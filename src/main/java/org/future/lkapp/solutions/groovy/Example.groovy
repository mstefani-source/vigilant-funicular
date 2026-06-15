def fun = {
    count = 0;
    return {
        count++;
    }
}()

// def closure = fun();

// int count = closure();
// println count;
// println closure();

int c = fun();
println "c= " + c

class Person {
    String name
}

def p = new Person(name: "Alice")

// 1. Все Groovy объекты имеют GroovyObject
println p instanceof GroovyObject  // true

// 2. invokeMethod() вызывается для НЕСУЩЕСТВУЮЩИХ методов
p.metaClass.sayHello = { -> "Hello, ${name}!" }
println p.sayHello()  
println p.sayGoodbye()

String greetens = Optional.ofNullable(name).orElse("Guest");