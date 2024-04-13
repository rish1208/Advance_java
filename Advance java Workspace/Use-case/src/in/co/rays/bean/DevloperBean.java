package in.co.rays.bean;

import java.util.Date;

public class DevloperBean {
	private int id;
	private String devloperName;
	private String project;
	private String status;
	private Date submitDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDevloperName() {
		return devloperName;
	}
	public void setDevloperName(String devloperName) {
		this.devloperName = devloperName;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}
	
}
