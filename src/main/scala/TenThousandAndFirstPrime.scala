/**
  * Created by ldowell on 4/19/16.
  */
object TenThousandAndFirstPrime extends App {

    override def main(args: Array[String]): Unit = {
        val maxIntRange = (2 to 200000).toList
        val sievedList = sieveOfEratosthenes(maxIntRange, 2, 1000)
        println(sievedList)
        println(sievedList(10000))
    }

    def sieveOfEratosthenes(list: List[Int], p: Int, upperLimit: Int): List[Int] = {
        println("Filtering out: " + p)
        if(p >= upperLimit) {
            list
        }
        else {
            val filteredList = list.filter(v => v == p || v % p != 0)
            sieveOfEratosthenes(filteredList, p + 1, upperLimit)
        }
    }
}
