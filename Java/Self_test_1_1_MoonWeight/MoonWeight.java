package Java.Self_test_1_1_MoonWeight;

/*
 * Самопроверка 1.1
 * 
 * Программа вычесления теоретического веса на Луне
 */
public class MoonWeight {
    public static void main(String[] args) {
        double weightOnEarth, weightOnMoon;

        weightOnEarth = 68.7;
        weightOnMoon = weightOnEarth * 0.17;

        System.out.println("Если ваш вес на планете Земля состовляет " + weightOnEarth + 
        ", то на Луне вы бы весили " + weightOnMoon);
    }
}
