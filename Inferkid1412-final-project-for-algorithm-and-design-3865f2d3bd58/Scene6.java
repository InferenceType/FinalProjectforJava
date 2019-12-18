import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The sixth scene of the videogame
 * 
 * @author rsolares@email.sc.edu
 * @version 1
 */
public class Scene6 extends World
{
    /**
     * Constructor for objects of class Scene6.
     * 
     */
    public Scene6(int scoreFromPreviousScene)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1);  
        GreenfootImage scene6 = new GreenfootImage("Scene6.png");
        scene6.scale(getWidth(), getHeight());
        setBackground(scene6); 
        prepare();
    }// end Scene6 constructor
    
    public void act()
    {
        if (UserInfo.isStorageAvailable() )
        { 
            UserInfo myInfo = UserInfo.getMyInfo();
            double userConfessed = 
                Math.round( 100 * ((double)myInfo.getInt(2) / (myInfo.getInt(2)+ myInfo.getInt(1)) ) );
            showText("Percentage of Players \n Who Choosed to Confess: " + (userConfessed), getWidth()/2 , 110 );
            double userCoveredUp = 
                Math.round( 100 * ((double)myInfo.getInt(1) / (myInfo.getInt(1)+ myInfo.getInt(2)) ) );
            showText("Percentage of Players \n Who Choosed to Cover Up: " + (userCoveredUp), getWidth()/2 , 225 );
            Greenfoot.stop();
        }
    }// end method act

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        deadMan deadMan = new deadMan();
        addObject(deadMan,425,325);
        deadMan deadMan2 = new deadMan();
        addObject(deadMan2,165,320);
        deadMan deadMan3 = new deadMan();
        addObject(deadMan3,283,309);
        deadMan deadMan4 = new deadMan();
        addObject(deadMan4,354,395);
        deadMan deadMan5 = new deadMan();
        addObject(deadMan5,246,448);
        deadMan deadMan6 = new deadMan();
        addObject(deadMan6,107,523);
        deadMan deadMan7 = new deadMan();
        addObject(deadMan7,51,350);
        deadMan deadMan8 = new deadMan();
        addObject(deadMan8,355,517);
        deadMan deadMan9 = new deadMan();
        addObject(deadMan9,465,452);
        deadMan deadMan10 = new deadMan();
        addObject(deadMan10,513,337);
        deadMan deadMan11 = new deadMan();
        addObject(deadMan11,521,489);
    }// end method prepare
}// end class Scene6
