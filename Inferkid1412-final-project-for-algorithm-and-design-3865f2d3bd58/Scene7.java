import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The seventh scene of the videogame
 * 
 * @author rsolares@email.sc.edu
 * @version 1
 */
public class Scene7 extends World
{
    private int scoreForThisScene;
    /**
     * Constructor for objects of class Scene7.
     * 
     */
    public Scene7(int scoreFromPreviousScene)
    {    
        // Create a new world with 560x560 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        GreenfootImage scene7 = new GreenfootImage("Scene7.png");
        scene7.scale(getWidth(), getHeight());
        setBackground(scene7); 

        deadMan deadMan = new deadMan();
        addObject(deadMan,139,92);

        Link link = new Link();
        addObject(link,198,173);

        policeMan policeMan = new policeMan();
        addObject(policeMan,349,206);

        policeMan policeMan2 = new policeMan();
        addObject(policeMan2,254,297);
        this.scoreForThisScene = scoreFromPreviousScene;
    }// end Scene7 constructor

    public void act()
    {
        if (Greenfoot.mouseClicked(this) )
        {

            
            Greenfoot.setWorld( new Scene8( scoreForThisScene ) );
        }// end if
    }// end method act 
}// end class 
