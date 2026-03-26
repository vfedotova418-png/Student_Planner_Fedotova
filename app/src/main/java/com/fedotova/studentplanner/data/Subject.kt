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
        name = "Инструментальные средства разработки программного обеспечения",
        professor = "Леонтьев Д.А.",
        credits = 78,
        currentGrade = "Хорошо",
        description = "Fullstack разрабокта в Visual Studio Code, работа с Git и GitHub"
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
        description = "Работа с WPF, архитектурой приложений, в Visual Studio"
    ),
    Subject(
        id = "5",
        name = "Обеспечение качества функционирования компьютерных систем",
        professor = "Ушакова М.А.",
        credits = 76,
        currentGrade = "Хорошо",
        description = "Изучение основ обеспечения качества функционированния компьютерных систем"
    ),
    Subject(
        id = "6",
        name = "Управление проектами",
        professor = "Трошина О.В.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Работа в Microsoft Project для разработки плана строительства Коттеджа"
    ),
    Subject(
        id = "7",
        name = "Иностранный язык в профессиональной деятельности",
        professor = "Пенькова О.В.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Изучение английского языка, применимого в сфере IT"
    ),
    Subject(
        id = "8",
        name = "Физическая культура",
        professor = "Магомедов С.К.",
        credits = 71,
        currentGrade = "Хорошо",
        description = "Дисциплина нацеленная на поддержание уровня физической активности студентов"
    ),
    Subject(
        id = "9",
        name = "Менеджмент в профессиональной деятельности",
        professor = "Запорожская С.А.",
        credits = 71,
        currentGrade = "Хорошо",
        description = "Основы менеджмента и управления как наука"
    ),
    Subject(
        id = "10",
        name = "Математическое моделирование",
        professor = "Трошина О.В.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Изучение математических моделей"
    )
)