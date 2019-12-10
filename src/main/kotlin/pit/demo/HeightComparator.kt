package pit.demo

import pit.demo.data.Person

class HeightComparator {

    fun tallerOf(a: Person, b: Person): Person {
        if (a.height >= b.height) {
            return a
        }
        return b
    }
}