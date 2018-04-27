package com.howtoprogram.junit5.service;

import java.util.Observable;

import com.howtoprogram.junit5.services.IElection;
import io.reactivex.*;

public class ElectionMockito implements IElection{

	@Override
	public String getCandidateNameByParty(String party) {
		
	//Flowable.just("Hello world").subscribe(System.out::println);
		return "Prueba";
	}

	@Override
	public int getNumberOfVotesByParty(String party) {
		return 10;
	}

}
