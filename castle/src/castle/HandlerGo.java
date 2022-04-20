package castle;

public class HandlerGo extends Handler{
	public HandlerGo(Game game) {
		super(game);
	}
	@Override
	public void doCnd(String word) {
		super.doCnd(word);
		game.goRoom(word);
	}

}
