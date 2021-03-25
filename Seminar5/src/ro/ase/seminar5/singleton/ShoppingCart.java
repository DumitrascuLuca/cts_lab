package ro.ase.seminar5.singleton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ro.ase.seminar5.factory.Product;

public class ShoppingCart  implements Serializable{
	private  static ShoppingCart instance=null;
	
	private static Map<String,ShoppingCart> instances=null;
	
	public String type;
	public ArrayList<Product> listproduse;
	
	private ShoppingCart() {
		instances=new HashMap<>();
		listproduse=new ArrayList<Product>();
		
	}
	public static synchronized ShoppingCart getInstance(String type) {
		if(instances==null){
			instances= new HashMap<>();
			
		}
		if(!instances.containsKey(type))
		{
			ShoppingCart cart=new ShoppingCart();
			cart.type=type;
			instances.put(type, cart);
		}
		return instances.get(type);
}
		
	
	
	
	public ArrayList<Product> getProducts(){
		return listproduse;
	}
	
}
