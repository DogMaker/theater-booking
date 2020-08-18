package kotlin

import java.util.*

class KotlinPerson(
    private val id: Long,
    private val title: String,
    private val firstName: String,
    private val surname: String,
    private val dateOfBirth: Calendar
) {

    override fun toString() = "${this.title}  ${this.firstName}  ${this.surname}"

    override fun equals(other: Any?): Boolean {


                return true
    }

    override fun hashCode() = Objects.hash(id, title, firstName, surname)

    companion object{
        fun getAge(dateOfBirth: Calendar?): Int{
            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth?.get(Calendar.YEAR)!!

            if(dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)){
                return years - 1
            }
            else{
                return years
            }

        }
    }

    fun getAge() = getAge(dateOfBirth)
}


