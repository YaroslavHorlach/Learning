package Java.Task_2_1_LogicalOpTable;

/*
 * Упражнение 2.1
 * 
 * Отображение таблицы истинности для логических операций
 */
public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;

        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));

        p = true;
        q = false;

        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));
        p = false;
        q = true;

        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));
        p = false;
        q = false;

        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));
    }
}
