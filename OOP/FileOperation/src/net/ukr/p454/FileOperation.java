package net.ukr.p454;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class FileOperation {

	private static int bufferSize = 1024 * 1024;

	FileOperation() {
		super();
		
	}

	public static void copyFile(File from, File to) throws IllegalArgumentException {

		if (to.exists()) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("File " + to.getName() + " is already exists. Do you want rewrite (y/n) ?");

			if (!scanner.nextLine().equalsIgnoreCase("y")) {
				throw new IllegalArgumentException("File is already exists. Try new name");
			}
			scanner.close();
		}

		try (FileInputStream input = new FileInputStream(from); FileOutputStream output = new FileOutputStream(to)) {

			if (from == null || to == null) {
				throw new IllegalArgumentException("Null pointer");
			}

			byte[] buffer = new byte[bufferSize];
			int readBytes = 0;
			while ((readBytes = input.read(buffer, 0, bufferSize)) != -1) {
				output.write(buffer, 0, readBytes);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public static void copyFiles(File folderSource, File folderDestination, String extension) {
		int copiedFiles = 0;
		Long copiedSize = 0L;
		LocalTime startTime;
		LocalTime finishTime;
		
		
		// Create folders if they don't exists
		if (!folderDestination.exists()) {
			folderDestination.mkdirs();
		}

		// interface FileFilter implementation
		FileFilter filter = (File file) -> {

			if (file.isDirectory()) {
				return false;
			}

			String fileExt = file.getName().substring(file.getName().lastIndexOf(".") + 1);

			return extension.contains(fileExt);
		};

		// get list file
		File[] fileList = folderSource.listFiles(filter);
		
		startTime = LocalTime.now();
		
		for (File copiersFile : fileList) {
			copyFile(copiersFile, new File(folderDestination, copiersFile.getName()));
			copiedFiles++;
			copiedSize += copiersFile.length();
			System.out.println(
					">>> File " + copiersFile.getName() + " is copied to " + folderDestination.getPath() + ">>>");
			
		}
		
		finishTime = LocalTime.now();
		int execTime = finishTime.getSecond() - startTime.getSecond();
		
		System.out.println("--------------------");
		System.out.println("Copied: " + copiedFiles + " files " + ". Full Size: " + copiedSize/1024/1024 + " Mb" + ". Exec time: " + execTime + " seconds" );
	}

	public static void setBufferSize(int bufferSize) {
		FileOperation.bufferSize = bufferSize;
	}

}
