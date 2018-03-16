package com.huiy.javareflect.DynamicProxyDemo;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public final class proxySubject
  extends Proxy
  implements Subject
{
  private static Method m1;
  private static Method m3;
  private static Method m0;
  private static Method m2;
  
  public proxySubject(InvocationHandler paramInvocationHandler)
  {
    super(paramInvocationHandler);
  }
  
  @Override
public final boolean equals(Object paramObject)
  {
    try
    {
      return ((Boolean)h.invoke(this, m1, new Object[] { paramObject })).booleanValue();
    } catch (Error localError)

//    catch (Error|RuntimeException localError)
    {
      throw localError;
    }
    catch (Throwable localThrowable)
    {
      throw new UndeclaredThrowableException(localThrowable);
    }
  }
  
@Override
public final void hello()
  {
    try
    {
      h.invoke(this, m3, null);
      return;
    }
    catch (Error localError)
    {
      throw localError;
    }
    catch (Throwable localThrowable)
    {
      throw new UndeclaredThrowableException(localThrowable);
    }
  }
  
  @Override
public final int hashCode()
  {
    try
    {
      return ((Integer)h.invoke(this, m0, null)).intValue();
    }
    catch (Error localError)
    {
      throw localError;
    }
    catch (Throwable localThrowable)
    {
      throw new UndeclaredThrowableException(localThrowable);
    }
  }
  
  @Override
public final String toString()
  {
    try
    {
      return (String)h.invoke(this, m2, null);
    }
    catch (Error localError)
    {
      throw localError;
    }
    catch (Throwable localThrowable)
    {
      throw new UndeclaredThrowableException(localThrowable);
    }
  }
  
  static
  {
    try
    {
      m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[] { Class.forName("java.lang.Object") });
      m3 = Class.forName("com.huiy.javareflect.DynamicProxyDemo.Subject").getMethod("hello", new Class[0]);
      m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
      m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
//      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      throw new NoSuchMethodError(localNoSuchMethodException.getMessage());
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new NoClassDefFoundError(localClassNotFoundException.getMessage());
    }
  }
  
}