package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.entity.Artist;
import com.nt.repository.IArtistRepo;
@Component
public class ArtistServiceMangImpl implements IArtistServiceMang {
	@Autowired
	private IArtistRepo artistRepo;
	@Override
	public String registerArtist(Artist artist) {
		int id=artistRepo.save(artist).getId();
		return "Employee Register With ID Value:"+id;
	}
   @Override
public Iterable<Artist> showAllArtist() {
	
	return artistRepo.findAll();
}
   @Override
public Optional<Artist> showArtistByID(int id) {
	
	return artistRepo.findById(id);
}
   @Override
public Double showArtistAgeById(int id) {

	return artistRepo.getArtistAgeByDob(id);
}
   	@Override
   	public Double showArtistExperienceById(int id) {
   		
   		return artistRepo.getArtistWorkinExperiencebyId(id);
   	}

	}
