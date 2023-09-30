

public class StudentInfo{

    public static void main(String[] args) {
        

        Course math=new Course("mathematics", "MATH101", "MATH");
        Course physics=new Course("physics", "PHYSICS101", "PHYSICS");
        Course chemistry=new Course("chemistry", "CHEM101", "CHEMISTRY");

        Teacher t1=new Teacher("Prof. Kamil Özdemir", "0900059005", "MATH");
        Teacher t2=new Teacher("Dr. Einstein", "090049004", "PHYSCS");
        Teacher t3=new Teacher("Dr. Meral Meral", "090039003", "CHEMS");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1=new Student(" İskender the Macedonian", 4, "123456", math, physics, chemistry);
        s1.addBulkExamNote(50, 20, 40);
        s1.isPass();

        Student s2=new Student(" Süleyman The Magnificient", 4, "654321", math, physics, chemistry);
        s2.addBulkExamNote(100, 50, 40);
        s2.isPass();

        Student s3=new Student(" Mrs. X", 4, "192837465", math, physics, chemistry);
        s3.addBulkExamNote(50, 20, 40);
        s3.isPass();
        
    }
}