package Compulsory;

import java.util.Comparator;

class Student implements Comparator<Student> {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

                                            // standard getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

                                            // override on compare, making it compare the names of the students

    @Override
    public int compare(Student o1, Student o2){
        return o1.getName().compareTo(o2.getName());
    }
}