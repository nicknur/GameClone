
public class GamaManager implements IGame {

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName()+ " adl� oyun sisteme Eklendi");
		
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName()+ " adl� oyun sisteme g�ncellendi");
	}

	@Override
	public void remove(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName()+ " adl� oyun sisteme kald�r�ld�");
	}

}
