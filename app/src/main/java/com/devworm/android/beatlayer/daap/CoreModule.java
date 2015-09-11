package com.devworm.android.beatlayer.daap;

import com.devworm.android.beatlayer.module.Module;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Core module. <br />
 * @since 1.0
 * @created 2015-09-11
 */
public class CoreModule {

    private static List<? super Module> moduleList;

    private static Class<?>[] moduleDefine = new Class<?>[]{

    };

    static {
        moduleList = new ArrayList<Module>();
    }

    public static void initialize(){
        createModules();
    }

    private static void createModules() {
        for(Class<?> moduleCls : moduleDefine){
            try {
                moduleList.add(newProxyInterface((Module) moduleCls.newInstance()));
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static class ModuleHandler<T extends Module> implements InvocationHandler{

        private final T rawModule;

        public ModuleHandler(T module) {
            this.rawModule = module;
        }

        @Override
        public Object invoke(Object executor, Method method, Object[] args) throws Throwable {
            // Do something.
            method.invoke(this.rawModule, args);
            return null;
        }
    }

    public static <T extends Module> T newProxyInterface(T instance){
        return (T)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), instance.getClass().getInterfaces(), new ModuleHandler<>(instance));
    }
}
