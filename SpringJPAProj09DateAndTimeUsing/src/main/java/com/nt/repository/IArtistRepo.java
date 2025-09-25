package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Artist;

public interface IArtistRepo extends JpaRepository<Artist, Integer> {
	@Query(value = "select (sysdate-dob)/365.25 from artist where id=:id",nativeQuery = true)
    public Double getArtistAgeByDob(int id);
	
	@Query(value = "select (sysdate-doj)/365.25 from artist where id=:id",nativeQuery=true)
	public Double getArtistWorkinExperiencebyId(int id);
}
