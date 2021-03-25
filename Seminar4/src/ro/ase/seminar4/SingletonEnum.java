package ro.ase.seminar4;

import java.util.ArrayList;

public enum SingletonEnum {
INSTANCE;
public ArrayList<String> listproduse;

public ArrayList<String> getListproduse() {
	if(listproduse==null)
	{
		listproduse=new ArrayList<String>();
	}
	return listproduse;
}


public void setListproduse(ArrayList<String> listproduse) {
	this.listproduse = listproduse;
}

}

