# time_series
Prototype interface for a time-series database


## Description

This is a simple time-series database. It has more major interfaces:

 - A datasource that is sampled for new (integer) data at specific intervals
 - A storage system that stores the time-sequence data, up to a specified length of time, including the ability to sample the most recent value, or any value at a specific time or interval
 - An interface to perform samples over a certain period of data (sum, median, average, etc)
 

##Implentation

This project includes the following implentations:

 - A datasouce that produces a random integer within a range whenever sampled
 - A storage system based on a fixed-size int[] array that acts as a ring buffer
 - A central engine that provides access to real-time and aggregated data
 - An aggregator that calculates the average value of the series across a certain period
 
 
##Disclaimers

 - Results from real-time and aggregate sampling may not be reliable, as the dataset is constantly changing
 - Exceptions will be thrown if an aggregation exceeds the bounds of the underlying datastore. This may also be changing.
 
##How to Use

At this moment, there is no build script (Maven, etc). Compile all files manually. A build script with dependencies will be forthcoming.