class Abc{

    public void m1(int x) {
        System.out.println(x + "this is int");
    }
    public void m1(float x) {
        System.out.println(x + "this is float");
    }
}


public class MethodSignature {

public static void main(String... args){

    Abc a = new Abc();
    a.m1(10);
    a.m1(10.0f);
    a.m1('a');


    }
}

// Method signature include only method name and parameters (arguments)
