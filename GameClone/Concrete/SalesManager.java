
public class SalesManager implements ISales {

	Validator _validator=new Validator();
	
	public void saleGame(Member member, Game game) {
		// C�zdan Kontrol� yap�lmal�
		if (_validator.valid(member, game)) {
			_validator.lastWallet(member, game);
			System.out.println("Say�n " + member.getUserFirstName() + "---" + game.getGameName()
					+ " adl� oyun k�t�phanenize eklenmi�tir. Yeni bakiyeniz" + member.getWallet());
		} else {
			System.out.println("Paran yeterli de�il be kanks :(");
		}

	}

	@Override
	public void returnGame(Member member, Game game) {
		// TODO Auto-generated method stub
		member.setWallet(game.getGamePrice()*0.88+member.getWallet());
		System.out.println(game.getGameName() + " Adl� Oyunun iade edildi. Yeni hesap bakiyeniz " + member.getWallet());
	}

	@Override
	public void remove(Member member, Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName()+ "adl� oyun k�t�phanenizden kald�r�lm��t�r");
	}

	@Override
	public void saleGameWithCampaign(Member member, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		if (_validator.validCampaign(member, game,campaign)) {
			_validator.lastWallet(member, game);
			System.out.println("Say�n " + member.getUserFirstName() + "---" + game.getGameName()
					+ " adl� oyun k�t�phanenize eklenmi�tir. Yeni bakiyeniz" + member.getWallet());
		} else {
			System.out.println("Paran yeterli de�il be kanks :(");
		}
	}

}
