public class Main {
    public static void main(String[] args)
    {



         //create object Without Parameter
        Person person = new Person();





        //FirstName Get and Set Methods
        person.setFirstName("Girogi");
        System.out.println(person.getFirstName());



        //LastName Get and Set Methods
        person.setLastName("Giorgadze");
        System.out.println(person.getLastName());



        //Age Get and Set Methods
        person.setAge(18);
        System.out.println(person.getAge());



        //FavoirteColor Get and Set Methods
        person.setFavoriteColor("White");
        System.out.println(person.getFavoriteColor());



        //FavoriteCar Get and Set Methods
        person.setFavoriteCar("Mercedes");
        System.out.println(person.getFavoriteCar());



        //Create object With parametrized constructor
        //Only Using Getters
        Person person1 = new Person("Nika","Beridze",22,"Yellow","BMW");
        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAge());
        System.out.println(person1.getFavoriteColor());
        System.out.println(person1.getFavoriteCar());





    }
}