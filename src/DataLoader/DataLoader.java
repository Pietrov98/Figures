package DataLoader;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Figures.Circle;
import Figures.IFigure;
import Figures.Rectangle;
import Figures.Triangle;
public abstract class DataLoader {

	private static List<IFigure> listOfFigures;
	
	@SuppressWarnings("unchecked")
	public static List<IFigure> loader()
	{
		listOfFigures = new ArrayList();
		JSONParser jsonParser = new JSONParser();
        
        try (FileReader reader = new FileReader("figures.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray figuresList = (JSONArray) obj;
            System.out.println(figuresList);
             
            //Iterate over employee array
            figuresList.forEach( fig -> {
				try {
					parseFigureObject( (JSONObject) fig);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (IFigure f : listOfFigures) {
        	System.out.println(f.getClass());
			
		}
		return listOfFigures;
	}
	
	private static void parseFigureObject(JSONObject figures) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        JSONObject employeeObject = (JSONObject) figures.get("figure");
         
        String type = (String) employeeObject.get("type");    
        //System.out.println(type);
         
        String parameters = (String) employeeObject.get("parameters");  
        //System.out.println(parameters);
        
        IFigure fig;
        
        if(type.equals("Circle"))
        {
        	String[] param = parameters.split(" ", 3);
        	double[] center = new double[2];
        	center[0] = Double.parseDouble(param[1]);
        	center[1] = Double.parseDouble(param[2]);
        	
        	fig = new Circle(Double.parseDouble(param[0]), center);
        	listOfFigures.add(fig);
        }
        else if(type.equals("Rectangle"))
        {
        	String[] param = parameters.split(" ", 4);
        	double[] center = new double[2];
        	center[0] = Double.parseDouble(param[0]);
        	center[1] = Double.parseDouble(param[1]);
        	
        	fig = new Rectangle(center, Double.parseDouble(param[2]), Double.parseDouble(param[3]));
        	listOfFigures.add(fig);
        }
        else if(type.equals("Triangle"))
        {
        	String[] param = parameters.split(" ", 6);
        	double[] X = new double[3];
        	X[0] = Double.parseDouble(param[0]);
        	X[1] = Double.parseDouble(param[1]);
        	X[2] = Double.parseDouble(param[2]);
        	
        	double[] Y = new double[3];
        	Y[0] = Double.parseDouble(param[0]);
        	Y[1] = Double.parseDouble(param[1]);
        	Y[1] = Double.parseDouble(param[2]);
        	
        	fig = new Triangle(X, Y);
        	listOfFigures.add(fig);
        }
 
    }
}

