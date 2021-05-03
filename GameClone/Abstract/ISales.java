
public interface ISales {
	public void saleGame(Member member, Game game);

	public void returnGame(Member member, Game game);

	public void remove(Member member, Game game);
	public void saleGameWithCampaign(Member member, Game game, Campaign campaign);
}
