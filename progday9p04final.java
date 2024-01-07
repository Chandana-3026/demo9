//final keyword
//stop value
//stops method overriding
//stops Inhertance
//program using final
class Bike
{
final int speedlimit=90;
void run()
{
//speedlimit=400;//error because speedlimit is declared as final
System.out.println(speedlimit);
}
public static void main(String args[])
{
Bike ob=new Bike();
ob.run();
}
}
