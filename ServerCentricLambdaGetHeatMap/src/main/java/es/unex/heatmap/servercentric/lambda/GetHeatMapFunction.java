package es.unex.heatmap.servercentric.lambda;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import es.unex.heatmap.servercentric.messages.GetHeatMapMessage;
import es.unex.heatmap.servercentric.messages.LocationFrequency;

public class GetHeatMapFunction  implements RequestHandler<GetHeatMapMessage, List<LocationFrequency>>{

	public List<LocationFrequency> handleRequest(GetHeatMapMessage heatMapMessage, Context context) {
		context.getLogger().log("Request received: "+heatMapMessage.getRadius()+" - "+heatMapMessage.getBeginDate());
		//Static result for testing purposes
		List<LocationFrequency> result=new ArrayList<LocationFrequency>();
		LocationFrequency location=new LocationFrequency();
		location.setLatitude(39.4789);
		location.setLongitude(-6.3420);
		location.setFrequency(10);
		result.add(location);
		location=new LocationFrequency();
		location.setLatitude(39.4786);
		location.setLongitude(-6.3423);
		location.setFrequency(5);
		result.add(location);
		return result;
	}

}
