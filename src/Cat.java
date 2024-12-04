public class Cat extends Animal
{
    public Cat(String Name, Integer Age)
    {
        super(Name, Age);
    }
    @Override
    public void makeSound()
    {
        System.out.println("Мяу");
    }

}
