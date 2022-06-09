public class InstructorManager extends UserManager{

    public void courseOffered(Instructor instructor){

        System.out.println(instructor.getFirstName()+" isimli eğitmenin verdiği ders : "+instructor.getCourse());
    }
}
