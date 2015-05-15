This project attempts to integrate and modularize the RepRap host application in a netbeans ide-style environment.

## Why Use NetBeans Over Eclipse? ##
The RepRep community has already invested a lot of time into writing code in Java3d and Swing. NetBeans uses Swing, and Java3d integrates best with Swing (it otherwise requires the use of a SWT-AWT bridge). This makes Netbeans an ideal platform.

Additionally, RepRap code is GPL-licensed, as is NetBeans. This means that a bundle can be distributed for each platform with no weird licensing workarounds. It would not be possible to distribute an Eclipse based environment without changing the license of either Eclipse or RepRap.

## Why Do You Think RepRap Needs to Be In NetBeans? ##
NetBeans is a powerful IDE which makes it easy to manage workspaces and project files. As of yet the RepRap code does not really help a user do so, so this would be nice. Additionally, NetBeans has a nice plug-in infrastructure. Hopefully, by modularizing RepRap, we can drive new innovation around this amazing rapid prototyping platform.

## Why Did You Choose Maven To Build This Project? ##
Maven has robust support in most popular IDE's, as well as the command line. It also makes automated testing convenient, and requires minimal coding to maintain the build system.