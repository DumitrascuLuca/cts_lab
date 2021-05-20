package ro.ase.cts.seminar12.memento;

public class GameCharacter {

	String name;
	int hitpoints;
	
	public GameCharacter(String name, int hitpoints) {
		super();
		this.name = name;
		this.hitpoints = hitpoints;
	}
	

	public CharacterMemento generateMemento() {
		return new CharacterMemento(this.name, this.hitpoints);
	}
	
	public void setEmmento(CharacterMemento memento) {
		this.name=memento.name;
		this.hitpoints=memento.hitpoints;
		
	}
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHitpoints() {
		return hitpoints;
	}


	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}


	public void bleed() {
		this.hitpoints-=10;
	}
}
