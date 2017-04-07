package com.dinesh.javabrains.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import com.dinesh.javabrains.messenger.model.Profile;
import com.dinesh.javabrains.messenger.service.ProfileService;

@Path("/profiles")
@XmlRootElement
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {

	ProfileService profileService = new ProfileService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Profile> getAllProfiles() {
		return profileService.getAllProfile();
	}
	
	@GET
	@Path("/{profilename}")
	public Profile getProfile(@PathParam("profilename") String profileName) {
		return profileService.getProfile(profileName);
	}
	
	@POST
	public Profile addProfile(Profile profile) {
		return profileService.addProfile(profile);
	}
	
	@PUT
	@Path("/{profilename}")
	public Profile updateProfile(@PathParam("profilename") String profileName, Profile profile) {
		profile.setProfileName(profileName);
		return profileService.updateProfile(profile);
	}
	
	@DELETE
	@Path("/{profilename}")
	public Profile removeProfile(@PathParam("profilename") String profileName) {
		return profileService.removeProfile(profileName);
	}
}
