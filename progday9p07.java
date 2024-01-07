class Animal
{
void eat()
{
System.out.println("EAting.........");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println("Barking........");
}
}
class BabyDog extends Dog
{
void weep()
{
System.out.println("Weeping........");
}
}
class TestInheritance1
{
public static void main(String args[])
{
BabyDog d=new BabyDog();
d.weep();
d.bark();
d.eat();
}
}