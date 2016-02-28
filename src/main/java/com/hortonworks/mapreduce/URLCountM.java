/*
 * Copyright 2016 aervits.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hortonworks.mapreduce;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

/**
 *
 * @author aervits
 */
public class URLCountM extends Mapper<Text, Text,Text, IntWritable> {
    private static final Logger LOG = Logger.getLogger(URLCountM.class.getName());
    
	public final IntWritable iw = new IntWritable();
	
        @Override
	public void map(Text key, Text value, Context context){
		
		try{
                    LOG.log(Level.INFO, "MAPPER_KEY: ".concat(key.toString()).concat(" MAPPER_VALUE: ".concat(value.toString())));
		context.write(key, new IntWritable(Integer.valueOf(value.toString())));
		}
		catch(NumberFormatException | IOException | InterruptedException e){
			LOG.log(Level.SEVERE, "ERROR: ".concat(e.toString()));
		}
	}
}
