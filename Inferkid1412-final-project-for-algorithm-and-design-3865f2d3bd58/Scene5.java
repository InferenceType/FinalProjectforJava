import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The fifth scene of the videogame
 * 
 * @author rsolares@email.sc.edu
 * @version 1
 */
public class Scene5 extends World
{
    private int scoreForThisSceneKillEye;

    /**
     * Constructor for objects of class Scene4.
     * I learned how to resize images from this link https://www.greenfoot.org/topics/1763
     * 
     */ 
    public Scene5( int scoreFromPreviousScene )
    {    
        // Create a new world with 560x560 cells with a cell size of 1x1 pixels.
        super(560, 560, 1);  
        GreenfootImage scene5 = new GreenfootImage("Scene5.png");
        scene5.scale(getWidth(), getHeight());
        setBackground(scene5); 

        this.scoreForThisSceneKillEye = scoreFromPreviousScene;
        
        
    }// end Scene5 constructor
    
    public void act()
    {
        if (UserInfo.isStorageAvailable() )
        {
            UserInfo myInfo = UserInfo.getMyInfo();
            double userKillman = 
                Math.round( 100 * ((double)myInfo.getScore() / (myInfo.getScore() + myInfo.getInt(0)) ) );
            showText("Percentage of Players Who \n Choosed to Kill the Man: " + (userKillman), getWidth()/2, 300 );
            double userKilleye = 
                Math.round( 100 * ((double)myInfo.getInt(0)/ (myInfo.getInt(0) + myInfo.getScore() ) ));
            showText("Percentage of Players Who \n Choosed to Kill the Eye: " + (userKilleye), getWidth()/2, 350 );
            Greenfoot.stop();
        }
    }// end method act

}// end class Scene5
