# GDNightSky
Designed to help with finding the right path to a desired devotion setup in Grim Dawn.
Just add all fully picked devotions to the list and press search. Complicated setups might take a bit longer due to the nature of the problem.


Written in Java, JRE version is 1.8. Uses MigLayout manager (packaged into the release .jar).

Link to release: 

### Features:
- **GUI**
	- Double click on constellations on the tree to add them.
	- Double click on the "Chosen constellations" list to remove them or click the "Clear" button to wipe them all
	- Search bar to filter the tree for matching constellations
- **Sanity Checks**
	- Checks if your setup is valid. If the check doesn't pass, you will be presented with the reason why
		- Checks for excessive amount of points
		- Checks for constellations that don't meet the affinity requirement
- **Fast and accurate**
	- Cannot generate an illegal path
	- I tried to optimize the underlying structure to achieve a fast response
		- If you find a devotion setup that takes an unreasonable amount of time, please tell me so I can tweak the search
- **Customizable**
	- You can choose whether you want the program to prioritize constellations with an active
		- A search that prioritizes actives often produces a more complicated path but is good during leveling because you get levels on your active constellations earlier
		- If you have all devotion points and just need to respec, it's best to leave the box unchecked for a path that takes less steps