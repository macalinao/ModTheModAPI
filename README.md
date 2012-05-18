ModTheModAPI ![Build Status](https://secure.travis-ci.org/simplyianm/ModTheModAPI.png?branch=master)
============

Introduction
------------
The __ModTheModAPI__ is a Java API for voxel-based block games. This API is implemented by the cross-platform __ModTheMod__ modding system.

This API serves as a normalizer between different platforms of games and eases the transition between object-oriented programming and entity-prototype/base programming. The resulting API makes it easy to add new languages to the system.

Building
--------
ModTheModAPI can be built with the
[Java Development Kit](http://oracle.com/technetwork/java/javase/downloads) and
[Apache Maven](http://maven.apache.org). Maven is also used for dependency
management.

The command `mvn clean install` will build ModTheModAPI and install it to your 
local repository.

Documentation
-------------
Javadocs can be generated by using the `mvn javadoc:javadoc` command in the
terminal. This utilizes Maven's Javadoc plugin and may need to download
dependencies the first time it is run.

Copyright
---------
**ModTheModAPI** is open-source software released under the (to be determined) license.
Please see the `LICENSE.txt` file for details.
