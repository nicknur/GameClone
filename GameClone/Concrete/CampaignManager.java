
public class CampaignManager implements ICampaign {

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " adl� kampanya ile b�t�n oyunlar % "
				+ campaign.getDiscountRate() + "ile alabilirsiniz");
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " adl� kampanya g�ncellenmi�tir % " + campaign.getDiscountRate()
				+ "ile b�t�n oyunlar� alabilirsiniz");
	}

	@Override
	public void remove(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName() + " adl� kampanya sona ermi�tir b�t�n oyunlar� alabilirsiniz");
	}

}
