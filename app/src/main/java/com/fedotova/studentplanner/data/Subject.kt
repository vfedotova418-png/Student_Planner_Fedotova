package com.fedotova.studentplanner.data

data class Subject(
    val id: String,
    val name: String,
    val professor: String,
    val credits: Int,
    val currentGrade: String,
    val description: String
)

val sampleSubjects = listOf(
    Subject(
        id = "1",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose. Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."
    ),
    Subject(
        id = "2",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 78,
        currentGrade = "Хорошо",
        description = ""
    ),
    Subject(
        id = "3",
        name = "Системное программирование",
        professor = "Токаев Т.И.",
        credits = 75,
        currentGrade = "Хорошо",
        description = "Низкоуровневая разработка на языке Rust: управление памятью без сборщика мусора, многопоточность, работа с операционной системой и создание высокопроизводительных системных компонентов."
    ),
    Subject(
        id = "4",
        name = "Разработка программных модулей",
        professor = "Донскова Д.А.",
        credits = 89,
        currentGrade = "Хорошо",
        description = ""
    ),
    Subject(
        id = "5",
        name = "Обеспечение качества функционирования компьютерных систем",
        professor = "Ушакова М.А.",
        credits = 76,
        currentGrade = "Хорошо",
        description = ""
    ),
    Subject(
        id = "6",
        name = "Управление проектами",
        professor = "Трошина О.В.",
        credits = 91,
        currentGrade = "Отлично",
        description = ""
    )
)