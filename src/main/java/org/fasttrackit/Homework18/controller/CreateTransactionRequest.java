package org.fasttrackit.Homework18.controller;

import org.fasttrackit.Homework18.model.transaction.TransactionType;

public record CreateTransactionRequest(String product, TransactionType type, double amount) {
}
