package webHw1Q4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4
{
	public static void main(String[] args) throws IOException 
	{
		System.out.print("\n***hello***\n#enter a number-->");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		
		double coloumn = Double.parseDouble(temp);
		double width = 100/coloumn;
		
		String bodyHtml = "";
		br.close();
		
		for(int i=1;i<=coloumn;i++) 
		{
			if(i%3==0){bodyHtml += "<div id="+"\"op3\">"+"</div>"+'\n';}
			if(i%3==1){bodyHtml += "<div id="+"\"op1\">"+"</div>"+'\n';}
			if(i%3==2){bodyHtml += "<div id="+"\"op2\">"+"</div>"+'\n';}	
		}
		
		String op1 = new String("#op1{width:" + width+"%;" + 
		                        "height:100%;" + 
		                        "background-color:blue;" + 
		                        "float:left;}\n");
		
		String op2 = new String("#op2{width:" + width+"%;" + 
					            "height:100%;"+ 
					            "background-color:red;" + 
					            "float:left;}\n");
		
		String op3 = new String("#op3{width:" + width + "%;" + 
					            "height:100%;" + 
					            "background-color:green;" + 
					            "float:left;}\n");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("question4.html")));
		
		bw.write("<html>\n" + "<head>\n" + "<style>\n" + op1 + op2 + op3 +
				"</style>\n" + "</head>\n" + "<body>\n" + bodyHtml +"</body>\n" + "</html>\n");
				
		bw.close();
	}
}
