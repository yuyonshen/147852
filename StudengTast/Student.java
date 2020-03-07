package StudengTast;

public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }

    @Override
    public String toString() {
       return "["+this.name+":"+this.score+"]";
}
    @Override
    public int compareTo(Student o){
    Student s=(Student)o;
    if(this.score>s.score){
        return -1;
    }else if(this.score<s.score){
        return 1;
    }else{
        return 0;
    }
    }
}
