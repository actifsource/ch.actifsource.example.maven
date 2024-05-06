package ch.actifsource.example.unittest.model.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import ch.actifsource.core.scope.IResourceScope;
import ch.actifsource.core.Resource;
import ch.actifsource.core.model.CodeModelBase;
import ch.actifsource.core.Relationship;

// referenced models:
import ch.actifsource.core.CoreModel;
import ch.actifsource.example.unittest.model.Model;

/**
 * Created by exporting from actifsource.
 */
public final class TestModel extends CodeModelBase {

  public static final Resource TestInstance = resource("82dbbdd5-daa9-11ec-b1d1-f170e5a75932");
  public static final Resource TestInstance_TestName_aE_844fe749__S_daa9__S_11ec__S_b1d1__S_f170e5a75932 = resource("844fe749-daa9-11ec-b1d1-f170e5a75932");
  public static final Resource TestInstance_TestName_aE_8a509dd4__S_daa9__S_11ec__S_b1d1__S_f170e5a75932 = resource("8a509dd4-daa9-11ec-b1d1-f170e5a75932");

  public TestModel(IResourceScopeProvider scopeProvider) {
    this(scopeProvider.getScope("ch.actifsource.example.unittest.model.test"));
  }

  @SuppressWarnings("unused")
  public TestModel(IResourceScope scope) {
    super(scope, TestModel.class);
    new ResourceImpl(TestInstance) {
      {
        create(getPackage(), fResource);
        this
          .property(CoreModel.Resource_typeOf, Model.TestModelClass, "82dc0bf7-daa9-11ec-b1d1-f170e5a75932")
          .property(CoreModel.NamedResource_name, stringLiteral("TestInstance"), "82dd4478-daa9-11ec-b1d1-f170e5a75932")
          .property(Model.TestModelClass_subClass, TestInstance_TestName_aE_844fe749__S_daa9__S_11ec__S_b1d1__S_f170e5a75932, Relationship.COMPOSITION, "8450356c-daa9-11ec-b1d1-f170e5a75932")
          .property(Model.TestModelClass_subClass, TestInstance_TestName_aE_8a509dd4__S_daa9__S_11ec__S_b1d1__S_f170e5a75932, Relationship.COMPOSITION, "8a511307-daa9-11ec-b1d1-f170e5a75932")
        ;
      }
    };
    new ResourceImpl(TestInstance_TestName_aE_844fe749__S_daa9__S_11ec__S_b1d1__S_f170e5a75932) {
      {
        this
          .property(CoreModel.Resource_typeOf, Model.SubClass, "84500e5b-daa9-11ec-b1d1-f170e5a75932")
          .property(CoreModel.NamedResource_name, stringLiteral("SubInstance_1"), "853146a3-daa9-11ec-b1d1-f170e5a75932")
        ;
      }
    };
    new ResourceImpl(TestInstance_TestName_aE_8a509dd4__S_daa9__S_11ec__S_b1d1__S_f170e5a75932) {
      {
        this
          .property(CoreModel.Resource_typeOf, Model.SubClass, "8a509dd5-daa9-11ec-b1d1-f170e5a75932")
          .property(CoreModel.NamedResource_name, stringLiteral("SubInstance_2"), "8a509dd6-daa9-11ec-b1d1-f170e5a75932")
        ;
      }
    };
  }

  /**
   * Returns all CodeModel-Classes required to work with this CodeModel including itself.
   */
  public static List<Class<? extends CodeModelBase>> getRequiredCodeModels() {
    return new ArrayList<Class<? extends CodeModelBase>>(collectRequiredCodeModels(new LinkedHashSet<Class<? extends CodeModelBase>>()));
  }
  
  public static LinkedHashSet<Class<? extends CodeModelBase>> collectRequiredCodeModels(LinkedHashSet<Class<? extends CodeModelBase>> codeModels) {
    if(!codeModels.add(TestModel.class)) return codeModels;
    ch.actifsource.core.CoreModel.collectRequiredCodeModels(codeModels);
    ch.actifsource.example.unittest.model.Model.collectRequiredCodeModels(codeModels);
    return codeModels;
  }

}

/* Actifsource ID=[22779f86-ef15-11de-bdab-77b2ff492439,ch.actifsource.example.unittest.model.test,XE0TBJfTIIK5Hcd58D6fB/puYwk=] */
