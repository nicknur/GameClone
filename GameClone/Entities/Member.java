
public class Member implements IEntities {
	private int userId;
	private String userFirstName;
	private String userLastName;
	private int dateYear;
	private Long NationalId;
	private Double wallet;

	public Member(int userId, String userFirstName, String userLastName, int dateYear, Long nationalId, Double wallet) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.dateYear = dateYear;
		NationalId = nationalId;
		this.wallet=wallet;
	}

	public Member() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public int getDateYear() {
		return dateYear;
	}

	public void setDateYear(int dateYear) {
		this.dateYear = dateYear;
	}

	public Long getNationalId() {
		return NationalId;
	}

	public void setNationalId(Long nationalId) {
		NationalId = nationalId;
	}
	
	public  Double getWallet() {
		return wallet;
	}

	public Double setWallet(Double wallet) {
		return this.wallet = wallet;
	}
	
}
