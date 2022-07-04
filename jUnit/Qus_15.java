package jUnitAs;

import java.time.LocalDate;

public class Qus_15
{
//	Create a class Item which will have following fields, itemid, itemname, cost_price, sell_price, date of
//	manufacturing, date of expiring. While creating the object of the item class, following rules need to
//	be follow, itemid should have 3 digits at least, itemname only contains alphabets, price can not
//	contain negative numbers, date of expiring can not be today, cost price and sell price should not be
//	same. Write test case to check all of the above condition

	int itemid;
	String itemname;
	static int cost_price;
	int sell_price;
	LocalDate dom;
	LocalDate doe;
	
	public int getItemid()
	{
		return itemid;
		
	}
	
	public boolean setItemid(int itemid)
	{

		int cnt=0;
		int temp=itemid;
		while(itemid>0)
		{
			itemid=itemid/10;
			cnt++;
		}
		if(cnt>=3)
		{
		this.itemid=temp;
		return true;
		}
		else
		{
			System.out.println("Enter 3 digit id");
		}
		return false;
	}
	public String getItemname() 
	{
		return itemname;
	}
	public boolean setItemname(String itemname) {
		int cnt=0;
		for(int i=0;i<itemname.length();i++)
		{
			char ch= itemname.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z')
			{
				cnt++;
			}
		}
		if(cnt==itemname.length())
		{
			this.itemname = itemname;
			return true;
		}
		else
		{
			System.out.println("Enter only alphabets");
		}
		return false;
	}
	public double getCost_price() {
		return cost_price;
	}
	public boolean setCost_price(int cost_price) {

		if(cost_price>0)
		{
		this.cost_price = cost_price;
		
		return true;
		}
		else
			System.out.println("enter price greater than zero");
		return false;
	}
	public double getSell_price() {
		return sell_price;
	}
	public boolean setSell_price(int sell_price) {
		if(cost_price != sell_price)
		{
		this.sell_price = sell_price;
		return true;
		}
		else
		{
			System.out.println("sell price and cost price cannot be same");
		}
		return false;
	}
	public LocalDate getDom() {
		return dom;
	}
	public void setDom(LocalDate dom) {
		this.dom = dom;
	}
	public LocalDate getDoe() {
		return doe;
	}
	public boolean setDoe(LocalDate doe) {
		 if(doe.compareTo(LocalDate.now())!=0)	
		 {
			this.doe = doe;
			return true;
		 }
		 else
		 {
			 System.out.println("enter different date than today");
		 }
		return false;
	}
	






}
