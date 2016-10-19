package com.guillermods.web.home.model;

import java.util.Date;

public class SampleModel {

	private String sampleName;
	
	private Date sampleDate;

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public Date getSampleDate() {
		return sampleDate;
	}

	public void setSampleDate(Date sampleDate) {
		this.sampleDate = sampleDate;
	}

	@Override
	public String toString() {
		return "SampleModel [sampleName=" + sampleName + ", sampleDate=" + sampleDate + "]";
	}
	
	
}
