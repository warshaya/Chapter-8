import acm.program.*;
import acm.graphics.*;

public enum Stroke
{
	STRAIGHT,
	CURVY
}

public class Initials extends GraphicsProgram
{
	public void run()
	{
		Initial firstInitial = new Initial();		

		firstInitial.drawStroke( Stroke.STRAIGHT, BOTTOMLEFT, TOPMIDDLE );
		firstInitial.drawStroke( Stroke.STRAIGHT, TOPMIDDLE, BOTTOMRIGHT );
		firstInitial.drawMiddleBar( CENTER ); 

		Initial secondInitial = new Initial();

		secondInitial.drawStroke( Stroke.STRAIGHT, TOPLEFT, TOPRIGHT );
		secondInitial.drawStroke( Stroke.STRAIGHT, BOTTOMLEFT, BOTTOMRIGHT );
		secondInitial.drawStroke( Stroke.STRAIGHT, TOPMIDDLE, BOTTOMMIDDLE );

		Initial thirdInitial = new Initial();

		thirdInitial.drawStroke( Stroke.STRAIGHT, TOPLEFT, BOTTOMLEFT );
		thirdInitial.drawStroke( Stroke.STRAIGHT, BOTTOMLEFT, CENTER );
		thirdInitial.drawStroke( Stroke.STRAIGHT, CENTER, BOTTOMRIGHT );
		thridInitial.drawStroke( Stroke.STRAIGHT, BOTTOMRIGHT, TOPRIGHT );

		Word word = new Word();
		
		word.add( firstInitial );
		word.add( secondInitial );
		word.add( thirdInitial );

		add( word , getWidth()/2, getHeight()/2 );
	}	
}
