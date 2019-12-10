package lectures.part1basics

object Recursions extends App {

  //Basic Factorial
  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }


  def anotherFactorial(n: BigInt): BigInt = {
    @scala.annotation.tailrec
    def factHelper(x: BigInt, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)
    }

    factHelper(n, 1)
  }

  println(anotherFactorial(200))

}
