package ro.ase.seminar11.main;

import ro.ase.seminar11.state.Gate;

public class Main {
	Gate securedGate=new Gate();
	securedGate.authorize();
	securedGate.enter();
}
