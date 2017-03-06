import acm.program.*;
import acm.graphics.*;

public class Peace extends GraphicsProgram
{
	public void init()
	{
		setSize( 600, 300 );
	}

	public void run()
	{
		drawPeaceSymbol( getWidth()/2, getHeight()/2, 100 );
	}

	private void drawPeaceSymbol( double x, double y, double r )
	{
		GCompound result = new GCompound();
		
		GOval ring = new GOval( -r, -r, 2*r, 2*r );
		result.add( ring );
	
		GLine lineForN1 = new GLine( 0, 0, r*Math.cos( -5*Math.PI/4 ), r*Math.sin( -5*Math.PI/4 ) );
		GLine lineForN2 = new GLine( 0, 0, r*Math.cos( -7*Math.PI/4 ), r*Math.sin( -7*Math.PI/4 ) );
		result.add( lineForN1 );
		result.add( lineForN2 );

		GLine lineForD = new GLine( 0, r, 0, -r);
		result.add( lineForD );
		
		add( result, x, y );			
	}
}
