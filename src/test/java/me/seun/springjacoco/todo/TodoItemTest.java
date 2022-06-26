package me.seun.springjacoco.todo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    @Test
    void givenToDoContent_whenCreateToDoItem_thenReturnToDoItemWithDoneAndCreatedTime() throws Exception {
        // given
        String content = "todo...";

        // when
        TodoItem todoItem = new TodoItem(content);

        // then
        Assertions.assertThat(todoItem.getContent()).isEqualTo(content);
        Assertions.assertThat(todoItem.isDone()).isFalse();
        Assertions.assertThat(todoItem.getCreatedTime()).isNotNull();
    }
}