package com.bloc.securitypackages.apples;
import com.bloc.securitypackages.colors.*;

public class Macintosh extends Apple {

 public	Macintosh() {
		
     super();
     //super(Macintosh.class.getSimpleName(), 200, new Red(), 0.14d);
	}

	void bite() {
		setWeight(getWeight() - 0.01d);
	}

}