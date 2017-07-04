import acm.graphics.*;
import java.awt.Graphics;

public class GWindow
{
	public GWindow( double width, double height, int rows, int columns )
	{
		m_GCompound = new GCompound();
		for (int j=0; j<rows; j++)
		{
			for (int i=0; i<columns; i++)
			{
				m_GCompound.add( new GRect( width, height ), i*width, j*height );
			}
		}
	}

	public GObject getObject()
	{
		return m_GCompound;
	}

	public GRectangle getBounds()
	{
		return m_GCompound.getBounds();
	}

	public void paint( Graphics g )
	{
		m_GCompound.setVisible( true );
	}

	private GCompound m_GCompound;
}
