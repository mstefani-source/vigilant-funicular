def fun = {
    def count = 0;

    return {
        count++;
    } 
}

def counter = fun();

// println counter()
// println counter()
// println counter()
// println counter()
// println counter()

class Person {
    def name;
}

def vitek = new Person();
vitek.metaClass.dance = { println "vitek dancine"};

vitek.dance();

class DbUtils {

    public void checkUser() {
        DbUtils up = new DbUtils();
        up.update();    
    }

    public void update() {
        print "updated";
    }
}

DbUtils dbu = new DbUtils();

dbu.checkUser();