package ch.actifsource.example.unittest.model;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import ch.actifsource.core.scope.IResourceScope;
import ch.actifsource.core.Resource;
import ch.actifsource.core.model.CodeModelBase;
import ch.actifsource.core.Relationship;

// referenced models:
import ch.actifsource.core.CoreModel;
import ch.actifsource.core.selector.element.ElementModel;
import ch.actifsource.core.selector.metaelement.MetaelementModel;
import ch.actifsource.core.selector.token.TokenModel;
import ch.actifsource.core.selector.type.TypeModel;

/**
 * Created by exporting from actifsource.
 */
public final class Model extends CodeModelBase {

  public static final Resource TestModelClass = resource("073519ee-d69e-11ec-9669-c7063ed32e69");
  public static final Resource SubClass = resource("0aafe8dd-d69e-11ec-9669-c7063ed32e69");
  public static final Resource TestFunctions = resource("bcfd687c-d6a3-11ec-9669-c7063ed32e69");
  public static final Resource TestModelClass_subClass = resource("0d70687c-d69e-11ec-9669-c7063ed32e69");
  public static final Resource SubClass_NameAspect__F__aA_1_aC_ = resource("0441e322-d6a4-11ec-9669-c7063ed32e69");
  public static final Resource TestFunctions_SubClass = resource("be203da0-d6a3-11ec-9669-c7063ed32e69");
  public static final Resource SubClass_NameAspect__F__aA_1_aC__LinkSelector = resource("04b98427-d6a4-11ec-9669-c7063ed32e69");
  public static final Resource TestFunctions_SubClass_getSubClassName = resource("c2ba8644-d6a3-11ec-9669-c7063ed32e69");
  public static final Resource GUID_ea74fc96_d83e_11ec_ad41_fddf9271c941 = resource("ea74fc96-d83e-11ec-ad41-fddf9271c941");
  public static final Resource TestFunctions_SubClass_getSubClassName_StringLiteral = resource("cb5659fb-d6a3-11ec-9669-c7063ed32e69");
  public static final Resource GUID_ea74ae6f_d83e_11ec_ad41_fddf9271c941 = resource("ea74ae6f-d83e-11ec-ad41-fddf9271c941");
  public static final Resource GUID_ea74ae70_d83e_11ec_ad41_fddf9271c941 = resource("ea74ae70-d83e-11ec-ad41-fddf9271c941");
  public static final Resource GUID_ea74d581_d83e_11ec_ad41_fddf9271c941 = resource("ea74d581-d83e-11ec-ad41-fddf9271c941");

  public Model(IResourceScopeProvider scopeProvider) {
    this(scopeProvider.getScope("ch.actifsource.example.unittest.model"));
  }

  @SuppressWarnings("unused")
  public Model(IResourceScope scope) {
    super(scope, Model.class);
    new ResourceImpl(TestModelClass) {
      {
        create(getPackage(), fResource);
        this
          .property(CoreModel.Resource_typeOf, CoreModel.Class, "07354100-d69e-11ec-9669-c7063ed32e69")
          .property(CoreModel.Class_extends, CoreModel.NamedResource, "0735dd42-d69e-11ec-9669-c7063ed32e69")
          .property(CoreModel.Class_property, TestModelClass_subClass, Relationship.COMPOSITION, "0d712bd0-d69e-11ec-9669-c7063ed32e69")
          .property(CoreModel.NamedResource_name, stringLiteral("TestModelClass"), "07358f21-d69e-11ec-9669-c7063ed32e69")
        ;
      }
    };
    new ResourceImpl(SubClass) {
      {
        create(getPackage(), fResource);
        this
          .property(CoreModel.Resource_typeOf, CoreModel.Class, "0aafe8df-d69e-11ec-9669-c7063ed32e69")
          .property(CoreModel.Class_extends, CoreModel.NamedResource, "0ab03701-d69e-11ec-9669-c7063ed32e69")
          .property(CoreModel.NamedResource_name, stringLiteral("SubClass"), "0ab00ff0-d69e-11ec-9669-c7063ed32e69")
          .property(CoreModel.AspectProvider_aspect, SubClass_NameAspect__F__aA_1_aC_, Relationship.COMPOSITION, "0442a676-d6a4-11ec-9669-c7063ed32e69")
        ;
      }
    };
    new ResourceImpl(TestFunctions) {
      {
        create(getPackage(), fResource);
        this
          .property(CoreModel.Resource_typeOf, TypeModel.FunctionSpace, "bcfd8f8e-d6a3-11ec-9669-c7063ed32e69")
          .property(CoreModel.NamedResource_name, stringLiteral("TestFunctions"), "bcfe79ef-d6a3-11ec-9669-c7063ed32e69")
          .property(TypeModel.AbstractFunctionSpace_functionContext, TestFunctions_SubClass, Relationship.COMPOSITION, "be20d9e3-d6a3-11ec-9669-c7063ed32e69")
        ;
      }
    };
    new ResourceImpl(TestModelClass_subClass) {
      {
        this
          .property(CoreModel.Resource_typeOf, CoreModel.Composition, "0d708f8e-d69e-11ec-9669-c7063ed32e69")
          .property(CoreModel.NamedResource_name, stringLiteral("subClass"), "0d70b69f-d69e-11ec-9669-c7063ed32e69")
          .property(CoreModel.Property_subjectCardinality, CoreModel.Cardinality0_aE_N, "0d7179f1-d69e-11ec-9669-c7063ed32e69")
          .property(CoreModel.Relation_objectCardinality, CoreModel.Cardinality1_aE_1, "0d71a102-d69e-11ec-9669-c7063ed32e69")
          .property(CoreModel.OwnRelation_range, SubClass, "0d723d43-d69e-11ec-9669-c7063ed32e69")
        ;
      }
    };
    new ResourceImpl(SubClass_NameAspect__F__aA_1_aC_) {
      {
        this
          .property(CoreModel.Resource_typeOf, ElementModel.TextSelectorAspectImplementation, "04420a34-d6a4-11ec-9669-c7063ed32e69")
          .property(ElementModel.TextSelectorAspectImplementation_implements, CoreModel.Class_NameAspect, "04427f65-d6a4-11ec-9669-c7063ed32e69")
          .property(ElementModel.TextSelectorAspectImplementation_selector, SubClass_NameAspect__F__aA_1_aC__LinkSelector, Relationship.COMPOSITION, "04b9d24a-d6a4-11ec-9669-c7063ed32e69")
        ;
      }
    };
    new ResourceImpl(TestFunctions_SubClass) {
      {
        this
          .property(CoreModel.Resource_typeOf, TypeModel.FunctionContext, "be2064b2-d6a3-11ec-9669-c7063ed32e69")
          .property(TypeModel.FunctionContext_function, TestFunctions_SubClass_getSubClassName, Relationship.COMPOSITION, "c2bb2288-d6a3-11ec-9669-c7063ed32e69")
          .property(TypeModel.FunctionContext_typeRef, SubClass, "c359ac79-d6a3-11ec-9669-c7063ed32e69")
        ;
      }
    };
    new ResourceImpl(SubClass_NameAspect__F__aA_1_aC__LinkSelector) {
      {
        this
          .property(CoreModel.Resource_typeOf, ElementModel.LinkSelector, "04b9ab39-d6a4-11ec-9669-c7063ed32e69")
          .property(MetaelementModel.ParentElement_children, GUID_ea74fc96_d83e_11ec_ad41_fddf9271c941, Relationship.COMPOSITION, "ea7dd653-d83e-11ec-ad41-fddf9271c941")
        ;
      }
    };
    new ResourceImpl(TestFunctions_SubClass_getSubClassName) {
      {
        this
          .property(CoreModel.Resource_typeOf, TypeModel.JavaFunction, "c2baad56-d6a3-11ec-9669-c7063ed32e69")
          .property(CoreModel.NamedResource_name, stringLiteral("getSubClassName"), "c416e1fa-d6a3-11ec-9669-c7063ed32e69")
          .property(TypeModel.AbstractJavaFunction_returnType, TestFunctions_SubClass_getSubClassName_StringLiteral, Relationship.COMPOSITION, "cb56a81e-d6a3-11ec-9669-c7063ed32e69")
          .property(TypeModel.Function_cached, stringLiteral("true"), "c2bafb77-d6a3-11ec-9669-c7063ed32e69")
        ;
      }
    };
    new ResourceImpl(GUID_ea74fc96_d83e_11ec_ad41_fddf9271c941) {
      {
        this
          .property(CoreModel.Resource_typeOf, ElementModel.Variable, "ea7c76b7-d83e-11ec-ad41-fddf9271c941")
          .property(ElementModel.Variable_code, GUID_ea74ae6f_d83e_11ec_ad41_fddf9271c941, Relationship.COMPOSITION, "ea7d8832-d83e-11ec-ad41-fddf9271c941")
        ;
      }
    };
    new ResourceImpl(TestFunctions_SubClass_getSubClassName_StringLiteral) {
      {
        this
          .property(CoreModel.Resource_typeOf, TypeModel.LiteralType, "cb56810d-d6a3-11ec-9669-c7063ed32e69")
          .property(TypeModel.LiteralType_literalRef, CoreModel.StringLiteral, "cbdb416f-d6a3-11ec-9669-c7063ed32e69")
        ;
      }
    };
    new ResourceImpl(GUID_ea74ae6f_d83e_11ec_ad41_fddf9271c941) {
      {
        this
          .property(CoreModel.Resource_typeOf, TokenModel.Code, "ea7c9dc9-d83e-11ec-ad41-fddf9271c941")
          .property(TokenModel.Code_statementToken, GUID_ea74ae70_d83e_11ec_ad41_fddf9271c941, Relationship.COMPOSITION, "ea7d8831-d83e-11ec-ad41-fddf9271c941")
        ;
      }
    };
    new ResourceImpl(GUID_ea74ae70_d83e_11ec_ad41_fddf9271c941) {
      {
        this
          .property(CoreModel.Resource_typeOf, TokenModel.FunctionToken, "ea7cc4db-d83e-11ec-ad41-fddf9271c941")
          .property(TokenModel.InstanceReference_instance, GUID_ea74d581_d83e_11ec_ad41_fddf9271c941, Relationship.COMPOSITION, "ea7d3a0f-d83e-11ec-ad41-fddf9271c941")
          .property(TokenModel.BaseFunctionToken_functionRef, TestFunctions_SubClass_getSubClassName, "ea7d6120-d83e-11ec-ad41-fddf9271c941")
        ;
      }
    };
    new ResourceImpl(GUID_ea74d581_d83e_11ec_ad41_fddf9271c941) {
      {
        this
          .property(CoreModel.Resource_typeOf, TokenModel.ClassToken, "ea7d12fd-d83e-11ec-ad41-fddf9271c941")
          .property(TokenModel.ClassToken_classRef, SubClass, "ea7d3a0e-d83e-11ec-ad41-fddf9271c941")
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
    if(!codeModels.add(Model.class)) return codeModels;
    ch.actifsource.core.CoreModel.collectRequiredCodeModels(codeModels);
    ch.actifsource.core.selector.element.ElementModel.collectRequiredCodeModels(codeModels);
    ch.actifsource.core.selector.metaelement.MetaelementModel.collectRequiredCodeModels(codeModels);
    ch.actifsource.core.selector.token.TokenModel.collectRequiredCodeModels(codeModels);
    ch.actifsource.core.selector.type.TypeModel.collectRequiredCodeModels(codeModels);
    return codeModels;
  }

}

/* Actifsource ID=[22779f86-ef15-11de-bdab-77b2ff492439,ch.actifsource.example.unittest.model,Lxp/nKkyKameQ6iglVJ5VcMS9Lc=] */
