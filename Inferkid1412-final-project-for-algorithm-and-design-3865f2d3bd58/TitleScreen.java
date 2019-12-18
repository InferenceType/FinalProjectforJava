import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Title Screen for the Game
 * 
 * @author rsolares@email.sc.edu
 * @version 1
 */ 
public class TitleScreen extends World
{
    
    /**
     * 
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 560x560 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        GreenfootImage titleImage = new GreenfootImage("title.png");
        titleImage.scale(getWidth(), getHeight());
        setBackground(titleImage); 
    } // end TitleScreen constructor
    
    /**
     * Allows the player to start the game when the title
     * screen is clicked
     */
    public void act() 
    { 
        if (Greenfoot.mouseClicked(this))
        {
            Scene1 scene1 = new Scene1();
            Greenfoot.setWorld(scene1);
        }// end if 
    }// end method act
} // end class TitleScreen
