package com.ara.programming.algo;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * You are in charge of a display advertising program. Your ads are displayed on
 * websites all over the internet. You have some CSV input data that counts how
 * many times that users have clicked on an ad on each individual domain. Every
 * line consists of a click count and a domain name, like this:
 * 
 * counts = [ "900,google.com", 
 * "60,mail.yahoo.com",
 * "10,mobile.sports.yahoo.com", 
 * "40,sports.yahoo.com", 
 * "300,yahoo.com",
 * "10,stackoverflow.com", 
 * "2,en.wikipedia.org", 
 * "1,es.wikipedia.org",
 * "1,mobile.sports" ]
 * 
 * Write a function that takes this input as a parameter and returns a data
 * structure containing the number of clicks that were recorded on each domain
 * AND each subdomain under it. For example, a click on "mail.yahoo.com" counts
 * toward the totals for "mail.yahoo.com", "yahoo.com", and "com". (Subdomains
 * are added to the left of their parent domain. So "mail" and "mail.yahoo" are
 * not valid domains. Note that "mobile.sports" appears as a separate domain as
 * the last item of the input.)
 * 
 * Sample output (in any order/format):
 * 
 * calculateClicksByDomain(counts) 
 * 1320 com 
 * 900 google.com 
 * 410 yahoo.com 
 * 60 mail.yahoo.com 
 * 10 mobile.sports.yahoo.com 
 * 50 sports.yahoo.com 
 * 10 stackoverflow.com 
 * 3 org 
 * 3 wikipedia.org 
 * 2 en.wikipedia.org 
 * 1 es.wikipedia.org
 * 1 mobile.sports 
 * 1 sports
 * 
 */

public class DomainClicks {

	public static void main(String[] args) {

		String[] counts = new String[] { "900,google.com", 
		  		  "60,mail.yahoo.com",
		  		  "10,mobile.sports.yahoo.com", 
		  		  "40,sports.yahoo.com", 
		  		  "300,yahoo.com",
		  		  "10,stackoverflow.com", 
		  		  "2,en.wikipedia.org", 
		  		  "1,es.wikipedia.org",
		  		  "1,mobile.sports" };
		
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		for (int i=0;i<counts.length;i++) {
			String domainCount = counts[i];
			String[] domainCountArr = domainCount.split(",");
			int clicks = Integer.parseInt(domainCountArr[0]);
			String domain = domainCountArr[1];
			while (domain.indexOf(".") != -1) {
				if (map.containsKey(domain)) {
					int value = map.get(domain);
					map.put(domain, value+clicks);
				} else {
					map.put(domain, clicks);	
				}
				domain = domain.substring(domain.indexOf(".")+1,domain.length()); // google.com
			}
		}
		
		map.entrySet().stream().forEach(System.out::println);
	}

}
