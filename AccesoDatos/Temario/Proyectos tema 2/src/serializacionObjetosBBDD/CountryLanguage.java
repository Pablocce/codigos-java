package serializacionObjetosBBDD;



@jakarta.xml.bind.annotation.XmlType(propOrder = {"countryCode", "language", "isOfficial", "percentage"})
public class CountryLanguage {
	private String countryCode;
	private String language;
	private String isOfficial;
	private float percentage;
	
	public CountryLanguage(String countryCode, String language, String isOfficial, float percentage) {
		super();
		this.countryCode = countryCode;
		this.language = language;
		this.isOfficial = isOfficial;
		this.percentage = percentage;
	}
	
	public CountryLanguage() {}

	public String getCountryCode() {
		return countryCode;
	}

	public String getLanguage() {
		return language;
	}

	public String getIsOfficial() {
		return isOfficial;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setIsOfficial(String isOfficial) {
		this.isOfficial = isOfficial;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	

	
	}
	
	
	
	


