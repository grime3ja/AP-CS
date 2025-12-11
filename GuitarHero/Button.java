import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private static int score = 0;
    private String myKey = "" + (int)(Math.random() * 5 + 1);
    public Button()
    {
        GreenfootImage img = getImage();
        img.setFont(new Font("VERDANA", true, false, 20));
        img.drawString(myKey, 50, 80 );
    }
    public void act() 
    {
        
        if( Greenfoot.isKeyDown("1") && Greenfoot.isKeyDown("enter") && isTouching(Note.class) )
        {
            Note note = new Note();
            getWorld().removeObject(note);
        }
        if( isTouching(Note.class) )
        {
            removeTouching(Note.class);
            score++;
        }
    }    
}
