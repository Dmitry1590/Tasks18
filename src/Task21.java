public class Task21 {
    //сначала без return
    //public static void main(String[] args) {
    //введем метод вывода
    public static int Counter(int k, int d) {
        for (int i = 1; i < k; i++) {
            if (i != d) {System.out.println("Текущее значение: " + i);
            continue;}//continue позволяет перейти к следующей итерации при условии true
            if (i == d) { System.out.println("Значение равно: " + i);
                break;// выход из цикла (у нас это при нашем условии false)
            }
        }
        System.out.println("Выход из цикла");//пишем что вышли из цикла
        return d;// условие задачи использовать return поэтому нужно любое int
    }

    public static void main(String[] args) {
        Counter(100, 85);
    }
}