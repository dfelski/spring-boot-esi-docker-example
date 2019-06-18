package example;

/**
 * We don't want to spread all the HTTP communication over our application, so let's define a Repository interface for this.
 */
public interface ModelRepository {

    FrontendDTO getFrontendModel();

}
