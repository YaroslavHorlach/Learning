package Java.Example_6_CharAsInt;

// С символьными переменными можно обращаться 
// как с целочисленными
public class CharAsInt {
    public static void main(String[] args) {
        char ch;
        ch = 'X';

        System.out.println("ch содердит " + ch);

        ch++;

        System.out.println("Теперь ch содердит " + ch);

        ch = 90; //Присвоить переменной ch значение 'Z'

        System.out.println("Теперь ch содердит " + ch);
    }
}
