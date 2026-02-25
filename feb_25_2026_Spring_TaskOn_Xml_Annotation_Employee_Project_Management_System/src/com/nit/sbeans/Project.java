package com.nit.sbeans;

public class Project {
	int projectId;
	String projectName;
	int duration;

	public Project(int projectId, String projectName, int duration) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.duration = duration;
	}

	public String showProjectDetails() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", duration=" + duration + "]";
	}

}
