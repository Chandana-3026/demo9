//1.Super is used to refer immediate parent class instance variable
class Animal
{
String color="White";
}
class Dog extends Animal
{
String color="Black";
void printColor()
{
System.out.println(color);//prints color of dog class
System.out.println(super.color);//prints color of animal class
}
}
class Main2
{
public static void main(String args[])
{
Dog d=new Dog();
d.printColor();
}
}
