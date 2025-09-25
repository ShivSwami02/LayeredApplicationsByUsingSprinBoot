package com.nt.service;

import java.util.Optional;

import com.nt.entity.Artist;

public interface IArtistServiceMang {
	
	public String registerArtist(Artist artist);
	
	public Iterable<Artist> showAllArtist();
	public Optional<Artist> showArtistByID(int id);
	
	public Double showArtistAgeById(int id);
	
	public Double showArtistExperienceById(int id);
}
