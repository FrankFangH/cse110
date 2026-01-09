
public class exercise_an {
    public static void main(String[] args) {
        // Ex1
        System.out.println(false || true && false);    // f 
        System.out.println(!(false || true) && true);  // f
        System.out.println(true || false && !true);    // t
        System.out.println((5 > 3) && (2 + 2 == 4));   // t
        System.out.println((5 > 3) || (2 + 2 != 4));   // f

        // Ex3
        int a = 0;
        int b = 1;

        boolean ok1 = (a++ > 0) && (b++ > 0);
        System.out.println("ok1=" + ok1);      // ok1=f

        boolean ok2 = (a++ > 0) || (b++ > 0);
        System.out.println("ok2=" + ok2);      // ok2=t

        boolean ok3 = !(a++ > 1) && (b++ > 1);
        System.out.println("ok3=" + ok3);      // ok3=f

        System.out.println("a=" + a + ", b=" + b); // a=3, b=1

        System.out.println("-----------------------");
    }
}