import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Member member1 = new Member();
		member1.setUserId(1);
		member1.setUserFirstName("Yýlmaz");
		member1.setUserLastName("Uçar");
		member1.setNationalId(Long.parseLong("1111110424"));
		member1.setWallet((double) 500);
		member1.setDateYear(1998);
		
		Game game1 =new Game();
		game1.setGameId(1);
		game1.setGameName("PLAYERUNKNOWN'S BATTLEGROUNDS");
		game1.setGamePrice((double) 100);
		
		Game game2 =new Game();
		game2.setGameId(1);
		game2.setGameName("LOL");
		game2.setGamePrice((double) 70);
		
		MemberManager memberManager = new MemberManager();
		memberManager.add(member1);

		GamaManager gameManager = new GamaManager();
		gameManager.add(game1);
		gameManager.add(game2);
		
		SalesManager salesManager =new SalesManager();
		//Oyun Satýþý
		salesManager.saleGame(member1, game1);
		//Oyun Ýade
		salesManager.returnGame(member1, game1);
		///////////////////////////////////////////////////
		Campaign campaign = new Campaign();
		campaign.setCampaignName("Hazreti Recep Ýndirimleri");
		campaign.setDiscountRate((double) 174);
		
		CampaignManager campaignManager= new CampaignManager();
		campaignManager.add(campaign);
		
		
		salesManager.saleGameWithCampaign(member1, game1, campaign);
	}

}
