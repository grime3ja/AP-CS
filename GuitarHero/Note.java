import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Note here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Note extends Actor
{
    //String note = "note" + (int)((Math.random() * 5)+1) + ".PNG";
    //public String note;
    //private double velocity;
    //int y = (int)(Math.random() * 5) + 1;
    //Note note = new Note();
    Note note = new Note();
    int y = (int)(Math.random()*5)+1;
    public Note()
    {
        //String notes = "note" + (int)((Math.random() * 5)+1) + ".PNG";
        //setImage(note);
        
        if( y== 1 )
        {
            note.setImage("note1.PNG");
            move(5);
        }
        if( y==2 )
        {
            note.setImage("note2.PNG");
            move(5);
        }
        if( y==3 )
        {
            note.setImage("note3.PNG");
            move(5);
        }
        if( y==4 )
        {
            note.setImage("note4.PNG");
            move(5);
        }
        if(y==5)
        {
            note.setImage("note5.PNG");
            move(5);
        }
    }

    public void act() 
    {
        /*if( y== 1 )
        {
            //getWorld().addObject(note, 147, 65);
            setLocation(getX() - 1, getY() +5);
        }
        if( y== 2 )
        {
            //getWorld().addObject(note, 177, 65);
            setLocation( note.getX() -1, note.getY() + 5);
        }
        if( y== 3 )
        {
            //getWorld().addObject(note, 207, 65);
            setLocation( note.getX(), note.getY() + 5);
        }
        if( y== 4 )
        {
            //getWorld().addObject(note, 237, 65);
            setLocation( note.getX() +1, note.getY() + 5);
        }
        if( y== 5 )
        {
            //getWorld().addObject(note, 267, 65);
            setLocation( note.getX() + 2, note.getY() + 5);
        }*/
        //setLocation( getX(), getY() + 5);
        /*if(Math.random() <= 0.5)
        {
        if( note.equals("note1.PNG") )
        {
        //Note green = new Note();
        getWorld().addObject(this, 147, 65);
        this.setLocation( getX() - 2, getY() + 5 );
        }
        else if( note.equals("note2.PNG") )
        {
        //Note red = new Note();
        getWorld().addObject(this, 177, 65);
        this.setLocation( getX() - 1, getY() + 5 );
        }
        else if( note.equals("note3.PNG") )
        {
        //Note yellow = new Note();
        getWorld().addObject(this, 207, 65);
        this.setLocation( getX(), getY() + 5 );
        }
        else if( note.equals("note4.PNG") )
        {
        //Note blue = new Note();
        getWorld().addObject(this, 237, 65);
        this.setLocation( getX() + 1, getY() + 5 );
        }
        else if( note.equals("note5.PNG") )
        {
        //Note orange = new Note();
        getWorld().addObject(this, 267, 65);
        this.setLocation( getX() + 2, getY() + 5 );
        }
        }*/
        /*if( note.equals("note1.PNG") )
        {
        if(Math.random() <= 0.05)
        {
        getWorld().addObject( this, 147, 65 );
        }
        setLocation( getX() - 2, getY() + 5 );
        }
        if( note.equals("note2.PNG") )
        {
        if(Math.random() <= 0.05)
        {
        getWorld().addObject( this, 177, 65 );
        }
        setLocation( getX() - 1, getY() + 5 );
        }
        if( note.equals("note3.PNG") )
        {
        if(Math.random() <= 0.05)
        {
        getWorld().addObject( this, 207, 65 );
        }
        setLocation( getX(), getY() + 5 );
        }
        if( note.equals("note4.PNG") )
        {
        if(Math.random() <= 0.05)
        {
        getWorld().addObject( this, 237, 65 );
        }
        setLocation( getX() +1, getY() + 5 );
        }
        if( note.equals("note5.PNG") )
        {
        if(Math.random() <= 0.05)
        {
        getWorld().addObject( this, 267, 65 );
        }
        setLocation( getX() + 2, getY() + 5 );
        }*/
        //}

        if( isAtEdge() )
        {
            getWorld().removeObject(this);
        }

    }    
}
