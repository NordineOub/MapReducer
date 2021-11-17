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
					"Un programme de map/reduce qui renvoie les espèces d’arbres distinctes dans l’ensemble de données Arbres remarquables de Paris.");

			programDriver.addClass("treeSpeciesCount", CountBYSpecies.class,
					"Un programme map/reduce qui renvoie les espèces d’arbres distinctes (et le nombre d’arbres pour chacune) dans l’ensemble de données Arbres remarquables de Paris.");

			programDriver.addClass("maxHeightSpecies", MaxHeightByKind.class,
					"Un programme map/reduce qui renvoie la plus grande hauteur d’arbres par espèce dans l’ensemble de données Arbres remarquables de Paris.");

			programDriver.addClass("treesSortedByHeight", SortedByHeight.class,
					"Un programme map/reduce qui renvoie tous les arbres du jeu de données Remarkable Trees of Paris, triés par hauteur.");

			programDriver.addClass("oldestTreeDistrictSort", OldestTreeDistrictSort.class,
					"Un programme map/reduce qui renvoie le(s) quartier(s) avec le(s) arbre(s) le(s) le(s) le(s) plus ancien(s) dans le jeu de données Arbres remarquables de Paris, à l’aide d’un tri.");

			programDriver.addClass("oldestTreeDistrictReduce", OldestTreeDistrictReduce.class,
					"Un programme map/reduce qui renvoie le(s) quartier(s) avec le(s) arbre(s) le(s) le(s) plus ancien(s) dans le jeu de données Arbres remarquables de Paris, en vérifiant toutes les données.");

			programDriver.addClass("maxTreesDistrict", DistrictMostTrees.class,
					"Un programme map/reduce qui renvoie le(s) quartier(s) avec le plus d’arbres dans le jeu de données Arbres remarquables de Paris, en vérifiant toutes les données, en utilisant le nettoyage du réducteur.");			
			
			programDriver.addClass("maxTreesDistrict2", MaxTreesDistrict2.class,
					"Un programme map/reduce qui renvoie le(s) quartier(s) avec le plus d’arbres dans le jeu de données Remarkable Trees of Paris, en vérifiant toutes les données, en utilisant deux tâches Reduce.");			
			
			exitCode = programDriver.run(argv);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}

		System.exit(exitCode);
	}
}
