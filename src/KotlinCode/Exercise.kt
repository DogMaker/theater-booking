package KotlinCode

import java.util.*

fun main() {
    val hugo = KotlinPerson(1L, "Mr", "Hugo", "Silva", GregorianCalendar(1985, 4, 19));
    val dayane =
        KotlinPerson(1L, "Mrs", "Dayane", "Gimenes", GregorianCalendar(1985, 10, 13));

    println("$hugo s age is ${hugo.getAge()}")
    println("$dayane s age is ${dayane.getAge()}")
    println("The age of someone born on 3rd May 1988 is ${KotlinPerson.getAge(
        GregorianCalendar(1988, 4, 19)
    )}")

}