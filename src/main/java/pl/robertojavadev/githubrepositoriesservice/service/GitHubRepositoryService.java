package pl.robertojavadev.githubrepositoriesservice.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.robertojavadev.githubrepositoriesservice.model.Repository;
import pl.robertojavadev.githubrepositoriesservice.model.dto.RepositoryDto;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GitHubRepositoryService {
    private static final String GITHUB_API_URL = "https://api.github.com";

    private final RestTemplate restTemplate;

    public List<RepositoryDto> getRepositories(String username) {
        String apiUrl = GITHUB_API_URL + "/users/" + username + "/repos";
        Repository[] gitHubRepositories = restTemplate.getForObject(apiUrl, Repository[].class, username);

        if (gitHubRepositories != null) {
            List<RepositoryDto> repositories = new ArrayList<>();

            return repositories;
        } else {
            throw new EntityNotFoundException("GitHub user not found: " + username);
        }
    }
}
