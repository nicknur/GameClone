import java.rmi.RemoteException;

public class MemberManager implements IMember {

	Boolean service = true;
	Validator _validator = new Validator();

	@Override
	public void add(Member member) throws RemoteException {
		// TODO Auto-generated method stub
		if (_validator.isPersonValid(member)) {
			System.out.println(member.getUserFirstName() + " adlý kullanýcý " + member.getWallet()
					+ " bakiyesi ile sisteme eklenmiþtir");

		} else {
			System.out.println("Lütfen Tc kimlik bilgilerinizden Emin olunuz ");
		}

	}

	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub
		System.out.println(member.getUserId() + " Kullancý Güncellendi");
	}

	@Override
	public void remove(Member member) {
		// TODO Auto-generated method stub
		System.out.println(member.getUserId() + " Kullancý silindi");
	}

}
