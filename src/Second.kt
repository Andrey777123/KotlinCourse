fun main(){
    var result = 0
    println("1.Правда ли, что Земля движется вокруг Солнца?\n1 - да\n2 - нет")
    var ans1:String = readLine()?:"0"
    if (ans1 == "1") result += 1
    println("2.Правда ли, что в Солнечной системе 10 планет?\n1 - да\n2 - нет")
    var ans2:String = readLine()?:"0"
    if (ans2 == "2") result += 1
    println("3.Меркурий — наименьшая планета Солнечной системы?\n1 - да\n2 - нет")
    var ans3:String = readLine()?:"0"
    if (ans3 == "1") result += 1
    println("4.Солнце относится к звездам спектрального класса G?\n1 - да\n2 - нет")
    var ans4:String = readLine()?:"0"
    if (ans4 == "1") result += 1
    println("5.Правда ли, что текущий возраст Солнца менее 1 млрд лет?\n1 - да\n2 - нет")
    var ans5:String = readLine()?:"0"
    if (ans5 == "2") result += 1
    when(result){
        0,2 -> println("Неудовлетворительно")
        3 -> println("Слабый результат")
        4 -> println("Удовлетворительно")
        5 -> println("Отлично")
    }

    println("Сумма вклада:")
    val sum:String = readLine()?:"0"
    println("Длительность(кол-во месяцев):")
    val numOfMonths:String = readLine()?:"0"
    println("Процент:")
    val percent:String = readLine()?:"0"

    var newSum: Double = sum.toDouble()
    var growth: Double = 0.0
    for(month in 1..numOfMonths.toInt()){
        growth = newSum * percent.toDouble() / 100
        newSum = newSum.toDouble() + growth
        println("Итог по $month месяцу:\nПрибыль = $growth\nСумма вклада = $newSum")
    }

    val table: Array<Array<Array<String>>> = Array(3, {Array(2, {Array(3, {""})})})
    table[0][0] = arrayOf("Россия","Москва","Рубль")
    table[0][1] = arrayOf("Франция","Париж","Франк")
    table[1][0] = arrayOf("Япония","Токио","Иена")
    table[1][1] = arrayOf("Индия","Нью-Дели","Рупия")
    table[2][0] = arrayOf("Турция","Анкара","Лира")
    table[2][1] = arrayOf("Германия","Берлин","Евро")
    for (i in 0..2) {
        for (j in 0..1) {
            for (k in 0..2) {
                print((table[i][j][k]) + "\t")
            }
            println()
        }
    }

    var cities : ArrayList<String> = arrayListOf()
    while(true){
        println("Что вы хотите сделать?\n1 - Добавить название города\n2 - Посмотреть список всех добавленных городов\n3 - Посмотреть список добавленных городов без повторений\n4 - Выход")
        val ans:String = readLine()?:"0"
        if (ans == "1") {
            println("Введите название города:")
            val newCity:String = readLine()?:"0"
            cities.add(newCity)
            println("Добавлен город $newCity")
        }
        else if (ans == "2"){
            println(cities.joinToString(", "))
        }
        else if (ans == "3"){
            var unique_cities = cities.toSet()
            println(unique_cities.joinToString(", "))
        }
        else if (ans == "4"){
            System.exit(0)
        }
        else {
            println("Неверное значение")
        }
    }
}