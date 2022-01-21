package Enumerations_Autoboxing_Annotations_12;

//                            Specifying a Retention Policy
//                   Obtaining Annotations at Run Time by Use of Reflection

// A retention policy determines at what point an anootation is discarded.
// Java defines three such policies, which are encapsulated within the java.lang.annotation.RetentionPolicy enumeration.
//They are SOURCE, CLASS and RUNTIME.
// An annotation on a local variable declaration is not retained in the .class file.
// @Retention(retention-policy)
//example -

//@Retention(RetentionPolicy.RUNTIME)
//@interface Annotation_main_7 {
//    String str();
//    int val();
//}


// An annotation type declaration

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Annotation_main_7{
    String str();
    int val();
}

class Meta{
    // Annotate a method
    @Annotation_main_7(str = "Annotation Example", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        // Obtain the annotation for this methoda and displays the values of the members.
        try {
        Class<?> c = ob.getClass();

        // Now, get a Method object that represents this method.

            Method m = c.getMethod("myMeth");

            // Next, get an annotation for this class.
            Annotation_main_7 anno = m.getAnnotation(Annotation_main_7.class);

            // Finally display the values
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }

    public static void main(String args[]) {
        myMeth();
    }
}

// Annotation_main_7 anno = m.getAnnotation(Annotation_main_7.class);
// Notice Annotation_main_7.class. This expresion evaluates to a Class object of type Annotation_main_7, the annotation. This construct is called class literal.

// This statement could have been used to obtain the Class object for Meta:
// Class<?> c = Meta.class;










