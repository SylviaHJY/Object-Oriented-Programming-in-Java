package Extends;

public class Person extends creature{
        public String name;
        public int age;
        private String gender;

        //空参构造器
        public Person(){

        }

        public void eat(){
            System.out.println("eat");
        }

        public void sleep(){
            System.out.println("sleep");
        }

        public void setGender(String gender){
                this.gender = gender;
        }

        public String getGender(){
                return gender;
        }

}
