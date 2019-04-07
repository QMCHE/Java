package dgsw.y2.c1.n11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * ����
 * ���� �����
 * ���� ���� �о����
 * ���� �̸� �ٲٱ�
 * ���� �ۼ��ϱ�
 * �ۼ��� ���ڿ� ��������
 * @author Shin
 */
public class FileLab {
	public static final String DIRECTORY = "C:\\JavaTest";

	public static final String FILE = "dgsw.txt";

	/**
	 * ���� �����
	 * @param fileName
	 * @throws IOException
	 */
	private void makeNewFile(String fileName) throws IOException{
		System.out.println("**** makeNewFile ****");

		File file = new File(DIRECTORY, fileName);
		System.out.println("exists : " + file.createNewFile());
		boolean created = file.createNewFile();

		System.out.println("File : " + file.getAbsolutePath());
		System.out.println("Created : " + created);
		System.out.println("isFile : " + file.isFile());
		System.out.println("exists : " + file.exists());

		System.out.println();
	}
	/**
	 * ���� ���� �о����
	 * @throws IOException
	 */
	private void getFileDetails() throws IOException{
		System.out.println("**** getFileDetails ****");
		
		File file = new File(DIRECTORY, "sample.txt");
		file.createNewFile();
		
		System.out.println("File : " + file.getAbsolutePath());
		System.out.println("isFile : " + file.isFile());
		System.out.println("isDirectory : " + file.isDirectory());
		System.out.println("parent : " + file.getParent());
		System.out.println("length : " + file.length());
		
		System.out.println();
	}
	/**
	 * ���� �̸� �ٲٱ�
	 * @throws IOException
	 */
	private void rename() throws IOException{
		System.out.println("**** rename ****");
		
		File file = new File(DIRECTORY, "sample.txt");
		file.createNewFile();
		System.out.println("File : " + file.getAbsolutePath());
		System.out.println("exists : " + file.exists());
		
		File rename = new File(DIRECTORY, "test.txt");
		file.renameTo(rename);
		System.out.println("File renamed : " + rename.getAbsolutePath());
		System.out.println("File : " + file.getAbsolutePath());
		
		System.out.println();
	}
	/**
	 * ���� �ۼ��ϱ�
	 * @throws IOException
	 */
	private void write() throws IOException{
		System.out.println("**** write ****");
		
		File file = new File(DIRECTORY, FILE);
		file.createNewFile();
		
		FileWriter writer = new FileWriter(file); //(file, true) or (file, false)
		writer.write("Hello world!" + System.getProperty("line.separator"));
		writer.write("�뱸 ����Ʈ���� ����б�\n");
		writer.write("Java ���α׷��� �ǹ�" + System.getProperty("line.separator"));
		
		writer.close();
	}
	/**
	 * �ۼ��� ���ڿ� ��������
	 * @throws IOException
	 */
	private void read() throws IOException{
		File file = new File(DIRECTORY, FILE);
		
		FileReader filereader = new FileReader(file);
		BufferedReader reader = new BufferedReader(filereader);
		
		while(true) {
			String line = reader.readLine();
			if(line != null) {
				System.out.println(line);
			}else {
				break;
			}
		}
		System.out.println();
		
		reader.close();
	}

	private void makeDirectory() throws IOException{
		System.out.println("**** makeNewDirectory ****");
		
		File file = new File(DIRECTORY, FILE);
		file.mkdir();
	}
	
	public static void main(String[] args) throws IOException {
		FileLab filelab = new FileLab();
		
		filelab.makeNewFile("sample.txt");
		filelab.getFileDetails();
		filelab.rename();
		filelab.write();
		filelab.read();
		filelab.makeDirectory();
	}

}

