package com.mfdev.api.core.entity.task;

import com.mfdev.api.core.entity.tag.Tag;
import com.mfdev.api.core.entity.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;

import java.time.Instant;
import java.util.List;

import static com.mfdev.api.core.entity.task.Priority.P4;
import static jakarta.persistence.GenerationType.IDENTITY;
import static org.hibernate.annotations.OnDeleteAction.CASCADE;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String task;

    private String description;

    @CreationTimestamp
    private Instant dateCreate;

    @Column(nullable = false)
    private Instant deadline;

    @Column(nullable = false)
    private Priority priority = P4;

    @Column(nullable = false)
    private boolean isDone = false;

    @ManyToOne
    @OnDelete(action = CASCADE)
    private User user;

    @OneToMany
    private List<Tag> tags;
}
