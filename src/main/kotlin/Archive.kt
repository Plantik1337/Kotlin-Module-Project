class Archive{
    var archives = mutableMapOf<Int, String>(1 to "Мой архив")
    var maxKey = 1// отслеживать максимальное значение ключа
    fun AddArch(newArchive: String){
        maxKey ++
        archives.put(maxKey,newArchive)
        println("Вы добавили новый архив!")
    }
}

//val notes = mutableMapOf<Int, String>(1 to "Моя история...")
//
//    fun addNote(belongs: Int, text: String) {
//        notes.put(belongs, text)
//    }