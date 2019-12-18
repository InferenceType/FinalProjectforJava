import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The second scene of the videogame
 * 
 * @author rsolares@email.sc.edu
 * @version 1
 */
public class Scene2 extends World
{
    /**
     * Constructor for objects of class Scene2.
     * 
     */
    public Scene2()
    {  
        // Create a new world with 560x560 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        
        GreenfootImage scene2 = new GreenfootImage("Scene2.png");
        scene2.scale(getWidth(), getHeight());
        setBackground(scene2); 
        
        Link link = new Link();
        addObject(link,408,493);
        
        oldMan oldMan = new oldMan();
        addObject(oldMan,185,493);
    }// end Scene2 constructor
    
    /**
     * Allows the player to go to the next screen
     */
    public void act() 
    { 
        if (Greenfoot.mouseClicked(this))
        {
            Scene3 scene3 = new Scene3();
            Greenfoot.setWorld(scene3);
        }// end if 
    }// end method act
}// end class Scene2
