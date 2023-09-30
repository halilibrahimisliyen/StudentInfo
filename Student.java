public class Student {

    String name;
    String stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double avarage;
    boolean isPass;

    Student(String name,int classes,String stuNo,Course math,Course physics, Course chemistry){

        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.math=math;
        this.physics=physics;
        this.chemistry=chemistry;
        calcAvarage();
        this.isPass=false;

    }

    public void addBulkExamNote(int math, int physics, int chemistry){
        if(math>=0&&math<=100){
            this.math.note=math;
        }
        if(physics>=0&&physics<=100){
            this.physics.note=physics;
        }
        if(chemistry>=0&&chemistry<=100){
            this.chemistry.note=chemistry;
        }


    }

    public void isPass(){

        if(this.math.note==0||this.physics.note==0||this.chemistry.note==0){
            System.out.println("All needed information isn't entered ");
        }else{
            this.isPass=isCheckPass();
            printNote();
            System.out.println("Avarage: "+ this.avarage);
        }
        if(this.isPass){
            System.out.println("Passed the class");
        }else{
            System.out.println("Failed in class");
        }
    }

    

    public void calcAvarage(){
        this.avarage=(this.physics.note+this.chemistry.note+this.math.note)/3;


    }

    public boolean isCheckPass(){
        calcAvarage();
        return this.avarage>55;
    }


    public void printNote(){
        System.out.println("---------------------------------------------");
        System.out.println("Student: "+this.name);
        System.out.println("Math's Grade: "+this.math.note);
        System.out.println("Physics' Grade: "+this.physics.note);
        System.out.println("Chemistry' Grade: "+this.chemistry.note);

    }

    
}
