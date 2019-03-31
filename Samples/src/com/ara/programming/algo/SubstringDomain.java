package com.ara.programming.algo;

import java.util.ArrayList;
import java.util.List;

public class SubstringDomain {

	public static void main(String[] args) {
		String domain = "a.b.c.d.e.f.g.h";
		List<String> subdomains = new ArrayList<>();
		subdomains.add(domain); //a.b.c
//		int i=0;
//		while (domain.indexOf(".") != -1) {
//			char c = domain.charAt(i); //b.c
//			if (c=='.') {
//				domain = domain.substring(domain.indexOf("."),domain.length()); //.b.c
//				domain = domain.substring(1); //b.c
//				//System.out.println(domain);
//				subdomains.add(domain);
//				i=0;
//				continue;
//			}
//			i++;
//		}
		
		for (int i=0;i<domain.length();i++) {
			char c = domain.charAt(i);
			if (c=='.') {
				subdomains.add(domain.substring(i+1,domain.length()));
			}
		}
		
		subdomains.stream().forEach(System.out::println);

	}

}
