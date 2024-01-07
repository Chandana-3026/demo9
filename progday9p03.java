//3 example of aggregation
class Author
{
String authorName;
int age;
String place;
Author(String authorName,int age,String place)
{
this.authorName=authorName;
this.age=age;
this.place=place;
}
}
class Book
{
String name;
int price;
Author auther;//Auther details
Book(String name,int price,Author auther)
{
this.name=name;
this.price=price;
this.auther=auther;
}
public static void main(String args[])
{
Author auther=new Author("John",25,"USA");
Book b=new Book("Java for beginner",500,auther);
System.out.println("Book name:"+b.name);
System.out.println("Book price:"+b.price);
System.out.println("---------Author Details----------");
System.out.println("Author name:"+b.auther.authorName);
System.out.println("Author age:"+b.auther.age);
System.out.println("Author place:"+b.auther.place);
}
}



