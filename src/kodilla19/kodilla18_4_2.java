package kodilla19;

public class kodilla18_4_2 {
    URI uri = new URI("http://test.com/cards?key=test&token=test&name=Test%20task&desc=Test%20Description&pos=top&idList=test_id");

    CreatedTrelloCard createdTrelloCard = new CreatedTrelloCard(
            "1",
            "Test task",
            "http://test.com"
    );
}
