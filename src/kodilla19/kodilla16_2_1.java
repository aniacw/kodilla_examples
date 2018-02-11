package kodilla19;

public class kodilla16_2_1 {
    <html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>CRUD</title>
  <link rel="stylesheet" href="style.css">
  <link href="https://fonts.googleapis.com/css?family=Roboto:400,400i,500,500i,700,700i&subset=latin-ext" rel="stylesheet">
</head>
<body>
<h1 class="kodilla-heading kodilla-heading--main">Kodilla CRUD App</h1>

<main class="crud container">
  <section class="datatable">
    <h2>Add a new task</h2>
    <form
    class="datatable__row datatable__row--add"
    method="POST"
    action="http://localhost:8080/v1/task/createTask"
    data-task-add-form
    >
      <fieldset class="datatable__row-section datatable__row-section--input-section">
        <label class="datatable__input-label">
    Task name
        </label>
        <input type="text" name="title" placeholder="Insert a task name" required minlength="3">
      </fieldset>

      <fieldset class="datatable__row-section datatable__row-section--input-section">
        <label class="datatable__input-label">
    Task content
        </label>
        <textarea name="content" placeholder="Insert task content" required minlength="3"></textarea>
      </fieldset>

      <fieldset class="datatable__row-section datatable__row-section--button-section">
        <button type="submit" data-task-add-button class="datatable__button">Add a task</button>
      </fieldset>
    </form>
     </section>
  <section class="datatable">
    <h2>Tasks from the API</h2>
    <div class="datatable__tasks-container" data-tasks-container></div>
  </section>
</main>

<div class="template" data-datatable-row-template>
  <form class="datatable__row" data-task-id="0">
    <fieldset class="datatable__row-section datatable__row-section--input-section" data-task-name-section>
      <label class="datatable__input-label">
    Task name
      </label>
      <input type="text" name="title" placeholder="Insert a new task name" data-task-name-input required minlength="3">
      <p class="datatable__field-value" data-task-name-paragraph></p>
    </fieldset>

    <fieldset class="datatable__row-section datatable__row-section--input-section" data-task-content-section>
      <label class="datatable__input-label">
    Task content
      </label>
      <textarea name="title" placeholder="Insert new task content" data-task-content-input required minlength="3"></textarea>
      <p class="datatable__field-value" data-task-content-paragraph></p>
    </fieldset>

    <fieldset class="datatable__row-section datatable__row-section--button-section">
      <button type="button" data-task-submit-update-button class="datatable__button datatable__button--editing ">Submit update</button>
      <button type="button" data-task-edit-abort-button class="datatable__button datatable__button--editing">Abort update</button>
      <button type="button" data-task-edit-button class="datatable__button">Edit</button>
      <button type="button" data-task-delete-button class="datatable__button">Delete</button>
    </fieldset>
  </form>
</div>

<script src="jquery-3.2.1.min.js"></script>
<script src="script.js"></script>
</body>
</html>
}
