
public class SalesManager implements ISales {

	Validator _validator=new Validator();
	
	public void saleGame(Member member, Game game) {
		// Cüzdan Kontrolü yapýlmalý
		if (_validator.valid(member, game)) {
			_validator.lastWallet(member, game);
			System.out.println("Sayýn " + member.getUserFirstName() + "---" + game.getGameName()
					+ " adlý oyun kütüphanenize eklenmiþtir. Yeni bakiyeniz" + member.getWallet());
		} else {
			System.out.println("Paran yeterli deðil be kanks :(");
		}

	}

	@Override
	public void returnGame(Member member, Game game) {
		// TODO Auto-generated method stub
		member.setWallet(game.getGamePrice()*0.88+member.getWallet());
		System.out.println(game.getGameName() + " Adlý Oyunun iade edildi. Yeni hesap bakiyeniz " + member.getWallet());
	}

	@Override
	public void remove(Member member, Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName()+ "adlý oyun kütüphanenizden kaldýrýlmýþtýr");
	}

	@Override
	public void saleGameWithCampaign(Member member, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		if (_validator.validCampaign(member, game,campaign)) {
			_validator.lastWallet(member, game);
			System.out.println("Sayýn " + member.getUserFirstName() + "---" + game.getGameName()
					+ " adlý oyun kütüphanenize eklenmiþtir. Yeni bakiyeniz" + member.getWallet());
		} else {
			System.out.println("Paran yeterli deðil be kanks :(");
		}
	}

}
