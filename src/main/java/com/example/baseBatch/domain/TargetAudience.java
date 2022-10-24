package com.example.baseBatch.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Email Target Audience
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TargetAudience {
    /**
     * Book name
     */
    private String bookName;
    /**
     * Account name, to rental book
     */
    private String accountName;
    /**
     * Account Email
     */
    private String email;
    /**
     * Book returnDate
     */
    private LocalDate returnDate;
}
