package eight.srteams;

public class Employee {
    int age;
    String name;
    Double salary;
    int id;


    public Employee(int age, String name, Double salary ,int id) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.id= id;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "id->  "+id+ " name-> "+this.name+" Age-> "+this.age+" Salary-> "+this.salary;
    }
}