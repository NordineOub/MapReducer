# Yarn Lab 2                                             Par Nour-Eddine OUBENAMI


## 1.6.3
```s
yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar wordcount /user/nour-eddine.oubenami/raw/ebook.txt  /user/nour-eddine.oubenami/wordcount

...
  Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        File Input Format Counters
                Bytes Read=68699
        File Output Format Counters
                Bytes Written=38685


```
## 1.8.1 Districts containing trees (very easy)

DistrictsWithTrees.java :

```s

import com.opstty.mapper.DistrictTreesMapper;
import com.opstty.reducer.DistrictTreesReducer;
...
...
        if (otherArgs.length < 2) {
            System.err.println("Usage: distinctDistricts <in> [<in>...] <out>");
            System.exit(2);
        }
        Job job = Job.getInstance(conf, "distinctDistricts");
        job.setJarByClass(DistrictsWithTrees.class);
        job.setMapperClass(DistrictTreesMapper.class);
        job.setCombinerClass(DistrictTreesReducer.class);
        job.setReducerClass(DistrictTreesReducer.class);
        job.setOutputKeyClass(IntWritable.class);
        job.setOutputValueClass(IntWritable.class);
    
    }
```


DistrictTreesMapper.java :

```s

public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
		if (curr_line != 0) {
			context.write(new IntWritable(Integer.parseInt(value.toString().split(";")[1])), new IntWritable(1));
		}
		curr_line++;
	}

```

DistrictTreesReducer.java :

```s

   public void reduce(IntWritable key, Iterable<IntWritable> values, Context context)
            throws IOException, InterruptedException {
    	int sum = 0;
        for (IntWritable val : values) {
            sum += val.get();
        }
    	context.write(key, new IntWritable(sum));

```
We have to add this in the try of AppDriver :

```s
			programDriver.addClass("districtswithtrees", DistrictsWithTrees.class,
					"Un programme map/reduce qui return le nombre d'arbres par quartier.");

```



```s
```


```s
```


```s
```



