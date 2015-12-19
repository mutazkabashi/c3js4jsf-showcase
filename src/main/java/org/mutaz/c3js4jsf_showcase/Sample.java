package org.mutaz.c3js4jsf_showcase;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "sample")
@RequestScoped
public class Sample {
	
	private List<String> groupNames =  new ArrayList<String>();
	private Map<String,List<Double>> entries = new TreeMap<String, List<Double>>();
	private Map<String,String> entriesColors = new TreeMap<String, String>();
	//private String chartType;
	
	@PostConstruct
	public void init(){
		groupNames.add("Group 1");
		groupNames.add("Group 2");
		entries.put("Set1",Arrays.asList(new Double[] { 100D, 1000D }));
		entries.put("Set2",Arrays.asList(new Double[] { 200D, 2000D }));
		entriesColors.put("Set1","#C00000");
		entriesColors.put("Set2", "#ED7D31");
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
