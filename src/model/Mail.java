package model;

public class Mail {

	private int mailID;
	private String mailTitle;
	private String sender;
	private String date;
	private double time;
	private String content;
	
	public Mail() {}
	
	public Mail(int mailID, String mailTitle, String sender, String date, double time, String content ) {
		super();
		this.mailID = mailID;
		this.mailTitle = mailTitle;
		this.sender = sender;
		this.date = date;
		this.time = time;
		this.content = content;
	}

	public int getMailID() {
		return mailID;
	}

	public void setMailID(int mailID) {
		this.mailID = mailID;
	}

	public String getMailTitle() {
		return mailTitle;
	}

	public void setMailTitle(String mailTitle) {
		this.mailTitle = mailTitle;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "mail [mailID=" + mailID + ", mailTitle=" + mailTitle + ", sender=" + sender
				+ ", date=" + date + ", time=" + time + ", , content=" + content + "]";
	}
	
}
