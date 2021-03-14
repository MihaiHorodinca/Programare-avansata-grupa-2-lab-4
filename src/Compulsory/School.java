package Compulsory;

class School implements Comparable<School> {

    private String name;
    private int capacity;

    public School(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    // standard getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

                                        // override on compareTo, making it take into consideration the names of the schools

    @Override
    public int compareTo(School other){
        if(this.name == null){
            return 0;
        } else
            return this.name.compareTo(other.getName());
    }
}