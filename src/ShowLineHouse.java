import acm.program.*;
import acm.graphics.*;

public class ShowLineHouse extends GraphicsProgram
{
	private int centerx;
	private int centery;

	public void run()
	{
		centerx = getWidth()/2;
		centery = getWidth()/2;

		GObject m_brickHouse = new GHouse( getWidth()/3, getWidth()/3 );
		add( m_brickHouse , centerx - m_brickHouse.getWidth()/2, 
					centery - getHeight()/2 );
	}
}
