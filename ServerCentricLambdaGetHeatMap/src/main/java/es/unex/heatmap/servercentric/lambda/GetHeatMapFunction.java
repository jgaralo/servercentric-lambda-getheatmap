package es.unex.heatmap.servercentric.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import es.unex.heatmap.servercentric.messages.GetHeatMapMessage;
import es.unex.heatmap.servercentric.messages.HeatMapInfoMessage;

public class GetHeatMapFunction  implements RequestHandler<GetHeatMapMessage, HeatMapInfoMessage>{

	public HeatMapInfoMessage handleRequest(GetHeatMapMessage heatMapMessage, Context context) {
		// TODO Auto-generated method stub
		return null;
	}

}
