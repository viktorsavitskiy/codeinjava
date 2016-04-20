public class SalesPerson
{
private int id;
private double sales;

SalesPerson(int idnum, double amt)
{
id = idnum;
sales = amt;
}
public int getId()
{
return id;
}
public double getSales(){
return sales;
}
public void setId(int idNum)
{
id = idNum;
}

public void setSales(double amt){
sales = amt;
}
}