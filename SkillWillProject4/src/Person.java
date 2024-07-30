public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String favoriteColor;
    private String favoriteCar;

    public Person()
    {

    }
    public Person(String FirstName,String LastName,int Age,String FavoriteColor,String FavoriteCar)
    {
     this.firstName = FirstName;
     this.lastName = LastName;
     this.age = Age;
     this.favoriteColor = FavoriteColor;
     this.favoriteCar = FavoriteCar;
    }




    //this is Setter and Getter for FirstName
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String FirstName)
    {
         this.firstName = FirstName;
    }





    //this is Setter and Getter for LastName
    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String LastName)
    {
        this.lastName = LastName;
    }





    //this is Getter and Setter for Age
    public int getAge()
    {
        return age;
    }

    public void setAge(int Age){
        this.age = Age;
    }






    //This is Getter and Setter for FavoriteColor
    public String getFavoriteColor()
    {
        return favoriteColor;
    }

    public void setFavoriteColor(String FavoriteColor){
        this.favoriteColor = FavoriteColor;
    }


    //this is Getter and Setter for FavoriteCar

    public String getFavoriteCar(){
        return favoriteCar;
    }

    public void setFavoriteCar(String FavoriteCar){
        this.favoriteCar = FavoriteCar;
    }




}
