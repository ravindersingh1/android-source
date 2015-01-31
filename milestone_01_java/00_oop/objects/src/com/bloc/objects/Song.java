package com.bloc.objects;

class Song extends Object {
	// The ensemble which produced it
	Ensemble mEnsemble;
	// Title of the song
	String mTitle;
	// The year it was released
	int mYearReleased;
    
	/*
	 * Basic Constructor
	 * Side-effects: Assigns some default ensemble, title and
	 *				 and year of your choosing
	 */
	// CONSTRUCTOR CODE GOES HERE
    
    Song(){
        Artist[] artists = new Artist[1];
        artists[0] = new Artist ("Ravinder", "Singh");
        mEnsemble = new Ensemble( artists);
        mTitle = "always winning";
        mYearReleased = 2004;
        
    }
	/*
	 * Partial Constructor
	 * Side-effects: Sets the year of release to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 */
	// CONSTRUCTOR CODE GOES HERE
    Song(Ensemble ensemble, String tittle){
        mYearReleased = 0;
        mEnsemble = ensemble;//new Ensemble(String name, Artists[] artists);
        mTitle = tittle;
    }
	/*
	 * Full Constructor
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 */
	// CONSTRUCTOR CODE GOES HERE
    Song(Ensemble ensemble, String tittle, int yearReleased){
        mEnsemble = ensemble; //new Ensemble(String name, Artists[] artists);
        mTitle= tittle;
        mYearReleased = yearReleased;
        
    }
    
}