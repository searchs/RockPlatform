package lectures.part1basics

//import org.scalatest._

object FunctionBox extends App {


  def noParameters(): Int = 42

  println(noParameters())

  def wordRepeater(s: String, n: Int): String = {

    if (n == 1) s
    else s + wordRepeater(s, n - 1)

  }

  //check function
  println(wordRepeater("Damsel", 2))
  assert(wordRepeater("boy", 1) equals ("boy"))
  assert(wordRepeater("man", 3) equals ("manmanman"))

  def auxFunction(n: Int): Int = {
    def innerFunction(a: Int, b: Int): Int = a + b

    innerFunction(n, n - 1)
  }

  //check
  /**
   * Assignments:  a greeting bot, Factorial and Fibonacci
   *
   * @param name
   * @param age
   */

  def greetBot(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old. "
  }

  //  check
  greetBot("Ola", 42)

  //Factorial
  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(5))

  //Fibonacci
  //  f(n) = f(n-1) + f(n-2)
  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(14))


  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrime(237))

}
