package pl.robertojavadev.githubrepositoriesservice.model.dto;

import org.mapstruct.Mapper;
import pl.robertojavadev.githubrepositoriesservice.model.Branch;
import pl.robertojavadev.githubrepositoriesservice.model.dto.BranchDto;

@Mapper(componentModel = "spring")
public interface BranchMapper {
    BranchDto mapBranchEntityToBranchDto(Branch branch);

    Branch mapBranchDtoToBranchEntity(BranchDto branchDto);
}
