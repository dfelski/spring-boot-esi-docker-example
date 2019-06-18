package example;

/**
 * Our backend representation.
 */
class BackendDTO {

    private String name;

    BackendDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
