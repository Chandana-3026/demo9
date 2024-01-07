//Yes,final method is inherited but you cannot ovverride it
class Bike3
{
final void run()
{
System.out.println("Running");
}
}
class Honda2 extends Bike3
{
public static void main(String args[])
{
new Honda2().run();
}
}