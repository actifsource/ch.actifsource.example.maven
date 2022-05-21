package ch.actifsource.example.customeclipse.model.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestModelClass extends DynamicResource implements ITestModelClass {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestModelClass> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestModelClass>() {
    
    @Override
    public ITestModelClass create() {
      return new TestModelClass();
    }
    
    @Override
    public ITestModelClass create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestModelClass(resourceRepository, resource);
    }
  
  };

  public TestModelClass() {
    super(ITestModelClass.TYPE_ID);
  }
  
  public TestModelClass(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestModelClass.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends ch.actifsource.example.customeclipse.model.javamodel.ISubClass> selectSubClass() {
    return _getList(ch.actifsource.example.customeclipse.model.javamodel.ISubClass.class, ch.actifsource.example.customeclipse.model.ModelPackage.TestModelClass_subClass);
  }

  public TestModelClass setSubClass(java.util.List<? extends ch.actifsource.example.customeclipse.model.javamodel.ISubClass> subClass) {
    _setList(ch.actifsource.example.customeclipse.model.ModelPackage.TestModelClass_subClass, subClass);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestModelClass setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.customeclipse.model.javamodel.ISubClass.class, ch.actifsource.example.customeclipse.model.ModelPackage.TestModelClass_subClass, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.customeclipse.model.javamodel.ITestModelClass selectToMeSubClass(ch.actifsource.example.customeclipse.model.javamodel.ISubClass object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.customeclipse.model.javamodel.ITestModelClass.class, ch.actifsource.example.customeclipse.model.ModelPackage.TestModelClass_subClass, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,073519ee-d69e-11ec-9669-c7063ed32e69,Wwn45d0d0UngtgV+9fFQGPketNg=] */
