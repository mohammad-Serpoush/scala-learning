package part03;

import scala.util.Random

object Options extends App {

  val a: Option[Int] = Some(4)
  val n: Option[Int] = None
  println(a)
  println(n)

  def unsafeMethod(): String = null

  val result = Some(unsafeMethod()) // wrong
  val result2 = Option(unsafeMethod()) // right

  println(result)
  println(result2)
  // -------------------

  def backup(): String = "A valid result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backup()))
  println(chainedResult)

  // Redesign unsafeMethod and backup
  def better(): Option[String] = None
  def betterBackup(): Option[String] = Some("A valid result")

  var aa = better()
  var bb = betterBackup()
  println(aa)
  println(bb)

  var betterChained = better() orElse betterBackup()

  // ------------

  println(a.isEmpty)
  println(a.get)
  // map, flatMap, filter

  println(a.map(_ * 2))
  println(a.filter(x => x > 10))

  println(n.map(_ * 2))
  println(n.filter(x => x > 10))

  println(a.flatMap(x => Option(x * 10)))

  // --------------------- Cute exercise
  val config: Map[String, String] = Map(
    "host" -> "192.168.1.1",
    "port" -> "8080"
  )
  class Connection {
    def connect = "Connected"
  }

  object Connection {
    val random = new Random(System.nanoTime())
    def apply(host: String, port: String): Option[Connection] =
      if (random.nextBoolean()) Some(new Connection)
      else None
  }
  val host = config.get("host")
  val port = config.get("port")

  /*

   */
  val connection = host.flatMap(h => port.flatMap(p => Connection.apply(h, p)))
  val connectionStatus = connection.map(c => c.connect)
  println(connectionStatus)
  connectionStatus.foreach(println)

  // config.get("host")
  //   .flatMap(host => config.get("port"))
  //   .flatMap(port => Connection(host, port))
  //   .map(connection => connection.connect)
  //   .foreach(println)

}
