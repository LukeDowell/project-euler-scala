/**
  * Created by ldowell on 4/18/16.
  */
object EvenFibonacciNumbers extends App {

    override def main(args: Array[String]): Unit = {
        val fibonacciNumbers = generateFibonacci(Vector(1, 2), 4000000)
        val fibonacciSum = fibonacciNumbers.filter(v => v % 2 == 0).sum
        println("The answer is " + fibonacciSum)
    }

    /**
      * Generates a vector of fibonacci values until a given value is reached
      * @param set A set of numbers to start with, should be Vector(1, 2)
      * @param upperLimit The returned vector will not have any numbers higher than this
      * @return
      */
    def generateFibonacci(set: Vector[Int], upperLimit: Int): Vector[Int] = {
        val nextValue = set(set.size - 2) + set.last
        if(nextValue >= upperLimit) return set

        val nextSet = set :+ nextValue
        println(nextSet)
        generateFibonacci(nextSet, upperLimit)
    }
}
