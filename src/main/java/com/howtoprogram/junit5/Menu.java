package com.howtoprogram.junit5;

import com.howtoprogram.junit5.services.Election;
import io.reactivex.*;
import com.howtoprogram.junit5.services.IElection;
import io.reactivex.*;

public class Menu {

	public static void main(String[] argumentos) {
		IElection election = new Election();
		String candidateName = election.getCandidateNameByParty("Axity");
		int numOfVotes = election.getNumberOfVotesByParty("Axity");
		
		System.out.println(String.format("Name >> %s >> Votes: %d",candidateName,numOfVotes));
		//Flowable.just("Hello world").subscribe(System.out::println);
		
	}
	


	
	       
	
}
