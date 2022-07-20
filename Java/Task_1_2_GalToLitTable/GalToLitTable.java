package Java.Task_1_2_GalToLitTable;

/*
 * Упражнение 1.2
 * 
 * Эта программа отображает таблицу перевода галлонов в литры
 */
public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;

        for (gallons = 1; gallons <= 100; gallons++) 
        {
            liters = gallons * 3.7854;
            System.out.println(gallons + " галлонам соответ ствует " + liters + " литра.");
            
            counter++;

            if (counter == 10)
            {
                System.out.println();
                counter = 0;
            }
        }
    }
}
