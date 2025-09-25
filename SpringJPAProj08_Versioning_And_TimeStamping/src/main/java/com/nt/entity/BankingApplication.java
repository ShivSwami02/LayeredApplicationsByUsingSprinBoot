package com.nt.entity;


import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class BankingApplication {
	
	@Id
	@SequenceGenerator(name = "seq1",sequenceName = "SEQ_11",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "seq1",strategy = GenerationType.AUTO)
	private Long acno;
	
	@NonNull
	@Column(name="HolderName",length=50)
	private String holderName;
	
	@NonNull
	@Column(length = 50)
	private String addrs;
	
	@NonNull
	private Double balance;
	
	//@Value("${user.name}")
	@CreatedBy
	private String createdBy;
	
	
	//@Value("${user.name}")
	@LastModifiedBy
	private String updatedBy;
	
	@Version
	@Column(name="UPDATE_COUNT")
	private Integer updateCount;
	
	@CreationTimestamp
	@Column(name="CREATED_ON")
	private LocalDateTime creadtedON;
	
	@UpdateTimestamp
	@Column(name="UPDATED_ON")
	private LocalDateTime updatedON;
	
	private String status="active";
	
}
