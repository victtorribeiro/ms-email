package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_EMAIl")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private String ownerRef;
    private String emailFrom; // quem manda o email
    private String emailTo; // para quem está sendo enviado
    private String subject; // assunto / titulo
    @Column(columnDefinition = "TEXT")
    private String text; // corpo do email
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
