package eight.srteams;

import javafx.util.Builder;

import java.util.Objects;

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
    public Employee(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.salary = builder.salary;
        this.id= builder.id;

    }



    @Override
    public int hashCode() {
        return Objects.hash(age,name,salary,id);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return  true;
        }
        if(obj instanceof  Employee){
            Employee employee= (Employee) obj;
            return this.age == employee.age &&
                    this.name.equals(employee.name) &&
                    Double.compare(this.salary,employee.salary)==0 &&
                    this.id==employee.id;

        }
        return  false;
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
    public static class Builder{
        int age;
        String name;
        Double salary;
        int id;

        public Builder withAge( int age){
            this.age= age;
            return this;
        }
        public Builder withName( String name){
            this.name= name;
            return this;
        }
        public Builder withSalary(Double salary){
            this.salary= salary;
            return this;
        }
        public Builder withId(int id){
            this.id=id;
            return this;
        }
        public Employee build (){
            return  new Employee(this);
        }


    }
}