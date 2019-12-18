import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The first scene of the videogame
 * 
 * @author rsolares@email.sc.edu
 * @version 1
 */
public class Scene1 extends World
{
    /**
     * Constructor for objects of class Scene1.
     * 
     */ 
    public Scene1()
    {    
        // Create a new world with 560x560 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        GreenfootImage scene1 = new GreenfootImage("Scene1.png");
        scene1.scale(getWidth(), getHeight());
        setBackground(scene1); 
        
        Link link = new Link();
        addObject(link,408,493);
        
        oldMan oldMan = new oldMan();
        addObject(oldMan,185,493);
    }// end constructor Scene1

    /**
     * Allows the player to go to the next screen
     */
    public void act() 
    { 
        if (Greenfoot.mouseClicked(this))
        {
            Scene2 scene2 = new Scene2();
            Greenfoot.setWorld(scene2);
        }// end if 
    }// end method act
}// end class Scene1
