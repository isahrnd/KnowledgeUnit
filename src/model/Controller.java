package model;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import model.Project;

public class Controller {


	private Project[] projects;
	private Stage [] stage;
	private 

	public Controller() {

		Projects = new Project[10];
		testCases();

	}
	
	public void testCases() {
		
		//units[0] = new KnowledgeUnit("A001", "Gestion de repositorios", "Tecnico", "GitHub es una herramienta util");
		//units[1] = new KnowledgeUnit("A002", "Gestion de equipos", "Experiencias", "Es importante definir responsabilidades claras");
		
	}

	public boolean registerProject(String projectName, String projectClient, String managerName, String managerPhone, double budget , int iDay, int fDay, int iMonth, int fMonth, int iYear, int fYear, int type) {

		Calendar initialDate = new GregorianCalendar(iYear, iMonth-1, iDay);
		Calendar finalDate = new GregorianCalendar(fYear, fMonth-1, fDay);
		
		TypeProject typeP= TypeProject.DEVELOPMENT;
        if (type==1){
            typeP= TypeProject.DEVELOPMENT;
        }
        else if (type==2){
            typeP=TypeProject.MAINTENANCE;
        }
		else{
			typeP=TypeProject.DEPLOYMENT;
		}

		Project newProject = new Project(projectName, projectClient, managerName, managerPhone, budget, initialDate, finalDate, typeP);

		for(int i = 0; i<projects.length; i++){

            if(projects[i]==null){

                projects[i] = newProject;

                return true;
            }
            
        }

		return false;
	}

	public String searchProjectsAfterDate(int cYear, int cMonth, int cDay) throws ParseException {

		Calendar consultDate = new GregorianCalendar(cYear, cMonth-1, cDay);

		String msg = "";

		for(int i = 0; i<projects.length; i++){
			
			int val = 0;
	
			if (projects[i]!=null){
				val = projects[i].getInitialDate().compareTo(consultDate);
	
				if(val == 1){
					msg = "\n" +projects[i].getProjectInfo(); 
				}
			}
        }

		return msg;

	}

	public String searchProjectsBeforeDate(int cYear, int cMonth, int cDay) throws ParseException {

		Calendar consultDate = new GregorianCalendar(cYear, cMonth-1, cDay);

		String msg = "";

		for(int i = 0; i<projects.length; i++){
			
			int val = 0;

			val = projects[i].getFinalDate().compareTo(consultDate);

			if (projects[i]!=null){
				val = projects[i].getInitialDate().compareTo(consultDate);
	
				if(val == 1){
					msg = "\n" +projects[i].getProjectInfo(); 
				}
			}
            
        }

		return msg;

	}


	public boolean registerKnowledgeUnit(int project, int stage, String id, String description, String type, String learnedLessons, String status) {

		return projects[project].getStages()[stage].addKU(id, description, type, learnedLessons, status);

	}
		/*/String typeKU = "";
		int type_comparator=Integer.parseInt(type);  

		if ( type_comparator == 1) {

			typeKU = "Technical";
		} else {
			typeKU = "Experiences";
		}

		KnowledgeUnit newKU = new KnowledgeUnit(id, description, typeKU, learnedLessons);

		for (int i = 0; i < units.length; i++) {

			if (units[i] == null) {
				units[i] = newKU;
				return true;
			}
		}
			return false; 
	



        }/** */

	


	//Incompleto
	public void approveKnowledgeUnit(int position, int stagePosition, int positionKu, String status) {

		projects [position].getStages()[stagePosition].approveKnowledgeUnit(positionKu, status);
		/*if (status == 1) {

			units[position].setStatus("Aprobada");

		} else {
			units[position].setStatus("No aprobada");

		}

		return status; 

	

	}/*/

	//Incompleto

	public void modificateCapsule(int projectPosition, int stagePosition, int position, int attribute, String mod){

		projects[projectPosition].getStages()[stagePosition].modifcarCapsula(position, attribute, mod);
		

	}
	public String getAllKnowledgeUnits(int projectPosition, int stagePosition) {

		return projects [projectPosition].getStages()[stagePosition].getAllKnowledgeUnits();
		String msg = "";

		for  (int i = 0; i<units.length; i++){

			if (units[i] != null) {
				msg += "\n" + units[i].toString() + "\n";
			}

		}

		return msg;

	}
	public String getKnowledgeUnits(int projectPosition, int stagePosition) {

		return Projects [projectPosition].getStages()[stagePosition].getAllKnowledgeUnits();
		String msg = "";

		for (int i = 0; i < units.length; i++) {

			if (units[i] != null) {
				msg += "\n" + (i + 1) + ". " + units[i].getId() + " - " + units[i].getDescription();
			}

		}

		return msg;

}
public String getSpecificKnowledgeUnits(int position, int projectPosition, int stagePosition){

		return projects[projectPosition].getStages()[stagePosition].getSpecificKnowledgeUnits(position);
	}



	public String getAllProjects() throws ParseException {

		String msg = "";

	 	for(int i=0; i<projects.length; i++){

            if(projects[i]!=null){
            	msg += "\n" +projects[i].getProjectInfo();    
            }

        } 

		return msg;

	}

	public String getAllStages(int projectPosition) throws ParseException{
		
		return projects[projectPosition-1].getAllStages();
	}

	public void culminateStage(int sDay, int sMonth, int sYear){
		Calendar initialDate = new GregorianCalendar(sYear, sMonth-1, sDay);
		Calendar finalDate = new GregorianCalendar(sYear, sMonth-1, sDay);

	}

	public void  addStage(int fYearR, int fMonthR, int fDayR){
		Calendar initialDateR = new GregorianCalendar(fMonthR, fMonthR-1, fDayR);
		Calendar finalDateR = new GregorianCalendar(fMonthR, fMonthR-1, fDayR);
	}
}
}
	


		



	

