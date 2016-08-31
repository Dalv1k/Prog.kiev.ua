package net.ukr.p454;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File from = new File("D:/Install");
		File to = new File("D:/test/subtest");
		FileOperation.copyFiles(from, to, "exe");
		
	}
}
