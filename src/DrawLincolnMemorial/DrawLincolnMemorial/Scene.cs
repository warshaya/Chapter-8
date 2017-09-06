using System;
using System.Collections.Generic;

public class Scene
{
	public Scene( double width, double height )
	{
      m_width = width;
      m_height = height;
      m_contents = new List<object>();
	}

   public double Width
   {
      get { return m_width; }
   }

   public double Height
   {
      get { return m_height; }
   }

   public List<object> Contents
   {
      get { return m_contents; }
   }

   private double m_width;
   private double m_height;
   private List<object> m_contents;
}
