package kodilla19;

public class kodilla18_2_2 {
    URI url = UriComponentsBuilder.fromHttpUrl(trelloApiEndpoint + "/members/kodillauser/boards")
            .queryParam("key", trelloAppKey)
            .queryParam("token", trelloToken).build().encode().toUri();

    TrelloBoardDto[] boardsResponse = restTemplate.getForObject(url, TrelloBoardDto[].class);
}
