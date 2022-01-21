package Enumerations_Autoboxing_Annotations_12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Default_Values_9{
    String str() default "Testing";
    int val() default 9000;
}

class Meta2{
    @Default_Values_9()
    public static void myMeth() throws NoSuchMethodException {
        Meta2 ob = new Meta2();

        //obtain the annotation for this method and display the value of the members

        Class<?> c = ob.getClass();
        Method m = c.getMethod("myMeth");

        Default_Values_9 anno = c.getAnnotation(Default_Values_9.class);
        System.out.println(anno.str() + " " + anno.val());
    }

    public static void main(String[] args) throws NoSuchMethodException {
        myMeth();
    }
}

















