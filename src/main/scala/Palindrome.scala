/**
  * Created by ldowell on 4/19/16.
  */
object Palindrome extends App {

    override def main(args: Array[String]): Unit = {

        var largestPalindrome = 0

        for(v1 <- 100 until 1000) {
            for(v2 <- 100 until 1000) {
                val potentialPalindrome = v1 * v2
                if(isPalindrome(potentialPalindrome) && largestPalindrome < potentialPalindrome) {
                    println("The product of " + v1 + " and " + v2 + " produces -- " + potentialPalindrome)
                    largestPalindrome = potentialPalindrome
                }

            }
        }
        println("The largest possible palindrome is : " + largestPalindrome)

    }

    def isPalindrome(v: Int): Boolean = {
        val vString = v.toString

        var farIndex = vString.length - 1
        var closeIndex = 0

        while(farIndex > closeIndex) {
            val closeChar = vString.charAt(closeIndex)
            val farChar = vString.charAt(farIndex)

            if(closeChar != farChar) return false

            farIndex -= 1
            closeIndex += 1
        }

        true
    }

}
