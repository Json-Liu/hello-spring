package com.yy.di.service.impl;

import java.util.List;

import com.yy.di.service.IPropertyDi;

public class PropertyDiImpl implements IPropertyDi {
	private String title;
	private String artist;
	private List<String> tracks;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public List<String> getTracks() {
		return tracks;
	}
	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}
	@Override
	public void play() {
		System.out.println("playing "+title+" by "+artist);
		for (String each : tracks) {
			System.out.println("Track: "+each);
		}
	}

}
