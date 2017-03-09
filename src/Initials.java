import acm.program.*;
import acm.graphics.*;

public enum Stroke
{
	STRAIGHT,
	CURVY
}

public enum Position
{
	TOPLEFT, TOPMIDDLE, TOPRIGHT,
	MIDDLELEFT, CENTER, MIDDLERIGHT,
	BOTTOMLEFT, BOTTOMMIDDLE, BOTTOMRIGHT
}

public class Initials extends GraphicsProgram
{
	public void run()
	{
		Initial firstInitial = new Initial();		

		firstInitial.drawStroke( Stroke.STRAIGHT, Position.BOTTOMLEFT, Position.TOPMIDDLE );
		firstInitial.drawStroke( Stroke.STRAIGHT, Position.TOPMIDDLE, Position.BOTTOMRIGHT );
		firstInitial.drawMiddleBar( Position.CENTER ); 

		Initial secondInitial = new Initial();

		secondInitial.drawStroke( Stroke.STRAIGHT, Position.TOPLEFT, Position.TOPRIGHT );
		secondInitial.drawStroke( Stroke.STRAIGHT, Position.BOTTOMLEFT, Position.BOTTOMRIGHT );
		secondInitial.drawStroke( Stroke.STRAIGHT, Position.TOPMIDDLE, Position.BOTTOMMIDDLE );

		Initial thirdInitial = new Initial();

		thirdInitial.drawStroke( Stroke.STRAIGHT, Position.TOPLEFT, Position.BOTTOMLEFT );
		thirdInitial.drawStroke( Stroke.STRAIGHT, Position.BOTTOMLEFT, Position.CENTER );
		thirdInitial.drawStroke( Stroke.STRAIGHT, Position.CENTER, Position.BOTTOMRIGHT );
		thridInitial.drawStroke( Stroke.STRAIGHT, Position.BOTTOMRIGHT, Position.TOPRIGHT );

		Word word = new Word();
		
		word.add( firstInitial );
		word.add( secondInitial );
		word.add( thirdInitial );

		add( word , getWidth()/2, getHeight()/2 );
	}	
}
