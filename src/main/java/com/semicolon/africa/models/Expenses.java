package com.semicolon.africa.models;

import com.semicolon.africa.constants.ExpenseType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Expenses {
    @Id
    private String id;
    private ExpenseType expenseType;
    private double totalExpenses;
    private String description;
    private LocalDateTime localDateTime = LocalDateTime.now();
//    private List<Expenses> listOfExpenses;

}
