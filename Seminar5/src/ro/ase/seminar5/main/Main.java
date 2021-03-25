package ro.ase.seminar5.main;

import java.util.Scanner;

//import com.sun.java_cup.internal.runtime.Scanner;

import ro.ase.seminar5.factory.OfficeProduct;
import ro.ase.seminar5.factory.Product;
import ro.ase.seminar5.factory.ProductFactory;
import ro.ase.seminar5.factory.TechProduct;
import ro.ase.seminar5.singleton.ShoppingCart;

public class Main {

	public static void main(String[] args) {
ShoppingCart myShoppingCart = ShoppingCart.getInstance("shopping");
		
//		Product smartphone = new TechProduct();
//		Product paperClip = new OfficeProduct();
//		myShoppingCart.products.add(smartphone);
//		myShoppingCart.products.add(paperClip);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Catalog produse :\n tech - Produse tech \n office - Produse office");
		String userPreference=scan.nextLine();
		
		Product myProduct = null;
		
//		if(userPreference.equalsIgnoreCase("tech")) {
//			myProduct = new TechProduct();
//		}else if(userPreference.equalsIgnoreCase("office")) {
//			myProduct = new OfficeProduct();
//		}
//		else {
//			System.out.println("Optiune invalida");
//			System.out.println("Catalog produse :\n tech - Produse tech \n office - Produse office");
//		}
		
		ProductFactory productFactory = new ProductFactory();
		myProduct = productFactory.makeProduct(userPreference, "generic");
		
		if(myProduct != null) {
			myShoppingCart.listproduse.add(myProduct);
		}
		
		for(Product p:myShoppingCart.listproduse) {
			System.out.println(p.getDescription());
		}
		
		
		
	}

}
