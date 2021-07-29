package com.sunil.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UsnTester {

	public static void main(String[] args) {
		
		Collection<String> usn = Arrays.asList("3VC15CS412","1SJ15EC056","3VC16CS035","2NI19ME047","2SB17CS022","3BR18CS012","1DS17CE032");
		System.out.println(usn.size());
		
		Collection<String> rollno = usn.stream().filter((u)-> u.contains("CS")).collect(Collectors.toList());
		System.out.println(rollno);
		
		Collection<String> num = usn.stream().filter((n)-> n.contains("15")).collect(Collectors.toList());
		System.out.println(num);
		num.forEach(a -> System.out.println(a));

	}

}
