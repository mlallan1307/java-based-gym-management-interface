package edu.colostate.cs.cs414.skynet_gym.domain;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import edu.colostate.cs.cs414.skynet_gym.domain.control.DomainControlPkgSuite;
import edu.colostate.cs.cs414.skynet_gym.domain.data.DomainDataPkgSuite;
import edu.colostate.cs.cs414.skynet_gym.domain.people.DomainPeoplePkgSuite;
import edu.colostate.cs.cs414.skynet_gym.domain.utilities.DomainUtilitiesPkgSuite;

@RunWith(Suite.class)
@SuiteClasses({
	DomainControlPkgSuite.class,
	DomainDataPkgSuite.class,
	DomainPeoplePkgSuite.class,
	DomainUtilitiesPkgSuite.class
	
})
public class DomainPkgSuite {
	public static void main(String args[]) {
		JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        junit.run(DomainPkgSuite.class);
	}
}
