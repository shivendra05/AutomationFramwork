package com.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

public class CaptureScreenshots extends BaseClass{


	public static void  captureScreens(String fineName) throws IOException {
		SimpleDateFormat formate = new SimpleDateFormat("DD-MM-YYYY-HHMMSS");
		Date date  =  new Date();
				
		System.out.println("File location:: "+System.getProperty("user.dir")+"\\screenshots\\"+fineName+formate.format(date)+".png");
		TakesScreenshot screen = (TakesScreenshot)driver;

		File srcFile = screen.getScreenshotAs(OutputType.FILE);
		File desFile = new File(System.getProperty("user.dir")+"\\screenshots\\"+fineName+formate.format(date)+".png");

		FileUtils.copyFile(srcFile, desFile);

	}
}
