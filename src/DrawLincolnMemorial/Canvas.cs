using System;

public class LincolnCanvas
{
	public LincolnCanvas( double width, double height )
	{
      m_width = width;
      m_height = height;
	}

   public double getWidth()
   {
      return m_width;
   }

   public double getHeight()
   {
      return m_height;
   }

   public void setWidth( double width )
   {
      m_width = width;
      return;
   }

   public void setHeight( double height )
   {
      m_height = height;
      return;
   }

   private double m_width;
   private double m_height;
}
