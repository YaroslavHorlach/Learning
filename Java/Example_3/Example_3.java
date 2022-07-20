package Java.Example_3;

public class Example_3 {
    //Сравнение int и double
    public static void main(String[] args) {
        int var1;
        double var2;

        var1 = 10;
        var2 = 10.0;

        System.out.println("Начальное значение переменной var1: " + var1);
        System.out.println("Начальное значение переменной var2: " + var2 + "\n");

        var1 /= 4;
        var2 /= 4;

        System.out.println("Значение переменной var1 после деления: " + var1);
        System.out.println("Значение переменной var2 после деления: " + var2);
    }
}
