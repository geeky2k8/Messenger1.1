package com.dinesh.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dinesh.javabrains.messenger.database.DatabaseClass;
import com.dinesh.javabrains.messenger.model.Profile;

public class ProfileService {
	
	private Map<String, Profile> profiles = DatabaseClass.getProfile();

	
	public ProfileService() {
		profiles.put("dinesh1008", new Profile(1, "dinesh1008","dinesh kumar", "dandu"));
	}

	public List<Profile> getAllProfile() {
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);
	}

}
