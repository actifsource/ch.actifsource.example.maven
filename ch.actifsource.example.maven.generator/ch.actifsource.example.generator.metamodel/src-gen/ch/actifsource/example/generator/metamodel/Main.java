package ch.actifsource.example.generator.metamodel;

import java.net.URISyntaxException;

import ch.actifsource.ant.task.AntLogger;
import ch.actifsource.core.javamodel.INamedResource;
import ch.actifsource.environment.WorkspaceProblem;

public class Main {

	public static void main(String[] args) {
	    // TODO Auto-generated method stub
		System.err.println("start ooooo sfsfsdfsd");
		
		if (args != null) {
			for (int index = 0; index <args.length; index++) {
				System.err.println("para: "+args[index]);
			}
		}
		
		
		
		Class<INamedResource> klassCore1 =  INamedResource.class;
//		Class<ModelPackage> klassCore2 =  ModelPackage.class;
		Class<WorkspaceProblem> klassCore3 =  WorkspaceProblem.class;
		Class<AntLogger> klassCore4 =  AntLogger.class;
		
		try {
			
			String jarPathCore = klassCore1
			          .getProtectionDomain()
			          .getCodeSource()
			          .getLocation()
			          .toURI()
			          .getPath();
			
			System.out.println("Core actifsoruce Jar1: "+jarPathCore);//.m2
			
//			jarPathCore = klassCore2
//			          .getProtectionDomain()
//			          .getCodeSource()
//			          .getLocation()
//			          .toURI()
//			          .getPath();
//			
//			System.out.println("Core actifsoruce Jar2: "+jarPathCore);//.m2
			
			jarPathCore = klassCore3
			          .getProtectionDomain()
			          .getCodeSource()
			          .getLocation()
			          .toURI()
			          .getPath();
			
			System.out.println("Core actifsoruce Jar3: "+jarPathCore);//.m2
			
			jarPathCore = klassCore4
			          .getProtectionDomain()
			          .getCodeSource()
			          .getLocation()
			          .toURI()
			          .getPath();
			
			System.out.println("Core actifsoruce Jar5: "+jarPathCore);//.m2
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		String value = System.getProperty("actifsource.test1");
		
			
		System.err.println("end ooooo sfsfsdfsd "+value);
		
		
		//return 1;
	}
	
}
