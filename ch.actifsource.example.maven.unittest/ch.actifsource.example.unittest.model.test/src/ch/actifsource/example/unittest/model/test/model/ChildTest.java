package ch.actifsource.example.unittest.model.test.model;

import org.junit.Test;
import ch.actifsource.core.job.Select;
import ch.actifsource.ui.junit.SingleScopeTestCase;
import java.io.IOException;
import ch.actifsource.example.unittest.model.test.TestModel;
import ch.actifsource.example.unittest.model.Model;

public class ChildTest extends SingleScopeTestCase {

	public ChildTest() throws IOException {
		super("ch.actifsource.example.unittest.model.test");
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**********************
	 * Start Test
	 *********************/
	
	@Test
	public void test_childSize() {
		assertEquals(2, Select.objectsForRelation(fSession, Model.TestModelClass_subClass, TestModel.TestInstance).size());
	}
	
}
