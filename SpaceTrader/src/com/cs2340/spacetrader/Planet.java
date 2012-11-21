package com.cs2340.spacetrader;

import java.io.Serializable;

public class Planet implements Serializable
{
	/**2-D coordinate of planet **/
	private int[] coordinate;
	
	/**Whether market is currently being traded with **/
	private boolean marketBusy; // indicates whether a ship is presently visiting a market 
	
	/**Inventory the planet has available for trade **/
	private PlanetInventory inventory;
	
	/**Contract planet has available **/
	private Contract contract;
	
	/**Name of the planet **/
	private String name;
	
	/**Technology level of the planet **/
	private String techLevel;
	
	/**numeric tech level for calculating good prices **/
	private int nTechLevel;

	/**
	 * Constructor for Planet class
	 * @param name
	 * @param coord
	 * @param inventory
	 * @param contract
	 * @param nTechLevel
	 */
	public Planet(String name, int[] coord, PlanetInventory inventory,
			Contract contract, int nTechLevel)
	{
		this.marketBusy = false;
		this.coordinate = coord.clone();
		this.inventory = inventory;
		this.name = name;
		this.contract = contract;
		this.nTechLevel = nTechLevel;
		switch (nTechLevel) 
		{
			case 0:
				techLevel = "Pre-Agriculture";
				break;
			case 1:
				techLevel = "Agriculture";
				break;
			case 2:
				techLevel = "Medieval";
				break;
			case 3:
				techLevel = "Renaissance";
				break;
			case 4:
				techLevel = "Early Industrial";
				break;
			case 5:
				techLevel = "Industrial";
				break;
			case 6:
				techLevel = "Post-Industrial";
				break;
			case 7:
				techLevel = "Hi-Tech";
				break;
			default:
				techLevel = "undefined";
		}
	}
	
	/**
	 * Setter method for inventory of planet
	 * @param inventory to set the planetInventory to
	 */
	public void setInventory(PlanetInventory inventory)
	{
		this.inventory = inventory;
	}
	/**
	 * getter for planet inventory
	 * @return the inventory of the planet
	 */
	public PlanetInventory getInventory()
	{
		return inventory;
	}

	/**
	 * 
	 * @return the contract the planet has available
	 */
	public Contract getContract()
	{
		return contract;
	}

	/**
	 * 
	 * @return name of the planet
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * 
	 * @return string tech level
	 */
	public String getTechLevel()
	{
		return techLevel;
	}

/*	public void createContract()
 	{
		// randomly generate contract here
	}
*/

	/**
	 * 
	 * @return coordinates of planet
	 */
	public int[] getCoordinate()
	{
		return coordinate;
	}

	/**
	 * 
	 * @return numerical tech level of planet
	 */
	public int getNTechLevel()
	{
		return nTechLevel;
	}
	
	/**
	 * 
	 * @param bool - state to set marketBusy to
	 */
	public void setMarketBusy(boolean bool)
	{
		marketBusy = bool;
	}
	
	/**
	 * 
	 * @return marketBusy
	 */
	public boolean getMarketBusy()
	{
		return marketBusy;
	}
}
