import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int x = 1;
    //String note = "note" + (int)((Math.random() * 6)+1) + ".PNG";
    public static int score = 0;
    public int numActs;
    int y = (int)(Math.random()*5)+1;
    Note note = new Note();
    public MyWorld()
    {    
        super(405, 320, 1);
    }

    public void act()
    {
        //Note note = new Note();
        
        if(Math.random() <= 0.05)
        {
            if( y == 1 )
            {
                addObject(note, 147, 65);
            }
            if( y==2 )
            {
                addObject(note, 177, 65);
            }
            if( y==3 )
            {
                addObject(note, 207, 65);
            }
            if( y==4 )
            {
                addObject(note, 237, 65);
            }
            if( y==5 )
            {
                addObject(note, 267, 65);
            }
        }
        /*int i = 1;
        for( numActs = 0; numActs <= i; numActs++ )
        {
        if( numActs % 50 == 0 )
        {
        Note note = new Note();
        addObject(note, 147,65);
        i+=2;
        if( note.equals( "note1.PNG" ))
        {
        addObject( note, 147, 65 );
        }
        if( note.equals( "note2.PNG" ))
        {
        addObject( note, 177, 65 );
        }
        if( note.equals( "note3.PNG" ))
        {
        addObject( note, 207, 65 );
        }
        if( note.equals( "note4.PNG" ))
        {
        addObject( note, 237, 65 );
        }
        if( note.equals( "note5.PNG" ))
        {
        addObject( note, 267, 65 );
        }
        }  
        } */
        showText( "Score: " + score , getWidth() / 2, 20);
        if( x == 1 )
        {
            Greenfoot.playSound("SCOM.wav");
            x++;
        }
        Button number = new Button();
        //Note note = new Note();

        /*if( Math.random() <= 0.05)
        {
        if( "note1.PNG" == note )
        {
        Note1 green = new Note1();
        addObject( green, 147, 65 );
        }
        if( note == "note2.PNG" )
        {
        Note2 red = new Note2();
        addObject( red, 177, 65 );
        }
        if( note == "note3.PNG" )
        {
        Note3 blue = new Note3();
        addObject( blue, 207, 65 );
        }
        if( note == "note4.PNG" )
        {
        Note4 yellow = new Note4();
        addObject( yellow, 237, 65 );
        }
        if( note == "note5.PNG" )
        {
        Note5 orange = new Note5();
        addObject( orange, 267, 65 );
        }
        }
        Note1 green = new Note1();
        if( Math.random() < 0.005 )
        {
        addObject( green, 147, 65 );
        }
        Note2 red = new Note2();
        if( Math.random() < 0.005)
        {
        addObject(red,177, 65 );
        }
        Note3 yellow = new Note3();
        if( Math.random() < 0.005)
        {
        addObject(yellow,207, 65 );
        }
        Note4 blue = new Note4();
        if( Math.random() < 0.005)
        {
        addObject(blue,237, 65 );
        }
        Note5 orange = new Note5();
        if( Math.random() < 0.005)
        {
        addObject(orange,267, 65 );
        }*/
        /*Note green = new Note();
        if( "note1.PNG" == note )
        {
        if( Math.random() <= 0.05)
        {

        addObject( green, 147, 65 );

        }
        green.setLocation( green.getX() - 2, green.getY() + 5 );
        }*/
    }
}
