package kodilla19;

public class kodilla18_2_3 {
    URI url = UriComponentsBuilder.fromHttpUrl(trelloApiEndpoint + "/members/kodillauser/boards")
            .queryParam("key", trelloAppKey)
            .queryParam("token", trelloToken)
            .queryParam("fields", "name,id").build().encode().toUri();
}
