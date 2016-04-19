/**
  * Created by ldowell on 4/19/16.
  */
object SmallestMultiple extends App {

    override def main(args: Array[String]): Unit = {
        findSmallestMultiple(20)

        def findSmallestMultiple(v: Int): Unit = {
            if(evenlyDivides(v)) println(v + " is the smallest multiple!")
            else findSmallestMultiple(v + 20)
        }

        def evenlyDivides(v: Int): Boolean = {
            for(divisor <- 1 to 20) {
                if(v % divisor != 0) return false
            }
            true
        }
    }
}
