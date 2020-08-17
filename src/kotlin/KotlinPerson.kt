package kotlin

import java.util.Calendar

class KotlinPerson(
    private val id: Long,
    private val title: String,
    private val firstName: String,
    private val surname: String,
    private val dateOfBirth: Calendar
) {

    override fun toString() = " ${this.title}  ${this.firstName}  ${this.surname}"
}