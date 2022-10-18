public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String studentNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String studentNo,String classes,Course c1,Course c2, Course c3){

        this.name=name;
        this.studentNo=studentNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPass=false;
    }
    void addBulkExamNote(double note1,double note2,double note3){
        if(note1>=0&&note1<=100){
            this.c1.note=note1;
        }
        if(note2>=0&&note2<=100){
            this.c2.note=note2;
        }
        if(note3>=0&&note3<=100){
            this.c3.note=note3;
        }


    }
    void addBulkSozluNote(double note1,double note2,double note3){
        if(note1>=0&&note1<=100){
            this.c1.sozlu=note1;
        }
        if(note2>=0&&note2<=100){
            this.c2.sozlu=note2;
        }
        if(note3>=0&&note3<=100){
            this.c3.sozlu=note3;
        }

    }

    void printNote(){
        System.out.println(this.c1.name+" Notu\t"+this.c1.note);
        System.out.println(this.c2.name+" Notu\t"+this.c2.note);
        System.out.println(this.c3.name+" Notu\t"+this.c3.note);
        System.out.println(this.c1.name+" Sözlü Notu\t"+this.c1.sozlu);
        System.out.println(this.c2.name+" Sözlü Notu\t"+this.c2.sozlu);
        System.out.println(this.c3.name+" Sözlü Notu\t"+this.c3.sozlu);
    }

    void isPass(){
        if(this.c1.note>=0&&this.c1.note<=100&&this.c2.note>=0&&this.c2.note<=100&&this.c3.note>=0&&this.c3.note<=100){
            c1.generalNote();
            c2.generalNote();
            c3.generalNote();
            this.average=(this.c1.note+this.c2.note+this.c3.note)/3;
            if(this.average>=50&&this.average<=100){

                System.out.println("Tebrikler Sınıfı geçtiniz\t"+this.average);
                this.isPass=true;
            }
            else {
                System.out.println("Hababam Sınıfı Sınıfta Kaldı\t"+this.average);
            }
        }
        else{
            System.out.println("Geçerli bir not girilmemiştir lütfen sistemi kontrol ediniz...");
        }

    }


}
