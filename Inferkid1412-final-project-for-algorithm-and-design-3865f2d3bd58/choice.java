import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class choice1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class choice extends Actor
{
    private GreenfootImage buttonImage;
    /**
     * 
     */
    public choice(String imageFilename)
    {
        buttonImage = new GreenfootImage(imageFilename);
        setImage( buttonImage );
        buttonImage.scale(240,100);
    }
   
}
