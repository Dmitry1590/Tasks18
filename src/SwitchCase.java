import java.util.Random;

public class SwitchCase {
    public static void main(String[] args) {
        Random rand = new Random();//генератор случайных чисел
        for (int i = 0; i < 20; i++) {
            int c = rand.nextInt(26) + 'a';// рандомное число  от 0 до 26 и прибавляется символ 'а'.
            //символ а принадлежит типу char, который входит в тип int и автоматически преобразуется в него при сложении
            //при переводе символа a в целочисленный используется система Unicode в которой все известные символы и цифры, числа
            // имеют свой номер, и свое представление в нужной нам системе. например 'a' имеет номер U+0061
            //и в десятичной системе это соответствует числу 97
            // поэтому происходит арифметическое сложение числа 97 и рандомного числа [0, 26] и получается номер
            //соответствующий другому символу английского алфавита при переводе к типу char
            // int d='d';//так можно
            // int e=2+'f';//так тоже можно
            System.out.println((char) c + ", " + c + ": ");//(char)c- кастование, мы преобразуем целочисленный тип c к символьному
            // и прописываем номер этого символа в десятичной системе
            //введем конструкцию [switch - case] для отлова гласных букв
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("гласная");
                    break;
                case 'y':
                case 'w':
                    System.out.println("условно гласная");
                    break;
                default:
                    System.out.println("согласная");
            }
        }
    }
}