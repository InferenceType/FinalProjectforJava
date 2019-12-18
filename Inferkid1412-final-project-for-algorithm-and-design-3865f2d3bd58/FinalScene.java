import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The eighth scene of the videogame
 * 
 * @author rsolares@email.sc.edu
 * @version 1
 */
public class FinalScene extends World
{
    private int scoreForThisScene; 
    /**
     * Constructor for objects of class FinalScene.
     * 
     */
    public FinalScene(int scoreFromPreviousScene)
    {    
        super(560, 560, 1); 
        GreenfootImage FinalScene = new GreenfootImage("FinalScene.png");
        FinalScene.scale(getWidth(), getHeight());
        setBackground(FinalScene);  
        this.scoreForThisScene = scoreFromPreviousScene;
    }// end FinalScene constructor
    
    public void act()
    {
        // Just for the purpose of this "toy example," let's 
        // just end the scenario here, display the score, and update userInfo
        Greenfoot.stop();
        
        
        
        
        if (UserInfo.isStorageAvailable()) {
            UserInfo myInfo = UserInfo.getMyInfo();
            if (scoreForThisScene > myInfo.getScore()) {
                myInfo.setScore(scoreForThisScene);
                myInfo.store();  // write back to server            
            } // end inner if
            double userKillman = 
                Math.round( 100 * ((double)myInfo.getScore() / (myInfo.getScore() + myInfo.getInt(0)) ) );
            showText("Percentage of Players \n Who Choosed to Kill the Man: " + (userKillman), getWidth()/2 , 100 );
            double userKilleye = 
                Math.round( 100 * ((double)myInfo.getInt(0)/ (myInfo.getInt(0) + myInfo.getScore() ) ));
            showText("Percentage of Players \n Who Choosed to Kill the Eye: " + (userKilleye), getWidth()/2 , 150 );
            double userConfessed = 
                Math.round( 100 * ((double)myInfo.getInt(2) / (myInfo.getInt(2)+ myInfo.getInt(1)) ) );
            showText("Percentage of Players \n Who Choosed to Confess: " + (userConfessed), getWidth()/2 , 200 );
            double userCoveredUp = 
                Math.round( 100 * ((double)myInfo.getInt(1) / (myInfo.getInt(1)+ myInfo.getInt(2)) ) );
            showText("Percentage of Players \n Who Choosed to Cover Up: " + (userCoveredUp), getWidth()/2 , 250 );
            double overAll = 
                Math.round( 100 * ((double)myInfo.getScore() / (myInfo.getScore() + myInfo.getInt(0) + myInfo.getInt(1) + myInfo.getInt(2)) ) );
            showText( "Overall Percentage of the \n Correct Scenes Being Chosen: " + overAll, getWidth()/2, 300 ); 
        } // end outer if
    } // end method act
}// end class FinalScene
