package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{

	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	float[] rainfall = {200, 260, 300, 150, 100, 50, 10, 40, 67, 160, 400, 420};

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
	}

	public void setup() {
		colorMode(HSB);
		background(0);

		
		
	}

	
	public void draw()
	{	
	}
}
