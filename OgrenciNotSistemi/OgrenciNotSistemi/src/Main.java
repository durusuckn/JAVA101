public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Duru Su Çakan","+905380723718","TRH");
        Teacher t2=new Teacher("Graham Bell","+9065652145","FZK") ;
        Course Tarih=new Course("Tarih","101","TRH",100,t1);
        Course Fizik=new Course("Fizik","102","FZK",50,t1);
        Course Turkce=new Course("Türkçe","103","TRK",45,t2);
        Student s1=new Student("İnek Şaban","123","4.sınıf",Tarih,Fizik,Turkce);
        s1.addBulkExamNote(100,50,30);
        s1.addBulkSozluNote(20,60,80);
        s1.printNote();
        s1.isPass();

    }
}