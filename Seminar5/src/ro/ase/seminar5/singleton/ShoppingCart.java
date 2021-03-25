package ro.ase.seminar5.singleton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart  implements Serializable{
	private  static ShoppingCart instance=null;
	
	private static Map<String,ShoppingCart> instances=null;
	
	public String type;
	public ArrayList<String> listproduse;
	
	private ShoppingCart() {
		instances=new HashMap<>();
		listproduse=new ArrayList<String>();
		
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
		
	
	
	
	public ArrayList<String> getProducts(){
		return listproduse;
	}
	
}
