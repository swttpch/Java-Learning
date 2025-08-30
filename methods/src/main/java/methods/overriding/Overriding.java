package methods.overriding;

@interface override {
    String value() default "default_value";
    int count();
}