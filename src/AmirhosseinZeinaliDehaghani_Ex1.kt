fun isPerfectNumber(number: Int): Boolean {
    var sumOfFactors = 0
    // To find divisors, iterate from one to half of the integers
    for (i in 1..number / 2) {
        if (number % i == 0) {  // Check whether i is a factor
            sumOfFactors += i
        }
    }
    return sumOfFactors == number  // Check that the number is equal to the sum of the factors
}

fun main() {
    val start = 1 //start range
    val end = 10000 //end range
    val perfectNumbers = mutableListOf<Int>() //Initialize a mutable list for perfect numbers

    for (number in start..end) { //loops through all integers from 1 to 10,000
        if (isPerfectNumber(number)) { // use the predefined function to check each number
            perfectNumbers.add(number)  // Add number to the list if it is perfect
        }
    }

    // Print the perfect numbers which are within the interval
    println(perfectNumbers.joinToString(", "))
}