package pl.robertojavadev.githubrepositoriesservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "branch")
public class Branch {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private String lastCommitSha;

    @ManyToOne
    private Repository repository;
}
