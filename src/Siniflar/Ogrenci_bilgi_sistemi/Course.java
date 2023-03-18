package Siniflar;

import javax.swing.*;

public class Course {
    //nitelikler
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu_notu;

    public Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozlu_notu = 0;
    }

    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("İşlem baiarılı");
        } else {
            System.out.println(t.name + "Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher(){
        if (courseTeacher != null){
            System.out.println(this.name+ " dersinin Akademisyeni : "+courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

}
