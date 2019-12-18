import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The fourth scene of the videogame
 * 
 * @author rsolares@email.sc.edu
 * @version 1
 */
public class Scene4 extends World
{ 
    private int scoreForThisScene;
    private choice SelectScreenButton; 
    private choice SelectScreenButton1;
    private int scoreForThisSceneCoverUp;
    private int scoreForThisSceneConfess;
    /**
     * Constructor for objects of class Scene4.
     * 
     */
    public Scene4( int scoreFromPreviousScene)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        GreenfootImage scene4 = new GreenfootImage("Scene4.png");
        scene4.scale(getWidth(), getHeight());
        setBackground(scene4); 

        policeMan policeMan = new policeMan();
        addObject(policeMan,217,485);

        policeMan policeMan2 = new policeMan();
        addObject(policeMan2,334,489);

        Link link = new Link();
        addObject(link,276,344);

        scoreForThisScene = scoreFromPreviousScene;

        SelectScreenButton = new choice("confess.png");
        addObject(SelectScreenButton,148,407);
        SelectScreenButton1 = new choice("coverup.png");
        addObject(SelectScreenButton1,429,407); 
    }// end Scene4 constructor

    public void act()
    {
        if (UserInfo.isStorageAvailable() )
        {
            UserInfo myInfo = UserInfo.getMyInfo();
            if (Greenfoot.mouseClicked(SelectScreenButton) )
            {
                scoreForThisSceneCoverUp = myInfo.getInt( 1 );
                myInfo.setInt( 1, scoreForThisSceneCoverUp + 1); 
                myInfo.store();
                Greenfoot.setWorld( new Scene6( scoreForThisSceneCoverUp ) );

            }// end if

            if (Greenfoot.mouseClicked(SelectScreenButton1) )
            {
                scoreForThisSceneConfess = myInfo.getInt( 2 );
                myInfo.setInt( 2, scoreForThisSceneConfess + 1); 
                myInfo.store();
                Greenfoot.setWorld( new Scene7( scoreForThisSceneConfess ) );

            }// end if

        }// end if
    }// end method act
}// end class Scene4