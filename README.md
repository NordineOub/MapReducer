# Yarn MapReducer Operations                                     

This mapreduce jar file allows you to do several operations:

  - Count the number of words
  - See districts containing trees
  - See all tree species in Paris
  - Count the number of trees per species
  - The maximum height per type of tree
  - Sort the height of trees from smallest to largest
  - Show the district containing the oldest tree
  - Show district with most trees
 
Here's how to apply each of these operations

## How to apply the wordcount : 

```s
yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar wordcount /user/username/raw/book.txt  /user/username/wordcount
```
##  Districts containing trees 



```s
yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar districtswithtrees /user/username/raw/trees.csv  /user/username/districtswithtrees
```
## All tree species


```s
yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar treeSpecies /user/username/raw/trees.csv /user/username/treeSpecies

```
## Number of trees by species

```s
yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar treeSpeciesCount /user/username/raw/trees.csv  /user/username/treeSpeciesCount

```
## Maximum height per tree type

```s
yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar maxHeightSpecies /user/username/raw/trees.csv  /user/username/maxHeightSpecies

```

## Sort tree height

```s
yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar treesSortedByHeight /user/username/raw/trees.csv  /user/username/treesSortedByHeight

```
## District with oldest tree

```s
yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar oldestTreeDistrictSort /user/username/raw/trees.csv  /user/username/oldestTreeDistrictSort

```
## District with most trees

```s
yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar maxTreesDistrict /user/username/raw/trees.csv  /user/username/maxTreesDistrict

```

# How to plot the result 

You can plot the result by reading the "part-r-00000" file in your program folder
```s
cat  /user/username/maxTreesDistrict/part-r-00000
```



