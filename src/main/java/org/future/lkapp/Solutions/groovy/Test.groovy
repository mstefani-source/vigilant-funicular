class User {

    String name;
    String surname;
    String address;

    private User (UserBuilder userbuilder){
        this.name = userbuilder.name();
        this.surname = userbuilder.surname();
        this.address = userbuilder.address();
    }

    static class UserBuilder {
        def name;
        def surname;
        def address;

        UserBuilder() {}

        public UserBuilder name(name){
            this.name = name;
            return this;
        }

        public UserBuilder surname(surname){
            this.surname = surname;
            return this;
        }
        
        public UserBuilder address(address){
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    static UserBuilder builder() {
        return new UserBuilder()
    }

    String toString() {
        return "User(name:$name, surname:$surname, address:$address)"
    }
}

User vitya = User.builder()
            .name("Vitya")
            .surname("Ivanov")
            .address("Earth")
            .build();
println vitya;

