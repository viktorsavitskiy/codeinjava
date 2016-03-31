/*
100 range 3.5 to 4.0
120 range 4.2 to 4.8

low= barrelprice *0.035
high= barrelprice * 0.048
*/

import java.util.Scanner;
public class GasPrices
{
public static void main(String[] args)
{
int pricePerBarrel;
Scanner input = new Scanner(System.in);
System.out.print("Enter price per barrel >>");
pricePerBarrel = input.nextInt();
PriceRange(pricePerBarrel);

}
public static void PriceRange(int BarrelPrice)
{
double Low = BarrelPrice * 0.035;
double High = BarrelPrice * 0.04;
System.out.println("Price per gallon range = $"+Low + " S to $" +High);
}
}