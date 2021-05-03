import java.rmi.RemoteException;

public class MemberManager implements IMember {

	Boolean service = true;
	Validator _validator = new Validator();

	@Override
	public void add(Member member) throws RemoteException {
		// TODO Auto-generated method stub
		if (_validator.isPersonValid(member)) {
			System.out.println(member.getUserFirstName() + " adl� kullan�c� " + member.getWallet()
					+ " bakiyesi ile sisteme eklenmi�tir");

		} else {
			System.out.println("L�tfen Tc kimlik bilgilerinizden Emin olunuz ");
		}

	}

	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub
		System.out.println(member.getUserId() + " Kullanc� G�ncellendi");
	}

	@Override
	public void remove(Member member) {
		// TODO Auto-generated method stub
		System.out.println(member.getUserId() + " Kullanc� silindi");
	}

}
