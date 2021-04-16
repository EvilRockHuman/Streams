package Map;

import java.util.Arrays;

public class SimpleComparableStudent implements Comparable {
    private String firstName;
    private int group;
    double PI = 3.14;
    public SimpleComparableStudent(String firstName, int group){
        this.firstName = firstName;
        this.group = group;
    }

    @Override
    public String toString() {
        return  firstName+ " " + group;
    }
    @Override
    public int compareTo(Object o) {
        if (this.group > ((SimpleComparableStudent) o).group) {
            return 1;
        } else if (this.group < ((SimpleComparableStudent) o).group) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        SimpleComparableStudent[] myStudents = {
                new SimpleComparableStudent("Yevhenii",333),
                new SimpleComparableStudent("Andrew", 222),
                new SimpleComparableStudent("Igor", 111),
                new SimpleComparableStudent("Peter", 300)
        };
        Arrays.sort(myStudents);
        for (SimpleComparableStudent myStudent2: myStudents) {
            System.out.println(myStudent2);
        }
    }

}
