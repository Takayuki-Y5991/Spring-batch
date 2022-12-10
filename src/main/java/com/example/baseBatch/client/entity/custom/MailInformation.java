package com.example.baseBatch.client.entity.custom;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Send Mail Information
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MailInformation implements Serializable {
    /**
     * Return Date
     */
    private LocalDate returnDate;

    /**
     * Account Name
     */
    private String memberName;

    /**
     * Account Email
     */
    private String email;

    /**
     * Book name, should be return
     */
    @Builder.Default
    private List<String> books = new ArrayList<String>();
}
