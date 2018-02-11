package kodilla19;

public class kodilla_18_3_3 {
    // GET request
    List<TrelloBoardDto> trelloBoards = trelloClient.getTrelloBoards();

trelloBoards.forEach(trelloBoardDto -> {

        System.out.println(trelloBoardDto.getName() + " - " + trelloBoardDto.getId());

        System.out.println("This board contains lists: ");

        trelloBoardDto.getLists().forEach(trelloList ->
                System.out.println(trelloList.getName() + " - " + trelloList.getId() + " - " + trelloList.isClosed()));

    });
}
