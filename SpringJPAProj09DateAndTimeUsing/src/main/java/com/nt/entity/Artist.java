package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Artist {
	
	@SequenceGenerator(name="gen1",sequenceName = "SQE_ARITIST",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy=GenerationType.SEQUENCE)
	@Id
	private Integer id;
	
	@NonNull
	@Column(name = "ARTIST_NAME")
	private String name;
	
	@NonNull
	@Column(name="ARTIST_ADDRS")
	private String addrs;
	
	@NonNull
	private LocalDate dob;
	
	@NonNull
	private LocalDate doj;
	
	@NonNull
	private LocalTime toj;
}
