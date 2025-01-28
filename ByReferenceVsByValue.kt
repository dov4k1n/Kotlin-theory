class Foo(var con: Int) {
    var vrbl: Int = 0
    
    override fun toString(): String {
        return "$con $vrbl"
    }
}

fun change(b: Foo) {
    b.con = 10  // allowed
    b.vrbl = 12 // allowed
//    b = Foo(0) // compile error: 'val' cannot be reassigned.
}

fun change(a: Int) {
//    a += 10 // compile error: 'val' cannot be reassigned. 
}

fun main() {
    val foo = Foo(5)
    foo.vrbl = 6
    change(foo)
    println(foo) // prints "10 12"
    
    var a = 1290
    change(a)
    println(a)
}