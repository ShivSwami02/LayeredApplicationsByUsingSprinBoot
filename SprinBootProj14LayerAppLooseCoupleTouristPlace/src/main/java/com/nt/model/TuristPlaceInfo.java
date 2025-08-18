package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
//@AllArgsConstructor
@NoArgsConstructor
public class TuristPlaceInfo {
	private int tpId;
	@NonNull
	private String tpName;
	@NonNull
	private String tplocation;
	@NonNull
	private String tpContact;
	@NonNull
	private String tpSite;
		

}
