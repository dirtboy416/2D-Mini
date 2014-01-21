package grid.view;

import grid.model.Hipster;

public class GridView
{

	public void printIntInformation(int[][] currentArray)
	{

		System.out.println("foreach printing");
		for (int[] currentRow : currentArray)
		{
			for (int currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");

			}
			System.out.println();
		}
		System.out.println("for printing");
		for (int row = 0; row < currentArray.length; row++)
		{
			for (int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ":" + currentArray[row][col]
						+ "\t");
			}
			System.out.println();
		}
	}

	public void printStringInformation(String[][] currentArray)
	{
		System.out.println("for-each printing");
		for (String[] currentRow : currentArray)
		{
			for (String currentString : currentRow)
			{
				System.out.print(currentString + "\t");
			}
			System.out.println();
		}
	}

	public void printHipsterInformation(Hipster[][] currentArray)
	{
		System.out.println("for-each printing");
		for (Hipster[] currentRow : currentArray)
		{
			for (Hipster currentHipster : currentRow)
			{
				System.out.print(currentHipster.getName() + "\t");
			}
			System.out.println();
		}
		System.out.println("for printing");
		for (int row = 0; row < currentArray.length; row++)
		{
			for (int col = 0; col < currentArray[0].length; col++)
			{
		//	System.out.print(row + "," + col + ":" + currentArray[row][col].getHipsterBooks()[0] + "\t");
				Hipster temp = currentArray[row][col];
				for(int bookCount = 0; bookCount < currentArray[row][col].getHipsterBooks().length; bookCount++)
				{
					System.out.print(row + "," + col + ": " + currentArray[row][col].getHipsterBooks()[bookCount] + "\t");
			}
			System.out.println();
		}
	  }
		
	}
}
