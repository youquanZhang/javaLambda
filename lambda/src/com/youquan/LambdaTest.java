package com.youquan;

import java.util.concurrent.Callable;

public class LambdaTest {
    public static void main(String[] args) throws Exception {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("running1");
            }
        };
        runnable.run();
        Runnable runnable2 = () -> {
            System.out.println("running2");
        };
        runnable2.run();
        Runnable runnable3 =()-> System.out.println("running3");
        runnable3.run();





        Callable  c1=new Callable() {
            @Override
            public Object call() throws Exception {
                return "youquan";
            }
        };
        System.out.println(c1.call());

        Callable c2=()->{return  "youquan";};
        System.out.println(c2.call());
        Callable c3=()->  "youquan";
        System.out.println(c3.call());



        StudentDao  sd1=  new StudentDao(){
            @Override
            public void insert(Student student) {
                System.out.println("插入学生1");
            }
        };

        StudentDao sd2=(student)->{
            System.out.println("studdent"+student);
        };
        StudentDao sd3=(Student student)-> System.out.println("studdent"+student);

        sd1.insert(new Student());
        sd2.insert(new Student());
        sd3.insert(new Student());

        TeacherDao td1=new TeacherDao() {
            @Override
            public int get(Teacher teacher) {
                System.out.println("teacher1");
                return 0;
            }
        };
        td1.get(new Teacher());
        TeacherDao td2 =teacher ->{return  2;};
        TeacherDao td3 =(Teacher teacher) -> 3;
        TeacherDao td4 =teacher -> 4;
        TeacherDao td5 =(Teacher teacher) -> {return 5;};
        System.out.println(td2.get(new Teacher()));
        System.out.println(td3.get(new Teacher()));
        System.out.println(td4.get(new Teacher()));
        System.out.println(td5.get(new Teacher()));

    }

}
