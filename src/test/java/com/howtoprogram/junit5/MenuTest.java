package com.howtoprogram.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.howtoprogram.junit5.services.Election;
import com.howtoprogram.junit5.services.IElection;


class MenuTest {
	@Test
	void test() {
		IElection election = new Election();
		assertEquals(100,election.getNumberOfVotesByParty("Axity"));
	}
	
	@Test
	void testMockito() {
		Election election = mock(Election.class);
		when(election.getCandidateNameByParty("prueba")).thenReturn("El Homero");
		assertEquals("El Homero",election.getCandidateNameByParty("prueba"));
	}
}
