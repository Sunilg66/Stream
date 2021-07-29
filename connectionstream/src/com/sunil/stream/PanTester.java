package com.sunil.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class PanTester {

	public static void main(String[] args) {
		
		Collection<String> pan = Arrays.asList("LEBPH2564S","AHDG3459S","KSVG9467K","DACE9452M","ADSI5974S","KHDG6974K","ASDF3249K","FSUER68265J","HSUD35585J");
		
		Collection<String> str = pan.stream().filter((p)->p.startsWith("A")).collect(Collectors.toList());
		System.out.println(str.size());
		str.forEach(k-> System.out.println(k));
		
		Collection<String> st = pan.stream().filter((i)->i.endsWith("S")).collect(Collectors.toSet());
		System.out.println("pan : " + st);

	}

}
