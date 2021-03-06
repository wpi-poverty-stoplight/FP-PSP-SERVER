package py.org.fundacionparaguaya.pspserver.network.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import py.org.fundacionparaguaya.pspserver.network.entities.SurveyOrganizationEntity;

public interface SurveyOrganizationRepository
        extends JpaRepository<SurveyOrganizationEntity, Long>,
        JpaSpecificationExecutor<SurveyOrganizationEntity> {

    SurveyOrganizationEntity findBySurveyIdAndOrganizationId(Long surveyId,
            Long organizationId);

    List<SurveyOrganizationEntity> findBySurveyId(Long surveyId);

    List<SurveyOrganizationEntity> findBySurveyIdAndApplicationIdAndOrganizationId(
            Long surveyId, Long applicationId, Long organizationId);

    void deleteBySurveyId(Long surveyId);

}
