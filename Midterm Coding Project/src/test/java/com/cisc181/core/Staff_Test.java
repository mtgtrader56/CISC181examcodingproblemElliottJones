package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.Exceptions.PersonException;
import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}

	@Test
	public void stafftest1() {
		ArrayList<Staff> stafflist = new ArrayList<Staff>();
		Date date = new Date();
		Staff Matt = new Staff("Matthew", "Robert", "Bonnett", date, "Christiana east Towers room 1213", "202-111-2233",
				"matthewbonnet@idontcare.net", "5 pm to 7 pm", 42, 1000000.00, date, eTitle.MR);
		Staff Tyler = new Staff("Tyler", "idontknow", "Reagle", date, "Christiana east Towers room 1213",
				"202-133-2132", "tylerreagle@idontcare.net", "3pm to 4 pm", 10, 100.00, date, eTitle.MR);
		Staff Elliott = new Staff("Elliott", "Warren", "Jones", date, "Christiana east Towers room 1213",
				"202-316-4376", "eljones@udel,edu", "5am to 6am", 4, 10000.00, date, eTitle.MR);
		Staff Vinay = new Staff("Vinay", "idontknow", "Vazir", date, "Christiana east Towers room 1213", "202-666-1023",
				"vinayvazir@idontcare.net", "12am to 2p,", 1, 1000.00, date, eTitle.MR);
		Staff Colin = new Staff("Colin", "Butler", "Jones", date, "Christiana east Towers room 1213", "202-153-1423",
				"cjones@maret.org", "11pm to 12am", 2, 100000.00, date, eTitle.MR);
		stafflist.add(Matt);
		stafflist.add(Tyler);
		stafflist.add(Elliott);
		stafflist.add(Vinay);
		stafflist.add(Colin);

		assertEquals(222220.00,
				((Matt.getSalary() + Tyler.getSalary() + Elliott.getSalary() + Vinay.getSalary() + Colin.getSalary())
						/ 5),
				1);

	}

	@Test
	public void invalidphonenumbertest() throws PersonException {
		Date date = new Date();
		Staff Matt = new Staff("Matthew", "Robert", "Bonnett", date, "Christiana east Towers room 1213",
				"20232111-2233", "matthewbonnet@idontcare.net", "5 pm to 7 pm", 42, 1000000.00, date, eTitle.MR);
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(Matt.getPhone());
		boolean check = matcher.matches();
		assertTrue(check == false);
		if (check == true) {
			System.out.println("exception test had failed");
		} else {
			throw new PersonException(Matt);
		}
	
	}

}
