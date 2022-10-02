public class MidpointKarel extends SuperKarel
{
    public void run()
    {   while(frontIsClear())
        {
            turnLeft();
            if(frontIsClear())
            {
               move();
               if(frontIsClear())
               {
                   move();
                   
                   turnRight();
                   move();
               }
               
                
            }
        }
        if(leftIsClear())
        {
        turnAround();
        }
        
        while(frontIsClear())
        {
            move();
        
        }
        putBall();
        if(leftIsClear())
        {
            turnLeft();
        }
