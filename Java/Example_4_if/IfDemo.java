package Java.Example_4_if;

//Демонстрация применения инструкции if
public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b) System.out.println("a меньше b\n");
        if (a == b) System.out.println("Вы не должны увидеть этот текст\n");

        c = a - b;

        System.out.println("c содержит " + c);

        if (c >= 0) System.out.println("c - положительное\n");
        if (c < 0) System.out.println("c - отрицательное\n");

        c = b - a;

        System.out.println("c содержит " + c);

        if (c >= 0) System.out.println("c - положительное");
        if (c < 0) System.out.println("c - отрицательное");
    }
}
