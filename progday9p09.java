class A
{
String name="KAVYA";
void eat()
{
System.out.println("They are Eating...");
}
}
class B extends A
{
void display()
{
System.out.println("sub extends super...");
}
}
class Labrador
{
public static void main(String args[])
{
B labrador=new B();
System.out.println(" "+labrador.name);
labrador.eat();
labrador.display();
}
}