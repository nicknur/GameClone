
public class CampaignManager implements ICampaign {

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " adlý kampanya ile bütün oyunlar % "
				+ campaign.getDiscountRate() + "ile alabilirsiniz");
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " adlý kampanya güncellenmiþtir % " + campaign.getDiscountRate()
				+ "ile bütün oyunlarý alabilirsiniz");
	}

	@Override
	public void remove(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " adlý kampanya sona ermiþtir bütün oyunlarý alabilirsiniz");
	}

}
