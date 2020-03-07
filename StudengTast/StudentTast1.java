package StudengTast;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class StudentTast1 {
    public static void main(String[] args) {
        Student[] students={new Student("张三",95),
        new Student("李四",96),
        new Student("王五",97),
        new Student("赵六",92)};
        sort(students);
        System.out.println(Arrays.toString(students));
    }
}
