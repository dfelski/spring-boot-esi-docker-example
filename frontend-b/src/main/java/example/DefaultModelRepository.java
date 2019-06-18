package example;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * Our {@link ModelRepository} implementation to encapsulate the HTTP calls.
 */
@Repository
public class DefaultModelRepository implements ModelRepository {

    @Override
    public FrontendDTO getFrontendModel() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://backend-b:8080/", FrontendDTO.class);
    }
}
