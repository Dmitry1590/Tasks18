import java.util.*;
public class Task18Page131Cicle {
    public static void main(String[] args) {
        int n=100;
        int number=20;
        int count=0;
        Random random2=new Random();
        int [] massive=new int[number];
        int [] massive2=new int[20];

for (int i=0; i<massive.length-1;i++) {
    massive[i] = random2.nextInt(100);

    for (int j = 2; j < massive[i]-1; j++) {
        if (massive[i] % j == 0) {
            massive2[count] = massive[i];
            count++;
        }

    }
}
        System.out.println(Arrays.toString(massive));//красиво выводит массив в формате [n1, n2, n3.....n]
        System.out.println("Из них простые числа:");
        System.out.println(Arrays.toString(massive2));
}
}