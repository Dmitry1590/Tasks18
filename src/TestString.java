class StringExample {
    String s;//переменная объекта по умолчанию инициализируются как null или другое в зависимости от типа данных
    StringExample() {
        System.out.println("Значение переменной s класса StringExample равно: "+s);
    }
    public static void main(String[] args) {
        //если бы мы вводили локальные переменные (в потоке) то Java потребовала бы сразу инициализировать их (задать значение)
        new StringExample();// мы вызвали конструктор объекта, который инициализирует свою переменнную s по умолчанию
        // поэтому при выводе в консоль выводится значение null

    }
}


