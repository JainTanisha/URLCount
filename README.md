# URLCount MapReduce Example
##### uses KeyValueTextInputFormat with space separator for K,V pair https://hadoop.apache.org/docs/r2.7.1/api/org/apache/hadoop/mapred/KeyValueTextInputFormat.html
##### this example reads in key as text and value as int, sums every value according to key

##### Tested on: Sandbox 2.3.2
##### Compiled with Hortonworks HDP 2.3.0

##### use included input file as dataset
##### execute the job like so:
```
yarn jar URLCount-1.0-jar-with-dependencies.jar data output
```
##### output looks like so:

```
http://url1.com 523
http://url11.com        4
http://url12.com        36
http://url20.com        36
```
