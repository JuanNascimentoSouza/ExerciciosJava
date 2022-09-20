package Package;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entities2.Comment;
import Entities2.Post;

public class DemoStringBuilder {

	public static void main(String[]args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that´s awsome");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to New Zeland",
				"I'm going to visit this wonderful contry!",12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}
}
