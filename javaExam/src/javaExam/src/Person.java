//question 4(ii)
public class Person {
    //    using modifiers
    private String name;
    private int age;
    protected int salary;
//    constructor
    public Person(String name,int age,int salary){
        this.name =name;
        this.age = age;
        this.salary = salary;
    }
    //    using modifiers
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args){
        Person person1 = new Person("Andrew ", 25, 1200000);
        System.out.println(person1.getName()+ person1.getAge());
        System.out.println(person1.getSalary());
    }
}
