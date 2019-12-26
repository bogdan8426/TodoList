package com.bogdanrotaru.todolist;

import com.bogdanrotaru.todolist.datamodel.TodoData;
import com.bogdanrotaru.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker datePicker;

    public TodoItem processResults(){
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = datePicker.getValue();

        TodoItem newItem = new TodoItem(shortDescription,details,deadlineValue);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;
    }

}
