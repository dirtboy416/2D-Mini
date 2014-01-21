package grid.controller;

import grid.model.Hipster;
import grid.view.GridView;

public class GridController
{
	private int[][] myFamilyAges;
	private String[][] friendNames;
	private GridView consoleView;
	private Hipster[][] hipsterBooks;

	public GridController()
	{
		myFamilyAges = new int[3][3];
		friendNames = new String[3][4];
		hipsterBooks = new Hipster[2][2];
		consoleView = new GridView();
	}

	public int[][] getMyFamilyAges()
	{
		return myFamilyAges;
	}

	public String[][] getFriendNames()
	{
		return friendNames;
	}

	public GridView getConsoleView()
	{
		return consoleView;
	}

	public void setMyFamilyAges(int[][] myFamilyAges)
	{
		this.myFamilyAges = myFamilyAges;
	}

	public void setFriendNames(String[][] friendNames)
	{
		this.friendNames = friendNames;
	}

	public void setConsoleView(GridView consoleView)
	{
		this.consoleView = consoleView;
	}

	private void fillAges()
	{
		myFamilyAges[0][0] = 16;
		myFamilyAges[0][1] = 13;
		myFamilyAges[0][2] = 18;

		myFamilyAges[1][0] = 46;
		myFamilyAges[1][1] = 45;
		myFamilyAges[1][2] = 10;

		myFamilyAges[2][0] = 76;
		myFamilyAges[2][1] = 37;
		myFamilyAges[2][2] = 48;

	}

	private void fillTheStringNameArray()
	{

		friendNames[0][0] = "Nathan";
		friendNames[0][1] = "Makayla";
		friendNames[0][2] = "Myke";
		friendNames[0][3] = "Berry";

		friendNames[1][0] = "McKayla";
		friendNames[1][1] = "Sarah";
		friendNames[1][2] = "Brandon";
		friendNames[1][3] = "Trent";

		friendNames[2][0] = "Kaden";
		friendNames[2][1] = "Mason";
		friendNames[2][2] = "Sam";
		friendNames[2][3] = "Roy";
	}

	private void fillTheHipsterArray()
	{

		hipsterBooks[0][0] = new Hipster();
		hipsterBooks[0][1] = new Hipster();
		
		hipsterBooks[1][0] = new Hipster();
		hipsterBooks[1][1] = new Hipster();
		
		
	}

	public void start()
	{

		fillAges();
		fillTheStringNameArray();
		fillTheHipsterArray();
		
		consoleView.printIntInformation(myFamilyAges);
		consoleView.printStringInformation(friendNames);
		consoleView.printHipsterInformation(hipsterBooks);
	}
}
