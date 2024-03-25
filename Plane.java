import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vliegtuig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
   private Task myTask;
   private ScoreBoard myScore;
   private boolean move = true;
    
    /**
     * Act - do whatever the Vliegtuig wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Plane(Task task,ScoreBoard score)
    {
        this.myTask=task;
        this.myScore=score;
        this.setImage(new GreenfootImage("airplane.png"));
         GreenfootImage i=getImage();
         i.scale(30,30);
    }
    
    public void act() 
    {
        if(move)
        {
            checkKeyPress();
            move(1);
        
            Actor actor=this.getOneIntersectingObject(City.class);
        
            if(actor!=null)
            {
               City city = (City)actor;
               String name = city.getName();
               if(name.equals(myTask.getName()))            
               {
                    
                 getWorld().removeObject(city);
                 myScore.incScore();
                 boolean success = ((Topografie)getWorld()).makeTask();
                 if(success==false)
                 {
                    move = false;
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
