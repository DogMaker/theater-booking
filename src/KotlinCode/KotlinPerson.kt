package KotlinCode

import java.util.Calendar
import java.util.GregorianCalendar
import java.util.Objects

class KotlinPerson(
    private val id: Long,
    private val title: String,
    private val firstName: String,
    private val surname: String,
    private val dateOfBirth: Calendar?
) {

    override fun toString() = "$title $firstName $surname"

    override fun hashCode() = Objects.hash(id, title, firstName, surname)

    companion object{
        fun getAge(dateOfBirth: Calendar?): Int {
            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth?.get(Calendar.YEAR)!!

            return if(dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) years - 1 else years
        }
    }
    fun getAge() = getAge(dateOfBirth)
}


