//2.Super can be used to invoke immediate parent class method
class A
{
void eat()
{
System.out.println("Starving..");
}
}
class Animal extends A
{
void eat()
{
System.out.println("Eating...");
}
}
class Dog extends Animal
{
void eat()
{
System.out.println("Eating bread..");
}
void bark()
{
System.out.println("Barking...");
}
void work()
{
super.eat();
bark();
}
}
class Main3
{
public static void main(String args[])
{
Dog d=new Dog();
//d.eat();
d.work();
}
}
