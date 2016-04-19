/**
  * Created by ldowell on 4/19/16.
  */
object SpecialPythagoreanTriplet extends App {

    override def main(args: Array[String]): Unit = {
        for(a <- 1 to 1000) {
            for(b <- 1 to 1000) {
                for(c <- 1 to 1000) {
                    val aSqr = a * a
                    val bSqr = b * b
                    val cSqr = c * c

                    if(aSqr + bSqr == cSqr && a + b + c == 1000) {
                        println("OH BABY A TRIPLE")
                        println("a: " + a + " - b: " + b + " - c: " + c)
                        println("Product: " + (a * b * c))
                    }
                }
            }
        }
    }
}
