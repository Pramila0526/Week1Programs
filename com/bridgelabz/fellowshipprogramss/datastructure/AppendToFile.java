package com.bridgelabz.fellowshipprogramss.datastructure;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @author Pramila0526
 * Date   :19/11/2019
 *
 */
public class AppendToFile
{

  public static void main(String[] args) 
	{
   // DataStructure d=new DataStructure();
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

	

			File file = new File("/home/admin94/Desktop/Text");

			// if file doesnt exists, then create it
			if (!file.exists())
			{
				file.createNewFile();
			}
			
			// true = append file
			 fw = new FileWriter(file.getAbsoluteFile(),true);
			
		//	bw = new BufferedWriter(fw);
			String data = "am";
			fw.write(UnOrderedList.search(data));
			

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}

	}

}