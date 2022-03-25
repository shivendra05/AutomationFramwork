package com.utility;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.BaseClass;

public class MyListeners implements ITestListener, ISuiteListener{

	Logger logger= BaseClass.logger;;
	
	@Override
	public void onStart(ITestContext context) {
		logger.info(context.getName());
		logger.info(context.getName()+":: Test started");
		System.out.println("LISTENER TEST STARTED");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			logger.info(result.getName());
			logger.info(result.getName()+":: cature screenshot-in linsener");

			CaptureScreenshots.captureScreens(result.getName());

			System.out.println(" LISTENER CAPTURING SCREENSHOTS");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info(result.getName());
		logger.info(result.getName()+"::TC passed");
		System.out.println("test passsed");
	}
}
