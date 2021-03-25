package ro.ase.seminar4;
import ro.ase.seminar4.EagerShoppingCartExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart shoppingCart=ShoppingCart.getInstance("shoppingCart");
		ShoppingCart wishList=ShoppingCart.getInstance("wishList");
		ShoppingCart wishList2=ShoppingCart.getInstance("wishList");
		 shoppingCart.getProducts();
		 wishList.getProducts();
		
		 if(wishList==wishList2)
		 {
			 System.out.println("obiectele wishlist sunt identice");
		 }
		
		
		
		
		
		//singleton
		 EagerShoppingCartExample example1=EagerShoppingCartExample.INSTANCE;
		 EagerShoppingCartExample example2=EagerShoppingCartExample.INSTANCE;
		 
		 //equals compara referintele
		 if(example1==example2)
		 {
			 System.out.println("obiectele sunt identice");
		 }
		 SingletonEnum mySingle=SingletonEnum.INSTANCE;
		 mySingle.getListproduse();
	}

}
