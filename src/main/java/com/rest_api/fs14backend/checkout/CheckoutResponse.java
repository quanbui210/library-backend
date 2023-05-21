package com.rest_api.fs14backend.checkout;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@Component
public class CheckoutResponse {
  private UUID id;
  private UUID bookId;
  private UUID userId;
  private String bookName;
  private String username;
  private LocalDate borrowedDate;
  private LocalDate returnedDate;
  private boolean isReturned;
}