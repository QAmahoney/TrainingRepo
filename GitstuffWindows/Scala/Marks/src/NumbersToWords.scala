import sun.security.util.Length

object NumbersToWords {
  def main(args: Array[String]) {
    var num: Int = 1234
    var word: String = ""
    var digitsIn = Array(0,0,0,0)
    var digits = Array(0,0,0,0)
    var notTens = Map(0 -> "Zero", 1 -> "One", 2 -> "Two", 3 -> "Three", 4 -> "Four", 5 -> "Five", 6 -> "Six", 7 -> "Seven", 8 -> "Eight", 9 -> "Nine", 10 -> "Ten", 11 -> "Eleven", 12 -> "Twelve", 13 -> "Thirteen", 14 -> "Fourteen", 15 -> "Fifteen", 16 -> "Sixteen", 17 -> "Seventeen", 18 -> "Eighteen", 19 -> "Nineteen")
    var isTens = Array("", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety")
    
    for (i <- (0 to digitsIn.length-2).reverse) {
      digitsIn(i + 1) = num % 10
      digitsIn(i) = num / 10
      num /= 10
    }
    digits(0) = digitsIn(3)
    digits(1) = digitsIn(2)
    digits(2) = digitsIn(1)
    digits(3) = digitsIn(0)
    
    if (digits(3) != 0) {
      if (digits(2) == 0 && (digits(1) != 0 || digits(0) != 0)) {
        word += (notTens(digits(3)) + " thousand and ")
      } else {
        word += (notTens(digits(3)) + " thousand ")
      }
    }
    if (digits(2) != 0) {
      if (digits(1) != 0 || digits(0) != 0) {
        word += (notTens(digits(2)) + " hundred and ")
      } else {
        word += (notTens(digits(2)) + " hundred ")
      }
    }
    if ((digits(1) != 0) && (digits(1) > 1)) {
      word += (isTens(digits(1) - 1) + " ")
    }
    if (digits(0) != 0) {
      if (digits(1) < 2 && digits(1) > 0) {
        word += (notTens((digits(1) * 10) + digits(0)))
      } else {
        word += notTens(digits(0))
      }
    }
    print("WORD: "+word)
  }
}