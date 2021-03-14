package Compulsory;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

                        // creating 4 students
        Student[] students = IntStream.rangeClosed(0, 3)
                        // creating the actual names
                .mapToObj(i -> new Student("S" + i) )
                        // adding them to an array
                .toArray(Student[]::new);

                        // move the students into a linked list
        List<Student> studentsList = new LinkedList<Student>(Arrays.asList(students));
        studentsList.sort(new StudentComparator());

        for (Student student : studentsList)
            System.out.println(student);


        int[] capacities = new int[]{1, 2, 2};
                        // creating 3 schools
        School[] schools = IntStream.rangeClosed(0, 2)
                        // creating the School objects
                .mapToObj(i -> new School("H" + i, capacities[i]))
                        // adding them to an array
                .toArray(School[]::new);

                        // creating the Set for the schools
        Set<School> schoolSet = new TreeSet<School>(new SchoolComparator());
        for (School school : schools)
            schoolSet.add(school);

        for(School school : schoolSet)
            System.out.println(school);



                        // Adding the students into a HashMap
        Map<Student, LinkedList<School>> studentsPreferences = new HashMap<Student, LinkedList<School>>();
        studentsPreferences.put(students[0], new LinkedList<School>(Arrays.asList(schools[0], schools[1], schools[2])));
        studentsPreferences.put(students[1], new LinkedList<School>(Arrays.asList(schools[0], schools[1], schools[2])));
        studentsPreferences.put(students[2], new LinkedList<School>(Arrays.asList(schools[0], schools[1])));
        studentsPreferences.put(students[3], new LinkedList<School>(Arrays.asList(schools[1], schools[2])));

        System.out.println("Students map: ");
        for (Map.Entry<Student, LinkedList<School>> entry : studentsPreferences.entrySet())
            System.out.println(entry);

                        // Adding the schools into a Treemap
        Map<School, LinkedList<Student>> schoolsPreferences = new TreeMap<School, LinkedList<Student>>();
        schoolsPreferences.put(schools[0], new LinkedList<Student>(Arrays.asList(students[3],students[0],students[1],students[2])));
        schoolsPreferences.put(schools[1], new LinkedList<Student>(Arrays.asList(students[0],students[1],students[2])));
        schoolsPreferences.put(schools[2], new LinkedList<Student>(Arrays.asList(students[0],students[1],students[3])));

        System.out.println("Schools map: ");
        for (Map.Entry<School, LinkedList<Student>> entry : schoolsPreferences.entrySet())
            System.out.println(entry);
    }
}