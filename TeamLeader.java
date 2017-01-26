
public class TeamLeader {

	 
	int ProjectNum;
	    String FirstName;
	    String LastName;
	    public TeamLeader(int ProjectNum, String FirstName, String LastName) {	  
	    	this.ProjectNum = ProjectNum;       
	        this.FirstName = FirstName;
	        this.LastName = LastName;
	    }
	   void Print(){      
	       StringBuffer sBuffer = new StringBuffer(ProjectNum+ " " +FirstName.toUpperCase());
	       sBuffer.append(" "+LastName.toUpperCase());
	       System.out.println(sBuffer);  
	   }
	}
