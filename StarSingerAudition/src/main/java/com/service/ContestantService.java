package com.service;

import java.util.ArrayList;
import com.model.Contestant;

//use appropriate annotation to configure ContestantService as a Service
public class ContestantService {
    
    //Do NOT CHANGE THE BELOW VARIABLE
	public static ArrayList<Contestant> contestantList = new ArrayList<Contestant>();

	// Validate emailId and add Contestant object into the Contestant list
	public boolean addContestant(Contestant Contestant) {

		// fill the code

		return false;

	}

	public ArrayList<Contestant> viewAllContestants() {
		// fill the code
		return null;
	}

	public static ArrayList<Contestant> getContestantList() {
		return contestantList;
	}

	public static void setContestantList(ArrayList<Contestant> contestantList) {
		ContestantService.contestantList = contestantList;
	}

}
