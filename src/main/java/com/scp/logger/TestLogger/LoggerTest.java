package com.scp.logger.TestLogger;

import java.io.File;
import java.sql.Connection;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class LoggerTest {

public static Logger logger =Logger.getLogger(LoggerTest.class);	
	
	public static String executeMethod(){
		try{
		logger.info("Entering in the execute method");  //it is just for information
	
		String stringMsg="this is execute method";
		return stringMsg;
		
		}catch(Exception e){
		logger.error("Error while excecuting method" +e.getMessage());	// if exception comes then this msg will be displayed
		}
		return null;

	}
	
	public static void showError(){
		File flie=new File("C:\\MyLogger");
		logger.error("Path not found");   //if path not found then thid error will be showed
	}

	
	public static  double usedCustomLevel(){
		try{
			logger.info("Entering in customLevelMethod");
			System.out.println("enter Only divisible by 15");
		Scanner sc=new Scanner(System.in);
			int inputFormScanner=sc.nextInt();
		     int outPut=inputFormScanner/15;
		     System.out.println("OutPut"+outPut);
		return outPut;
		}catch(Exception e){
			logger.warn("NEED Input as integer "+e.getMessage());
		}
		return 0;
	
}
}
