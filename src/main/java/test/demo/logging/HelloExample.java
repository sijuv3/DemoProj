package test.demo.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HelloExample {

	private static final Logger LOGGER = LogManager.getLogger(HelloExample.class.getName());
    
    public static void main(String[] args) {
    		LoggingVO obj = new LoggingVO(5, "testing");
    		ObjectMapper mapper = new ObjectMapper();
    		String jsonInString;
		try {
			jsonInString = mapper.writeValueAsString(obj);
			LOGGER.info(jsonInString);
		} catch (JsonProcessingException e) {}
    }
}