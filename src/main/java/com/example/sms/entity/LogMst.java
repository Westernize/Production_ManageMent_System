package com.example.sms.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(name = "TB_LOG")
public class LogMst {

    @Id
    @Column(name = "LOG_NO", length = 20)
    private String logNo;

    @CreationTimestamp
    @Column(name = "LOG_DT", updatable = false)
    private LocalDateTime logDt;

    @Column(name = "LOG_USER", length = 20)
    private String logUser;

    @Column(name = "ACTION_TYPE", length = 10)
    private String actionType;

    @Column(name = "MENU_NAME", length = 50)
    private String menuName;

    @Column(name = "TARGET_KEY", length = 50)
    private String targetKey;

    @Column(name = "TARGET_NAME", length = 100)
    private String targetName;

    @Lob
    @Column(name = "CHANGE_CONTENTS")
    private String changeContents;
}