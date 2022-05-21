package ch.actifsource.example.customeclipse.model.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SubClass extends DynamicResource implements ISubClass {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISubClass> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISubClass>() {
    
    @Override
    public ISubClass create() {
      return new SubClass();
    }
    
    @Override
    public ISubClass create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SubClass(resourceRepository, resource);
    }
  
  };

  public SubClass() {
    super(ISubClass.TYPE_ID);
  }
  
  public SubClass(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISubClass.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SubClass setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0aafe8dd-d69e-11ec-9669-c7063ed32e69,spnMhKdQTOxfhQEEBszLOGNzVDE=] */
