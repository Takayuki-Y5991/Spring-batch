package com.example.baseBatch.client.entity.custom;

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
    private String title;
    /**
     * Member Id
     */
    private Long memberId;
    /**
     * Account name, to rental book
     */
    private String name;
    /**
     * Account Email
     */
    private String email;
    /**
     * Book returnDate
     */
    private LocalDate returnDate;
}
