package com.api.request.models;

import java.util.List;

public class UpdatePetRequest {

	private int id;

	private String name;

	private category category;

	private List<String> photoUrls;

	private List<tags> tags;

	private String status;

	public UpdatePetRequest(int id, String name, category category, List<String> photoUrls, List<tags> tags,
			String status) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.photoUrls = photoUrls;
		this.tags = tags;
		this.status = status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public category getCategory() {
		return category;
	}

	public void setCategory(category category) {
		this.category = category;
	}

	public List<String> getPhotoUrls() {
		return photoUrls;
	}

	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}

	public List<tags> getTags() {
		return tags;
	}

	public void setTags(List<tags> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "UpdatePetRequest [id=" + id + ", name=" + name + ", category=" + category + ", photoUrls=" + photoUrls
				+ ", tags=" + tags + ", status=" + status + "]";
	}

	public static class category {
		private int id;

		private String name;

		public category(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "category [id=" + id + ", name=" + name + "]";
		}

	}

	public static class tags {
		private int id;
		private String name;

		public tags(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "tags [id=" + id + ", name=" + name + "]";
		}
	}

}
