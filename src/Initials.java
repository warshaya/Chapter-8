import acm.program.*;
import acm.graphics.*;
/*
public enum Style
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
*/
public class Initials extends GraphicsProgram
{
	/*
	public void run()
	{
		Initial firstInitial = new Initial();		

		firstInitial.drawStroke( Style.STRAIGHT, Position.BOTTOMLEFT, Position.TOPMIDDLE );
		firstInitial.drawStroke( Style.STRAIGHT, Position.TOPMIDDLE, Position.BOTTOMRIGHT );
		firstInitial.drawMiddleBar( Position.CENTER ); 

		Initial secondInitial = new Initial();

		secondInitial.drawStroke( Style.STRAIGHT, Position.TOPLEFT, Position.TOPRIGHT );
		secondInitial.drawStroke( Style.STRAIGHT, Position.BOTTOMLEFT, Position.BOTTOMRIGHT );
		secondInitial.drawStroke( Style.STRAIGHT, Position.TOPMIDDLE, Position.BOTTOMMIDDLE );

		Initial thirdInitial = new Initial();

		thirdInitial.drawStroke( Style.STRAIGHT, Position.TOPLEFT, Position.BOTTOMLEFT );
		thirdInitial.drawStroke( Style.STRAIGHT, Position.BOTTOMLEFT, Position.CENTER );
		thirdInitial.drawStroke( Style.STRAIGHT, Position.CENTER, Position.BOTTOMRIGHT );
		thridInitial.drawStroke( Style.STRAIGHT, Position.BOTTOMRIGHT, Position.TOPRIGHT );

		Word word = new Word();
		
		word.add( firstInitial );
		word.add( secondInitial );
		word.add( thirdInitial );

		add( word , getWidth()/2, getHeight()/2 );
	}
	*/

	private GGompound m_word = new GCompound();

	private GCompound m_firstInitial = new GCompound();
	private	GCompound m_secondInitial = new GCompound();
	private	GCompound m_thirdInitial = new GCompound()

	public void init()
	{
		setSize( 600, 400 );
	}
	
	public void run()
	{
		strokeOne = new GLine( -10, 20, 0, -20 );
		strokeTwo = new GLine( 0, -20, 10, 20 );
		strokeThree = new GLine( -5, 0, 5, 0 );
		m_firstInitial.add( strokeOne );
		m_firstInitial.add( strokeTwo );
		m_firstInitial.add( strokeThree );
		add( m_firstInitial );
		//add( m_word, getWidth()/2, getHeight()/2 );
	}

	
	
}



