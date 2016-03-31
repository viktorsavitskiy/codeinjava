public class DemoSalesperson
{
public static void main(String[] args)
{
SalesPerson[] salespeople = new SalesPerson[10];
int i;
for( i = 0; i < salespeople.length; i++)
{
salespeople[i] = new SalesPerson(9999, 0);
}
for (i = 0; i < salespeople.length; i++)
{
System.out.println(salespeople[i].getId()+ " " + salespeople[i].getId());
}

}

}