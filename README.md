# GDNightSky
Designed to help with finding the right path to a desired devotion setup in Grim Dawn.
Just add all fully picked devotions to the list and press search. Complicated setups might take a bit longer due to the nature of the problem.


Written in Java, JRE version is 1.8. Uses MigLayout manager (packaged into the release .jar).

Link to release: 

### Features:
- **GUI**
	- Double click on constellations on the tree to add them.
	- Double click on the "Chosen constellations" list to remove them
	- Search bar to filter the tree for matching constellations
- **Sanity Checks**
	- Checks if your setup is valid. If the check doesn't pass, you will be presented with the reason why.
		- Checks for excessive amount of points
		- Checks for constellations that don't meet the affinity requirement
- **Fast**
	- I tried to optimize the underlying structure to achieve a fast response.