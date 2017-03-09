import acm.graphics.*;

public class Initial extends GCompound {

	public void drawStroke( Style style, Position start, Position end )
	{
		if ( style == Style.STRAIGHT )
		{
			GLine line = new GLine();
			line.setStartPoint( start.getX(), start.getY() );
			line.setEndPoint( end.getX(), end.getY() );	
			
		}
	} 

}
