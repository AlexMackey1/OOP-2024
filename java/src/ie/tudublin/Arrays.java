package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{

	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	float[] rainfall = {200, 260, 300, 150, 100, 50, 10, 40, 67, 160, 400, 420};

	public float map1(float a, float b, float c, float d, float e)
	{
		float r1 = c - b;
		float r2 = e - d;

		float how_far = a - b;

		return d + (how_far / r1) * r2;
	}

	public void settings()
	{
		size(500, 500);

		String[] m1 = months;
		months[0] = "XXX";
		print(m1[0]);

		float high = rainfall[0];
		float low = rainfall[0];
		String high_month = " ";
		String low_month = " ";

		
		for(int i = 0; i < months.length; i++)
		{
			println("Month: " + months[i] + "\t" + rainfall[i]);
		}

		for (String s : m1)
		{
			println(s);
		}

		for(int i = 0; i < months.length; i++)
		{
			if (high < rainfall[i])
			{
				high = rainfall[i];
				high_month = months[i];

			}

			if (low > rainfall[i])
			{
				low = rainfall[i];
				low_month = months[i];
			}
		}

		println("Highest rainfall: ", high_month, "with", high, "mm");
		println("Lowest rainfall: ", low_month, "with", low, "mm");

		float tot = 0 ;
		for (float f : rainfall)
		{
			tot += f;	
		}

		float avg = tot / (float) rainfall.length;

		println(map1(5, 0, 10, 0, 100));
		println(map1(25, 20, 30, 200, 300));
		println(map1(2, 25, 35, 0, 100));

	}

	public void setup() {
		colorMode(HSB);
		background(0);

		
		
	}

	
	public void draw()
	{	
		background(0);
		float w = width / (float) months.length;
		for(int i = 0; i < months.length; i++)
		{
			float x = map1(i, 0 , months.length, 0, width);
			rect(x, height, w, -rainfall[i]);

		}
	}
}
