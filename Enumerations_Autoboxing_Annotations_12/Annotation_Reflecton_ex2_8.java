package Enumerations_Autoboxing_Annotations_12;

// A Second Reflection Example

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Annotation_Reflecton_ex2_8{
    String  str();
    int val();
}

class Meta1{
    @Annotation_main_7(str = "Two Parameters", val = 20)
    public static void myMeth(String str, int i) throws NoSuchMethodException {
        Meta1 ob = new Meta1();

        Class<?> c = ob.getClass();

        Method m = c.getMethod("myMeth", String.class, int.class);

        Annotation_main_7 anno = m.getAnnotation(Annotation_main_7.class);
        System.out.println(anno.str() + " " + anno.val());

    }

    public static void main(String[] args) throws NoSuchMethodException {
        myMeth("Piyush", 10);
    }
}
