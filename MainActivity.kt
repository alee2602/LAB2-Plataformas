// Universidad del Valle de Guatemala
// Programación de Plataformas Móviles
// Sección 20
// Mónica Salvatierra- 22249


package com.example.lab2ms

class MainActivity {
    fun main() {
        val n = listOf(2, 4, 6, 8, 10, 12, 14, 16) //Lista de enteros
        val average = calcularPromedio(n) // variable que guarda el promedio
        println("----------------------------------------------")
        println("                M E A N               ")
        println(" The mean for this set of numbers is: $average")
        println("----------------------------------------------")

        val integers= listOf(1,2,3,4,5,6,7,8,9,10) // Lista de enteros
        val oddNumbers= integers.filter {it %2 !=0} // Función filter que clasifica los números en la lista como impares si al momento de dividir el número entre 2, el residuo es un número entero diferente de cero.
        println("              F I L T E R               ")
        println(" List of integers: $integers")
        println(" List of Odd Numbers: $oddNumbers")
        println("----------------------------------------------")

        val palindrome= "raDar" // Palabra que se escribe y lee de la misma manera al derecho y al revés
        println("     P A L I N D R O M E   C H E C K              ")
        println("The word ${palindrome.lowercase()} is a palindrome: ${isPalindrome(palindrome)}")
        println("----------------------------------------------")

        val names= listOf("Alejandra", "José", "Alicia") //Lista de nombres
        println("               M A P P I N G              ")
        val greet= mapGreetings(names) // Se guardan todos los saludos
        greet.forEach{println(it)}
        println("----------------------------------------------")

        val a= 4
        val b= 5
        val result= performOperation(a,b){x, y -> x*y} // La función performOperation realizará una multiplicación entre ambos enteros y el resultado se guardará en la variable result
        println("               O P E R A T I O N              ")
        println("The product is: $result")
        println("----------------------------------------------")

        println("               M A P P I N G              ")
        val people= listOf(
            Person("Manuel", 19, "male"),  //Lista de personas
            Person("José", 24, "male"),
            Person("Andrés", 16, "male")
        )

        val students= mapStudent(people) //Guarda el resultado del mapeo
        students.forEach{ student ->
            println("El estudiante ${student.name} tiene ${student.age} años.")
        }
    }

    private fun calcularPromedio(numbers: List<Int>): Double { //Recibe una lista de tipo int y retorna un valor de tipo Double
        if (numbers.isEmpty()) return 0.0 // Si la lista está vacía, retornará 0.0
        val sum = numbers.reduce { acc, number -> acc + number } //Aplica la función reduce para realizar la suma de los números en la lista
        return sum.toDouble() / numbers.size //Retorna el promedio de los números en la lista
    }

    private fun isPalindrome(w: String):Boolean{
        val word= w.lowercase() // Vuelve cada caracter del string en minúsculas
        return word== word.reversed() //Verifica y retorna el string de derecha a izquierda para comprobar si es igual a la palabra al derecho y al revés
    }
    private fun mapGreetings(names:List<String>):List<String>{ //Recibe una lista de nombres y mapea cada nombre, agregando un saludo
        return names.map{"¡Hola, $it!"} // Retorna la lista de saludos junto con el nombre de la persona
    }

    private fun performOperation(a:Int, b:Int, operation:(Int,Int)->Int): Int{ //Recibe dos enteros (a y b) y una lambda function con la operación a realizar
        return operation(a,b) //Retorna el resultado de la operación realizada por a y b
    }

    private fun mapStudent(personList: List<Person>):List<Student>{ //Recibe una lista de objetos de tipo 'Person' y mapea cada objeto dentro de él a un objeto de tipo 'Student'
        return personList.map{person -> //Se crea un objeto de tipo 'Student' a base de la información ya predeterminada en la lista de tipo 'Person'
            Student(person.name, person.age, person.gender, "ID_${person.name.uppercase()}" ) //Retorna una lista Student con el resultado del mapeo
        }

    }

}
fun main() {
    val mainActivity = MainActivity()
    mainActivity.main()
}

