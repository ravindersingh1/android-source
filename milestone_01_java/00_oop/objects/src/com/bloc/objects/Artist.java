package com.bloc.objects;

class Artist extends Object {
	// The artist's first name
	String mFirstName;
	// The artist's last name
	String mLastName;

	/*
	 * Only Constructor
	 * @param firstName
	 * @param lastName
	 */
	// CONSTRUCTOR CODE GOES HERE
    
    Artist(String fname, String lname){
        mFirstName=fname;
        mLastName=lname;
    }
    
    
    public String getFirstName(){
        
        return mFirstName;
    }
    
    public String getLastName(){
        
        return mLastName;
    }

}