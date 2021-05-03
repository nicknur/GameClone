
public class Campaign implements IEntities {

	private String campaignName;
	private Double discountRate;

	public Campaign() {
		super();
	}

	public Campaign(String campaignName, Double discountRate) {
		super();
		this.campaignName = campaignName;
		this.discountRate = discountRate;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public Double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}

}
