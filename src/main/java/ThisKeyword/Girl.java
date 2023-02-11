package ThisKeyword;

public class Girl {
    private String name;
    private int age;
    //空参构造器
    public Girl(){

    }

    public Girl(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void marry(Boy boy){
        System.out.println("I want to marry " + boy.getName() + " !");
       boy.marry(this); //谁调用这个方法谁就是this, 这个girl想调用marry(), this就是这个girl。
    }

    /**
     * 比较两个对象的大小：
     * 如果 return 正数：当前对象大； 负数：当前对象小；0：当前对象与形参对象相等。
     */

    public int compare(Girl girl){
        if(this.age > girl.age){ // 此时的 this 和 girl 是两个属性，this是调用方法的对象的属性， girl是形参的属性。
            System.out.println(this.getName()+ " is older than " + girl.getName() + ".");
            return 1;
        }else if(this.age < girl.age){
            System.out.println(this.getName()+ " is younger than " + girl.getName() + ".");
            return -1;
        }else{
            System.out.println("They are the same age.");
            return 0;
        }
    }

    // 简化写法：
    // return this.age - girl.age; 直接返回相减的值。
}
