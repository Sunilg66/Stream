package com.sunil.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class WatchBrandTester {

	public static void main(String[] args) {
		
		Collection<String> brand = Arrays.asList("Sonata","Titan","Rolex","Timex","Titan","MI","Fossil","Armani","TiltFossil");
		
		Collection<String>temp=brand.stream().filter((s)->s.startsWith("T")).collect(Collectors.toList());
		System.out.println(temp.size());
		temp.forEach((m)-> System.out.println(m));
		
		Set<String> str =brand.stream().filter((m)->m.startsWith("T")).collect(Collectors.toSet());
		System.out.println("Brand : " + str);
	}
		
	}

