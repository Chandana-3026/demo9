//3.super is used to invoke parent class Constructor
class Animal
{
Animal()
{
System.out.println("Animal is created");
}
}
class Dog1 extends Animal
{
Dog1()
{
super();
System.out.println("Dog is created");
}
}
class Main4
{
public static void main(String args[])
{
Dog1 d1=new Dog1();
}
}