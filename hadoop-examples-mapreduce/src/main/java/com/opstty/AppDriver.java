package com.opstty;

import org.apache.hadoop.util.ProgramDriver;

import com.opstty.job.DistrictsWithTrees;
import com.opstty.job.MaxHeightByKind;
import com.opstty.job.DistrictMostTrees;
import com.opstty.job.MaxTreesDistrict2;
import com.opstty.job.OldestTreeDistrictReduce;
import com.opstty.job.OldestTreeDistrictSort;
import com.opstty.job.ExistingSpecies;
import com.opstty.job.CountBYSpecies;
import com.opstty.job.SortedByHeight;
import com.opstty.job.WordCount;

public class AppDriver {
	public static void main(String argv[]) {
		int exitCode = -1;
		ProgramDriver programDriver = new ProgramDriver();

		try {
			programDriver.addClass("wordcount", WordCount.class,
					"A map/reduce program that counts the words in the input files.");

			programDriver.addClass("districtswithtrees", DistrictsWithTrees.class,
					"Un programme map/reduce qui return le nombre d'arbres par quartier.");

			programDriver.addClass("treeSpecies", ExistingSpecies.class,
					"A map/reduce program that returns the distinct tree species in the Remarkable Trees of Paris dataset.");

			programDriver.addClass("treeSpeciesCount", CountBYSpecies.class,
					"A map/reduce program that returns the distinct tree species (and the number of trees for each one) in the Remarkable Trees of Paris dataset.");

			programDriver.addClass("maxHeightSpecies", MaxHeightByKind.class,
					"A map/reduce program that returns the highest height of trees per species in the Remarkable Trees of Paris dataset.");

			programDriver.addClass("treesSortedByHeight", SortedByHeight.class,
					"A map/reduce program that returns all the trees in the Remarkable Trees of Paris dataset, sorted by height.");

			programDriver.addClass("oldestTreeDistrictSort", OldestTreeDistrictSort.class,
					"A map/reduce program that returns the district(s) with the oldest tree(s) in the Remarkable Trees of Paris dataset, using a sort.");

			programDriver.addClass("oldestTreeDistrictReduce", OldestTreeDistrictReduce.class,
					"A map/reduce program that returns the district(s) with the oldest tree(s) in the Remarkable Trees of Paris dataset, checking through all the data.");

			programDriver.addClass("maxTreesDistrict", DistrictMostTrees.class,
					"A map/reduce program that returns the district(s) with the most trees in the Remarkable Trees of Paris dataset, checking through all the data, using the Reducer's cleanup.");			
			
			programDriver.addClass("maxTreesDistrict2", MaxTreesDistrict2.class,
					"A map/reduce program that returns the district(s) with the most trees in the Remarkable Trees of Paris dataset, checking through all the data, using two Reduce jobs.");			
			
			exitCode = programDriver.run(argv);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}

		System.exit(exitCode);
	}
}
