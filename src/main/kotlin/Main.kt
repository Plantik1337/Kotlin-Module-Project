fun main(args: Array<String>) {
    val nav = Navigator()
    val arch = Archive()
    val note = Note()
    var archiveIsActive: Boolean = true
    var noteListIsActive: Boolean = false

    while (archiveIsActive) {
        println("Список архивов:")
        nav.print(arch.archives)
        val input = readLine()?.toIntOrNull()
        //val number = input?.toIntOrNull()
        if (input == null) {
            println("Вы ввели некорректное значение!")
        } else {
            when (input) {
                0 -> {
                    val inputName = nav.giveName()
                    arch.archives.put(arch.archives.size + 1, inputName)
                }

                arch.archives.size + 1 -> {
                    archiveIsActive = false
                    continue
                }

                in 1..arch.archives.size -> {
                    noteListIsActive = true
                    while (noteListIsActive) {
                        nav.filterPrint(input, note.notes)
                        //var inputName = readLine().toString()
                        val inputName = readLine()?.toIntOrNull()
                        if (inputName == null) {
                            println("Вы ввели некорректное значение!")
                        } else {
                            when (inputName) {
                                0 -> {
                                    note.addNote(input, nav.giveName())
                                }

                                nav.lastFilteredSize -> {
                                    archiveIsActive = true
                                    noteListIsActive = false
                                    continue
                                }

                                in 1..nav.lastFilteredSize -> {
                                    nav.showFullText(inputName)
                                }

                            }

                        }
                    }
                }

                else -> {
                    println("Некорректное значение")
                }
            }
        }
    }
}
