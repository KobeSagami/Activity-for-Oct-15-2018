
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
		String extension = "";
		String areaCode = "";

		phoneNumber = phoneNumber.trim().replaceAll(" ", "").replaceAll("-", "");
		
		if (phoneNumber.contains("\\(") && phoneNumber.contains("\\)"));
		{
			extension = phoneNumber.substring(0, 3);
			phoneNumber = phoneNumber.substring(3);
		}
				
		if (phoneNumber.length() > 7)
		{
			areaCode = phoneNumber.substring(0, 3);
			phoneNumber = phoneNumber.substring(3);
			phoneNumber = extension + areaCode + "-" + phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3);
		}
		else
		{
			phoneNumber = phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3);
		}

		return("I am calling " + phoneNumber);
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
