package com.pixeltrice.springbootimportcsvfileapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "developer_tutorial")
public class DeveloperTutorial {

	 @Id
	  private String id;

	  private String title;

	  private String description;

	  private boolean published;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public DeveloperTutorial(String id, String title, String description, boolean published) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.published = published;
	}

	public DeveloperTutorial() {
		
	}

	@Override
	public String toString() {
		return "DeveloperTutorial [id=" + id + ", title=" + title + ", description=" + description + ", published="
				+ published + "]";
	}
	  
	  
}
