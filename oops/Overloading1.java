package oops;


// method said to be overloading if and only if the method has same name but different arguments type.
// In overloading, method resolution always taken care by the compiler at the time of compilation based on reference
// variable.hence overloading also considered as compile time polymorphism or early binding
// or static polymorphism


class Over1{
     Over1() {
         System.out.println("sp");
     }
     Over1(int x){
         System.out.println(x +' ' +"overloaded");
     }
}

public class Overloading1 {

public  static void main(String... args){

    Over1 o = new Over1();
    Over1 o1 = new Over1(25);

}
}
