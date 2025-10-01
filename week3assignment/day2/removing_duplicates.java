package week3assignment.day2;

public class removing_duplicates {

	public static void main(String[] args) {
     String text="we learn java as part of daily java sessions from java trainer";
     String[] split = text.split(" ");
     String[] split1=split; 
      int count=0;
     for(int i=0;i<split.length;i++)
     {   
    	 for(int j=i+1;j<split1.length;j++)
    	 {
    		 if(split[i].equals(split1[j]))
    		 { 
    			
    			split1[j]="";
    			 count=count+1;
    		 }
    	 }
	}
     if(count>1)
     {
    for(int i=0;i<split1.length;i++)
    {
    	System.out.print(split1[i]+" ");
    }
     }
}
}