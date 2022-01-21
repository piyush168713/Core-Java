package Enumerations_Autoboxing_Annotations_12;
// Marker interface contains no members

// A marker annotation

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Marker_Annotation_10{ }

class Marker{
    // Annotate a method using a marker
    // Notice that no() is needed.

    @Marker_Annotation_10
    public static void myMeth() throws NoSuchMethodException {
        Marker ob = new Marker();

        Method m = ob.getClass().getMethod("myMeth");

        // Determine if the annotation is present
        if (m.isAnnotationPresent(Marker_Annotation_10.class))
            System.out.println("Marker_Annotation_10 is present.");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        myMeth();
    }
}