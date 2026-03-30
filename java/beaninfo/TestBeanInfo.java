package beaninfo;

import java.beans.*;

public class TestBeanInfo {
    public static void main(String[] args) throws Exception {

        BeanInfo info = Introspector.getBeanInfo(Class.forName("beans.Person"));

        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println("Property: " + pd.getName());
        }
    }
}