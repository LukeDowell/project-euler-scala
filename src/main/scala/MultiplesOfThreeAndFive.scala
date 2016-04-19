/**
  * Created by ldowell on 4/18/16.
  */
object MultiplesOfThreeAndFive extends App {
    override def main(args: Array[String]): Unit = {
//        var sum = 0
//
//        for(i <- 0 until 1000) {
//            println(i)
//            if(i % 3 == 0 || i % 5 == 0) {
//                sum += i
//            }
//        }
//
//        println(sum)

        val r = (1 until 1000).view.filter(n => n % 3 == 0 || n % 5 ==0).sum
        println(r)
    }
}
