package pl.robertojavadev.githubrepositoriesservice.model.dto;

import org.mapstruct.Mapper;
import pl.robertojavadev.githubrepositoriesservice.model.Repository;

@Mapper(componentModel = "spring")
public interface RepositoryMapper {
    RepositoryDto mapRepositoryEntityToRepositoryDto(Repository repository);

    Repository mapRepositoryDtoToRepositoryEntity(RepositoryDto repositoryDto);

}
