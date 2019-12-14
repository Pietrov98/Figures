package DataLoader;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Figures.IFigure;
public abstract class DataLoader {

	private List<IFigure> listOfFigures;
	
	public static List<IFigure> loader()
	{
		
		JSONParser jsonParser = new JSONParser();
        
        try (FileReader reader = new FileReader("figures.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray figuresList = (JSONArray) obj;
            System.out.println(figuresList);
             
            //Iterate over employee array
            figuresList.forEach( fig -> parseFigureObject( (JSONObject) fig) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
		return null;
	}
	
	private static void parseFigureObject(JSONObject figures) 
    {
        JSONObject employeeObject = (JSONObject) figures.get("figure");
         
        String type = (String) employeeObject.get("type");    
        System.out.println(type);
         
        String parameters = (String) employeeObject.get("parameters");  
        System.out.println(parameters);
        
    
 
    }
}

