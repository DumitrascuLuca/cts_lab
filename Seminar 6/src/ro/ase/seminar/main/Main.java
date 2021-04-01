package ro.ase.seminar.main;

import java.util.Scanner;

import ro.ase.seminar.builder.AbstractProductFactory;
import ro.ase.seminar.builder.Product;
import ro.ase.seminar.builder.TechProductFactory;
import ro.ase.seminar.singleton.ShoppingCart;



//import com.sun.java_cup.internal.runtime.Scanner;


public class Main {

	public static void main(String[] args) {

		
ShoppingCart myShoppingCart = ShoppingCart.getInstance("shopping");

//Product smartphone = new TechProduct();
//Product paperClip = new OfficeProduct();
//myShoppingCart.products.add(smartphone);
//myShoppingCart.products.add(paperClip);

Scanner scan = new Scanner(System.in);
System.out.println("Selectati categoria de produse :\n tech - Produse tech \n office - Produse office");
String userPreference=scan.nextLine();

Product myProduct = null;

AbstractProductFactory productFactory=null;
if(userPreference!=null) {
	if(userPreference.equalsIgnoreCase("tech")) {
		productFactory=new TechProductFactory();
	}
}

//if(userPreference.equalsIgnoreCase("tech")) {
//	myProduct = new TechProduct();
//}else if(userPreference.equalsIgnoreCase("office")) {
//	myProduct = new OfficeProduct();
//}
//else {
//	System.out.println("Optiune invalida");
//	System.out.println("Catalog produse :\n tech - Produse tech \n office - Produse office");
//}
//
//ProductFactory productFactory = new ProductFactory();

myProduct = productFactory.makeProduct();

if(myProduct != null) {
	myShoppingCart.listproduse.add(myProduct);
}

for(Product p:myShoppingCart.listproduse) {
	System.out.println(p.getDescription());
}
		
		
	}

}
