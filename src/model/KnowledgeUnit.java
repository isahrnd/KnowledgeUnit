package model;

public class KnowledgeUnit {

	public static final int length = 0;
	public String id;
	public String description;
	public String type;
	public String learnedLessons;
	public String status;

	public KnowledgeUnit(String id, String description, String type, String learnedLessons, String status) {

		this.id = id;
		this.description = description;
		this.type = type;
		this.learnedLessons = learnedLessons;
		this.status = "Por definir";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLearnedLessons() {
		return learnedLessons;
	}

	public void setLearnedLessons(String learnedLessons) {
		this.learnedLessons = learnedLessons;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String toString() {

		String msg = "";

		msg = "ID: " + id + "\nDescription: " + description + "\nType: " + type + "\nLearned lesson"
				+ learnedLessons + "\nStatus: " + status;

		return msg;

	}

	public String toStringA(){

		String msg = "";
		msg = "\nID: "+ id + "\nDescription:" + description;
		return msg;
	}

}
