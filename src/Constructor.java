public class Constructor {
    public static void main(String[] args) {
        //обычно чтобы инициализировать объект мы обращаемся к методам экземпляра класса Obsos создав его оператором new
        Obsos obsos1=new Obsos();
        Obsos obsos2=new Obsos("Ivanushka");
        obsos1.giveMeName("Dima",30);
        //в зависимсти от передаваемых аргументов, конструктор сам понимает какой именно конструктор вызвать
    }
}

class Obsos{
    //в каждом классе всегда присутствует конструктор по умолчанию без аргументов
     public Obsos(){
         //теперь переопределим наш конструктор, добавим вывод на консоль
         System.out.println("Привет из первого конструктора, обсос!");
     }

     //давайте создадим конструктор который будет принимать аргументы

    public Obsos(String name1){
        System.out.println("Привет из второго конструктора, обсос "+name1);
    }

    //на данный момент я не прошел сеттеры и геттеры
    public void giveMeName(String name, int age) {
        System.out.println("Меня зовут "+name+", Мне "+age+" лет");
    }
}
