# wtf-exercise

This exercise will bring up 3 separate clusters running DSE 5.0.

* **death\_star** - A central hub cluster of 6 nodes for collecting data from all other monitored systems that are under the Emperor's rule
* **alderaan** - a single EC2 c3.8xlarge instance (30 cpu - 60GB RAM) running 3 dense nodes as a standalone cluster
* **yavin\_4** - a single EC2 c3.8xlarge instance (30 cpu - 60GB RAM) running 3 dense nodes as a standalone cluster

* * *

Both **yavin\_4** and **alderaan** have the _**ShieldClient**_ program writing sensor information from the various outposts on the planet/moon.

There are between 40-60 sensors per system that collect information 10 times per second and write to the local cluster. 
This information will be replicate to the **death\_star**'s galaxy keyspace for <s>spying</s> observation.

The exercise is designed to bring up a healthy system and then gradually add in chaos for you to fix.

Enjoy.
