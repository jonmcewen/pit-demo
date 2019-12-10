package pit.demo

class HeightComparator {

    data class Person(val name: String, val height: Int)

    fun tallerOf(a: Person, b: Person): Person {
        if (a.height > b.height) {
            return a
        }
        return b
    }
}