/**
  * Created by ldowell on 4/19/16.
  */
object SumSquareDifference extends App {

    override def main(args: Array[String]): Unit = {
        val oneToOneHundred = 1 to 100

        val sumOfSquares = oneToOneHundred.map(v => v * v).sum
        val squareOfTheSum = oneToOneHundred.sum * oneToOneHundred.sum

        println(sumOfSquares)
        println(squareOfTheSum)
        println(squareOfTheSum - sumOfSquares)
    }
}
