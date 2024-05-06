package ch.actifsource.example.unittest.model.test;

import junit.framework.*;

public class AllTests {
  
  public static Test suite() {
    TestSuite suite = new TestSuite(AllTests.class.getName());
    //$JUnit-BEGIN$
    
    suite.addTest(ch.actifsource.example.unittest.model.test.model.AllTests.suite());
    //$JUnit-END$
    return suite;
  }
  
}
