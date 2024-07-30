import Classes.BMW;
import Classes.JustClass;
import Classes.Mercedes;

public class Main {

    //შექმენი ინტერფეისი გაწერე მეთოდი სახელით hello რომელსაც გადაეცემა არგუმენტად მესიჯი, გაწერე მეორე მეთოდი იგივე სახელით
    //რომელსაც გადაეცემა ორი არგუმენტი: მესიჯი და ციფრი. შექმენი კლასი რომელიც დაიმპლემენტირებს ამ ინტერფეისს და გადაუტვირთავს ორივე მეთოდს, პირველის შემთხვევაში
    //მეთოდმა უნდა დაბეჭდოს მესიჟი, ცოლო მეორე შემთხვევაში მეთოდმა უნდა დაბეჭდოს მესიჯი იმდენჯერ რამდენჯერაც მეთოდის მეორე არგუმენტში წერია


    //შექმენი აბსტრაკტული კლასი მანქანა, რომელსაც ექნება 2 აბსრატქული მეთოდი: სიჩქარე და ფერი, და 1 არა აბსტრაქტული მეთოდი საბურავების რაოდენობა. შექმენი რამდენიმე კლასი
    // რომელიც ამ აბსრაქტულ კლასს დაექსტენდებს, გადატვირთე
    //აბსრაქტული მეთოდები და გამოიძაცე თითოეული მათგანი

    public static void main(String[] args)
    {

        //this is task for Interface
        JustClass justclass = new JustClass();//aq shevqmenit klasis obieqti
        justclass.hello("Hello Guys");//es ubralod dabechdavs messages etxel
        justclass.hello("Hello Skillwill", 7);//es dabechdavs am messages 7 jer


        //this is task for AbstractClass

        BMW bmw  = new BMW();
        bmw.speed();
        bmw.color();
        bmw.wheelCount();


        Mercedes mercedes = new Mercedes();
        mercedes.speed();
        mercedes.color();
        mercedes.wheelCount();



    }
}