package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data      //By using this annatation we are geting setter getter construcor tostring method etc..
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class HospitalDetails {
	private int hospitalId;
	@NonNull
	private String hospitalName;
	@NonNull
	private String hospitalLocation;
	@NonNull
	private String hospitalNumber;
	@NonNull
	private String hospitalEMail;

}
