package com.full.springsecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "notices")
public class Notices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_id")
    private Long noticeId;

    @Column(name = "notices_summary")
    private String noticesSummary;

    @Column(name = "notices_details")
    private String noticesDetails;

    @Column(name = "beg_date", length = 10)
    private Date BegDate;

    @Column(name = "notice_end", length = 10)
    private Date noticeEnd;

    @Column(name = "create_date", length = 10)
    private Date createdDate;

    @Column(name = "update_date", length = 10)
    private Date updatedDate;
}
