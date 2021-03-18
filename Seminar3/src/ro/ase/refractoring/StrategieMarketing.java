package ro.ase.refractoring;

public class StrategieMarketing {
	
	public static final int VECHIME_MAXIMA=10;
	public static final float DISCOUNT_VECHIME_MAX=0.15f;
	
	
	
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
		pretFinal=(tip!=tip.NOU) ? aplicaDiscount( pretInitial, discount,tip.getDiscount()) : pretInitial;
		
		return pretFinal;
	}
}
