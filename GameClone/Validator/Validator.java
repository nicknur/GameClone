import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Validator {
	KPSPublicSoapProxy _KpsPublicSoapProxy = new KPSPublicSoapProxy();

	public boolean valid(Member member, Game game) {
		if (member.getWallet() >= game.getGamePrice()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validCampaign(Member member, Game game, Campaign campaign) {
		if (member.getWallet() >= (game.getGamePrice()*campaign.getDiscountRate()/100)) {
			return true;
		} else {
			return false;
		}
	}

	public Double lastWallet(Member member, Game game) {

		return member.setWallet(member.getWallet() - game.getGamePrice());

	}

	public Boolean isPersonValid(Member member) throws RemoteException {

	Boolean result =_KpsPublicSoapProxy.TCKimlikNoDogrula(member.getNationalId(), member.getUserFirstName().toUpperCase(),
				member.getUserLastName().toUpperCase(), member.getDateYear());

		return result;
	}

}
