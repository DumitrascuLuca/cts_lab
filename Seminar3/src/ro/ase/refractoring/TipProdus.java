package ro.ase.refractoring;

public enum TipProdus {
NOU(0),
STOC_LIMITAT(0.25f),
SFARSIT_DE_SEZON(0.35f), 
DISCOUNT(0.1f);

private float discount;
	 TipProdus(float discount)
	{
		this.setDiscount(discount);
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
}
