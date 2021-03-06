package kodilla19;

public class kodilla11_2 {
    package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;
import java.util.stream.IntStream;

    public class BoardTestSuite {
        @Test
        public void testToString() {
            //given
            //creating the TasksList for todos
            TasksList listToDo = new TasksList("To Do Tasks");
            IntStream.iterate(1, n -> n + 1)
                    .limit(10)
                    .forEach(n -> listToDo.getTasks().add(new Task("To Do Task number " + n)));

            //creating the TaskList for tasks in progress
            TasksList listInProgress = new TasksList("In Progress Tasks");
            IntStream.iterate(1, n -> n + 1)
                    .limit(10)
                    .forEach(n -> listInProgress.getTasks().add(new Task("In Progress Task number " + n)));

            //creating the TaskList for done tasks
            TasksList listDone = new TasksList("Done Tasks");
            IntStream.iterate(1, n -> n + 1)
                    .limit(10)
                    .forEach(n -> listDone.getTasks().add(new Task("Done Task number " + n)));

            //creating the board and assigning the lists
            Board board = new Board("Project number 1");
            board.getLists().add(listToDo);
            board.getLists().add(listInProgress);
            board.getLists().add(listDone);
            System.out.println(board);

            //When
            //Then
            Assert.assertEquals(3, board.getLists().size());
        }
    }
}
