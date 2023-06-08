package pl.robertojavadev.githubrepositoriesservice.model.dto;

import pl.robertojavadev.githubrepositoriesservice.model.Repository;

public record BranchDto(
        String name,
        String lastCommitSha,
        Repository repository
) {
}
