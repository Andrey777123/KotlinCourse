fun main() {
    val mapOfWorkPlaces: Map<Int, String> = mapOf(
        1 to "Иванов Иван Иванович",
        2 to "Максимов Максим Максимович",
        3 to "Егоров Егор Егорович",
        4 to "Александров Александр Александрович",
        5 to "Сергеев Сергей Сергеевич"
    )

    while (true) {
        println("Что вы хотите сделать?\n1 - Узнать ФИО владельца места\n2 - Выход")
        val ans: String = readlnOrNull() ?: "0"
        if (ans == "1") {
            println("Введите номер места")
            val userPlace: String = readlnOrNull() ?: "0"
            if (userPlace.toIntOrNull() != null) {
                val numOfPlace = userPlace.toInt()
                if (mapOfWorkPlaces.containsKey(numOfPlace)) println(
                    "место $numOfPlace: ${
                        mapOfWorkPlaces.getValue(
                            numOfPlace
                        )
                    }"
                )
                else {
                    println("Нет такого места")
                    continue
                }
            } else println("Нет такого места")
        } else if (ans == "2") System.exit(0)
        else println("Неверное значение")
    }
}