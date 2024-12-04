public class Dog extends Animal
{

    public Dog(String Name, Integer Age)
    {
        super(Name, Age);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Гав");
    }
}
