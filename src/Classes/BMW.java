package Classes;

public class BMW extends Car{
    @Override
    public void speed() {
        System.out.println("BMW speed is 320");
    }

    @Override
    public void color() {
        System.out.println("BMW color is black");
    }

    @Override
    public void wheelCount()
    {
        System.out.println("I have only 4 wheel");
    }

}
