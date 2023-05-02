fun main(args: Array<String>) {
    val nav = Navigator()
    val arch = Archive()
    var archiveIsActive: Boolean = true
    var noteListIsActive: Boolean = false

    while (archiveIsActive) {
        println("Список архивов:")
        nav.print(arch.archiveList)
        val input = readLine()?.toIntOrNull()
        if (input == null) {
            println("Вы ввели некорректное значение!")
        } else {
            when (input) {
                0 -> {
                    val inputName = nav.giveName()
                    arch.addSomething(arch.archiveList.size + 1, inputName, arch.archiveList)
                }

                arch.archiveList.size + 1 -> {
                    archiveIsActive = false
                    continue
                }

                in 1..arch.archiveList.size -> {
                    noteListIsActive = true
                    while (noteListIsActive) {
                        nav.filterPrint(input, arch.notes)
                        //var inputName = readLine().toString()
                        val inputName = readLine()?.toIntOrNull()
                        if (inputName == null) {
                            println("Вы ввели некорректное значение!")
                        } else {
                            when (inputName) {
                                0 -> {
                                    arch.addSomething(input, nav.giveName(), arch.notes)
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
