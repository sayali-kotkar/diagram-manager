package com.nulab.task.cacoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nulab.task.cacoo.model.Diagram;
import com.nulab.task.cacoo.model.Diagrams;

@Service
public class DiagramService {

	@Value("${diagrams.url.get}")
	private String getDiagramsUrl ;
	
	@Value("${diagrams.url.post}")
	private String postDiagramsUrl ;
	
	@Value("${diagrams.url.delete}")
	private String deleteDiagramUrl ;
	
	@Autowired
	private RestTemplate template;
	
	@Value("${apiKey}")
	private String apiKey;
	
	public List<Diagram> getListOfAllDiagrams() {
		String url = getDiagramsUrl + "?apiKey="+ apiKey;
		Diagrams diagrams= template.getForEntity(url, Diagrams.class).getBody();
		System.out.println(diagrams.getResult());
		return diagrams.getResult();		
	}	

	public Diagram createDiagram() {
		String url = postDiagramsUrl + "?apiKey="+ apiKey;
		Diagram diagram= template.getForEntity(url, Diagram.class).getBody();
		System.out.println(diagram);
		return diagram;
	
	}
	
	public Diagram deleteDiagram(String diagramId) {
		String url = deleteDiagramUrl + "?apiKey="+ apiKey;
		Diagram diagram= template.getForEntity(url, Diagram.class).getBody();
		System.out.println(diagram);
		return diagram;	
	}
}
