package pl.robertojavadev.githubrepositoriesservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Repository {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private Owner owner;

    @OneToMany(mappedBy = "repository")
    private List<Branch> branches;
}
