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

	private GCompound m_word = new GCompound();

	private GCompound m_firstInitial = new GCompound();
	private	GCompound m_secondInitial = new GCompound();
	private	GCompound m_thirdInitial = new GCompound();

	public void init()
	{
		setSize( 600, 400 );
	}
	
	public void run()
	{
		GLine strokeOne = new GLine( -10, 20, 0, -20 );
		GLine strokeTwo = new GLine( 0, -20, 10, 20 );
		GLine strokeThree = new GLine( -5, 0, 5, 0 );
		m_firstInitial.add( strokeOne );
		m_firstInitial.add( strokeTwo );
		m_firstInitial.add( strokeThree );
		
		GLine stroke2One = new GLine( -10, 20, 10, 20 );
		GLine stroke2Two = new GLine( -10, -20, 10, -20 );
		GLine stroke2Three = new GLine( 0, 20, 0, -20 );
		m_secondInitial.add( stroke2One );
		m_secondInitial.add( stroke2Two );
		m_secondInitial.add( stroke2Three );

		GLine stroke3One = new GLine( -10, -20, -10, 20 );
		GLine stroke3Two = new GLine( -10, 20, 0, 10 );
		GLine stroke3Three = new GLine( 0, 10, 10, 20 );
		GLine stroke3Four = new GLine( 10, 20, 10, -20 );
		m_thirdInitial.add( stroke3One );
		m_thirdInitial.add( stroke3Two );
		m_thirdInitial.add( stroke3Three );
		m_thirdInitial.add( stroke3Four );

		m_word.add( m_firstInitial, -30, 0 );
		m_word.add( m_secondInitial, 0, 0 );
		m_word.add( m_thirdInitial, 30, 0 );

		add( m_word, getWidth()/2, getHeight()/2 );
	}
}
