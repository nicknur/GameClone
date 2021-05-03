import java.rmi.RemoteException;

public interface IMember {

	public void add(Member member) throws RemoteException;

	public void update(Member member);

	public void remove(Member member);
}
