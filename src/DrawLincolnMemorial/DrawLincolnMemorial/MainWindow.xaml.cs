using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace DrawLincolnMemorial
{
   /// <summary>
   /// Interaction logic for MainWindow.xaml
   /// </summary>
   public partial class MainWindow : Window
   {
      public MainWindow()
      {
         InitializeComponent();
         var memorialWalls = new Rectangle();
         memorialWalls.Height = 100;
         memorialWalls.Width = myWindow.Width * 0.666667;
         memorialWalls.Fill = System.Windows.Media.Brushes.LightSeaGreen;
         myCanvas.Children.Add( memorialWalls );
         Canvas.SetLeft( memorialWalls, (myCanvas.Width - memorialWalls.Width) / 2.0 );
         Canvas.SetTop( memorialWalls, (myCanvas.Height - memorialWalls.Height) / 2.0 );
         //createAndAddLine();
      }

      private void createAndAddLine()
      {
         var myLine = new Line();
         myLine.Stroke = System.Windows.Media.Brushes.LightSteelBlue;
         myLine.X1 = 1;
         myLine.X2 = 50;
         myLine.Y1 = 1;
         myLine.Y2 = 25;
         myLine.HorizontalAlignment = HorizontalAlignment.Left;
         myLine.VerticalAlignment = VerticalAlignment.Center;
         myLine.StrokeThickness = 4;
         myCanvas.Children.Add( myLine );
      }
   }
}
