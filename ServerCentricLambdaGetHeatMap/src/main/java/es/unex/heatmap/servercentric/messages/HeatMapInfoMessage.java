package es.unex.heatmap.servercentric.messages;

import java.util.List;

public class HeatMapInfoMessage {
	
	private List<LocationFrequency> locationList;

	public List<LocationFrequency> getLocationList() {
		return locationList;
	}

	public void setLocationList(List<LocationFrequency> locationList) {
		this.locationList = locationList;
	}

	public HeatMapInfoMessage() {
		super();
	}
	
}
