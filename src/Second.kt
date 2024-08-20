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
}