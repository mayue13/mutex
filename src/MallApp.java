import java.util.*;

class Item
{
	String name;
	double price;
	boolean isTax;
	double gstRate;

	Item()
	{
	  name = "iPhone";
	  price =65832 ; 
	  isTax = true;
	  gstRate = 6;
	}

	Item(String name,double price,boolean isTax,double gstRate)
	{
	  this.name=name;
	  this.price=price;
	  this.isTax=isTax;
	  this.gstRate=gstRate;
	}

	Item(String name,double price,boolean isTax)
	{
	  this.name=name;
	  this.price=price;
	  this.isTax=isTax;
	  this.gstRate=6;
	}

    boolean isTaxable()
	{
	  if(isTaxable()==true)
		  return true;
	  else
		  return false;
	}

	double getGst()
	{
		double totalGST= (price*gstRate/100);
      
	   return totalGST;
	}
}

class MallApp
{
	public static void main(String args[]) 
	{
		System.out.print("How many item you want to create :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		
		Item[] item = new Item[n];
		String name;
		double price,gstRate,totalGst=0,totalPrice=0,grandTotal=0;
		boolean isTax;
		
        for (int i=0;i<item.length;i++)
        {
			System.out.print("\nEnter Product Name :");
            name = sc.next(); 
			
			System.out.print("Enter Product Price :");
			price =sc.nextDouble();

            System.out.print("is product is taxable(true/false) :");
			isTax=sc.nextBoolean();

			if(isTax==true){			
				System.out.print("Enter Product GST Rate :");
			    gstRate =sc.nextDouble();
			}
			else
				gstRate=0;

			System.out.println("Which Constructor you want to use :");
			System.out.println("1) Item()");
			System.out.println("2) Item(name,price,isTax,gstRate)");
			System.out.println("3) Item(name,price,isTax)");
			int ch=sc.nextInt();
            
			switch(ch)
			{
			  case 1:
				     item[i] = new Item();
			  case 2:
				     item[i] = new Item(name,price,isTax,gstRate);
			  case 3:
				     item[i] = new Item(name,price,isTax);
			}

			totalPrice += item[i].price;
			totalGst   += item[i].gstRate;
        } 
        
		System.out.println("Total Price ="+ totalPrice);
        System.out.println("Total tax ="+ totalGst);
		System.out.println("Grand Total ="+ (totalPrice+totalGst));


	}
}
