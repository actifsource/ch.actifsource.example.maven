package ch.actifsource.example.customeclipse.model.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestModelClass extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("073519ee-d69e-11ec-9669-c7063ed32e69");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.example.customeclipse.model.javamodel.ISubClass> selectSubClass();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,073519ee-d69e-11ec-9669-c7063ed32e69,60xTMQ4GGA71fDe23rg1SZ0Nn0g=] */
