import java.util.Arrays;
import java.util.Random;

public class Task18Page131Cicle {
    public static void main(String[] args) {
        //int n = 100;
        int number = 20;
        int count = 0;
        Random random2 = new Random();
        int[] massive = new int[number];
        int[] massive2 = new int[number];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random2.nextInt(100);
            System.out.println("Текущее значение: " + massive[i]);
            for (int j = 2; j < massive[i]; j++) {
                //System.out.println("Делим на j " + j);//вывожу элемент
                if (massive[i] % j != 0) {
                    if (j == massive[i] - 1) {
                        System.out.println("Число является простым");
                        massive2[count] = massive[i];
                        count++;
                    } //else System.out.println("Переходим к следующему делителю j");
                    continue;
                }
                System.out.println("Число не является простым, переходим к следующему");
                break;

            }
        }
        System.out.println(Arrays.toString(massive));//красиво выводит массив в формате [n1, n2, n3.....n]
        System.out.println("Из них простые числа:");
        System.out.println(Arrays.toString(massive2));
    }
}