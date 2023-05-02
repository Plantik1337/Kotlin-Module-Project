class Navigator {
    fun print(myList: MutableList<String>) {
        println("0. Создать")
        for (i in myList) {
            println("$i")
        }
        println("${myList.size + 1}. Выход")
    }

    var lastFilteredSize: Int = 1
    var lastfilteredList: MutableList<String> = mutableListOf()
    fun filterPrint(filteredKey: Int, myList: MutableList<String>) {
        val filteredList = myList.filter { it.substringBefore(".") == filteredKey.toString() }
        var currentPos = 1
        println("0. создать")
        for (i in filteredList) {
            println("$currentPos.${i.substringAfter(".").take(10)}...")
            currentPos++
        }
        println("${filteredList.size + 1}. Выход")
        lastFilteredSize = filteredList.size + 1
        lastfilteredList = filteredList.toMutableList()
    }

    fun giveName(): String {
        println("Введите название")
        var inputName = readLine().toString()
        if (inputName == "") {
            return "Без имени"
        }
        return inputName
    }

    fun showFullText(number: Int) {
        val fullText: String = lastfilteredList[number - 1].substringAfter(".")
        println("\n${fullText}\n")
    }
}
