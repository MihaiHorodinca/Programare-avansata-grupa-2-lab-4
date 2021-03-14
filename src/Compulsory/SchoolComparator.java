package Compulsory;

import java.util.Comparator;

public class SchoolComparator implements Comparator<School> {

    @Override
    public int compare(School school1, School school2){
        return school1.getName().compareTo(school2.getName());
    }
}
