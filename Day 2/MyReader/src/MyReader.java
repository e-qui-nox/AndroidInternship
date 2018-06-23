/*try {
	Statement which can throw an exception
}catch(ExceptionName exceptionVariable){
	Catch | Handle the exception here
}finally {
	Will be executed irrespective of whether an exception is thrown or not
}
//try catch used together...they handle the exception

1.checked | compiler-time exceptions
2.unchecked | run-time exceptions

A->throw 	//throw an exception
B->throws   //handles exception somewhere else   // if we want to use the method then we must handle there(where ever you want to use you handle it there
			//keywords
*/

import java.io.*;
public class MyReader {
	
	//Method 1
	public void readFromAFile(String fileName) {
		FileReader fileReader=null;
		try {
			fileReader=new FileReader(fileName);
			int c; //To store data from file
			while((c=fileReader.read())!=-1) {
				System.out.println(c);;
			}
		}catch(FileNotFoundException f) {
			System.err.println(f);
		}catch(IOException i) {
			System.err.println(i);
		}finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				System.err.println(e);
			}
		}
		
	}
	
	//Method 2
	public void writeToAFile(String fileName, String input) throws IOException{ //if it throws one more exception then....throws IOException,SomeException,... 
		FileWriter fileWriter = new FileWriter("filename"); //compile time exception
		
		for(int i=0;i<input.length();i++) {
			fileWriter.write(input.charAt(i));
		}
		
		fileWriter.close();
	}
}
