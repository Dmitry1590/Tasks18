public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog dog1 = new Dog ();
        Dog dog2 = new Dog ();
        dog1.name= "spot";//имя собаки 1
        dog2.name= "scruffy";//имя собаки 2
        dog1.says= "Ауф какая цыпа";
        dog2.says= "Гав нахуй";
        System.out.println("Собака по кличке "+dog1.name+" говорит: "+dog1.says );
        System.out.println("Собака по кличке "+dog2.name+" говорит: "+dog2.says );

        Dog dog3 = new Dog ();
        dog3.name= "spot";//имя собаки 3 совпадает с собакой 1
        dog3.says= "Ауф какая цыпа";

        System.out.println(dog3.equals(dog1));//false метод не переопределен??? (не понял)
        System.out.println(dog3==dog1);//false (сравниваются только ссылки, исход очевиден)
    }

}

