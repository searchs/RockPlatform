package lectures.part1basics

import utils.Logging

object Expressions extends App with Logging {

  val x = 1 + 3 //expression
  println(x)


//  NO WHILE LOOPS!
  def whileLoop(cond : =>Boolean, block : =>Unit) : Unit =
    if(cond) {
      block
      whileLoop(cond, block)
    }


}
