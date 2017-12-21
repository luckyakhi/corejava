package in.javacomics.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer i = 10;
        long l = 10L;
        System.out.println(i.equals(l));
        ScannerDemo sd = new ScannerDemo();
        byte b = 10;
        sd.call(b);
             
        }
		
	public void call(Integer i){
		System.out.println(i);
	}
	
	public void call(int i){
		System.out.println(i);
	}
	}



