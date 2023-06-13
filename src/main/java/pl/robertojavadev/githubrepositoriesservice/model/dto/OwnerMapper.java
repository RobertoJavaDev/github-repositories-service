package pl.robertojavadev.githubrepositoriesservice.model.dto;

import org.mapstruct.Mapper;
import pl.robertojavadev.githubrepositoriesservice.model.Owner;

@Mapper(componentModel = "spring")
public interface OwnerMapper {
    OwnerDto mapBranchEntityToBranchDto(Owner owner);

    Owner mapBranchDtoToBranchEntity(OwnerDto ownerDto);
}
