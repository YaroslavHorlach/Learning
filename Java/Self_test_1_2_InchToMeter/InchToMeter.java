package Java.Self_test_1_2_InchToMeter;

/*
 * Самопроверка 1.2
 * 
 * Эта программа отображает таблицу перевода дюймов в метры
 */
public class InchToMeter {
    public static void main(String[] args) {
        double inches, meters;

        for (inches = 1; inches <= 100; inches++)
        {
            meters = inches / 39.37;
            System.out.println(inches + " дюймам соответствует " + meters + " метров.");

            //Через каждые 12 дюймов делается отступ
            if (inches % 12 == 0) System.out.println();
        }
    }
}
