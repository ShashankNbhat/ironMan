package com.technoelevate;

public class Task1 {
	
	public class Main {

	    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
	    public static String getDurationString(int minutes, int seconds) {
	        String string = "";
	        int secondsSum = minutes * 60 + seconds;
	        if (minutes >= 0 && seconds >= 0 && seconds < 60) {
	            string = ((int) (secondsSum / 3600) + "h " + ((secondsSum % 3600) / 60) + "m " + (secondsSum % 60) + "s");
	        } else {
	           return INVALID_VALUE_MESSAGE;
	        }
	        return string;
	    }

	    public static String getDurationString(int seconds) {
	        String string = "";
	        if (seconds >= 0) {
	            string = getDurationString(seconds/60, seconds % 60);
	        }
	        return string;
	    }
	    
	    
	    
	    
	    public static void main(String[] args) {

	        
	        System.out.println(getDurationString(0, 3600));
	        System.out.println(getDurationString(0, 3660));
	        
	


	    }
	   
	    }
	
}
	
	
	
	
	
	
	


