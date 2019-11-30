package com.nulab.task.cacoo.model;

public class Diagram {

	private String title;
	private String imageUrlForApi;
	private String diagramId;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImageUrlForApi() {
		return imageUrlForApi;
	}
	public void setImageUrlForApi(String imageUrlForApi) {
		this.imageUrlForApi = imageUrlForApi;
	}
	public String getDiagramId() {
		return diagramId;
	}
	public void setDiagramId(String diagramId) {
		this.diagramId = diagramId;
	}
	@Override
	public String toString() {
		return "Diagram [title=" + title + ", imageUrlForApi=" + imageUrlForApi + ", diagramId=" + diagramId + "]";
	}
	
	
}
