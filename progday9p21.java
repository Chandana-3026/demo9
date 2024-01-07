//We can initialize blank final variable ,but only in constructor
class Bike10
{
final int speedlimit;
Bike10()
{
speedlimit=75;
System.out.println(speedlimit);
}
public static void main(String args[])
{
new Bike10();
}
}
