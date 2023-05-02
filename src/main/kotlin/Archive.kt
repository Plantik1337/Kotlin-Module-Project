class Archive {
    var notes = mutableListOf<String>(
        "1. Моя история...",
        "1. Продолжение следует",
        "2. Абоба",
        "1. На свадьбе невеста случайно споткнулась и упала, все затихли. Но жених поднял ее и объявил: “Теперь свадьба настоящая – присоединяйтесь!”."
    )
    var archiveList = mutableListOf<String>("1. Мой архив")

    private fun concat(strNum: String, strText: String): String {
        return "${strNum}. $strText"
    }

    fun addSomething(number: Int, newSome: String, list: MutableList<String>) {
        list.add(concat(number.toString(), newSome))
    }
}