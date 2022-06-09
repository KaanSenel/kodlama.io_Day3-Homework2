public class Main {

    public static void main(String[] args) {
        Instructor instructor=new Instructor(1,"kaan","şenel","dkksaads@gmail.com","12","JAVA kursu");
        Student student=new Student(2,"ali","veli","a@gmail.com","Java","2222");

        InstructorManager instructorManager=new InstructorManager();
        instructorManager.courseOffered(instructor);

        StudentManager studentManager=new StudentManager();
        studentManager.getCourse(student);
    }
}
