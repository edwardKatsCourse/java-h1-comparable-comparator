package com.company.examples;

public class InterfaceDemo {

    public static void main(String[] args) {

        //Comparable
        //Comparator
        A myClass = new A();

        myClass.a_method();

        MyInterface a = new A();
        a.method();
//        a.a_method();

        MyInterface b = new B();
        b.method();

//        run(b);
    }
//
//    public static void run(MyInterface myInterface) {
//        myInterface.method();
//    }
}

interface MyInterface {
    /*public*/void method();
}
class B implements MyInterface {
    public void method() { System.out.println("MyClass_B.method()"); }
    public void b_method(){}
}
class A implements MyInterface {
    public void method() { System.out.println("MyClass.method()"); }
    public void a_method() {}
}