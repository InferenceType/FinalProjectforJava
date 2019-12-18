import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The eighth scene of the videogame
 * 
 * @author rsolares@email.sc.edu
 * @version 1
 */
public class Scene8 extends World
{ 
    private int scoreForThisScene;
    /**
     * Constructor for objects of class Scene8.
     *  
     */
    public Scene8(int scoreFromPreviousScene) 
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        GreenfootImage scene8 = new GreenfootImage("Scene8.png");
        scene8.scale(getWidth(), getHeight());
        setBackground(scene8);
        this.scoreForThisScene = scoreFromPreviousScene;
        Link link = new Link();
        addObject(link,498,534);
        
        Eye eye = new Eye();
        addObject(eye,511,530);
        
        Eye eye2 = new Eye();
        addObject(eye2,485,527);
    }// end Scene8 constructor

    public void act()  
    {  
        if (Greenfoot.mouseClicked(this) )
        {
            Greenfoot.setWorld( new FinalScene( scoreForThisScene ) );
        }//end if
    }// end method act
}// end class Scene8
