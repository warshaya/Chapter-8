import acm.graphics.*;

public class GWindow extends GCompound
{
	public GWindow( double width, double height, int rows, int columns )
	{
		for (int j=0; j<rows; j++)
		{
			for (int i=0; i<columns; i++)
			{
				add( new GRect( width, height ), i*width, j*height );
			}
		}
	}
}
