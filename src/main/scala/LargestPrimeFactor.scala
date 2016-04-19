/**
  * Created by ldowell on 4/18/16.
  */
object LargestPrimeFactor extends App {

    override def main(args: Array[String]): Unit = {
        println(largestPrimeFactor(BigInt(600851475143L)))
    }

    def largestPrimeFactor(b: BigInt) = {
        def loop(f: BigInt, n: BigInt): BigInt =
            if (f == n) n else
            if (n % f == 0) loop(f, n / f)
            else loop(f + 1, n)

        loop(BigInt(2), b)
    }
}
