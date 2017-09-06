using System;
using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace DrawLincolnMemorialTests
{
   [TestClass]
   public class SceneTest
   {
      [TestMethod]
      public void Width_Getter_GetsWidth()
      {
         Scene testScene = new Scene( 13, 14 );
         double result = testScene.Width;
         Assert.AreEqual( result, 13 );
      }

      [TestMethod]
      public void Height_Getter_GetsHeight()
      {
         Scene testScene = new Scene( 11, 12 );
         double result = testScene.Height;
         Assert.AreEqual( result, 12 );
      }

      [TestMethod]
      public void Contents_Getter_GetsEmptyContents()
      {
         Scene testScene = new Scene( 1, 1.0 );
         List<object> result = testScene.Contents;
         Assert.AreEqual( result.Count, 0 );
      }
   }
}
