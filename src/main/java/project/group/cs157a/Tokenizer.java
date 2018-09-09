package project.group.cs157a;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;

public class Tokenizer {

	Tokenizer() {
		try (InputStream modelIn = new FileInputStream("./lib/en-token.bin")) {
			TokenizerModel model = new TokenizerModel(modelIn);
			TokenizerME tokenizer = new TokenizerME(model);
			String tokens[] = tokenizer.tokenize( "\r\n" + 
					"	Chris Wiggins, Chief Data Scientist of The New York Times, sat down for a Fireside Chat at January 2015s edition of Data Driven NYC.\r\n" + 
					"	The National Science Foundation (NSF) has honored Columbia University professor Ponisseril Somasundaran, Director of Center for Particulate and Surfactant Systems (CPaSS) at Columbia University, with the 2015 Alexander Schwarzkopf Prize for Technological Innovation.\r\n" + 
					"Professor and DSI Affiliate Paul Sajda is working to give our machines a window into our brain waves. Mr. Sajda believes that if we could just give our machines a window into our brain wavesthe fleeting thoughts we have before we even know were thinking themwe have a shot at that bold future where computers dont just make our commodities and houses better; they make our brains better.\r\n" + 
					"	The startup aims to simplify high-performance electronic system design to meet the demands of next-generation devices and sensors.\r\n" + 
					"\r\n" + 
					"	A deck of playing cards honors 54 notable women in computing. Produced by Duke University and Everwise (in conjunction with CRA-W and Anita Borg Institute Wikipedia Project), the first card decks were distributed at this year's Grace Hopper conference. One of the women to be honored with her own card is Kathy McKeown, the director of the Data Science Institute.\r\n" + 
					"	How to best exploit big data for societys advantage is an issue for many companies and research fields, and our Institute will focus on data science research across disciplines...\r\n" + 
					"	The Institute's six centers will function as engines of translational research and education in the data sciences and as sources of technology projects with high commercialization potential...\r\n" + 
					"	Data Science Institute Director Dr. Kathleen R. McKeown will speak tomorrow at 5pm in Davis about the \"The Intersection of Data Science and Language\".\r\n" + 
					"	The Data Science Institute (DSI) at Columbia University and Bloomberg LP are pleased to announce a workshop on Machine Learning in Finance. Click here to register.\r\n" + 
					"	Join us for the upcoming Colloquium Series dates during the Spring 2015 semester.\r\n" + 
					"	Join us for our Online Information Sessions held in the Spring 2015 term.\r\n" + 
					"	Columbia University is pleased to invite applications for faculty positions with the Data Science Institute.\r\n" + 
					"	Watch Hal Daume III speak about \"Algorithms that Think on Their Feet\" in this Oct. 15th talk.\r\n" + 
					"The Institute brings together the renowned interdisciplinary expertise of Columbia's schools to focus on cutting-edge data research.\r\n" + 
					"	Watch the Town Hall event video hosted by the Institute on Monday, March 31, 2014.\r\n" + 
					"	Professor Tom Dietterich from Oregon State University presented on March 13, 2014 and his title was \"Challenges for Machine Learning in Computational Sustainability\".\r\n" + 
					"	Professor Michael Jordan from UC Berkeley presented on October 15, 2013 and the topic was \"On the Computational and Statistical Interface and Big Data\".");
			for (String token: tokens) {
				System.out.println(token);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
