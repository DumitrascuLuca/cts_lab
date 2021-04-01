package ro.ase.seminar5.factory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;

import javax.smartcardio.ATR;

public class TechProductFactory extends AbstractProductFactory{

	@Override
	public Product makeProduct() throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		return new TechProduct("generic");
	}

	@Override
	public String getCalaog() {
		// TODO Auto-generated method stub
		ArrayList<String> records=readRecord("tech_products.csv");
		StringBuilder builder=new StringBuilder();
		for(String record:records)
		{
			String[] attributes=record.split(",");
			builder.append(attributes[0]);
			builder.append(attributes[0]+" - ");
			builder.append(attributes[1]+" ").append(attributes[2]+" ").append(attributes[3]+"\n");
			
		}
		return builder.toString();
		
	}

	
	private ArrayList<String> readRecord(String numeFisiser){
		ArrayList<String> records=new ArrayList<String>();
		
		URL fileUrl=getClass().getResource(numeFisiser);
		
		File productsFile=new File(fileUrl.getPath());
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader(productsFile));
			String line;
			while((line=reader.readLine())!=null) {
				records.add(line);
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return records;
	}
}
