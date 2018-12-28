package compatibility

class CompatibilityKt {

    fun sayHello() {
        val compatibilityJava = CompatibilityJava()
        println("收到对面Java的一条消息：${compatibilityJava.greetings()}")
    }

    fun greetings(): String {
        return "how are you?"
    }
}

fun main(args: Array<String>) {
    CompatibilityKt().sayHello()
}