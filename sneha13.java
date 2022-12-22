class MyException extends Exception{
    MyException(){
        super("Marks less than 45!!");
    }
}

class Student{
    private String id;
    private String name;
    private int avg;

    Student(String id, String name, int avg){
        this.id = id;
        this.name = name;
        this.avg = avg;
    }
int getAvg(){
        return avg;
    }

    void print(){
        System.out.println("Name:"+name);
        System.out.println("Name:"+id);
        System.out.println("Name:"+avg);
    }
} 
public class Question3{
    public static void main(String[] args) {Student s1 = new Student("123cs1", "Ravi", 85);
        Student s2 = new Student("123cs2", "Sachin", 75);
        Student s3 = new Student("123cs3", "Sashi", 56);
        Student s4 = new Student("123cs", "Anushka", 35);

        Student [] s = new Student[]{s1,s2,s3,s4};

        for(Student x: s){
            if(x.getAvg() < 45){
                try{
                    throw new MyException();
                }
                catch(MyException e){
                    System.out.println(e.getMessage());
                }
            }else{
                x.print();
            }
        }
    }
}