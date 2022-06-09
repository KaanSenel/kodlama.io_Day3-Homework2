public class StudentManager extends UserManager{

    public void getCourse(Student student){
        System.out.println(student.getFirstName()+" isimli kişi "+ student.getLesson() +" kursunu satın aldı.");
    }

}
