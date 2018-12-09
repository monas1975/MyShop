public class User {

    private String name;
    private int age;

    public User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.age = userBuilder.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static class UserBuilder{

        private String name;
        private int age;

        public UserBuilder setName(String name){
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }




    }


}
