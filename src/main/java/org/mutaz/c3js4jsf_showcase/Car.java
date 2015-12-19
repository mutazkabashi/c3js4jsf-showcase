package org.mutaz.c3js4jsf_showcase;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "car")
@RequestScoped
public class Car {
	
	private List<String> groupNames =  new ArrayList<String>();
	private Map<String,List<Double>> entries = new TreeMap<String, List<Double>>();
	private Map<String,String> entriesColors = new TreeMap<String, String>();
	//private String chartType;
	
	@PostConstruct
	public void init(){
		groupNames.add("Toyota");
		groupNames.add("BMW");
		groupNames.add("Merceds Benz");
		groupNames.add("Honda");
		groupNames.add("Ford");
		groupNames.add("Nissan");
		groupNames.add("Audi");
		groupNames.add("VW");
		groupNames.add("Land Rover");
		entries.put("Car Brand",Arrays.asList(new Double[] { 28.91D, 26.35D,21.97D,13.33D,13.11D,11.41D,10.13D,9.28D,4.99D,4.33D }));
		//entries.put("Set2",Arrays.asList(new Double[] { 200D, 2000D }));
		entriesColors.put("Car Brand","#C00000");
		//entriesColors.put("Set2", "#ED7D31");
		//chartType = "pie";
	}
	
	public List<String> getGroupNames() {
		return groupNames;
	}
	public void setGroupNames(List<String> groupNames) {
		this.groupNames = groupNames;
	}
	public Map<String, List<Double>> getEntries() {
		return entries;
	}
	public void setEntries(Map<String, List<Double>> entries) {
		this.entries = entries;
	}
	public Map<String, String> getEntriesColors() {
		return entriesColors;
	}
	public void setEntriesColors(Map<String, String> entriesColors) {
		this.entriesColors = entriesColors;
	}
	/*public String getChartType() {
		return chartType;
	}
	public void setChartType(String chartType) {
		this.chartType = chartType;
	}*/

}
