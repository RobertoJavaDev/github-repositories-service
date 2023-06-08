package pl.robertojavadev.githubrepositoriesservice.model.dto;

import pl.robertojavadev.githubrepositoriesservice.model.Branch;
import pl.robertojavadev.githubrepositoriesservice.model.Owner;

import java.util.List;

public record RepositoryDto(
        Owner owner,
        List<Branch> branches
) {
}
