/**
 * Created by student on 2016/03/13.
 */
public class Student {
    private String name;
    private int age;
    Student()
    {

    }
    Student (String name , int age)
    {
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




}
