package com.accord.SmartNav_Handheld;

import com.accord.SmartNav_Handheld.Tests.BaseTest;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // To run the jar file, comment this below line
        String  xmlFileName = ".\\src\\main\\Resources\\testNG.xml";

        // To run the jar file, use the directory path as below and comment the above line
  //      String xmlFileName = System.getProperty("user.dir") + File.separator + "testNG.xml";


       if(args.length >0){
            getApkPathFromCommandLine(args);
        }
        TestNG testNG = new TestNG();
        List<XmlSuite> suite;
        try
        {
            suite = new Parser(xmlFileName).parseToList();
            testNG.setXmlSuites(suite);

            testNG.run();
        }
        catch (Exception e)
        {
            Throwable underlyingException = e.getCause();
            System.out.println("An exception occurred in main : " + underlyingException);
            e.printStackTrace();
        }
    }

    public static void getApkPathFromCommandLine(String[] args){
        Options options = new Options();
        options.addOption("-apk", "path", true, "Relative path to required apk");

        BaseTest baseTest = new BaseTest();
        CommandLineParser parser = new DefaultParser();

        try {
            CommandLine cmd = parser.parse(options, args);
            String providedPath = cmd.getOptionValue("-apk");
            if (providedPath != null) {
                baseTest.setApkPath(providedPath);
            }
            else{
                baseTest.setApkPath(System.getProperty("user.dir") + File.separator + "smartnav_release.apk");
            }
        }
        catch (Exception e){
            e.printStackTrace();

        }
    }
}
