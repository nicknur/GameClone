
public class Game implements IEntities {

	private int gameId;
	private String gameName;
	private Double gamePrice;
	private Double campaignRate;

	

	public Game() {
		super();
	}

	public Game(int gameId, String gameName, Double gamePrice) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public Double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(Double gamePrice) {
		this.gamePrice = gamePrice;
	}
	public Double getCampaignRate() {
		return campaignRate;
	}

	public void setCampaignRate(Double campaignRate) {
		this.campaignRate = campaignRate;
	}

}
