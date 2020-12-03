package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LogFileMaxMinTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    String[][] logs = new String[][] {
		        { "58523", "user_1", "resource_1" },
		        { "62314", "user_2", "resource_2" },
		        { "54001", "user_1", "resource_3" },
		        { "200", "user_6", "resource_5" },
		        { "215", "user_6", "resource_4" },
		        { "54060", "user_2", "resource_3" },
		        { "53760", "user_3", "resource_3" },
		        { "58522", "user_4", "resource_1" },
		        { "53651", "user_5", "resource_3" },
		        { "2", "user_6", "resource_1" },
		        { "100", "user_6", "resource_6" },
		        { "400", "user_7", "resource_2" },
		        { "100", "user_8", "resource_2" },
		        {"54359", "user_1", "resource_3"},
		    };

		    //for(int i = 0; i<logs.length;i++)
		    	//for(int j=0; j<3; j++)
		    		//System.out.println(logs[i][j]);
		    
		   
		    //String[][] outputlogs = new String[logs.length][3];
		    List<String[]> outputlogs = new ArrayList<String[]>();
		    for(int i = 0; i<logs.length;i++) {
		    	//System.out.println(logs[i][1]);
		    	for(int j=0; j<outputlogs.size(); j++) {
		    		System.out.println(outputlogs.size());
		    		if(logs[i][1] == outputlogs.get(j)[0]) {
		    			if(Integer.parseInt(logs[i][0]) < Integer.parseInt(outputlogs.get(j)[1])) {
		    				outputlogs.get(j)[1] = logs[i][0];   
		    			}
		    			
		    			if(Integer.parseInt(logs[i][0]) > Integer.parseInt(outputlogs.get(j)[2])) {
		    				outputlogs.get(j)[2] = logs[i][0];	    				
		    			}
		    			break;
		    			
		    		}else if(j == outputlogs.size()-1){
		    			String [] newVal = new String[] {logs[i][1],logs[i][0], logs[i][0]};
		    			//outputlogs.add(newVal);
		    			Collections.addAll(outputlogs, newVal);
		    		}
		    		
		    		
		    			
		    		//}else if(Integer.parseInt(outputlogs.get(j)[0]) == outputlogs.size()-1){
//		    			for(int k = 0; k < outputlogs.size();k++)
//		    		    	//for(int l=0; l<3; l++)
//		    		    		if(outputlogs[k][0] == null) {
//		    		    			System.out.println(logs[i][1]);
//		    		    			outputlogs[k][0] = logs[i][1];
//		    		    			outputlogs[k][1] = logs[i][0];
//		    		    			outputlogs[k][2] = logs[i][0];
//		    		    			break;
//
//		    		    		}
		    			
		    			
	    			
		    	}
		    }
		    //for(int i = 0; i<outputlogs.length;i++) {
		    	//System.out.println();
		    	//for(int j=0; j<3; j++)
		    		//System.out.println(Arrays.deepToString(outputlogs));
		   // }
		    //System.out.println(Arrays.deepToString(outputlogs.toArray()));
		    System.out.println(outputlogs);
	}
}
	

	
	

