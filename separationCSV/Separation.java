import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Separation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scConsole = new Scanner(System.in);
		
		System.out.print("Input path to file csv:");
		String filePath = scConsole.nextLine();
		File file = new File(parsePath(filePath));
		
		System.out.print("Input new path for separated files or press Enter:");
		String folderPath = scConsole.nextLine();
		
		/*If folder does not exists than use path of file*/
		File folderDestination = new File(checkFolderDestinationPath(parsePath(folderPath), file));
		
		System.out.print("How many rows should be in one file ?:");
		int countOfRows = scConsole.nextInt();	
		reWriteFile(folderDestination, file, countOfRows);

	}
	
	static String parsePath(String path){

		path = path.replace("\\", "/");
		return path;
		
	}
	
	static String checkFolderDestinationPath (String folderPath, File filePath) {
		File folder = new File(folderPath);
		if (!folder.exists()){
			folderPath = filePath.getParent();
		}
		return folderPath;
	}
	
	static String readHeader(File filePath){
		StringBuilder stringBuilder = new StringBuilder();
		
		try (Scanner scanner = new Scanner(filePath)) {			
				stringBuilder.append(scanner.nextLine());
				stringBuilder.append(System.lineSeparator());
		} catch (IOException e) {
			System.out.println("Error");
		}
		return stringBuilder.toString();
	}
	
	static void reWriteFile (File folderDestination, File file, int countOfRows){
		String fileNamePart = "";
		int countCreatedFiles = 1;
		String fileHeader = readHeader(file);
		
		//Read the file 
		try (Scanner scanner = new Scanner(file)){			
			while (scanner.hasNextLine()){
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append(fileHeader);
				for (int i = countOfRows; i >= 0 && scanner.hasNextLine(); i--) {
					stringBuilder.append(scanner.nextLine());
					stringBuilder.append(System.lineSeparator());
				}					
				
				fileNamePart = folderDestination.getAbsolutePath() + "/" + countCreatedFiles + "_" + file.getName();
				writeToFile(fileNamePart, stringBuilder.toString());
				countCreatedFiles ++;
			}					
			
		} catch (Exception e) {
			System.out.println("Can't read the file" + file.getName());
		}
		
		System.out.println("Created " + (countCreatedFiles-1) + " files");
	}
	
	static void writeToFile(String filePath, String text){
		File file = new File(filePath);
		
		try(PrintWriter printWriter = new PrintWriter(file)){
			printWriter.write(text);
		}catch(IOException e) {
			System.err.println("Can not write to file: " + file.getName());
		}
	}
	
}
