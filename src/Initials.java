import acm.program.*;
import acm.graphics.*;

public class Initials extends GraphicsProgram
{

	public void run()
	{
		firstInitial.drawStroke( STRAIGHT, LOWERLEFT, TOPMIDDLE );
		firstInitial.drawStroke( STRAIGHT, TOPMIDDLE, LOWERRIGHT );
		firstInitial.drawMiddleBar(); 
	}

		
}
