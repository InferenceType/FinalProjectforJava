import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The third scene of the videogame
 * 
 * @author rsolares@email.sc.edu
 * @version 1
 */
public class Scene3 extends World
{
    private choice SelectScreenButton; 
    private choice SelectScreenButton1;
    private int scoreForThisSceneKillMan; 
    private int scoreForThisSceneKillEye; 
   
    /**
     * Constructor for objects of class Scene3.
     * 
     */
    public Scene3()
    {    
        // Create a new world with 560x560 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        GreenfootImage scene3 = new GreenfootImage("Scene3.png");
        scene3.scale(getWidth(), getHeight());
        setBackground(scene3);  

        scoreForThisSceneKillMan = 0;
        scoreForThisSceneKillEye = 0;

        SelectScreenButton = new choice("choice1eye.png");
        addObject(SelectScreenButton,150,270);
        SelectScreenButton1 = new choice("choice1man.png");
        addObject(SelectScreenButton1,421,270);
        
    }// end Scene3 constructor

    /**
     * Allows the player to go to the next avaiable screens and updates the score
     */ 
    public void act() 
    { 
        if (UserInfo.isStorageAvailable() )
        {
            UserInfo myInfo = UserInfo.getMyInfo();
            
            if (Greenfoot.mouseClicked(SelectScreenButton1) )
            {
                scoreForThisSceneKillMan += 1;
                if ( myInfo.getScore() >= scoreForThisSceneKillMan )
                {
                    myInfo.setScore( scoreForThisSceneKillMan ); //... update the high score
                }// end inner if
                myInfo.setScore( scoreForThisSceneKillMan );
                myInfo.store();
                 
                Greenfoot.setWorld( new Scene4( scoreForThisSceneKillMan ) );   
                
                // write data back to server
                

            }// end outer if 
            if (Greenfoot.mouseClicked(SelectScreenButton) )
            {
                scoreForThisSceneKillEye = myInfo.getInt( 0 );
                myInfo.setInt( 0, scoreForThisSceneKillEye + 1); 
                myInfo.store();
                
                 
                Greenfoot.setWorld( new Scene5( scoreForThisSceneKillEye ) );   
                
                // write data back to server
                

            }// end inner if 
        }// end outer if
    }// end method act  
}// end class Scene3 