package com.pixeltrice.springbootimportcsvfileapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pixeltrice.springbootimportcsvfileapp.entity.DeveloperTutorial;

@Repository
public interface DeveloperTutorialRepository extends JpaRepository<DeveloperTutorial, String>{

}
