import java.io.*;
import java.net.*;
import java.util.*;
import org.jdom.*;
import org.jdom.input.*;


class JDomDemo {
    private static List list;
	public static void main(String[] args){
		System.out.println("Just testing");
		SAXBuilder builder = new SAXBuilder();
		try{
			// Create an URL object - look it up yourself
			URL url = new URL("http://munro.humber.ca/~fielder/CPAN202-XML/recipes.xml");

			// Now this is too cool, create a new "dom" object from our website!!
			Document doc = builder.build(url);


			DocType docType = doc.getDocType();
			System.out.println("Doc type: " + docType.getElementName());

			// This is the same as the doc type for the most part
			Element root = doc.getRootElement();
			System.out.println("Root Element" + root.toString());


			// The child of root is <description>
			System.out.println("description:" + root.getChildText("description"));
                           
                       

			// OK,  get all the first children of the root "node"
			// Go look up List in the java API under java.util.List
			list = root.getChildren();

			/// Just print the length
			System.out.println("List length = " + list.size());


			for(int i = 0; i<list.size(); ++i){
				Element e = (Element)list.get(i);
				System.out.println("\n"+e.getChildText("title"));
				System.out.println("    by:" + e.getChildText("contributor"));
                                System.out.println("Comment: " + e.getChildText("comment"));
				List ingredients = e.getChildren("ingredient");
                                 

				// Just print the length
				System.out.println("List length = " + ingredients.size());
				for(int j = 0; j < ingredients.size(); ++j){
					Element ingredient = (Element)ingredients.get(j);
					System.out.println (ingredient.getAttributeValue("name") + " " +
										ingredient.getAttributeValue("amount") + " " +
										ingredient.getAttributeValue("unit"));
				}
                                List steps = e.getChildren("preparation");
                                //List steps2 = e.getChildren("step");
                                for(int x=0; x<steps.size(); x++){
                                    Element step = (Element)steps.get(x);
                                    System.out.println("Step:" + step.getChildText("step"));
                                }
                                
                                
			}

		}catch(JDOMException e){
			System.out.println(e.toString());
		}catch(MalformedURLException e){
			System.out.println(e.toString());
		}catch(IOException e ){
			System.out.println(e.toString());
		}
	}
}