package example;

/**
 * Frontend representation of our transfer object.
 */
class FrontendDTO {

    private String name;

    // required for de-serialization
    private FrontendDTO() {}

    // required for de-serialization
    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
