package com.scp.logger.TestLogger;

import org.apache.log4j.Level;

public class CustomLevel  extends Level{
// Created custom class and implemented its  constructor
	
	protected CustomLevel(int level, String levelStr, int syslogEquivalent) {
		super(level, levelStr, syslogEquivalent);
	}
	
	public static final Level CUSTOMLEVEL = new CustomLevel(1,"CUSTOMLEVEL", 10); //Now we can use this level in the program

}

