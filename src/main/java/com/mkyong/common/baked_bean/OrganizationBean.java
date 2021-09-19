package com.mkyong.common.baked_bean;

import com.mkyong.common.model.Organization;
import com.mkyong.common.repository.OrganizationRepository;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@ManagedBean
@ApplicationScoped
public class OrganizationBean {

    private List<Organization> organizationList;
    private OrganizationRepository organizationRepository = new OrganizationRepository();
    private Organization organization = new Organization();

    private Part fileToAttach;

    public List<Organization> getOrganizationList() {
        organizationList = organizationRepository.getAll();
        return organizationList;
    }
    public Organization getOrganization() {
        System.out.println("OrganizationEditBean :: getOrganization organization => "+ organization);
        return organization;
    }

    public Part getFileToAttach() {
        return fileToAttach;
    }

    public void setFileToAttach(Part fileToAttach) {
        this.fileToAttach = fileToAttach;
    }

    public String openOrganizationEditPage(Organization org){
        this.organization = org;
        System.out.println("OrganizationEditBean :: openOrganizationEditPage organization => "+ organization);
        return "add_organization";
    }

    public String openOrganizationCreatePage(){
        this.organization = new Organization();
        System.out.println("OrganizationEditBean :: openOrganizationEditPage organization => "+ organization);
        return "add_organization";
    }

    public String saveOrganization(){
        organizationRepository.save(this.organization);
        System.out.println("OrganizationEditBean :: saveOrganization organization => "+ organization);
        return "organization";
    }
    public String updateOrganization(){
        organizationRepository.update(this.organization);
        System.out.println("OrganizationEditBean :: updateOrganization organization => "+ organization);
        return "organization";
    }
    public void deleteOrganization(Organization org){
        organizationRepository.delete(org);
        System.out.println("Deleted => "+ org.toString());
    }


}
