package Java.Task_1_1_GalToLit;

/*
 * Упражнение 1.1
 * 
 * Программа перевода галлонов в литры
 */
public class GalToLit {
    public static void main(String[] args) {
        double gallons; //в этой переменной хранится значение,выражающее объем жидкости в галлонах
        double liters;  //в этой переменной хранится значение,выражающее объем жидкости в литрах

        gallons = 10;
        liters = gallons * 3.7854;

        System.out.println(gallons + " галлонам соответствует " + liters + " литра");
    }
}
