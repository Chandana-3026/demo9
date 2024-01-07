/*
Method overriding
if same method is present in both the superclass And subclass the method in the subclass ovverrides the method in the superclass .This concept is known as metho "Overriding" in Java.
*/
class Animal
{
public void eat()
{
System.out.println("I can eat");/this doesn't execute because it ovverrides same method name//to execute we need to create again the                                                                                                                //obj for the animal class and then should call the eat() method
}
}
class Dog extends Animal
{
public void eat()//method overriding
{
System.out.println("I eat dog food");
}
public void bark()
{
System.out.println("I can Bark..");
}
}
class Main
{
public static void main(String args[])
{
Dog labrador=new Dog();//create an object for subclass
labrador.eat();//calling the eat()method
labrador.bark();
}
}
