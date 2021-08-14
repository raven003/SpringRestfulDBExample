package com.restful.api.h2.restful.api.h2.Control.mapper;

import com.restful.api.h2.restful.api.h2.Boundry.model.ProjectDTO;
import com.restful.api.h2.restful.api.h2.Entity.Project;
import org.springframework.stereotype.Service;

@Service
public class ProjectMapper {
    public Project dtoToEntity(ProjectDTO proj){
        Project result = new Project();
        result.setComment(proj.getComment());
        result.setCreatedAt(proj.getCreatedAt());
        result.setNote(proj.getNote());
        result.setTitle(proj.getTitle());
        result.setCreatedBy(proj.getCreatedBy());
        result.setSubTitle(proj.getSubTitle());
        return result;

    }
    public ProjectDTO entityToDto(Project proj){
        ProjectDTO result = new ProjectDTO();
        result.setComment(proj.getComment());
        result.setCreatedAt(proj.getCreatedAt());
        result.setNote(proj.getNote());
        result.setTitle(proj.getTitle());
        result.setCreatedBy(proj.getCreatedBy());
        result.setSubTitle(proj.getSubTitle());
        result.setId(proj.getId());
        return result;
    }

}
