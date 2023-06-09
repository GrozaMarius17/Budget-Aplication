package org.fasttrackit.Homework18.controller;

import org.fasttrackit.Homework18.model.transaction.Transaction;

import java.util.List;

public record ReportByTypeResponse(List<Transaction> SELL, List<Transaction> BUY) {

}
