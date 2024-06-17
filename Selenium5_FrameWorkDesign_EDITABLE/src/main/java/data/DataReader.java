package data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {

	public  List<HashMap<String, String>> getJsonDataToMap() throws IOException
	{
		// Read JSON to string
	String jsonContent	=FileUtils.readFileToString(new File("C:\\Users\\Abhijit\\eclipse-workspace\\Selenium5_FrameWorkDesign_EDITABLE\\src\\main\\java\\PurchaseOrder.json"),
			StandardCharsets.UTF_8);

	//C:\Users\Abhijit\eclipse-workspace\Selenium5_FrameWorkDesign_EDITABLE\src\main\java\data\PurchaseOrder.json

	//String to HashMap Jackson DataBind

	ObjectMapper mapper = new ObjectMapper();
	List<HashMap<String,String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String,String>>>()
			{});
			return data;


	}

}
