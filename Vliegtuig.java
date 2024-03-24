import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vliegtuig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vliegtuig extends Actor
{
   private Opdracht myOpdracht;
   private ScoreBord myScore;
   private boolean beweegt = true;
    
    /**
     * Act - do whatever the Vliegtuig wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Vliegtuig(Opdracht opdracht,ScoreBord score)
    {
        this.myOpdracht=opdracht;
        this.myScore=score;
        this.setImage(new GreenfootImage("airplane.png"));
         GreenfootImage i=getImage();
         i.scale(30,30);
    }
    
    public void act() 
    {
        if(beweegt)
        {
            checkKeyPress();
            move(1);
        
            Actor actor=this.getOneIntersectingObject(Stad.class);
        
            if(actor!=null)
            {
               Stad deStad = (Stad)actor;
               String naam = deStad.geefNaam();
               if(naam.equals(myOpdracht.geefNaam()))            
               {
                    
                 getWorld().removeObject(deStad);
                 myScore.verhoogScore();
                 boolean gelukt = ((topografie)getWorld()).maakOpdracht();
                 if(gelukt==false)
                 {
                    beweegt = false;
                 }
                }
            }
        }
        // Add your action code here.
    }
    
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
    }
        
}
