package springCoreAssignment15;

public class Customer 
{
	String custname;
	Item item;
	
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	
	public void showw()
	{
		Customer mobj=new Customer();
		System.out.println("category:- "+item.getCat());
		System.out.println("Item id:- "+item.getItemid());
		System.out.println("item name:-"+item.getItemname());
		System.out.println("item price:-"+item.getItemprice());
		System.out.println("cust. name:-"+ mobj.getCustname());
	}
	
	
	
}
