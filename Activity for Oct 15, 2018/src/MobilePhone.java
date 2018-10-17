
public class MobilePhone
{
	private String manufacturer;
	private String model;
	private float price;
	private String carrier;
	
	public MobilePhone(String manufacturer, String model, float price, String carrier)
	{
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.carrier = carrier;
	}

	public String call(String phoneNumber)
	{
		return("I am calling " + phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6, 10));
	}
	
	public String text(String message)
	{
		return(message);
	}
	
	@Override
	public String toString()
	{
		return "MobilePhone [manufacturer=" + manufacturer + ", model=" + model + ", price=" + price + ", carrier="
				+ carrier + "]";
	}
	
}
