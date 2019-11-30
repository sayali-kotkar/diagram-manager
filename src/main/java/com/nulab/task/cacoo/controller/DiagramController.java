package com.nulab.task.cacoo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nulab.task.cacoo.model.Diagram;
import com.nulab.task.cacoo.service.DiagramService;

@RestController
@RequestMapping("/diagrams")
public class DiagramController {

	@Autowired
	private DiagramService diagramService;	
	
	
	@GetMapping
	@CrossOrigin
	public List<Diagram> getAllDiagrams() {
		 return diagramService.getListOfAllDiagrams();
	}
	
	@PostMapping
	public Diagram createDiagram() {
		 return diagramService.createDiagram();
	}
	
	@DeleteMapping("/{diagramId}")
	@CrossOrigin
	public Diagram deleteDiagram(@PathParam("diagramId") String diagramId) {
		 return diagramService.deleteDiagram(diagramId);
	}
}
