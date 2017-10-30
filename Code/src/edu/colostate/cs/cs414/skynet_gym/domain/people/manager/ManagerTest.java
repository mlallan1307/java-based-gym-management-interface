package edu.colostate.cs.cs414.skynet_gym.domain.people.manager;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.colostate.cs.cs414.skynet_gym.domain.people.info.Address;
import edu.colostate.cs.cs414.skynet_gym.domain.people.info.HealthInsurance;
import edu.colostate.cs.cs414.skynet_gym.domain.people.info.PersonInformation;
import edu.colostate.cs.cs414.skynet_gym.domain.people.info.Qualification;
import edu.colostate.cs.cs414.skynet_gym.domain.people.trainer.Trainer;
import edu.colostate.cs.cs414.skynet_gym.utility.data.Schedule;

public class ManagerTest {

	private PersonInformation personInfo;
	private Manager manager;
	
	@Before
	public void setUp() throws Exception {
		personInfo = new PersonInformation(
				"fn",
				"ln",
				"dln",
				"ph",
				"em",
				new HealthInsurance(
						"p"),
				new Address(
						"s1",
						"s2",
						"st",
						"ct",
						"zp",
						"tp"));
		manager = new Manager(
				"u",
				"p",
				personInfo);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testEqualsObject() {
		Manager m = new Manager(
				"u",
				"p",
				personInfo);
		assertTrue(m.equals(manager));
		assertFalse(m.equals(null));
	}

	@Test
	public final void testManager() {
		assertTrue(manager.getPersonInfo().equals(personInfo));
		assertTrue(manager.login("u", "p"));
		assertTrue(manager.getUserType().equals("Manager"));
	}

}
