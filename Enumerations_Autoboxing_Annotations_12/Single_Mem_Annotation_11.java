package Enumerations_Autoboxing_Annotations_12;

// A single member annotation contains only one member.
// When only one member is present, you can easily specify the value for that member when the annotation is applied.
// The name of the member must be the value.


// A single member annotation

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Single_mem_Annotation_11{
    int value();
}

class Single{
    @Single_mem_Annotation_11(100)
    public static void myMeth() throws NoSuchMethodException {
        Single ob = new Single();

        Method m = ob.getClass().getMethod("myMeth");

        Single_mem_Annotation_11 anno = m.getAnnotation(Single_mem_Annotation_11.class);
        System.out.println(anno.value());
    }

    public static void main(String[] args) throws NoSuchMethodException {
        myMeth();
    }
}

// In the program, @Single_mem_Annotation_11 is used to annotate myMeth().