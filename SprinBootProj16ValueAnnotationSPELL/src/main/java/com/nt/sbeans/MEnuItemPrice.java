package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menup")
@Data
public class MEnuItemPrice {
	@Value("${menu.dosarate}")
	private float dosaprice;
	@Value("${menu.idlyrate}")
	private float idlyprice;
	@Value("${menu.vprate}")
	private float vpprice;
	
	@Value("${menu.poharate}")
	private float pohaprice;

}
