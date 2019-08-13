public class CallStudent {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        Student alawee = new Student();
        System.out.println("object vee = "+alawee);
        alawee.addCourse();
        alawee.dropCourse();
        alawee.payment();
        alawee.enrollment();
        System.out.println("===========");
        //crete object GraduateStudent
        GraduateStudent vee = new GraduateStudent();
        System.out.println("object vee ="+vee);
        vee.oralExamination();
        vee.thesisExamination();
        vee.enrollment();
        vee.addCourse();
        vee.dropCourse();
        vee.payment();
    }
}
