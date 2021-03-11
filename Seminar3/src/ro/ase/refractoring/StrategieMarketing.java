package ro.ase.refractoring;

public class StrategieMarketing {
	
	public static final int VECHIME_MAXIMA=10;
	public static final float DISCOUNT_VECHIME_MAX=0.15f;
	public static final float DISCOUNT_10=0.1f;
	public static final float DISCOUNT_25=0.25f;
	public static final float DISCOUNT_35=0.35f;
	public static float getDiscount(int vechime)
	{
		return (vechime > VECHIME_MAXIMA) ? DISCOUNT_VECHIME_MAX : (float)vechime/100; 
	}
	
	public static float aplicaDiscount(float pretInitial,float valoareDiscount,float DiscountExtra) {
		return (pretInitial - (DiscountExtra * pretInitial)) - valoareDiscount * (pretInitial - (DiscountExtra * pretInitial));
	}
	public float calculeazaPretFinal(TipProdus tip,float pretInitial,int vechime)
	{
		float pretFinal=0;
		
		float discount=getDiscount(vechime);
		switch(tip)
		{
		case NOU:
			pretFinal=pretInitial;
			break;
		case DISCOUNT:
			pretFinal=aplicaDiscount(pretInitial, discount, DISCOUNT_10);
			break;
		case STOC_LIMITAT:
			pretFinal=aplicaDiscount(pretInitial, discount, DISCOUNT_25);
			break;
		case SFARSIT_DE_SEZON:
			pretFinal=aplicaDiscount(pretInitial, discount, DISCOUNT_35);
			break;
		default:
			throw new UnsupportedOperationException("Categorie produs neidentificat");
		}
		
		return pretFinal;
	}
}
