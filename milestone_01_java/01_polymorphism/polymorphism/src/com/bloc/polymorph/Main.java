
package com.bloc.polymorph;

import com.bloc.polymorph.pets.*;

public class Main extends Object {

	public static void main(String [] args) {

        Pet dog = (Dog) new Dog();
        Pet cat = (Cat) new Cat();
        Pet bird = (Bird) new Bird();
        Pet snake = (Snake)new Snake();
        Pet tarantula = (Tarantula) new Tarantula();
        
        
        Pet[] pets= { dog, cat, bird, snake, tarantula};
        
       
        for (int i = 0; i < pets.length; i++) {
            
            pets[i].feed();
            pets[i].wash();
            pets[i].exercise();
        }
        
        
        
        
        
        /*Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		Snake snake = new Snake();
		Tarantula tarantula = new Tarantula();
  
		// Accomplish the below using polymorphism

		/* dog.feed();
		dog.wash();
		dog.exercise();

		cat.feed();
		cat.wash();
		cat.exercise();

		bird.feed();
		bird.wash();
		bird.exercise();

		snake.feed();
		snake.wash();
		snake.exercise();

		tarantula.feed();
		tarantula.wash();
		tarantula.exercise();
  */
		// Accomplish the above using polymorphism

		assert dog.isFed() && dog.isWashed() && dog.isExercised() : "Your dog needs a little more attention";
		assert cat.isFed() && cat.isWashed() && cat.isExercised() : "Your cat needs a little more attention";
		assert bird.isFed() && bird.isWashed() && bird.isExercised() : "Your bird needs a little more attention";
		assert snake.isFed() && snake.isWashed() && snake.isExercised() : "Your snake needs a little more attention";
		assert tarantula.isFed() && tarantula.isWashed() && tarantula.isExercised() : "Your tarantula needs a little more attention";
		
		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
