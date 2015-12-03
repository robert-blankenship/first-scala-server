Configuring the server:

Overview:

1. Install Scala
2. Install SBT
3. Build files


Step 1: Install Scala
Akka doesn't like the 2.9 version of Scala that is provided to Ubuntu, so grab the .deb for the most recent version.
`wget http://www.scala-lang.org/files/archive/scala-2.11.6.deb`
`sudo dpkg -i scala-2.11.6.deb`

Step 2: Install SBT
`sudo apt-get install sbt`

Step 3: Build files.
Clone this repo, then run `sbt`. Then, run `compile`
