// class Person {
//   def name;
// }
// Person vitya = new Person(name: "Витя");
// vitya.metaClass.dance = { "Витя ${delegate.name} dancing"}
// println vitya.dance();

def fun = {
  def counter = 0;

  return {
    counter++;
  }
}

def counter = fun();

println counter();


// withCloseable - аналог try-with-resources в Java
def readFile(String path) {
    new File(path).withReader { reader ->
        // reader автоматически закроется после выполнения замыкания
        return reader.readLines()
    }
}

// Пример из GORM
def user = User.withTransaction { tx ->
    def u = new User(name: "John")
    u.save(flush: true)
    // Транзакция коммитится/откатывается автоматически
    return u
}


