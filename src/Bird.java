public class Bird extends Animal{
    public Bird(String Name, Integer Age) {
        super(Name, Age);
    }
    @Override
    public void makeSound()
    {
        System.out.println("Чик-чирик");
    }

}
