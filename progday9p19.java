//3.Using final ,If you make any class as final ,you cannot extend it
final class Bike2
{
}
class Honda1 extends Bike2
{
void run()
{
System.out.println("Running safely with 100kmph");
}
public static void main(String args[])
{
Honda1 obh=new Honda1();
obh.run();
}
}