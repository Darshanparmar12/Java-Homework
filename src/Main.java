public class Main {

    static int a = 10;
    static int b = 20;
    static int c = 30;
    static int d = 40;
    static int e = 10;
    static int total;

    // no return type no parameter
    static void add (){
    total = a + b;
        System.out.println("Addition of " + a + " and "+b+" = " + total);
}   static void sub() {
        total = d - c;
        System.out.println("Subtraction of " + d + " from " + c + " = " + total);
    }
// no return type with parameter
    static void add(int e, int f, int g) {
        total = e + f + g;
        System.out.println("Addition of " + e  + f  + g  + " = " + total);}
    static void sub (int i, int h){
        total = i - h;
        System.out.println( "Subtraction of " + i+" from " + h + " = " + total);
}
    public static void main(String[] args) {
        add();
        sub();
        add(20,30,40);
        sub(30, 20);
}
}