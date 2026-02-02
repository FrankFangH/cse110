public class test {
    public static void main(String[] args) {
        String name = "Frank";

        System.out.println("My name is " + name);
        System.out.printf("My name is %s%n", name);
        System.out.print("My name is " + name);

        char b = 'A';
        char d = 'a';

        System.out.println(d - b);

        String name_1 = "apple";
        char first = name_1.charAt(0);
        char cap = (char)(first - 32);
        String result = cap + name_1.substring(1);
        System.out.println(result);
    }

}