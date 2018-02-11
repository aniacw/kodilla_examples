package kodilla19;

public class kodilla18_2_1 {
    // GET request
    getForObject(String url, Class<T> responseType, Map<String,?> uriVariables)

    // POST request
    postForObject(String url, Object request, Class<T> responseType,Object... uriVariables)

    // PUT request
    put(URI url, Object request)

    // DELETE request
    delete(String url, Map<String,?> uriVariables)
}
