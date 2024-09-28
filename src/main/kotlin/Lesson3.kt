package org.artemyeva

class Lesson3 {
    val event: String = "Hakaton" //  Название мероприятия
    var date: String = "10.10.2024" // Дата проведения
    val place: String = "Moscow" // Место проведения
    private val budget: Int = 1000000 // Бюджет
    var member: Int = 50 // Количество участников (может измениться)
    var duration: Long = 5 * 60 // Длительность мероприятия(может измениться)
    var contactInformation: String = "Moscow 123" //Контактная информация
    var status: String = "On" //Статус мероприятия
    val sponsors: String = "sponsor1" // Спонсоры мероприятия
    var internetAccessLevel: String = "high" //Уровень доступа к интернету
    var transport: String = "on way" // Информация о транспортировке
    var numberOfMember: Int = 0 // Количество команд
    val task: String = "all" // Перечень задач
    val evacuationPlan: String = "run" //План эвакуации
    var listOfAvailableEquipment: String = "equipment1" //Список доступного оборудования
    var listOfFreeEquipment: String = "equipment2"//Список свободного оборудования
    val planInCaseOfFailure: String = "cry"//План на случай сбоя мероприятия
    val specialGuest: String = "Leps" //Специальный гость
    lateinit var mood: String //Настроение по результатам опроса
    var plan: String = "happy"//Подробный план мероприятия
}