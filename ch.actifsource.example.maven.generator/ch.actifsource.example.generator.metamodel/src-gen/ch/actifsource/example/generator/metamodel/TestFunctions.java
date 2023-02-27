package ch.actifsource.example.generator.metamodel;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[bcfd687c-d6a3-11ec-9669-c7063ed32e69,imports]] */

/* End Protected Region   [[bcfd687c-d6a3-11ec-9669-c7063ed32e69,imports]] */

public class TestFunctions {

  /* Begin Protected Region [[bcfd687c-d6a3-11ec-9669-c7063ed32e69]] */
  
  /* End Protected Region   [[bcfd687c-d6a3-11ec-9669-c7063ed32e69]] */


  public static interface ISubClassFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c2ba8644-d6a3-11ec-9669-c7063ed32e69")
    public java.lang.String getSubClassName();

  }
  
  public static interface ISubClassFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("c2ba8644-d6a3-11ec-9669-c7063ed32e69")
    public java.lang.String getSubClassName(final ch.actifsource.example.generator.metamodel.javamodel.ISubClass subClass);

  }
  
  public static class SubClassFunctionsImpl implements ISubClassFunctionsImpl {

    public static final ISubClassFunctionsImpl INSTANCE = new SubClassFunctionsImpl();

    private SubClassFunctionsImpl() {}

    @Override
    public java.lang.String getSubClassName(final ch.actifsource.example.generator.metamodel.javamodel.ISubClass subClass) {
      /* Begin Protected Region [[c2ba8644-d6a3-11ec-9669-c7063ed32e69]] */
      return "Prefix_"+subClass.selectName();  
      /* End Protected Region   [[c2ba8644-d6a3-11ec-9669-c7063ed32e69]] */
    }

  }
  
  public static class SubClassFunctions {

    private SubClassFunctions() {}

    public static java.lang.String getSubClassName(final ch.actifsource.example.generator.metamodel.javamodel.ISubClass subClass) {
      return DynamicResourceUtil.invoke(ISubClassFunctionsImpl.class, SubClassFunctionsImpl.INSTANCE, subClass).getSubClassName(subClass);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,bcfd687c-d6a3-11ec-9669-c7063ed32e69,jvJf2dOG6/D1OpwuzkO2U0XL/ns=] */
