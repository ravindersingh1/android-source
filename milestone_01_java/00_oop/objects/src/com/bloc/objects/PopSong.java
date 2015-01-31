package com.bloc.objects;

class PopSong extends Song {
	// The number of weeks this song stayed on Billboard's top 100
	int mWeeksOnBillboard;

	/*
	 * Basic Constructor
	 * Side-effects: Assigns some default ensemble, title,
	 *				 year and weeks on billboard
	 */
	// CONSTRUCTOR CODE GOES HERE
    PopSong(){
        super();
        
        mWeeksOnBillboard = 0;
    }
	/*
	 * Partial Constructor
	 * Side-effects: Sets the year of release to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 */
	// CONSTRUCTOR CODE GOES HERE
    
    PopSong(Ensemble ensemble, String tittle){
        super(ensemble, tittle);
    }
    
    /*
	 * Full Song Constructor
	 * Side-effects: Sets the weeks on billboard to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 */
	// CONSTRUCTOR CODE GOES HERE
    
    PopSong(Ensemble ensemble, String tittle, int yearReleased){
        mWeeksOnBillboard = 0;
        super.mEnsemble =  ensemble ;//new Ensemble(String name, Artists[] artists);
        super.mTitle = tittle;
        super.mYearReleased = yearReleased;
    }

	/*
	 * Full PopSong Constructor
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 * @param weeksOnBillboard number of weeks this song lasted on the
	 *		  				   Billboard's top 100
	 */
	// CONSTRUCTOR CODE GOES HERE
    
    PopSong(Ensemble ensemble, String tittle, int yearReleased, int weeksOnBillboard){
        
        super.mEnsemble = ensemble; //new Ensemble(String name, Artists[] artists);
        super.mTitle = tittle;
        super.mYearReleased = yearReleased;
        mWeeksOnBillboard = weeksOnBillboard;
    }
}