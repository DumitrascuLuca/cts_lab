package ro.ase.cts.seminar9;

import ro.ase.cts.seminar9.flyweight.Model3DFactory;
import ro.ase.cts.seminar9.flyweight.ModelFLywieghtInterface;
import ro.ase.cts.seminar9.flyweight.ModelType;
import ro.ase.cts.seminar9.flyweight.ScreenData;
import ro.ase.cts.seminar9.proxy.YoutubeLibrary;
import ro.ase.cts.seminar9.proxy.YoutubeLibraryInterface;
import ro.ase.cts.seminar9.proxy.YoutubeLibraryProxy;

public class Main {

	public static void main(String[] args) {
		//without proxy
		YoutubeLibraryInterface youtubelibrary=new YoutubeLibrary();
		System.out.println(youtubelibrary.listVideos());
		System.out.println(youtubelibrary.getVideoInfo(1));
		System.out.println(youtubelibrary.getVideoInfo(1));
		
		System.out.println("\n------------------");
		//with proxy
		YoutubeLibraryInterface youtubelibraryProxy=new YoutubeLibraryProxy();
		System.out.println(youtubelibrary.listVideos());
		System.out.println(youtubelibrary.getVideoInfo(1));
		
		System.out.println("\n------------------");
		ScreenData soldier1=new ScreenData("green", 99, 30, 100);
		ScreenData soldier2=new ScreenData("green", 20, 30, 40);
		
		ModelFLywieghtInterface soldier1Interace=Model3DFactory.getModel(ModelType.SOLDIER);
		ModelFLywieghtInterface soldier2Interace=Model3DFactory.getModel(ModelType.SOLDIER);
		soldier1Interace.display(soldier1);
		soldier1Interace.display(soldier2);
		soldier2Interace.display(soldier2);
		
	}

}
