package ro.ase.cts.seminar9.flyweight;

import java.util.HashMap;

public class Model3DFactory {

	static HashMap<ModelType, ModelFLywieghtInterface> models=new HashMap<>();
	
	static
	{
		models=new HashMap<>();
		models.put(ModelType.SOLDIER, new Model3DFlyweight("Soldier", null));
		models.put(ModelType.TREE, new Model3DFlyweight("Tree", null));
	}
	
	public static ModelFLywieghtInterface getModel(ModelType type)
	{
		return models.get(type);
	}
}
