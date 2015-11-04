// Lab06Bst.java
// This is the student, starting version of Lab06B which is divided into 8 cells.
// The first cell -- "Draw Random Points" -- is provided as an example.
// Students need to complete the other 7 cells on their own.


import java.awt.*;
import java.applet.*;


public class Lab06Bst extends Applet
{
	public void paint(Graphics g)
	{
		// Draw Grid
		Expo.drawLine(g,250,0,250,650);
		Expo.drawLine(g,500,0,500,650);
		Expo.drawLine(g,750,0,750,650);
		Expo.drawLine(g,0,325,1000,325);

		// Draw 10,000 Random Points
		for (int count = 1; count <= 10000; count++)
		{
			Expo.setRandomColor(g);
			int x = Expo.random(5,245);
			int y = Expo.random(5,320);
			Expo.drawPoint(g,x,y);
		}


		// Draw 1000 Random Lines
		for (int k = 1; k <= 1000; k++)
		{
		    Expo.setRandomColor(g);
			int x1 = Expo.random(255,495);
			int y1 = Expo.random(0,320);
			int x2 = Expo.random(255,495);
			int y2 = Expo.random(0,320);
			Expo.drawLine(g,x1,y1,x2,y2);
		}

		






		// Draw 1000 Random Rectangles
		for (int k = 1; k <= 1000; k++)
		{
		    Expo.setRandomColor(g);
			int x1 = Expo.random(505,745);
			int y1 = Expo.random(0,320);
			int x2 = Expo.random(505,745);
			int y2 = Expo.random(0,320);
			Expo.fillRectangle(g,x1,y1,x2,y2);
		}







		// Draw 500 Random Triangles
		for (int k = 1; k <= 500; k++)
		{
		    Expo.setRandomColor(g);
			int x1 = Expo.random(760,995);
			int y1 = Expo.random(0,320);
			int x2 = Expo.random(760,995);
			int y2 = Expo.random(0,320);
			int x3 = Expo.random(760,995);
			int y3 = Expo.random(0,320);
			Expo.fillPolygon(g,x1,y1,x2,y2,x3,y3);
		}






		// Draw 100 Random Initials
		for (int k = 1; k <= 100; k++)
		{
		    Expo.setRandomColor(g);
			int x1 = Expo.random(0,235);
			int y1 = Expo.random(335,640);
			Expo.drawString(g,"LR",x1,y1);
		}

		






		// Draw 500 Random Stars with a constant radius of 30 and a random # of points
		for (int k = 1; k <= 500; k++)
		{
		    Expo.setRandomColor(g);
			int x1 = Expo.random(275,475);
			int y1 = Expo.random(350,630);
			int r = Expo.random(5,30);
			int p = Expo.random(5,15);
			Expo.fillStar(g,x1,y1,r,p);
		}






		// Draw 1000 Random Circles with random radii
		for (int k = 1; k <= 1000; k++)
		{
		    Expo.setRandomColor(g);
			int x1 = Expo.random(525,725);
			int y1 = Expo.random(350,630);
			int r = Expo.random(5,25);
			Expo.fillCircle(g,x1,y1,r);
		}






		// Draw 250 Random Arcs with 2 random radii, random start and random finish
		for (int k = 1; k <= 250; k++)
		{
		    Expo.setRandomColor(g);
			int x1 = Expo.random(780,995);
			int y1 = Expo.random(355,630);
			int z1 = Expo.random(5,35);
			int r = Expo.random(5,35);
			int d1 = Expo.random(0,360);
			int d2 = Expo.random(0,360);
			Expo.fillArc(g,x1,y1,z1,r,d1,d2);
		}






	}

}




