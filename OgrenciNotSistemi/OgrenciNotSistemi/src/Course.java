public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sozlu;

    Course(String name,String code, String prefix,double note, Teacher t1){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.teacher=t1;
        this.sozlu=0;
    }
    void printTeacherInfo(){
        this.teacher.print();
    }
    void generalNote(){
        if (this.prefix.equals("TRH")){
            this.note=(this.note* 0.7) + (this.sozlu*0.3);
        } else if (this.prefix.equals("FZK")) {
            this.note=(this.note*0.6)+(this.sozlu*0.4);
        } else if (this.prefix.equals("TRK")) {
            this.note=(this.note*0.5)+(this.sozlu*0.5);
        }
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            printTeacherInfo();
        }
        else {
            System.out.println("Öğretmen ve ders uyuşmuyor");
        }


    }


}
