package kodilla19;

public class kodilla18_4_1 {
    // Given
    when(trelloConfig.getTrelloApiEndpoint()).thenReturn("http://test.com");
    when(trelloConfig.getTrelloAppKey()).thenReturn("test");
    when(trelloConfig.getTrelloToken()).thenReturn("test");


    TrelloBoardDto[] trelloBoards = new TrelloBoardDto[1];
    trelloBoards[0] = new TrelloBoardDto("test_id", "test_board", new ArrayList<>());

    URI uri = new URI("http://test.com/members/TWOJ_USERNAME_TRELLO/boards?key=test&token=test&fields=name,id&lists=all");
}
