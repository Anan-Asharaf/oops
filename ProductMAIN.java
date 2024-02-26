import.io.java.*;
 class product{
          int price;
          string pcode,pname;
public product(string pcode,string pname,int price)
{
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
string.getpcode()
{
return pcode;
}
string.getpname()
{
return pname;
}
string.getprice()
{
return price;
}

void display()
{

system.out.print("product name=");
system.out.println(this.pname);
system.out.print("product code=");
system.out.println(this.pcode);
system.out.print("product price=");
system.out.println(this.price);
}
}
class product MAIN
{

public static void main(String args[])
{
System.out.println("ANAN AYSHA  Rollno:14 program 1)Define a class ‘product’ with data members pcode, pname and price.");
System.out.println("product 1");
Product p1=new Product("ca45","car",540000);
p1.display();
System.out.println("product 2");
Product p2=new Product("bike45","bike",100000);
p2.display();
System.out.println("product 3");
Product p3=new Product("lorry45","lorry",1000000);
p2.display();
Product p;

System.out.println("------product details of lower price---");
if(p1.price<p2.price)
{
  if(p1.price<p3.price)
  {
  p=p1;
  }
  else
  {
  p=p3;
  }
 }
else
 {
  if(p2.price<p3.price)
  {
  p=p2;
  }
  else
  {
  p=p3;
  }
 }
 p.display();
 }
 }
