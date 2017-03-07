import acm.program.*;
import acm.graphics.*;

public class Initials extends GraphicsProgram
{
	public void run()
	{
		Initial firstInitial = new Initial();		

		firstInitial.drawStroke( STRAIGHT, BOTTOMLEFT, TOPMIDDLE );
		firstInitial.drawStroke( STRAIGHT, TOPMIDDLE, BOTTOMRIGHT );
		firstInitial.drawMiddleBar( CENTER ); 

		Initial secondInitial = new Initial();

		secondInitial.drawStroke( STRAIGHT, TOPLEFT, TOPRIGHT );
		secondInitial.drawStroke( STRAIGHT, BOTTOMLEFT, BOTTOMRIGHT );
		secondInitial.drawStroke( STRAIGHT, TOPMIDDLE, BOTTOMMIDDLE );

		Initial thirdInitial = new Initial();

		thirdInitial.drawStroke( STRAIGHT, TOPLEFT, BOTTOMLEFT );
		thirdInitial.drawStroke( STRAIGHT, BOTTOMLEFT, CENTER );
		thirdInitial.drawStroke( STRAIGHT, CENTER, BOTTOMRIGHT );
		thridInitial.drawStroke( STRAIGHT, BOTTOMRIGHT, TOPRIGHT );

		Word word = new Word();
		
		word.add( firstInitial );
		word.add( secondInitial );
		word.add( thirdInitial );

		add( word , getWidth()/2, getHeight()/2 );
	}	
}
