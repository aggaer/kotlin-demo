package nullSafe

class NullSafeDemo {

    fun notAllowed() {
        var a = "abc"
//        a = null // 编译错误
        //因为a的非空属性，此时调用a的方法或者访问a的属性将保证不会产生NPE
        println(a.length)
    }

    fun Allowed() {
        var b: String? = "xyz"
        b = null // ok
        //如果此时访问b的属性，编译器会抛出一个错误，因为这个操作是不安全的
//        println(b.length)
    }
}