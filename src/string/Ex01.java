package string;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
	
	// args.leng():args는 switch나 if문으로 구성되어있다.
	//문자열 String 클래스에서 사용할 수 있는 함수 정리한다.
	
	Scanner sc = new Scanner(System.in);
	
	String word1 = "apple";
	String word2 = null;
	
	System.out.println("word2 입력 >> ");
	word2 = sc.next();	//next는 enter까지 입력받아 출력한다.
	System.out.println(word1.equals(word2));
	System.out.println(word1 == word2);

	String word3 = "Hello, World!!!";
//	1)문자열도 길이가 있다.(함수)
	for(int i = 0; i< word3.length(); i++) {
		char ch = word3.charAt(i);
		System.out.print(ch+" ");
	} System.out.println();
//	2)대문자 혹은 소문자 바꾸기
	System.out.println(word3);
	System.out.println(word3.toLowerCase());
	System.out.println(word3.toUpperCase());
	System.out.println();
//	3)문자열이 특정단어 혹은 패턴을 포함하는지 확인
	System.out.println();
	System.out.println(word3.contains("H"));
	System.out.println(word3.contains("Hi"));
	System.out.println();
//	4)문자열의 특정 단어 혹은 패턴을 다른 내용으로 바꾸기
	System.out.println(word3.replace("Hello", "Hi"));
	System.out.println(word3);	//원본은 변하지않는다.
	System.out.println();
	System.out.println(word3.replace("!", "?"));
	System.out.println(word3.replaceAll("!", "?"));
	System.out.println();
	
	String word4 = "aaabaaabaaabcdefg";
	System.out.println(word4.replace("aa", "a"));
	System.out.println(word4.replace("[a-z]", "a"));
	System.out.println();
	
//	5)특정문자열 잘라내기
	String word5 = "Life is too short, you need Python";
	System.out.println(word5.substring(19));
	System.out.println(word5.substring(0, 17));
	System.out.println();
	
//	6)특정패턴으로 시작하거나 끝나는 문자열찾기
	String url1 = "https://blog.naver.com";
	String url2 = "https://www.doum.net";
	String url3 = "https://www.google.com";
	
	String[] arr = {url1, url2, url3};
	for(int i =0; i<arr.length; i++) {
		System.out.println(arr[i]);
		System.out.println("https로시작하는가?" + arr[i].startsWith("https"));
		System.out.println("com으로 끝나는가?" + arr[i].endsWith("com"));
		System.out.println("www를 포함하는가?" + arr[i].contains("www"));
		System.out.println();
	}System.out.println();

//	7) 문자열 더하기를 활용하여 원하는 값을 만들 수 있어야 한다.
	String s1 = "";
	s1 += "안녕하세요\n";
	s1 += "오늘은 4월25일입니다.\n";
	System.out.println(s1);
	
//	8) String.format(format,args...)
	String s2 = "%s : %d\n";
	s2 = String.format(s2, "이지은", 30);
	System.out.println(s2);
	
	
	
	sc.close();
	}
}
