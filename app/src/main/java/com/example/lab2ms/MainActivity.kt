package com.example.lab2ms

import androidx.compose.ui.text.toLowerCase

class MainActivity {
    fun main() {
        val n = listOf(2, 4, 6, 8, 10, 12, 14, 16)
        val average = calcularPromedio(n)
        println("----------------------------------------------")
        println("               M E A N               ")
        println(" The mean for this set of numbers is: $average")
        println("----------------------------------------------")

        val integers= listOf(1,2,3,4,5,6,7,8,9,10)
        val oddNumbers= integers.filter {it %2 !=0}
        println("              F I L T E R               ")
        println(" List of integers: $integers")
        println(" List of oddNumbers: $oddNumbers")
        println("----------------------------------------------")

        val palindrome= "raDar"
        println("     P A L I N D R O M E   C H E C K              ")
        println("The word is a palindrome: ${isPalindrome(palindrome)}")
        println("----------------------------------------------")

    }

    private fun calcularPromedio(numbers: List<Int>): Double {
        if (numbers.isEmpty()) return 0.0 // Si la lista está vacía, retornará 0.0
        val sum = numbers.reduce { acc, number -> acc + number } //Aplica la función reduce para realizar la suma de los números en la lista
        return sum.toDouble() / numbers.size //Retorna el promedio de los nÜmeros en la lista
    }

    private fun isPalindrome(w: String):Boolean{
        val word= w.toLowerCase() // Vuelve cada caracter del string en minúsculas
        return word== word.reversed() //Retorna el string de derecha a izquierda para comprobar si es igual a la palabra al derecho y al revés

    }


}

fun main() {
    val mainActivity = MainActivity()
    mainActivity.main()
}

