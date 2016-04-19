import scala.io.Source

/**
  * Created by ldowell on 4/19/16.
  */
object LargestProductInASeries extends App {

    override def main(args: Array[String]): Unit = {
        // We want to convert our input string into a list of integers
        val input = Source.fromFile("/Users/ldowell/Development/Projects/Scala/eulerchallenges/src/main/resources/largest-product-in-a-series.txt").getLines().toList.head
        val bigIntList: List[BigInt] = input.toCharArray.map(c => BigInt(c.asDigit)).toList //asDigit, not toInt, because the way characters are encoded causes the int value to be increased by 48

        var greatestProduct: BigInt = BigInt(0)
        for(i <- bigIntList.indices) {
            // Slice out our 13 elements
            val series = bigIntList.slice(i, i + 13)
            val seriesProduct = series.product

            if(seriesProduct >= greatestProduct) {
                greatestProduct = seriesProduct
                println("============= \n " + series + "\n" + "Product: " + seriesProduct + "\n=============")
            }
        }

        println(greatestProduct)
    }
}
