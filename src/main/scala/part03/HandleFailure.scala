package part03;

import scala.util.Success
import scala.util.Failure
import scala.util.Try

object HandleFailure extends App {
  val aSuccess = Success(3)
  val aFailure = Failure(new RuntimeException("Error"))

  println(aSuccess)
  println(aFailure)
  def unsafeMethod(): String = throw new RuntimeException("No string")

  val potentialFailure = Try(unsafeMethod())
  println(potentialFailure)

  if (potentialFailure.isFailure) {
    println("failure")
  }

  val another = Try {
    // Code that might throw error
  }
  // utilities

  def backupMethod(): String = "Backup"

  val fallbackTry = Try(unsafeMethod()).orElse(Try(backupMethod()))

  def betterUnsafeMethod(): Try[String] = Failure(new RuntimeException)
  def betterBackupMethod(): Try[String] = Success("Valid Result")

  val betterResult = betterUnsafeMethod() orElse betterBackupMethod()

  // map flatmap filter

  println(aSuccess.map(_ * 2))
  println(aSuccess.flatMap(x => Success(x * 10)))
  println(aSuccess.filter(_ > 10))
  println(aSuccess.filter(_ < 10))

  var a = 10
}
