package in.co.rays.bean;

import java.util.Date;

public class TvBean {
	private int id;
	private String channelName;
	private String showName;
	private Date showDate;
	private String watch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public Date getShowDate() {
		return showDate;
	}
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}
	public String getWatch() {
		return watch;
	}
	public void setWatch(String watch) {
		this.watch = watch;
	}

}
