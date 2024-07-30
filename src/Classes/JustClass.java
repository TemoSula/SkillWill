package Classes;

import Intefaces.JustInterface;

public class JustClass implements JustInterface {


    @Override
    public void hello(String Message) {
        System.out.println(Message);
    }

    @Override
    public void hello(String Message, int JustNumber) {
     for(int i = 0; i < JustNumber; i++)
     {
         System.out.println(Message);
     }
    }
}
