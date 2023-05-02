class Note{
    var notes = mutableListOf<String>("1. Моя история...", "1. Продолжение следует","2. Абоба","1. На свадьбе невеста случайно споткнулась и упала, все затихли. Но жених поднял ее и объявил: “Теперь свадьба настоящая – присоединяйтесь!”.")

    private fun concat(strNum: String, strText: String):String{
        return "${strNum}. $strText"
    }

    fun addNote(number: Int, text: String) {
        notes.add(concat(number.toString(), text))
    }
}