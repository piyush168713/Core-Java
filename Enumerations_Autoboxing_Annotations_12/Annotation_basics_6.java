package Enumerations_Autoboxing_Annotations_12;

// An annotation leaves the semantics of a program unchanged.
// this information can be used by various tools during both development and deployment.
// example - an annotation might be processed by a source-code generator.
// The term `metadata` is also used to refer to this feature, but the term annotation is the most descriptive and more commomly used.

@interface Annotation_basics_6 {
    String str();
    int val();
}

// @ tells the compiler that an annotation type is being declared.
// All annotations constist solely of method decalarations. ( str() and val() )
// You don't provide bodies for these methods.
// Annotation can't includes an `extends` clause.
// All annotation types automatically extend the `Annotation` interface.
// Annotation is a super-interface of all annotations.
// It overrides hashCode(), equals(), and toString(), which are defined by Object.
// It also specifies annotationType(), which returns a Class object that represents the invoking annotation.
// classes, methods, fields, parameters, enum constants can be annotated. Even an annotation can be annotated.

// When you apply an annotation, you give values to its members.
// Example -

// Annotate a method

class Myanno {
    @Annotation_basics_6(str = "Annotation Example", val = 100)
    public static void myMeth() {

    }
}