package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("hotel1")
@Data
public class Hotel {
	@Value("123")
	private Integer hid;
	
	@Value("${hotel.name}")
	private String hname;
	@Value("${hotel.address}")
	private String hadd;
	@Value("${hotel.contact}")
	private String mobile;
	@Value("${cust.name}")
	private String custName;
	@Value("#{menup.dosaprice+menup.dosaprice}")
	private float billAmt;
	@Value("${os.name}")
	private String osName;
	@Value("${user.name}")
	private String userName;
	@Value("${Path}")
	private String pathData;

	@Override
	public String toString() {
		return "Hotel [hid=" + hid + ", hname=" + hname + ", hadd=" + hadd + ", mobile=" + mobile + ", custName="
				+ custName + ", billAmt=" + billAmt + ", osName=" + osName + ", userName=" + userName + ", pathData="
				+ pathData + "]";
	}
	
	

}
