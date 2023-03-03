package com.tririga.ws;

import com.tririga.ws.dto.content.InvalidContentException;
import com.tririga.ws.dto.content.InvalidDocumentTypeException;
import com.tririga.ws.errors.AccessException;
import com.tririga.ws.errors.ActionDoesNotExistException;
import com.tririga.ws.errors.ActionItemInvalidException;
import com.tririga.ws.errors.GuiDoesNotExistException;
import com.tririga.ws.errors.InvalidArgumentException;
import com.tririga.ws.errors.InvalidContinuationTokenException;
import com.tririga.ws.errors.ListDoesNotExistException;
import com.tririga.ws.errors.ModuleDoesNotExistException;
import com.tririga.ws.errors.ObjectTypeDoesNotExistException;
import com.tririga.ws.errors.ProjectDoesNotExistException;
import com.tririga.ws.errors.QueryDoesNotExistException;
import com.tririga.ws.errors.RecordDoesNotExistException;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.tririga.ws package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCurrencyConversionRates_QNAME = new QName("http://ws.tririga.com", "getCurrencyConversionRates");
    private final static QName _GetCurrencyConversionRatesResponse_QNAME = new QName("http://ws.tririga.com", "getCurrencyConversionRatesResponse");
    private final static QName _GetActionItems_QNAME = new QName("http://ws.tririga.com", "getActionItems");
    private final static QName _GetActionItemsResponse_QNAME = new QName("http://ws.tririga.com", "getActionItemsResponse");
    private final static QName _GetNamedQueryType_QNAME = new QName("http://ws.tririga.com", "getNamedQueryType");
    private final static QName _GetNamedQueryTypeResponse_QNAME = new QName("http://ws.tririga.com", "getNamedQueryTypeResponse");
    private final static QName _UploadFrom_QNAME = new QName("http://ws.tririga.com", "uploadFrom");
    private final static QName _UploadFromResponse_QNAME = new QName("http://ws.tririga.com", "uploadFromResponse");
    private final static QName _Register_QNAME = new QName("http://ws.tririga.com", "register");
    private final static QName _RegisterResponse_QNAME = new QName("http://ws.tririga.com", "registerResponse");
    private final static QName _GetAssociationDefinitionsByName_QNAME = new QName("http://ws.tririga.com", "getAssociationDefinitionsByName");
    private final static QName _GetAssociationDefinitionsByNameResponse_QNAME = new QName("http://ws.tririga.com", "getAssociationDefinitionsByNameResponse");
    private final static QName _KeywordSearch_QNAME = new QName("http://ws.tririga.com", "keywordSearch");
    private final static QName _KeywordSearchResponse_QNAME = new QName("http://ws.tririga.com", "keywordSearchResponse");
    private final static QName _GetGUIs_QNAME = new QName("http://ws.tririga.com", "getGUIs");
    private final static QName _GetGUIsResponse_QNAME = new QName("http://ws.tririga.com", "getGUIsResponse");
    private final static QName _GetModuleId_QNAME = new QName("http://ws.tririga.com", "getModuleId");
    private final static QName _GetModuleIdResponse_QNAME = new QName("http://ws.tririga.com", "getModuleIdResponse");
    private final static QName _RunNamedQueryMultiBoContinue_QNAME = new QName("http://ws.tririga.com", "runNamedQueryMultiBoContinue");
    private final static QName _RunNamedQueryMultiBoContinueResponse_QNAME = new QName("http://ws.tririga.com", "runNamedQueryMultiBoContinueResponse");
    private final static QName _GetAllAssociatedRecords_QNAME = new QName("http://ws.tririga.com", "getAllAssociatedRecords");
    private final static QName _GetAllAssociatedRecordsResponse_QNAME = new QName("http://ws.tririga.com", "getAllAssociatedRecordsResponse");
    private final static QName _GetRecordState_QNAME = new QName("http://ws.tririga.com", "getRecordState");
    private final static QName _GetRecordStateResponse_QNAME = new QName("http://ws.tririga.com", "getRecordStateResponse");
    private final static QName _RunDynamicQueryContinue_QNAME = new QName("http://ws.tririga.com", "runDynamicQueryContinue");
    private final static QName _RunDynamicQueryContinueResponse_QNAME = new QName("http://ws.tririga.com", "runDynamicQueryContinueResponse");
    private final static QName _GetModules_QNAME = new QName("http://ws.tririga.com", "getModules");
    private final static QName _GetModulesResponse_QNAME = new QName("http://ws.tririga.com", "getModulesResponse");
    private final static QName _GetContentLength_QNAME = new QName("http://ws.tririga.com", "getContentLength");
    private final static QName _GetContentLengthResponse_QNAME = new QName("http://ws.tririga.com", "getContentLengthResponse");
    private final static QName _RunNamedMetricQuery_QNAME = new QName("http://ws.tririga.com", "runNamedMetricQuery");
    private final static QName _RunNamedMetricQueryResponse_QNAME = new QName("http://ws.tririga.com", "runNamedMetricQueryResponse");
    private final static QName _GetGUIStateTransitions_QNAME = new QName("http://ws.tririga.com", "getGUIStateTransitions");
    private final static QName _GetGUIStateTransitionsResponse_QNAME = new QName("http://ws.tririga.com", "getGUIStateTransitionsResponse");
    private final static QName _RunNamedQueryMultiBo_QNAME = new QName("http://ws.tririga.com", "runNamedQueryMultiBo");
    private final static QName _RunNamedQueryMultiBoResponse_QNAME = new QName("http://ws.tririga.com", "runNamedQueryMultiBoResponse");
    private final static QName _RunNamedQuery_QNAME = new QName("http://ws.tririga.com", "runNamedQuery");
    private final static QName _RunNamedQueryResponse_QNAME = new QName("http://ws.tririga.com", "runNamedQueryResponse");
    private final static QName _RunNamedQueryMultiBoLocalized_QNAME = new QName("http://ws.tririga.com", "runNamedQueryMultiBoLocalized");
    private final static QName _RunNamedQueryMultiBoLocalizedResponse_QNAME = new QName("http://ws.tririga.com", "runNamedQueryMultiBoLocalizedResponse");
    private final static QName _GetDefaultGUI_QNAME = new QName("http://ws.tririga.com", "getDefaultGUI");
    private final static QName _GetDefaultGUIResponse_QNAME = new QName("http://ws.tririga.com", "getDefaultGUIResponse");
    private final static QName _DeleteCurrencyConversionRates_QNAME = new QName("http://ws.tririga.com", "deleteCurrencyConversionRates");
    private final static QName _DeleteCurrencyConversionRatesResponse_QNAME = new QName("http://ws.tririga.com", "deleteCurrencyConversionRatesResponse");
    private final static QName _GetApplicationInfo_QNAME = new QName("http://ws.tririga.com", "getApplicationInfo");
    private final static QName _GetApplicationInfoResponse_QNAME = new QName("http://ws.tririga.com", "getApplicationInfoResponse");
    private final static QName _GetRootRecordId_QNAME = new QName("http://ws.tririga.com", "getRootRecordId");
    private final static QName _GetRootRecordIdResponse_QNAME = new QName("http://ws.tririga.com", "getRootRecordIdResponse");
    private final static QName _GetChildren_QNAME = new QName("http://ws.tririga.com", "getChildren");
    private final static QName _GetChildrenResponse_QNAME = new QName("http://ws.tririga.com", "getChildrenResponse");
    private final static QName _DeassociateRecords_QNAME = new QName("http://ws.tririga.com", "deassociateRecords");
    private final static QName _DeassociateRecordsResponse_QNAME = new QName("http://ws.tririga.com", "deassociateRecordsResponse");
    private final static QName _RunNamedQueryContinue_QNAME = new QName("http://ws.tririga.com", "runNamedQueryContinue");
    private final static QName _RunNamedQueryContinueResponse_QNAME = new QName("http://ws.tririga.com", "runNamedQueryContinueResponse");
    private final static QName _GetHierarchyMetadata_QNAME = new QName("http://ws.tririga.com", "getHierarchyMetadata");
    private final static QName _GetHierarchyMetadataResponse_QNAME = new QName("http://ws.tririga.com", "getHierarchyMetadataResponse");
    private final static QName _GetUserLicenses_QNAME = new QName("http://ws.tririga.com", "getUserLicenses");
    private final static QName _GetUserLicensesResponse_QNAME = new QName("http://ws.tririga.com", "getUserLicensesResponse");
    private final static QName _GetDefaultGuiId_QNAME = new QName("http://ws.tririga.com", "getDefaultGuiId");
    private final static QName _GetDefaultGuiIdResponse_QNAME = new QName("http://ws.tririga.com", "getDefaultGuiIdResponse");
    private final static QName _Download_QNAME = new QName("http://ws.tririga.com", "download");
    private final static QName _DownloadResponse_QNAME = new QName("http://ws.tririga.com", "downloadResponse");
    private final static QName _GetChecksum_QNAME = new QName("http://ws.tririga.com", "getChecksum");
    private final static QName _GetChecksumResponse_QNAME = new QName("http://ws.tririga.com", "getChecksumResponse");
    private final static QName _GetHierarchyMetadataByModuleName_QNAME = new QName("http://ws.tririga.com", "getHierarchyMetadataByModuleName");
    private final static QName _GetHierarchyMetadataByModuleNameResponse_QNAME = new QName("http://ws.tririga.com", "getHierarchyMetadataByModuleNameResponse");
    private final static QName _PutCurrencyConversionRates_QNAME = new QName("http://ws.tririga.com", "putCurrencyConversionRates");
    private final static QName _PutCurrencyConversionRatesResponse_QNAME = new QName("http://ws.tririga.com", "putCurrencyConversionRatesResponse");
    private final static QName _GetAssociationDefinitions_QNAME = new QName("http://ws.tririga.com", "getAssociationDefinitions");
    private final static QName _GetAssociationDefinitionsResponse_QNAME = new QName("http://ws.tririga.com", "getAssociationDefinitionsResponse");
    private final static QName _GetRecordDataHeaders_QNAME = new QName("http://ws.tririga.com", "getRecordDataHeaders");
    private final static QName _GetRecordDataHeadersResponse_QNAME = new QName("http://ws.tririga.com", "getRecordDataHeadersResponse");
    private final static QName _GetObjectTypeActions_QNAME = new QName("http://ws.tririga.com", "getObjectTypeActions");
    private final static QName _GetObjectTypeActionsResponse_QNAME = new QName("http://ws.tririga.com", "getObjectTypeActionsResponse");
    private final static QName _GetObjectTypeId_QNAME = new QName("http://ws.tririga.com", "getObjectTypeId");
    private final static QName _GetObjectTypeIdResponse_QNAME = new QName("http://ws.tririga.com", "getObjectTypeIdResponse");
    private final static QName _GetRequiredGuiFieldNames_QNAME = new QName("http://ws.tririga.com", "getRequiredGuiFieldNames");
    private final static QName _GetRequiredGuiFieldNamesResponse_QNAME = new QName("http://ws.tririga.com", "getRequiredGuiFieldNamesResponse");
    private final static QName _GetDefaultGUIActions_QNAME = new QName("http://ws.tririga.com", "getDefaultGUIActions");
    private final static QName _GetDefaultGUIActionsResponse_QNAME = new QName("http://ws.tririga.com", "getDefaultGUIActionsResponse");
    private final static QName _GetHierarchyMetadataByModuleId_QNAME = new QName("http://ws.tririga.com", "getHierarchyMetadataByModuleId");
    private final static QName _GetHierarchyMetadataByModuleIdResponse_QNAME = new QName("http://ws.tririga.com", "getHierarchyMetadataByModuleIdResponse");
    private final static QName _Delete_QNAME = new QName("http://ws.tririga.com", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://ws.tririga.com", "deleteResponse");
    private final static QName _GetCurrencies_QNAME = new QName("http://ws.tririga.com", "getCurrencies");
    private final static QName _GetCurrenciesResponse_QNAME = new QName("http://ws.tririga.com", "getCurrenciesResponse");
    private final static QName _GetObjectTypeListByModuleName_QNAME = new QName("http://ws.tririga.com", "getObjectTypeListByModuleName");
    private final static QName _GetObjectTypeListByModuleNameResponse_QNAME = new QName("http://ws.tririga.com", "getObjectTypeListByModuleNameResponse");
    private final static QName _DownloadTo_QNAME = new QName("http://ws.tririga.com", "downloadTo");
    private final static QName _DownloadToResponse_QNAME = new QName("http://ws.tririga.com", "downloadToResponse");
    private final static QName _SaveRecord_QNAME = new QName("http://ws.tririga.com", "saveRecord");
    private final static QName _SaveRecordResponse_QNAME = new QName("http://ws.tririga.com", "saveRecordResponse");
    private final static QName _GetDefaultGUIStructure_QNAME = new QName("http://ws.tririga.com", "getDefaultGUIStructure");
    private final static QName _GetDefaultGUIStructureResponse_QNAME = new QName("http://ws.tririga.com", "getDefaultGUIStructureResponse");
    private final static QName _GetGUIsByName_QNAME = new QName("http://ws.tririga.com", "getGUIsByName");
    private final static QName _GetGUIsByNameResponse_QNAME = new QName("http://ws.tririga.com", "getGUIsByNameResponse");
    private final static QName _GetAvailableActions_QNAME = new QName("http://ws.tririga.com", "getAvailableActions");
    private final static QName _GetAvailableActionsResponse_QNAME = new QName("http://ws.tririga.com", "getAvailableActionsResponse");
    private final static QName _GetProjects_QNAME = new QName("http://ws.tririga.com", "getProjects");
    private final static QName _GetProjectsResponse_QNAME = new QName("http://ws.tririga.com", "getProjectsResponse");
    private final static QName _TerminateSession_QNAME = new QName("http://ws.tririga.com", "terminateSession");
    private final static QName _TerminateSessionResponse_QNAME = new QName("http://ws.tririga.com", "terminateSessionResponse");
    private final static QName _GetCurrencyConversionGroups_QNAME = new QName("http://ws.tririga.com", "getCurrencyConversionGroups");
    private final static QName _GetCurrencyConversionGroupsResponse_QNAME = new QName("http://ws.tririga.com", "getCurrencyConversionGroupsResponse");
    private final static QName _AssociateRecords_QNAME = new QName("http://ws.tririga.com", "associateRecords");
    private final static QName _AssociateRecordsResponse_QNAME = new QName("http://ws.tririga.com", "associateRecordsResponse");
    private final static QName _RunNamedMetricQueryContinue_QNAME = new QName("http://ws.tririga.com", "runNamedMetricQueryContinue");
    private final static QName _RunNamedMetricQueryContinueResponse_QNAME = new QName("http://ws.tririga.com", "runNamedMetricQueryContinueResponse");
    private final static QName _GetListItems_QNAME = new QName("http://ws.tririga.com", "getListItems");
    private final static QName _GetListItemsResponse_QNAME = new QName("http://ws.tririga.com", "getListItemsResponse");
    private final static QName _Copy_QNAME = new QName("http://ws.tririga.com", "copy");
    private final static QName _CopyResponse_QNAME = new QName("http://ws.tririga.com", "copyResponse");
    private final static QName _GetListByTypes_QNAME = new QName("http://ws.tririga.com", "getListByTypes");
    private final static QName _GetListByTypesResponse_QNAME = new QName("http://ws.tririga.com", "getListByTypesResponse");
    private final static QName _GetProjectId_QNAME = new QName("http://ws.tririga.com", "getProjectId");
    private final static QName _GetProjectIdResponse_QNAME = new QName("http://ws.tririga.com", "getProjectIdResponse");
    private final static QName _GetContentFieldsDefinition_QNAME = new QName("http://ws.tririga.com", "getContentFieldsDefinition");
    private final static QName _GetContentFieldsDefinitionResponse_QNAME = new QName("http://ws.tririga.com", "getContentFieldsDefinitionResponse");
    private final static QName _GetAssociatedRecords_QNAME = new QName("http://ws.tririga.com", "getAssociatedRecords");
    private final static QName _GetAssociatedRecordsResponse_QNAME = new QName("http://ws.tririga.com", "getAssociatedRecordsResponse");
    private final static QName _AcceptActionItems_QNAME = new QName("http://ws.tririga.com", "acceptActionItems");
    private final static QName _AcceptActionItemsResponse_QNAME = new QName("http://ws.tririga.com", "acceptActionItemsResponse");
    private final static QName _GetObjectTypeByName_QNAME = new QName("http://ws.tririga.com", "getObjectTypeByName");
    private final static QName _GetObjectTypeByNameResponse_QNAME = new QName("http://ws.tririga.com", "getObjectTypeByNameResponse");
    private final static QName _RunDynamicQuery_QNAME = new QName("http://ws.tririga.com", "runDynamicQuery");
    private final static QName _RunDynamicQueryResponse_QNAME = new QName("http://ws.tririga.com", "runDynamicQueryResponse");
    private final static QName _GetTargetRecords_QNAME = new QName("http://ws.tririga.com", "getTargetRecords");
    private final static QName _GetTargetRecordsResponse_QNAME = new QName("http://ws.tririga.com", "getTargetRecordsResponse");
    private final static QName _GetGUI_QNAME = new QName("http://ws.tririga.com", "getGUI");
    private final static QName _GetGUIResponse_QNAME = new QName("http://ws.tririga.com", "getGUIResponse");
    private final static QName _TriggerActions_QNAME = new QName("http://ws.tririga.com", "triggerActions");
    private final static QName _TriggerActionsResponse_QNAME = new QName("http://ws.tririga.com", "triggerActionsResponse");
    private final static QName _GetObjectType_QNAME = new QName("http://ws.tririga.com", "getObjectType");
    private final static QName _GetObjectTypeResponse_QNAME = new QName("http://ws.tririga.com", "getObjectTypeResponse");
    private final static QName _GetHttpSession_QNAME = new QName("http://ws.tririga.com", "getHttpSession");
    private final static QName _GetHttpSessionResponse_QNAME = new QName("http://ws.tririga.com", "getHttpSessionResponse");
    private final static QName _GetObjectTypeListByModuleId_QNAME = new QName("http://ws.tririga.com", "getObjectTypeListByModuleId");
    private final static QName _GetObjectTypeListByModuleIdResponse_QNAME = new QName("http://ws.tririga.com", "getObjectTypeListByModuleIdResponse");
    private final static QName _Upload_QNAME = new QName("http://ws.tririga.com", "upload");
    private final static QName _UploadResponse_QNAME = new QName("http://ws.tririga.com", "uploadResponse");
    private final static QName _Exception_QNAME = new QName("http://ws.tririga.com", "Exception");
    private final static QName _ModuleDoesNotExistException_QNAME = new QName("http://ws.tririga.com", "ModuleDoesNotExistException");
    private final static QName _QueryDoesNotExistException_QNAME = new QName("http://ws.tririga.com", "QueryDoesNotExistException");
    private final static QName _ObjectTypeDoesNotExistException_QNAME = new QName("http://ws.tririga.com", "ObjectTypeDoesNotExistException");
    private final static QName _InvalidArgumentException_QNAME = new QName("http://ws.tririga.com", "InvalidArgumentException");
    private final static QName _ProjectDoesNotExistException_QNAME = new QName("http://ws.tririga.com", "ProjectDoesNotExistException");
    private final static QName _InvalidContinuationTokenException_QNAME = new QName("http://ws.tririga.com", "InvalidContinuationTokenException");
    private final static QName _RecordDoesNotExistException_QNAME = new QName("http://ws.tririga.com", "RecordDoesNotExistException");
    private final static QName _InvalidDocumentTypeException_QNAME = new QName("http://ws.tririga.com", "InvalidDocumentTypeException");
    private final static QName _AccessException_QNAME = new QName("http://ws.tririga.com", "AccessException");
    private final static QName _InvalidContentException_QNAME = new QName("http://ws.tririga.com", "InvalidContentException");
    private final static QName _GuiDoesNotExistException_QNAME = new QName("http://ws.tririga.com", "GuiDoesNotExistException");
    private final static QName _ListDoesNotExistException_QNAME = new QName("http://ws.tririga.com", "ListDoesNotExistException");
    private final static QName _ActionItemInvalidException_QNAME = new QName("http://ws.tririga.com", "ActionItemInvalidException");
    private final static QName _ActionDoesNotExistException_QNAME = new QName("http://ws.tririga.com", "ActionDoesNotExistException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tririga.ws
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCurrencyConversionRates }
     */
    public GetCurrencyConversionRates createGetCurrencyConversionRates() {
        return new GetCurrencyConversionRates();
    }

    /**
     * Create an instance of {@link GetCurrencyConversionRatesResponse }
     */
    public GetCurrencyConversionRatesResponse createGetCurrencyConversionRatesResponse() {
        return new GetCurrencyConversionRatesResponse();
    }

    /**
     * Create an instance of {@link GetActionItems }
     */
    public GetActionItems createGetActionItems() {
        return new GetActionItems();
    }

    /**
     * Create an instance of {@link GetActionItemsResponse }
     */
    public GetActionItemsResponse createGetActionItemsResponse() {
        return new GetActionItemsResponse();
    }

    /**
     * Create an instance of {@link GetNamedQueryType }
     */
    public GetNamedQueryType createGetNamedQueryType() {
        return new GetNamedQueryType();
    }

    /**
     * Create an instance of {@link GetNamedQueryTypeResponse }
     */
    public GetNamedQueryTypeResponse createGetNamedQueryTypeResponse() {
        return new GetNamedQueryTypeResponse();
    }

    /**
     * Create an instance of {@link UploadFrom }
     */
    public UploadFrom createUploadFrom() {
        return new UploadFrom();
    }

    /**
     * Create an instance of {@link UploadFromResponse }
     */
    public UploadFromResponse createUploadFromResponse() {
        return new UploadFromResponse();
    }

    /**
     * Create an instance of {@link Register }
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link GetAssociationDefinitionsByName }
     */
    public GetAssociationDefinitionsByName createGetAssociationDefinitionsByName() {
        return new GetAssociationDefinitionsByName();
    }

    /**
     * Create an instance of {@link GetAssociationDefinitionsByNameResponse }
     */
    public GetAssociationDefinitionsByNameResponse createGetAssociationDefinitionsByNameResponse() {
        return new GetAssociationDefinitionsByNameResponse();
    }

    /**
     * Create an instance of {@link KeywordSearch }
     */
    public KeywordSearch createKeywordSearch() {
        return new KeywordSearch();
    }

    /**
     * Create an instance of {@link KeywordSearchResponse }
     */
    public KeywordSearchResponse createKeywordSearchResponse() {
        return new KeywordSearchResponse();
    }

    /**
     * Create an instance of {@link GetGUIs }
     */
    public GetGUIs createGetGUIs() {
        return new GetGUIs();
    }

    /**
     * Create an instance of {@link GetGUIsResponse }
     */
    public GetGUIsResponse createGetGUIsResponse() {
        return new GetGUIsResponse();
    }

    /**
     * Create an instance of {@link GetModuleId }
     */
    public GetModuleId createGetModuleId() {
        return new GetModuleId();
    }

    /**
     * Create an instance of {@link GetModuleIdResponse }
     */
    public GetModuleIdResponse createGetModuleIdResponse() {
        return new GetModuleIdResponse();
    }

    /**
     * Create an instance of {@link RunNamedQueryMultiBoContinue }
     */
    public RunNamedQueryMultiBoContinue createRunNamedQueryMultiBoContinue() {
        return new RunNamedQueryMultiBoContinue();
    }

    /**
     * Create an instance of {@link RunNamedQueryMultiBoContinueResponse }
     */
    public RunNamedQueryMultiBoContinueResponse createRunNamedQueryMultiBoContinueResponse() {
        return new RunNamedQueryMultiBoContinueResponse();
    }

    /**
     * Create an instance of {@link GetAllAssociatedRecords }
     */
    public GetAllAssociatedRecords createGetAllAssociatedRecords() {
        return new GetAllAssociatedRecords();
    }

    /**
     * Create an instance of {@link GetAllAssociatedRecordsResponse }
     */
    public GetAllAssociatedRecordsResponse createGetAllAssociatedRecordsResponse() {
        return new GetAllAssociatedRecordsResponse();
    }

    /**
     * Create an instance of {@link GetRecordState }
     */
    public GetRecordState createGetRecordState() {
        return new GetRecordState();
    }

    /**
     * Create an instance of {@link GetRecordStateResponse }
     */
    public GetRecordStateResponse createGetRecordStateResponse() {
        return new GetRecordStateResponse();
    }

    /**
     * Create an instance of {@link RunDynamicQueryContinue }
     */
    public RunDynamicQueryContinue createRunDynamicQueryContinue() {
        return new RunDynamicQueryContinue();
    }

    /**
     * Create an instance of {@link RunDynamicQueryContinueResponse }
     */
    public RunDynamicQueryContinueResponse createRunDynamicQueryContinueResponse() {
        return new RunDynamicQueryContinueResponse();
    }

    /**
     * Create an instance of {@link GetModules }
     */
    public GetModules createGetModules() {
        return new GetModules();
    }

    /**
     * Create an instance of {@link GetModulesResponse }
     */
    public GetModulesResponse createGetModulesResponse() {
        return new GetModulesResponse();
    }

    /**
     * Create an instance of {@link GetContentLength }
     */
    public GetContentLength createGetContentLength() {
        return new GetContentLength();
    }

    /**
     * Create an instance of {@link GetContentLengthResponse }
     */
    public GetContentLengthResponse createGetContentLengthResponse() {
        return new GetContentLengthResponse();
    }

    /**
     * Create an instance of {@link RunNamedMetricQuery }
     */
    public RunNamedMetricQuery createRunNamedMetricQuery() {
        return new RunNamedMetricQuery();
    }

    /**
     * Create an instance of {@link RunNamedMetricQueryResponse }
     */
    public RunNamedMetricQueryResponse createRunNamedMetricQueryResponse() {
        return new RunNamedMetricQueryResponse();
    }

    /**
     * Create an instance of {@link GetGUIStateTransitions }
     */
    public GetGUIStateTransitions createGetGUIStateTransitions() {
        return new GetGUIStateTransitions();
    }

    /**
     * Create an instance of {@link GetGUIStateTransitionsResponse }
     */
    public GetGUIStateTransitionsResponse createGetGUIStateTransitionsResponse() {
        return new GetGUIStateTransitionsResponse();
    }

    /**
     * Create an instance of {@link RunNamedQueryMultiBo }
     */
    public RunNamedQueryMultiBo createRunNamedQueryMultiBo() {
        return new RunNamedQueryMultiBo();
    }

    /**
     * Create an instance of {@link RunNamedQueryMultiBoResponse }
     */
    public RunNamedQueryMultiBoResponse createRunNamedQueryMultiBoResponse() {
        return new RunNamedQueryMultiBoResponse();
    }

    /**
     * Create an instance of {@link RunNamedQuery }
     */
    public RunNamedQuery createRunNamedQuery() {
        return new RunNamedQuery();
    }

    /**
     * Create an instance of {@link RunNamedQueryResponse }
     */
    public RunNamedQueryResponse createRunNamedQueryResponse() {
        return new RunNamedQueryResponse();
    }

    /**
     * Create an instance of {@link RunNamedQueryMultiBoLocalized }
     */
    public RunNamedQueryMultiBoLocalized createRunNamedQueryMultiBoLocalized() {
        return new RunNamedQueryMultiBoLocalized();
    }

    /**
     * Create an instance of {@link RunNamedQueryMultiBoLocalizedResponse }
     */
    public RunNamedQueryMultiBoLocalizedResponse createRunNamedQueryMultiBoLocalizedResponse() {
        return new RunNamedQueryMultiBoLocalizedResponse();
    }

    /**
     * Create an instance of {@link GetDefaultGUI }
     */
    public GetDefaultGUI createGetDefaultGUI() {
        return new GetDefaultGUI();
    }

    /**
     * Create an instance of {@link GetDefaultGUIResponse }
     */
    public GetDefaultGUIResponse createGetDefaultGUIResponse() {
        return new GetDefaultGUIResponse();
    }

    /**
     * Create an instance of {@link DeleteCurrencyConversionRates }
     */
    public DeleteCurrencyConversionRates createDeleteCurrencyConversionRates() {
        return new DeleteCurrencyConversionRates();
    }

    /**
     * Create an instance of {@link DeleteCurrencyConversionRatesResponse }
     */
    public DeleteCurrencyConversionRatesResponse createDeleteCurrencyConversionRatesResponse() {
        return new DeleteCurrencyConversionRatesResponse();
    }

    /**
     * Create an instance of {@link GetApplicationInfo }
     */
    public GetApplicationInfo createGetApplicationInfo() {
        return new GetApplicationInfo();
    }

    /**
     * Create an instance of {@link GetApplicationInfoResponse }
     */
    public GetApplicationInfoResponse createGetApplicationInfoResponse() {
        return new GetApplicationInfoResponse();
    }

    /**
     * Create an instance of {@link GetRootRecordId }
     */
    public GetRootRecordId createGetRootRecordId() {
        return new GetRootRecordId();
    }

    /**
     * Create an instance of {@link GetRootRecordIdResponse }
     */
    public GetRootRecordIdResponse createGetRootRecordIdResponse() {
        return new GetRootRecordIdResponse();
    }

    /**
     * Create an instance of {@link GetChildren }
     */
    public GetChildren createGetChildren() {
        return new GetChildren();
    }

    /**
     * Create an instance of {@link GetChildrenResponse }
     */
    public GetChildrenResponse createGetChildrenResponse() {
        return new GetChildrenResponse();
    }

    /**
     * Create an instance of {@link DeassociateRecords }
     */
    public DeassociateRecords createDeassociateRecords() {
        return new DeassociateRecords();
    }

    /**
     * Create an instance of {@link DeassociateRecordsResponse }
     */
    public DeassociateRecordsResponse createDeassociateRecordsResponse() {
        return new DeassociateRecordsResponse();
    }

    /**
     * Create an instance of {@link RunNamedQueryContinue }
     */
    public RunNamedQueryContinue createRunNamedQueryContinue() {
        return new RunNamedQueryContinue();
    }

    /**
     * Create an instance of {@link RunNamedQueryContinueResponse }
     */
    public RunNamedQueryContinueResponse createRunNamedQueryContinueResponse() {
        return new RunNamedQueryContinueResponse();
    }

    /**
     * Create an instance of {@link GetHierarchyMetadata }
     */
    public GetHierarchyMetadata createGetHierarchyMetadata() {
        return new GetHierarchyMetadata();
    }

    /**
     * Create an instance of {@link GetHierarchyMetadataResponse }
     */
    public GetHierarchyMetadataResponse createGetHierarchyMetadataResponse() {
        return new GetHierarchyMetadataResponse();
    }

    /**
     * Create an instance of {@link GetUserLicenses }
     */
    public GetUserLicenses createGetUserLicenses() {
        return new GetUserLicenses();
    }

    /**
     * Create an instance of {@link GetUserLicensesResponse }
     */
    public GetUserLicensesResponse createGetUserLicensesResponse() {
        return new GetUserLicensesResponse();
    }

    /**
     * Create an instance of {@link GetDefaultGuiId }
     */
    public GetDefaultGuiId createGetDefaultGuiId() {
        return new GetDefaultGuiId();
    }

    /**
     * Create an instance of {@link GetDefaultGuiIdResponse }
     */
    public GetDefaultGuiIdResponse createGetDefaultGuiIdResponse() {
        return new GetDefaultGuiIdResponse();
    }

    /**
     * Create an instance of {@link Download }
     */
    public Download createDownload() {
        return new Download();
    }

    /**
     * Create an instance of {@link DownloadResponse }
     */
    public DownloadResponse createDownloadResponse() {
        return new DownloadResponse();
    }

    /**
     * Create an instance of {@link GetChecksum }
     */
    public GetChecksum createGetChecksum() {
        return new GetChecksum();
    }

    /**
     * Create an instance of {@link GetChecksumResponse }
     */
    public GetChecksumResponse createGetChecksumResponse() {
        return new GetChecksumResponse();
    }

    /**
     * Create an instance of {@link GetHierarchyMetadataByModuleName }
     */
    public GetHierarchyMetadataByModuleName createGetHierarchyMetadataByModuleName() {
        return new GetHierarchyMetadataByModuleName();
    }

    /**
     * Create an instance of {@link GetHierarchyMetadataByModuleNameResponse }
     */
    public GetHierarchyMetadataByModuleNameResponse createGetHierarchyMetadataByModuleNameResponse() {
        return new GetHierarchyMetadataByModuleNameResponse();
    }

    /**
     * Create an instance of {@link PutCurrencyConversionRates }
     */
    public PutCurrencyConversionRates createPutCurrencyConversionRates() {
        return new PutCurrencyConversionRates();
    }

    /**
     * Create an instance of {@link PutCurrencyConversionRatesResponse }
     */
    public PutCurrencyConversionRatesResponse createPutCurrencyConversionRatesResponse() {
        return new PutCurrencyConversionRatesResponse();
    }

    /**
     * Create an instance of {@link GetAssociationDefinitions }
     */
    public GetAssociationDefinitions createGetAssociationDefinitions() {
        return new GetAssociationDefinitions();
    }

    /**
     * Create an instance of {@link GetAssociationDefinitionsResponse }
     */
    public GetAssociationDefinitionsResponse createGetAssociationDefinitionsResponse() {
        return new GetAssociationDefinitionsResponse();
    }

    /**
     * Create an instance of {@link GetRecordDataHeaders }
     */
    public GetRecordDataHeaders createGetRecordDataHeaders() {
        return new GetRecordDataHeaders();
    }

    /**
     * Create an instance of {@link GetRecordDataHeadersResponse }
     */
    public GetRecordDataHeadersResponse createGetRecordDataHeadersResponse() {
        return new GetRecordDataHeadersResponse();
    }

    /**
     * Create an instance of {@link GetObjectTypeActions }
     */
    public GetObjectTypeActions createGetObjectTypeActions() {
        return new GetObjectTypeActions();
    }

    /**
     * Create an instance of {@link GetObjectTypeActionsResponse }
     */
    public GetObjectTypeActionsResponse createGetObjectTypeActionsResponse() {
        return new GetObjectTypeActionsResponse();
    }

    /**
     * Create an instance of {@link GetObjectTypeId }
     */
    public GetObjectTypeId createGetObjectTypeId() {
        return new GetObjectTypeId();
    }

    /**
     * Create an instance of {@link GetObjectTypeIdResponse }
     */
    public GetObjectTypeIdResponse createGetObjectTypeIdResponse() {
        return new GetObjectTypeIdResponse();
    }

    /**
     * Create an instance of {@link GetRequiredGuiFieldNames }
     */
    public GetRequiredGuiFieldNames createGetRequiredGuiFieldNames() {
        return new GetRequiredGuiFieldNames();
    }

    /**
     * Create an instance of {@link GetRequiredGuiFieldNamesResponse }
     */
    public GetRequiredGuiFieldNamesResponse createGetRequiredGuiFieldNamesResponse() {
        return new GetRequiredGuiFieldNamesResponse();
    }

    /**
     * Create an instance of {@link GetDefaultGUIActions }
     */
    public GetDefaultGUIActions createGetDefaultGUIActions() {
        return new GetDefaultGUIActions();
    }

    /**
     * Create an instance of {@link GetDefaultGUIActionsResponse }
     */
    public GetDefaultGUIActionsResponse createGetDefaultGUIActionsResponse() {
        return new GetDefaultGUIActionsResponse();
    }

    /**
     * Create an instance of {@link GetHierarchyMetadataByModuleId }
     */
    public GetHierarchyMetadataByModuleId createGetHierarchyMetadataByModuleId() {
        return new GetHierarchyMetadataByModuleId();
    }

    /**
     * Create an instance of {@link GetHierarchyMetadataByModuleIdResponse }
     */
    public GetHierarchyMetadataByModuleIdResponse createGetHierarchyMetadataByModuleIdResponse() {
        return new GetHierarchyMetadataByModuleIdResponse();
    }

    /**
     * Create an instance of {@link Delete }
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link GetCurrencies }
     */
    public GetCurrencies createGetCurrencies() {
        return new GetCurrencies();
    }

    /**
     * Create an instance of {@link GetCurrenciesResponse }
     */
    public GetCurrenciesResponse createGetCurrenciesResponse() {
        return new GetCurrenciesResponse();
    }

    /**
     * Create an instance of {@link GetObjectTypeListByModuleName }
     */
    public GetObjectTypeListByModuleName createGetObjectTypeListByModuleName() {
        return new GetObjectTypeListByModuleName();
    }

    /**
     * Create an instance of {@link GetObjectTypeListByModuleNameResponse }
     */
    public GetObjectTypeListByModuleNameResponse createGetObjectTypeListByModuleNameResponse() {
        return new GetObjectTypeListByModuleNameResponse();
    }

    /**
     * Create an instance of {@link DownloadTo }
     */
    public DownloadTo createDownloadTo() {
        return new DownloadTo();
    }

    /**
     * Create an instance of {@link DownloadToResponse }
     */
    public DownloadToResponse createDownloadToResponse() {
        return new DownloadToResponse();
    }

    /**
     * Create an instance of {@link SaveRecord }
     */
    public SaveRecord createSaveRecord() {
        return new SaveRecord();
    }

    /**
     * Create an instance of {@link SaveRecordResponse }
     */
    public SaveRecordResponse createSaveRecordResponse() {
        return new SaveRecordResponse();
    }

    /**
     * Create an instance of {@link GetDefaultGUIStructure }
     */
    public GetDefaultGUIStructure createGetDefaultGUIStructure() {
        return new GetDefaultGUIStructure();
    }

    /**
     * Create an instance of {@link GetDefaultGUIStructureResponse }
     */
    public GetDefaultGUIStructureResponse createGetDefaultGUIStructureResponse() {
        return new GetDefaultGUIStructureResponse();
    }

    /**
     * Create an instance of {@link GetGUIsByName }
     */
    public GetGUIsByName createGetGUIsByName() {
        return new GetGUIsByName();
    }

    /**
     * Create an instance of {@link GetGUIsByNameResponse }
     */
    public GetGUIsByNameResponse createGetGUIsByNameResponse() {
        return new GetGUIsByNameResponse();
    }

    /**
     * Create an instance of {@link GetAvailableActions }
     */
    public GetAvailableActions createGetAvailableActions() {
        return new GetAvailableActions();
    }

    /**
     * Create an instance of {@link GetAvailableActionsResponse }
     */
    public GetAvailableActionsResponse createGetAvailableActionsResponse() {
        return new GetAvailableActionsResponse();
    }

    /**
     * Create an instance of {@link GetProjects }
     */
    public GetProjects createGetProjects() {
        return new GetProjects();
    }

    /**
     * Create an instance of {@link GetProjectsResponse }
     */
    public GetProjectsResponse createGetProjectsResponse() {
        return new GetProjectsResponse();
    }

    /**
     * Create an instance of {@link TerminateSession }
     */
    public TerminateSession createTerminateSession() {
        return new TerminateSession();
    }

    /**
     * Create an instance of {@link TerminateSessionResponse }
     */
    public TerminateSessionResponse createTerminateSessionResponse() {
        return new TerminateSessionResponse();
    }

    /**
     * Create an instance of {@link GetCurrencyConversionGroups }
     */
    public GetCurrencyConversionGroups createGetCurrencyConversionGroups() {
        return new GetCurrencyConversionGroups();
    }

    /**
     * Create an instance of {@link GetCurrencyConversionGroupsResponse }
     */
    public GetCurrencyConversionGroupsResponse createGetCurrencyConversionGroupsResponse() {
        return new GetCurrencyConversionGroupsResponse();
    }

    /**
     * Create an instance of {@link AssociateRecords }
     */
    public AssociateRecords createAssociateRecords() {
        return new AssociateRecords();
    }

    /**
     * Create an instance of {@link AssociateRecordsResponse }
     */
    public AssociateRecordsResponse createAssociateRecordsResponse() {
        return new AssociateRecordsResponse();
    }

    /**
     * Create an instance of {@link RunNamedMetricQueryContinue }
     */
    public RunNamedMetricQueryContinue createRunNamedMetricQueryContinue() {
        return new RunNamedMetricQueryContinue();
    }

    /**
     * Create an instance of {@link RunNamedMetricQueryContinueResponse }
     */
    public RunNamedMetricQueryContinueResponse createRunNamedMetricQueryContinueResponse() {
        return new RunNamedMetricQueryContinueResponse();
    }

    /**
     * Create an instance of {@link GetListItems }
     */
    public GetListItems createGetListItems() {
        return new GetListItems();
    }

    /**
     * Create an instance of {@link GetListItemsResponse }
     */
    public GetListItemsResponse createGetListItemsResponse() {
        return new GetListItemsResponse();
    }

    /**
     * Create an instance of {@link Copy }
     */
    public Copy createCopy() {
        return new Copy();
    }

    /**
     * Create an instance of {@link CopyResponse }
     */
    public CopyResponse createCopyResponse() {
        return new CopyResponse();
    }

    /**
     * Create an instance of {@link GetListByTypes }
     */
    public GetListByTypes createGetListByTypes() {
        return new GetListByTypes();
    }

    /**
     * Create an instance of {@link GetListByTypesResponse }
     */
    public GetListByTypesResponse createGetListByTypesResponse() {
        return new GetListByTypesResponse();
    }

    /**
     * Create an instance of {@link GetProjectId }
     */
    public GetProjectId createGetProjectId() {
        return new GetProjectId();
    }

    /**
     * Create an instance of {@link GetProjectIdResponse }
     */
    public GetProjectIdResponse createGetProjectIdResponse() {
        return new GetProjectIdResponse();
    }

    /**
     * Create an instance of {@link GetContentFieldsDefinition }
     */
    public GetContentFieldsDefinition createGetContentFieldsDefinition() {
        return new GetContentFieldsDefinition();
    }

    /**
     * Create an instance of {@link GetContentFieldsDefinitionResponse }
     */
    public GetContentFieldsDefinitionResponse createGetContentFieldsDefinitionResponse() {
        return new GetContentFieldsDefinitionResponse();
    }

    /**
     * Create an instance of {@link GetAssociatedRecords }
     */
    public GetAssociatedRecords createGetAssociatedRecords() {
        return new GetAssociatedRecords();
    }

    /**
     * Create an instance of {@link GetAssociatedRecordsResponse }
     */
    public GetAssociatedRecordsResponse createGetAssociatedRecordsResponse() {
        return new GetAssociatedRecordsResponse();
    }

    /**
     * Create an instance of {@link AcceptActionItems }
     */
    public AcceptActionItems createAcceptActionItems() {
        return new AcceptActionItems();
    }

    /**
     * Create an instance of {@link AcceptActionItemsResponse }
     */
    public AcceptActionItemsResponse createAcceptActionItemsResponse() {
        return new AcceptActionItemsResponse();
    }

    /**
     * Create an instance of {@link GetObjectTypeByName }
     */
    public GetObjectTypeByName createGetObjectTypeByName() {
        return new GetObjectTypeByName();
    }

    /**
     * Create an instance of {@link GetObjectTypeByNameResponse }
     */
    public GetObjectTypeByNameResponse createGetObjectTypeByNameResponse() {
        return new GetObjectTypeByNameResponse();
    }

    /**
     * Create an instance of {@link RunDynamicQuery }
     */
    public RunDynamicQuery createRunDynamicQuery() {
        return new RunDynamicQuery();
    }

    /**
     * Create an instance of {@link RunDynamicQueryResponse }
     */
    public RunDynamicQueryResponse createRunDynamicQueryResponse() {
        return new RunDynamicQueryResponse();
    }

    /**
     * Create an instance of {@link GetTargetRecords }
     */
    public GetTargetRecords createGetTargetRecords() {
        return new GetTargetRecords();
    }

    /**
     * Create an instance of {@link GetTargetRecordsResponse }
     */
    public GetTargetRecordsResponse createGetTargetRecordsResponse() {
        return new GetTargetRecordsResponse();
    }

    /**
     * Create an instance of {@link GetGUI }
     */
    public GetGUI createGetGUI() {
        return new GetGUI();
    }

    /**
     * Create an instance of {@link GetGUIResponse }
     */
    public GetGUIResponse createGetGUIResponse() {
        return new GetGUIResponse();
    }

    /**
     * Create an instance of {@link TriggerActions }
     */
    public TriggerActions createTriggerActions() {
        return new TriggerActions();
    }

    /**
     * Create an instance of {@link TriggerActionsResponse }
     */
    public TriggerActionsResponse createTriggerActionsResponse() {
        return new TriggerActionsResponse();
    }

    /**
     * Create an instance of {@link GetObjectType }
     */
    public GetObjectType createGetObjectType() {
        return new GetObjectType();
    }

    /**
     * Create an instance of {@link GetObjectTypeResponse }
     */
    public GetObjectTypeResponse createGetObjectTypeResponse() {
        return new GetObjectTypeResponse();
    }

    /**
     * Create an instance of {@link GetHttpSession }
     */
    public GetHttpSession createGetHttpSession() {
        return new GetHttpSession();
    }

    /**
     * Create an instance of {@link GetHttpSessionResponse }
     */
    public GetHttpSessionResponse createGetHttpSessionResponse() {
        return new GetHttpSessionResponse();
    }

    /**
     * Create an instance of {@link GetObjectTypeListByModuleId }
     */
    public GetObjectTypeListByModuleId createGetObjectTypeListByModuleId() {
        return new GetObjectTypeListByModuleId();
    }

    /**
     * Create an instance of {@link GetObjectTypeListByModuleIdResponse }
     */
    public GetObjectTypeListByModuleIdResponse createGetObjectTypeListByModuleIdResponse() {
        return new GetObjectTypeListByModuleIdResponse();
    }

    /**
     * Create an instance of {@link Upload }
     */
    public Upload createUpload() {
        return new Upload();
    }

    /**
     * Create an instance of {@link UploadResponse }
     */
    public UploadResponse createUploadResponse() {
        return new UploadResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyConversionRates }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetCurrencyConversionRates }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getCurrencyConversionRates")
    public JAXBElement<GetCurrencyConversionRates> createGetCurrencyConversionRates(GetCurrencyConversionRates value) {
        return new JAXBElement<GetCurrencyConversionRates>(_GetCurrencyConversionRates_QNAME, GetCurrencyConversionRates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyConversionRatesResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetCurrencyConversionRatesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getCurrencyConversionRatesResponse")
    public JAXBElement<GetCurrencyConversionRatesResponse> createGetCurrencyConversionRatesResponse(GetCurrencyConversionRatesResponse value) {
        return new JAXBElement<GetCurrencyConversionRatesResponse>(_GetCurrencyConversionRatesResponse_QNAME, GetCurrencyConversionRatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActionItems }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetActionItems }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getActionItems")
    public JAXBElement<GetActionItems> createGetActionItems(GetActionItems value) {
        return new JAXBElement<GetActionItems>(_GetActionItems_QNAME, GetActionItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActionItemsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetActionItemsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getActionItemsResponse")
    public JAXBElement<GetActionItemsResponse> createGetActionItemsResponse(GetActionItemsResponse value) {
        return new JAXBElement<GetActionItemsResponse>(_GetActionItemsResponse_QNAME, GetActionItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNamedQueryType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetNamedQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getNamedQueryType")
    public JAXBElement<GetNamedQueryType> createGetNamedQueryType(GetNamedQueryType value) {
        return new JAXBElement<GetNamedQueryType>(_GetNamedQueryType_QNAME, GetNamedQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNamedQueryTypeResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetNamedQueryTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getNamedQueryTypeResponse")
    public JAXBElement<GetNamedQueryTypeResponse> createGetNamedQueryTypeResponse(GetNamedQueryTypeResponse value) {
        return new JAXBElement<GetNamedQueryTypeResponse>(_GetNamedQueryTypeResponse_QNAME, GetNamedQueryTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFrom }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UploadFrom }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "uploadFrom")
    public JAXBElement<UploadFrom> createUploadFrom(UploadFrom value) {
        return new JAXBElement<UploadFrom>(_UploadFrom_QNAME, UploadFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFromResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UploadFromResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "uploadFromResponse")
    public JAXBElement<UploadFromResponse> createUploadFromResponse(UploadFromResponse value) {
        return new JAXBElement<UploadFromResponse>(_UploadFromResponse_QNAME, UploadFromResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Register }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssociationDefinitionsByName }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAssociationDefinitionsByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getAssociationDefinitionsByName")
    public JAXBElement<GetAssociationDefinitionsByName> createGetAssociationDefinitionsByName(GetAssociationDefinitionsByName value) {
        return new JAXBElement<GetAssociationDefinitionsByName>(_GetAssociationDefinitionsByName_QNAME, GetAssociationDefinitionsByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssociationDefinitionsByNameResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAssociationDefinitionsByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getAssociationDefinitionsByNameResponse")
    public JAXBElement<GetAssociationDefinitionsByNameResponse> createGetAssociationDefinitionsByNameResponse(GetAssociationDefinitionsByNameResponse value) {
        return new JAXBElement<GetAssociationDefinitionsByNameResponse>(_GetAssociationDefinitionsByNameResponse_QNAME, GetAssociationDefinitionsByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordSearch }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link KeywordSearch }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "keywordSearch")
    public JAXBElement<KeywordSearch> createKeywordSearch(KeywordSearch value) {
        return new JAXBElement<KeywordSearch>(_KeywordSearch_QNAME, KeywordSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordSearchResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link KeywordSearchResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "keywordSearchResponse")
    public JAXBElement<KeywordSearchResponse> createKeywordSearchResponse(KeywordSearchResponse value) {
        return new JAXBElement<KeywordSearchResponse>(_KeywordSearchResponse_QNAME, KeywordSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGUIs }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetGUIs }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getGUIs")
    public JAXBElement<GetGUIs> createGetGUIs(GetGUIs value) {
        return new JAXBElement<GetGUIs>(_GetGUIs_QNAME, GetGUIs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGUIsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetGUIsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getGUIsResponse")
    public JAXBElement<GetGUIsResponse> createGetGUIsResponse(GetGUIsResponse value) {
        return new JAXBElement<GetGUIsResponse>(_GetGUIsResponse_QNAME, GetGUIsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModuleId }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetModuleId }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getModuleId")
    public JAXBElement<GetModuleId> createGetModuleId(GetModuleId value) {
        return new JAXBElement<GetModuleId>(_GetModuleId_QNAME, GetModuleId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModuleIdResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetModuleIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getModuleIdResponse")
    public JAXBElement<GetModuleIdResponse> createGetModuleIdResponse(GetModuleIdResponse value) {
        return new JAXBElement<GetModuleIdResponse>(_GetModuleIdResponse_QNAME, GetModuleIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunNamedQueryMultiBoContinue }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunNamedQueryMultiBoContinue }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runNamedQueryMultiBoContinue")
    public JAXBElement<RunNamedQueryMultiBoContinue> createRunNamedQueryMultiBoContinue(RunNamedQueryMultiBoContinue value) {
        return new JAXBElement<RunNamedQueryMultiBoContinue>(_RunNamedQueryMultiBoContinue_QNAME, RunNamedQueryMultiBoContinue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunNamedQueryMultiBoContinueResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunNamedQueryMultiBoContinueResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runNamedQueryMultiBoContinueResponse")
    public JAXBElement<RunNamedQueryMultiBoContinueResponse> createRunNamedQueryMultiBoContinueResponse(RunNamedQueryMultiBoContinueResponse value) {
        return new JAXBElement<RunNamedQueryMultiBoContinueResponse>(_RunNamedQueryMultiBoContinueResponse_QNAME, RunNamedQueryMultiBoContinueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAssociatedRecords }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAllAssociatedRecords }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getAllAssociatedRecords")
    public JAXBElement<GetAllAssociatedRecords> createGetAllAssociatedRecords(GetAllAssociatedRecords value) {
        return new JAXBElement<GetAllAssociatedRecords>(_GetAllAssociatedRecords_QNAME, GetAllAssociatedRecords.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAssociatedRecordsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAllAssociatedRecordsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getAllAssociatedRecordsResponse")
    public JAXBElement<GetAllAssociatedRecordsResponse> createGetAllAssociatedRecordsResponse(GetAllAssociatedRecordsResponse value) {
        return new JAXBElement<GetAllAssociatedRecordsResponse>(_GetAllAssociatedRecordsResponse_QNAME, GetAllAssociatedRecordsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecordState }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetRecordState }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getRecordState")
    public JAXBElement<GetRecordState> createGetRecordState(GetRecordState value) {
        return new JAXBElement<GetRecordState>(_GetRecordState_QNAME, GetRecordState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecordStateResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetRecordStateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getRecordStateResponse")
    public JAXBElement<GetRecordStateResponse> createGetRecordStateResponse(GetRecordStateResponse value) {
        return new JAXBElement<GetRecordStateResponse>(_GetRecordStateResponse_QNAME, GetRecordStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunDynamicQueryContinue }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunDynamicQueryContinue }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runDynamicQueryContinue")
    public JAXBElement<RunDynamicQueryContinue> createRunDynamicQueryContinue(RunDynamicQueryContinue value) {
        return new JAXBElement<RunDynamicQueryContinue>(_RunDynamicQueryContinue_QNAME, RunDynamicQueryContinue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunDynamicQueryContinueResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunDynamicQueryContinueResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runDynamicQueryContinueResponse")
    public JAXBElement<RunDynamicQueryContinueResponse> createRunDynamicQueryContinueResponse(RunDynamicQueryContinueResponse value) {
        return new JAXBElement<RunDynamicQueryContinueResponse>(_RunDynamicQueryContinueResponse_QNAME, RunDynamicQueryContinueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModules }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetModules }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getModules")
    public JAXBElement<GetModules> createGetModules(GetModules value) {
        return new JAXBElement<GetModules>(_GetModules_QNAME, GetModules.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModulesResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetModulesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getModulesResponse")
    public JAXBElement<GetModulesResponse> createGetModulesResponse(GetModulesResponse value) {
        return new JAXBElement<GetModulesResponse>(_GetModulesResponse_QNAME, GetModulesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentLength }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetContentLength }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getContentLength")
    public JAXBElement<GetContentLength> createGetContentLength(GetContentLength value) {
        return new JAXBElement<GetContentLength>(_GetContentLength_QNAME, GetContentLength.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentLengthResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetContentLengthResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getContentLengthResponse")
    public JAXBElement<GetContentLengthResponse> createGetContentLengthResponse(GetContentLengthResponse value) {
        return new JAXBElement<GetContentLengthResponse>(_GetContentLengthResponse_QNAME, GetContentLengthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunNamedMetricQuery }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunNamedMetricQuery }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runNamedMetricQuery")
    public JAXBElement<RunNamedMetricQuery> createRunNamedMetricQuery(RunNamedMetricQuery value) {
        return new JAXBElement<RunNamedMetricQuery>(_RunNamedMetricQuery_QNAME, RunNamedMetricQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunNamedMetricQueryResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunNamedMetricQueryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runNamedMetricQueryResponse")
    public JAXBElement<RunNamedMetricQueryResponse> createRunNamedMetricQueryResponse(RunNamedMetricQueryResponse value) {
        return new JAXBElement<RunNamedMetricQueryResponse>(_RunNamedMetricQueryResponse_QNAME, RunNamedMetricQueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGUIStateTransitions }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetGUIStateTransitions }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getGUIStateTransitions")
    public JAXBElement<GetGUIStateTransitions> createGetGUIStateTransitions(GetGUIStateTransitions value) {
        return new JAXBElement<GetGUIStateTransitions>(_GetGUIStateTransitions_QNAME, GetGUIStateTransitions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGUIStateTransitionsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetGUIStateTransitionsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getGUIStateTransitionsResponse")
    public JAXBElement<GetGUIStateTransitionsResponse> createGetGUIStateTransitionsResponse(GetGUIStateTransitionsResponse value) {
        return new JAXBElement<GetGUIStateTransitionsResponse>(_GetGUIStateTransitionsResponse_QNAME, GetGUIStateTransitionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunNamedQueryMultiBo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunNamedQueryMultiBo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runNamedQueryMultiBo")
    public JAXBElement<RunNamedQueryMultiBo> createRunNamedQueryMultiBo(RunNamedQueryMultiBo value) {
        return new JAXBElement<RunNamedQueryMultiBo>(_RunNamedQueryMultiBo_QNAME, RunNamedQueryMultiBo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunNamedQueryMultiBoResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunNamedQueryMultiBoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runNamedQueryMultiBoResponse")
    public JAXBElement<RunNamedQueryMultiBoResponse> createRunNamedQueryMultiBoResponse(RunNamedQueryMultiBoResponse value) {
        return new JAXBElement<RunNamedQueryMultiBoResponse>(_RunNamedQueryMultiBoResponse_QNAME, RunNamedQueryMultiBoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunNamedQuery }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunNamedQuery }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runNamedQuery")
    public JAXBElement<RunNamedQuery> createRunNamedQuery(RunNamedQuery value) {
        return new JAXBElement<RunNamedQuery>(_RunNamedQuery_QNAME, RunNamedQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunNamedQueryResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunNamedQueryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runNamedQueryResponse")
    public JAXBElement<RunNamedQueryResponse> createRunNamedQueryResponse(RunNamedQueryResponse value) {
        return new JAXBElement<RunNamedQueryResponse>(_RunNamedQueryResponse_QNAME, RunNamedQueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunNamedQueryMultiBoLocalized }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunNamedQueryMultiBoLocalized }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runNamedQueryMultiBoLocalized")
    public JAXBElement<RunNamedQueryMultiBoLocalized> createRunNamedQueryMultiBoLocalized(RunNamedQueryMultiBoLocalized value) {
        return new JAXBElement<RunNamedQueryMultiBoLocalized>(_RunNamedQueryMultiBoLocalized_QNAME, RunNamedQueryMultiBoLocalized.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunNamedQueryMultiBoLocalizedResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunNamedQueryMultiBoLocalizedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runNamedQueryMultiBoLocalizedResponse")
    public JAXBElement<RunNamedQueryMultiBoLocalizedResponse> createRunNamedQueryMultiBoLocalizedResponse(RunNamedQueryMultiBoLocalizedResponse value) {
        return new JAXBElement<RunNamedQueryMultiBoLocalizedResponse>(_RunNamedQueryMultiBoLocalizedResponse_QNAME, RunNamedQueryMultiBoLocalizedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultGUI }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDefaultGUI }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getDefaultGUI")
    public JAXBElement<GetDefaultGUI> createGetDefaultGUI(GetDefaultGUI value) {
        return new JAXBElement<GetDefaultGUI>(_GetDefaultGUI_QNAME, GetDefaultGUI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultGUIResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDefaultGUIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getDefaultGUIResponse")
    public JAXBElement<GetDefaultGUIResponse> createGetDefaultGUIResponse(GetDefaultGUIResponse value) {
        return new JAXBElement<GetDefaultGUIResponse>(_GetDefaultGUIResponse_QNAME, GetDefaultGUIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCurrencyConversionRates }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteCurrencyConversionRates }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "deleteCurrencyConversionRates")
    public JAXBElement<DeleteCurrencyConversionRates> createDeleteCurrencyConversionRates(DeleteCurrencyConversionRates value) {
        return new JAXBElement<DeleteCurrencyConversionRates>(_DeleteCurrencyConversionRates_QNAME, DeleteCurrencyConversionRates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCurrencyConversionRatesResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteCurrencyConversionRatesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "deleteCurrencyConversionRatesResponse")
    public JAXBElement<DeleteCurrencyConversionRatesResponse> createDeleteCurrencyConversionRatesResponse(DeleteCurrencyConversionRatesResponse value) {
        return new JAXBElement<DeleteCurrencyConversionRatesResponse>(_DeleteCurrencyConversionRatesResponse_QNAME, DeleteCurrencyConversionRatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationInfo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetApplicationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getApplicationInfo")
    public JAXBElement<GetApplicationInfo> createGetApplicationInfo(GetApplicationInfo value) {
        return new JAXBElement<GetApplicationInfo>(_GetApplicationInfo_QNAME, GetApplicationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationInfoResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetApplicationInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getApplicationInfoResponse")
    public JAXBElement<GetApplicationInfoResponse> createGetApplicationInfoResponse(GetApplicationInfoResponse value) {
        return new JAXBElement<GetApplicationInfoResponse>(_GetApplicationInfoResponse_QNAME, GetApplicationInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRootRecordId }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetRootRecordId }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getRootRecordId")
    public JAXBElement<GetRootRecordId> createGetRootRecordId(GetRootRecordId value) {
        return new JAXBElement<GetRootRecordId>(_GetRootRecordId_QNAME, GetRootRecordId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRootRecordIdResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetRootRecordIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getRootRecordIdResponse")
    public JAXBElement<GetRootRecordIdResponse> createGetRootRecordIdResponse(GetRootRecordIdResponse value) {
        return new JAXBElement<GetRootRecordIdResponse>(_GetRootRecordIdResponse_QNAME, GetRootRecordIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChildren }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetChildren }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getChildren")
    public JAXBElement<GetChildren> createGetChildren(GetChildren value) {
        return new JAXBElement<GetChildren>(_GetChildren_QNAME, GetChildren.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChildrenResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetChildrenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getChildrenResponse")
    public JAXBElement<GetChildrenResponse> createGetChildrenResponse(GetChildrenResponse value) {
        return new JAXBElement<GetChildrenResponse>(_GetChildrenResponse_QNAME, GetChildrenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeassociateRecords }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeassociateRecords }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "deassociateRecords")
    public JAXBElement<DeassociateRecords> createDeassociateRecords(DeassociateRecords value) {
        return new JAXBElement<DeassociateRecords>(_DeassociateRecords_QNAME, DeassociateRecords.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeassociateRecordsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeassociateRecordsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "deassociateRecordsResponse")
    public JAXBElement<DeassociateRecordsResponse> createDeassociateRecordsResponse(DeassociateRecordsResponse value) {
        return new JAXBElement<DeassociateRecordsResponse>(_DeassociateRecordsResponse_QNAME, DeassociateRecordsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunNamedQueryContinue }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunNamedQueryContinue }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runNamedQueryContinue")
    public JAXBElement<RunNamedQueryContinue> createRunNamedQueryContinue(RunNamedQueryContinue value) {
        return new JAXBElement<RunNamedQueryContinue>(_RunNamedQueryContinue_QNAME, RunNamedQueryContinue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunNamedQueryContinueResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunNamedQueryContinueResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runNamedQueryContinueResponse")
    public JAXBElement<RunNamedQueryContinueResponse> createRunNamedQueryContinueResponse(RunNamedQueryContinueResponse value) {
        return new JAXBElement<RunNamedQueryContinueResponse>(_RunNamedQueryContinueResponse_QNAME, RunNamedQueryContinueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHierarchyMetadata }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetHierarchyMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getHierarchyMetadata")
    public JAXBElement<GetHierarchyMetadata> createGetHierarchyMetadata(GetHierarchyMetadata value) {
        return new JAXBElement<GetHierarchyMetadata>(_GetHierarchyMetadata_QNAME, GetHierarchyMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHierarchyMetadataResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetHierarchyMetadataResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getHierarchyMetadataResponse")
    public JAXBElement<GetHierarchyMetadataResponse> createGetHierarchyMetadataResponse(GetHierarchyMetadataResponse value) {
        return new JAXBElement<GetHierarchyMetadataResponse>(_GetHierarchyMetadataResponse_QNAME, GetHierarchyMetadataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserLicenses }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetUserLicenses }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getUserLicenses")
    public JAXBElement<GetUserLicenses> createGetUserLicenses(GetUserLicenses value) {
        return new JAXBElement<GetUserLicenses>(_GetUserLicenses_QNAME, GetUserLicenses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserLicensesResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetUserLicensesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getUserLicensesResponse")
    public JAXBElement<GetUserLicensesResponse> createGetUserLicensesResponse(GetUserLicensesResponse value) {
        return new JAXBElement<GetUserLicensesResponse>(_GetUserLicensesResponse_QNAME, GetUserLicensesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultGuiId }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDefaultGuiId }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getDefaultGuiId")
    public JAXBElement<GetDefaultGuiId> createGetDefaultGuiId(GetDefaultGuiId value) {
        return new JAXBElement<GetDefaultGuiId>(_GetDefaultGuiId_QNAME, GetDefaultGuiId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultGuiIdResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDefaultGuiIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getDefaultGuiIdResponse")
    public JAXBElement<GetDefaultGuiIdResponse> createGetDefaultGuiIdResponse(GetDefaultGuiIdResponse value) {
        return new JAXBElement<GetDefaultGuiIdResponse>(_GetDefaultGuiIdResponse_QNAME, GetDefaultGuiIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Download }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Download }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "download")
    public JAXBElement<Download> createDownload(Download value) {
        return new JAXBElement<Download>(_Download_QNAME, Download.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DownloadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "downloadResponse")
    public JAXBElement<DownloadResponse> createDownloadResponse(DownloadResponse value) {
        return new JAXBElement<DownloadResponse>(_DownloadResponse_QNAME, DownloadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChecksum }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetChecksum }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getChecksum")
    public JAXBElement<GetChecksum> createGetChecksum(GetChecksum value) {
        return new JAXBElement<GetChecksum>(_GetChecksum_QNAME, GetChecksum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChecksumResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetChecksumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getChecksumResponse")
    public JAXBElement<GetChecksumResponse> createGetChecksumResponse(GetChecksumResponse value) {
        return new JAXBElement<GetChecksumResponse>(_GetChecksumResponse_QNAME, GetChecksumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHierarchyMetadataByModuleName }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetHierarchyMetadataByModuleName }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getHierarchyMetadataByModuleName")
    public JAXBElement<GetHierarchyMetadataByModuleName> createGetHierarchyMetadataByModuleName(GetHierarchyMetadataByModuleName value) {
        return new JAXBElement<GetHierarchyMetadataByModuleName>(_GetHierarchyMetadataByModuleName_QNAME, GetHierarchyMetadataByModuleName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHierarchyMetadataByModuleNameResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetHierarchyMetadataByModuleNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getHierarchyMetadataByModuleNameResponse")
    public JAXBElement<GetHierarchyMetadataByModuleNameResponse> createGetHierarchyMetadataByModuleNameResponse(GetHierarchyMetadataByModuleNameResponse value) {
        return new JAXBElement<GetHierarchyMetadataByModuleNameResponse>(_GetHierarchyMetadataByModuleNameResponse_QNAME, GetHierarchyMetadataByModuleNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutCurrencyConversionRates }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PutCurrencyConversionRates }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "putCurrencyConversionRates")
    public JAXBElement<PutCurrencyConversionRates> createPutCurrencyConversionRates(PutCurrencyConversionRates value) {
        return new JAXBElement<PutCurrencyConversionRates>(_PutCurrencyConversionRates_QNAME, PutCurrencyConversionRates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutCurrencyConversionRatesResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link PutCurrencyConversionRatesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "putCurrencyConversionRatesResponse")
    public JAXBElement<PutCurrencyConversionRatesResponse> createPutCurrencyConversionRatesResponse(PutCurrencyConversionRatesResponse value) {
        return new JAXBElement<PutCurrencyConversionRatesResponse>(_PutCurrencyConversionRatesResponse_QNAME, PutCurrencyConversionRatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssociationDefinitions }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAssociationDefinitions }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getAssociationDefinitions")
    public JAXBElement<GetAssociationDefinitions> createGetAssociationDefinitions(GetAssociationDefinitions value) {
        return new JAXBElement<GetAssociationDefinitions>(_GetAssociationDefinitions_QNAME, GetAssociationDefinitions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssociationDefinitionsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAssociationDefinitionsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getAssociationDefinitionsResponse")
    public JAXBElement<GetAssociationDefinitionsResponse> createGetAssociationDefinitionsResponse(GetAssociationDefinitionsResponse value) {
        return new JAXBElement<GetAssociationDefinitionsResponse>(_GetAssociationDefinitionsResponse_QNAME, GetAssociationDefinitionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecordDataHeaders }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetRecordDataHeaders }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getRecordDataHeaders")
    public JAXBElement<GetRecordDataHeaders> createGetRecordDataHeaders(GetRecordDataHeaders value) {
        return new JAXBElement<GetRecordDataHeaders>(_GetRecordDataHeaders_QNAME, GetRecordDataHeaders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecordDataHeadersResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetRecordDataHeadersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getRecordDataHeadersResponse")
    public JAXBElement<GetRecordDataHeadersResponse> createGetRecordDataHeadersResponse(GetRecordDataHeadersResponse value) {
        return new JAXBElement<GetRecordDataHeadersResponse>(_GetRecordDataHeadersResponse_QNAME, GetRecordDataHeadersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectTypeActions }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetObjectTypeActions }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getObjectTypeActions")
    public JAXBElement<GetObjectTypeActions> createGetObjectTypeActions(GetObjectTypeActions value) {
        return new JAXBElement<GetObjectTypeActions>(_GetObjectTypeActions_QNAME, GetObjectTypeActions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectTypeActionsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetObjectTypeActionsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getObjectTypeActionsResponse")
    public JAXBElement<GetObjectTypeActionsResponse> createGetObjectTypeActionsResponse(GetObjectTypeActionsResponse value) {
        return new JAXBElement<GetObjectTypeActionsResponse>(_GetObjectTypeActionsResponse_QNAME, GetObjectTypeActionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectTypeId }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetObjectTypeId }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getObjectTypeId")
    public JAXBElement<GetObjectTypeId> createGetObjectTypeId(GetObjectTypeId value) {
        return new JAXBElement<GetObjectTypeId>(_GetObjectTypeId_QNAME, GetObjectTypeId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectTypeIdResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetObjectTypeIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getObjectTypeIdResponse")
    public JAXBElement<GetObjectTypeIdResponse> createGetObjectTypeIdResponse(GetObjectTypeIdResponse value) {
        return new JAXBElement<GetObjectTypeIdResponse>(_GetObjectTypeIdResponse_QNAME, GetObjectTypeIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequiredGuiFieldNames }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetRequiredGuiFieldNames }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getRequiredGuiFieldNames")
    public JAXBElement<GetRequiredGuiFieldNames> createGetRequiredGuiFieldNames(GetRequiredGuiFieldNames value) {
        return new JAXBElement<GetRequiredGuiFieldNames>(_GetRequiredGuiFieldNames_QNAME, GetRequiredGuiFieldNames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequiredGuiFieldNamesResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetRequiredGuiFieldNamesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getRequiredGuiFieldNamesResponse")
    public JAXBElement<GetRequiredGuiFieldNamesResponse> createGetRequiredGuiFieldNamesResponse(GetRequiredGuiFieldNamesResponse value) {
        return new JAXBElement<GetRequiredGuiFieldNamesResponse>(_GetRequiredGuiFieldNamesResponse_QNAME, GetRequiredGuiFieldNamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultGUIActions }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDefaultGUIActions }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getDefaultGUIActions")
    public JAXBElement<GetDefaultGUIActions> createGetDefaultGUIActions(GetDefaultGUIActions value) {
        return new JAXBElement<GetDefaultGUIActions>(_GetDefaultGUIActions_QNAME, GetDefaultGUIActions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultGUIActionsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDefaultGUIActionsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getDefaultGUIActionsResponse")
    public JAXBElement<GetDefaultGUIActionsResponse> createGetDefaultGUIActionsResponse(GetDefaultGUIActionsResponse value) {
        return new JAXBElement<GetDefaultGUIActionsResponse>(_GetDefaultGUIActionsResponse_QNAME, GetDefaultGUIActionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHierarchyMetadataByModuleId }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetHierarchyMetadataByModuleId }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getHierarchyMetadataByModuleId")
    public JAXBElement<GetHierarchyMetadataByModuleId> createGetHierarchyMetadataByModuleId(GetHierarchyMetadataByModuleId value) {
        return new JAXBElement<GetHierarchyMetadataByModuleId>(_GetHierarchyMetadataByModuleId_QNAME, GetHierarchyMetadataByModuleId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHierarchyMetadataByModuleIdResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetHierarchyMetadataByModuleIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getHierarchyMetadataByModuleIdResponse")
    public JAXBElement<GetHierarchyMetadataByModuleIdResponse> createGetHierarchyMetadataByModuleIdResponse(GetHierarchyMetadataByModuleIdResponse value) {
        return new JAXBElement<GetHierarchyMetadataByModuleIdResponse>(_GetHierarchyMetadataByModuleIdResponse_QNAME, GetHierarchyMetadataByModuleIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencies }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetCurrencies }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getCurrencies")
    public JAXBElement<GetCurrencies> createGetCurrencies(GetCurrencies value) {
        return new JAXBElement<GetCurrencies>(_GetCurrencies_QNAME, GetCurrencies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrenciesResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetCurrenciesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getCurrenciesResponse")
    public JAXBElement<GetCurrenciesResponse> createGetCurrenciesResponse(GetCurrenciesResponse value) {
        return new JAXBElement<GetCurrenciesResponse>(_GetCurrenciesResponse_QNAME, GetCurrenciesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectTypeListByModuleName }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetObjectTypeListByModuleName }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getObjectTypeListByModuleName")
    public JAXBElement<GetObjectTypeListByModuleName> createGetObjectTypeListByModuleName(GetObjectTypeListByModuleName value) {
        return new JAXBElement<GetObjectTypeListByModuleName>(_GetObjectTypeListByModuleName_QNAME, GetObjectTypeListByModuleName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectTypeListByModuleNameResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetObjectTypeListByModuleNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getObjectTypeListByModuleNameResponse")
    public JAXBElement<GetObjectTypeListByModuleNameResponse> createGetObjectTypeListByModuleNameResponse(GetObjectTypeListByModuleNameResponse value) {
        return new JAXBElement<GetObjectTypeListByModuleNameResponse>(_GetObjectTypeListByModuleNameResponse_QNAME, GetObjectTypeListByModuleNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadTo }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DownloadTo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "downloadTo")
    public JAXBElement<DownloadTo> createDownloadTo(DownloadTo value) {
        return new JAXBElement<DownloadTo>(_DownloadTo_QNAME, DownloadTo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadToResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DownloadToResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "downloadToResponse")
    public JAXBElement<DownloadToResponse> createDownloadToResponse(DownloadToResponse value) {
        return new JAXBElement<DownloadToResponse>(_DownloadToResponse_QNAME, DownloadToResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRecord }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SaveRecord }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "saveRecord")
    public JAXBElement<SaveRecord> createSaveRecord(SaveRecord value) {
        return new JAXBElement<SaveRecord>(_SaveRecord_QNAME, SaveRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRecordResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link SaveRecordResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "saveRecordResponse")
    public JAXBElement<SaveRecordResponse> createSaveRecordResponse(SaveRecordResponse value) {
        return new JAXBElement<SaveRecordResponse>(_SaveRecordResponse_QNAME, SaveRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultGUIStructure }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDefaultGUIStructure }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getDefaultGUIStructure")
    public JAXBElement<GetDefaultGUIStructure> createGetDefaultGUIStructure(GetDefaultGUIStructure value) {
        return new JAXBElement<GetDefaultGUIStructure>(_GetDefaultGUIStructure_QNAME, GetDefaultGUIStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDefaultGUIStructureResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDefaultGUIStructureResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getDefaultGUIStructureResponse")
    public JAXBElement<GetDefaultGUIStructureResponse> createGetDefaultGUIStructureResponse(GetDefaultGUIStructureResponse value) {
        return new JAXBElement<GetDefaultGUIStructureResponse>(_GetDefaultGUIStructureResponse_QNAME, GetDefaultGUIStructureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGUIsByName }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetGUIsByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getGUIsByName")
    public JAXBElement<GetGUIsByName> createGetGUIsByName(GetGUIsByName value) {
        return new JAXBElement<GetGUIsByName>(_GetGUIsByName_QNAME, GetGUIsByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGUIsByNameResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetGUIsByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getGUIsByNameResponse")
    public JAXBElement<GetGUIsByNameResponse> createGetGUIsByNameResponse(GetGUIsByNameResponse value) {
        return new JAXBElement<GetGUIsByNameResponse>(_GetGUIsByNameResponse_QNAME, GetGUIsByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableActions }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAvailableActions }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getAvailableActions")
    public JAXBElement<GetAvailableActions> createGetAvailableActions(GetAvailableActions value) {
        return new JAXBElement<GetAvailableActions>(_GetAvailableActions_QNAME, GetAvailableActions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableActionsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAvailableActionsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getAvailableActionsResponse")
    public JAXBElement<GetAvailableActionsResponse> createGetAvailableActionsResponse(GetAvailableActionsResponse value) {
        return new JAXBElement<GetAvailableActionsResponse>(_GetAvailableActionsResponse_QNAME, GetAvailableActionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProjects }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetProjects }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getProjects")
    public JAXBElement<GetProjects> createGetProjects(GetProjects value) {
        return new JAXBElement<GetProjects>(_GetProjects_QNAME, GetProjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProjectsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetProjectsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getProjectsResponse")
    public JAXBElement<GetProjectsResponse> createGetProjectsResponse(GetProjectsResponse value) {
        return new JAXBElement<GetProjectsResponse>(_GetProjectsResponse_QNAME, GetProjectsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminateSession }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TerminateSession }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "terminateSession")
    public JAXBElement<TerminateSession> createTerminateSession(TerminateSession value) {
        return new JAXBElement<TerminateSession>(_TerminateSession_QNAME, TerminateSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminateSessionResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TerminateSessionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "terminateSessionResponse")
    public JAXBElement<TerminateSessionResponse> createTerminateSessionResponse(TerminateSessionResponse value) {
        return new JAXBElement<TerminateSessionResponse>(_TerminateSessionResponse_QNAME, TerminateSessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyConversionGroups }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetCurrencyConversionGroups }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getCurrencyConversionGroups")
    public JAXBElement<GetCurrencyConversionGroups> createGetCurrencyConversionGroups(GetCurrencyConversionGroups value) {
        return new JAXBElement<GetCurrencyConversionGroups>(_GetCurrencyConversionGroups_QNAME, GetCurrencyConversionGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyConversionGroupsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetCurrencyConversionGroupsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getCurrencyConversionGroupsResponse")
    public JAXBElement<GetCurrencyConversionGroupsResponse> createGetCurrencyConversionGroupsResponse(GetCurrencyConversionGroupsResponse value) {
        return new JAXBElement<GetCurrencyConversionGroupsResponse>(_GetCurrencyConversionGroupsResponse_QNAME, GetCurrencyConversionGroupsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateRecords }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AssociateRecords }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "associateRecords")
    public JAXBElement<AssociateRecords> createAssociateRecords(AssociateRecords value) {
        return new JAXBElement<AssociateRecords>(_AssociateRecords_QNAME, AssociateRecords.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateRecordsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AssociateRecordsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "associateRecordsResponse")
    public JAXBElement<AssociateRecordsResponse> createAssociateRecordsResponse(AssociateRecordsResponse value) {
        return new JAXBElement<AssociateRecordsResponse>(_AssociateRecordsResponse_QNAME, AssociateRecordsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunNamedMetricQueryContinue }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunNamedMetricQueryContinue }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runNamedMetricQueryContinue")
    public JAXBElement<RunNamedMetricQueryContinue> createRunNamedMetricQueryContinue(RunNamedMetricQueryContinue value) {
        return new JAXBElement<RunNamedMetricQueryContinue>(_RunNamedMetricQueryContinue_QNAME, RunNamedMetricQueryContinue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunNamedMetricQueryContinueResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunNamedMetricQueryContinueResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runNamedMetricQueryContinueResponse")
    public JAXBElement<RunNamedMetricQueryContinueResponse> createRunNamedMetricQueryContinueResponse(RunNamedMetricQueryContinueResponse value) {
        return new JAXBElement<RunNamedMetricQueryContinueResponse>(_RunNamedMetricQueryContinueResponse_QNAME, RunNamedMetricQueryContinueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListItems }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetListItems }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getListItems")
    public JAXBElement<GetListItems> createGetListItems(GetListItems value) {
        return new JAXBElement<GetListItems>(_GetListItems_QNAME, GetListItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListItemsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetListItemsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getListItemsResponse")
    public JAXBElement<GetListItemsResponse> createGetListItemsResponse(GetListItemsResponse value) {
        return new JAXBElement<GetListItemsResponse>(_GetListItemsResponse_QNAME, GetListItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Copy }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Copy }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "copy")
    public JAXBElement<Copy> createCopy(Copy value) {
        return new JAXBElement<Copy>(_Copy_QNAME, Copy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CopyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "copyResponse")
    public JAXBElement<CopyResponse> createCopyResponse(CopyResponse value) {
        return new JAXBElement<CopyResponse>(_CopyResponse_QNAME, CopyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListByTypes }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetListByTypes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getListByTypes")
    public JAXBElement<GetListByTypes> createGetListByTypes(GetListByTypes value) {
        return new JAXBElement<GetListByTypes>(_GetListByTypes_QNAME, GetListByTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListByTypesResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetListByTypesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getListByTypesResponse")
    public JAXBElement<GetListByTypesResponse> createGetListByTypesResponse(GetListByTypesResponse value) {
        return new JAXBElement<GetListByTypesResponse>(_GetListByTypesResponse_QNAME, GetListByTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProjectId }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetProjectId }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getProjectId")
    public JAXBElement<GetProjectId> createGetProjectId(GetProjectId value) {
        return new JAXBElement<GetProjectId>(_GetProjectId_QNAME, GetProjectId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProjectIdResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetProjectIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getProjectIdResponse")
    public JAXBElement<GetProjectIdResponse> createGetProjectIdResponse(GetProjectIdResponse value) {
        return new JAXBElement<GetProjectIdResponse>(_GetProjectIdResponse_QNAME, GetProjectIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentFieldsDefinition }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetContentFieldsDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getContentFieldsDefinition")
    public JAXBElement<GetContentFieldsDefinition> createGetContentFieldsDefinition(GetContentFieldsDefinition value) {
        return new JAXBElement<GetContentFieldsDefinition>(_GetContentFieldsDefinition_QNAME, GetContentFieldsDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentFieldsDefinitionResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetContentFieldsDefinitionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getContentFieldsDefinitionResponse")
    public JAXBElement<GetContentFieldsDefinitionResponse> createGetContentFieldsDefinitionResponse(GetContentFieldsDefinitionResponse value) {
        return new JAXBElement<GetContentFieldsDefinitionResponse>(_GetContentFieldsDefinitionResponse_QNAME, GetContentFieldsDefinitionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssociatedRecords }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAssociatedRecords }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getAssociatedRecords")
    public JAXBElement<GetAssociatedRecords> createGetAssociatedRecords(GetAssociatedRecords value) {
        return new JAXBElement<GetAssociatedRecords>(_GetAssociatedRecords_QNAME, GetAssociatedRecords.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssociatedRecordsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAssociatedRecordsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getAssociatedRecordsResponse")
    public JAXBElement<GetAssociatedRecordsResponse> createGetAssociatedRecordsResponse(GetAssociatedRecordsResponse value) {
        return new JAXBElement<GetAssociatedRecordsResponse>(_GetAssociatedRecordsResponse_QNAME, GetAssociatedRecordsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptActionItems }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AcceptActionItems }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "acceptActionItems")
    public JAXBElement<AcceptActionItems> createAcceptActionItems(AcceptActionItems value) {
        return new JAXBElement<AcceptActionItems>(_AcceptActionItems_QNAME, AcceptActionItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptActionItemsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AcceptActionItemsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "acceptActionItemsResponse")
    public JAXBElement<AcceptActionItemsResponse> createAcceptActionItemsResponse(AcceptActionItemsResponse value) {
        return new JAXBElement<AcceptActionItemsResponse>(_AcceptActionItemsResponse_QNAME, AcceptActionItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectTypeByName }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetObjectTypeByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getObjectTypeByName")
    public JAXBElement<GetObjectTypeByName> createGetObjectTypeByName(GetObjectTypeByName value) {
        return new JAXBElement<GetObjectTypeByName>(_GetObjectTypeByName_QNAME, GetObjectTypeByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectTypeByNameResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetObjectTypeByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getObjectTypeByNameResponse")
    public JAXBElement<GetObjectTypeByNameResponse> createGetObjectTypeByNameResponse(GetObjectTypeByNameResponse value) {
        return new JAXBElement<GetObjectTypeByNameResponse>(_GetObjectTypeByNameResponse_QNAME, GetObjectTypeByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunDynamicQuery }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunDynamicQuery }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runDynamicQuery")
    public JAXBElement<RunDynamicQuery> createRunDynamicQuery(RunDynamicQuery value) {
        return new JAXBElement<RunDynamicQuery>(_RunDynamicQuery_QNAME, RunDynamicQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunDynamicQueryResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RunDynamicQueryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "runDynamicQueryResponse")
    public JAXBElement<RunDynamicQueryResponse> createRunDynamicQueryResponse(RunDynamicQueryResponse value) {
        return new JAXBElement<RunDynamicQueryResponse>(_RunDynamicQueryResponse_QNAME, RunDynamicQueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTargetRecords }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetTargetRecords }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getTargetRecords")
    public JAXBElement<GetTargetRecords> createGetTargetRecords(GetTargetRecords value) {
        return new JAXBElement<GetTargetRecords>(_GetTargetRecords_QNAME, GetTargetRecords.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTargetRecordsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetTargetRecordsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getTargetRecordsResponse")
    public JAXBElement<GetTargetRecordsResponse> createGetTargetRecordsResponse(GetTargetRecordsResponse value) {
        return new JAXBElement<GetTargetRecordsResponse>(_GetTargetRecordsResponse_QNAME, GetTargetRecordsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGUI }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetGUI }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getGUI")
    public JAXBElement<GetGUI> createGetGUI(GetGUI value) {
        return new JAXBElement<GetGUI>(_GetGUI_QNAME, GetGUI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGUIResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetGUIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getGUIResponse")
    public JAXBElement<GetGUIResponse> createGetGUIResponse(GetGUIResponse value) {
        return new JAXBElement<GetGUIResponse>(_GetGUIResponse_QNAME, GetGUIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerActions }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TriggerActions }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "triggerActions")
    public JAXBElement<TriggerActions> createTriggerActions(TriggerActions value) {
        return new JAXBElement<TriggerActions>(_TriggerActions_QNAME, TriggerActions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerActionsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link TriggerActionsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "triggerActionsResponse")
    public JAXBElement<TriggerActionsResponse> createTriggerActionsResponse(TriggerActionsResponse value) {
        return new JAXBElement<TriggerActionsResponse>(_TriggerActionsResponse_QNAME, TriggerActionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetObjectType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getObjectType")
    public JAXBElement<GetObjectType> createGetObjectType(GetObjectType value) {
        return new JAXBElement<GetObjectType>(_GetObjectType_QNAME, GetObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectTypeResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetObjectTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getObjectTypeResponse")
    public JAXBElement<GetObjectTypeResponse> createGetObjectTypeResponse(GetObjectTypeResponse value) {
        return new JAXBElement<GetObjectTypeResponse>(_GetObjectTypeResponse_QNAME, GetObjectTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHttpSession }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetHttpSession }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getHttpSession")
    public JAXBElement<GetHttpSession> createGetHttpSession(GetHttpSession value) {
        return new JAXBElement<GetHttpSession>(_GetHttpSession_QNAME, GetHttpSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHttpSessionResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetHttpSessionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getHttpSessionResponse")
    public JAXBElement<GetHttpSessionResponse> createGetHttpSessionResponse(GetHttpSessionResponse value) {
        return new JAXBElement<GetHttpSessionResponse>(_GetHttpSessionResponse_QNAME, GetHttpSessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectTypeListByModuleId }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetObjectTypeListByModuleId }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getObjectTypeListByModuleId")
    public JAXBElement<GetObjectTypeListByModuleId> createGetObjectTypeListByModuleId(GetObjectTypeListByModuleId value) {
        return new JAXBElement<GetObjectTypeListByModuleId>(_GetObjectTypeListByModuleId_QNAME, GetObjectTypeListByModuleId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectTypeListByModuleIdResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetObjectTypeListByModuleIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "getObjectTypeListByModuleIdResponse")
    public JAXBElement<GetObjectTypeListByModuleIdResponse> createGetObjectTypeListByModuleIdResponse(GetObjectTypeListByModuleIdResponse value) {
        return new JAXBElement<GetObjectTypeListByModuleIdResponse>(_GetObjectTypeListByModuleIdResponse_QNAME, GetObjectTypeListByModuleIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Upload }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Upload }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "upload")
    public JAXBElement<Upload> createUpload(Upload value) {
        return new JAXBElement<Upload>(_Upload_QNAME, Upload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UploadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "uploadResponse")
    public JAXBElement<UploadResponse> createUploadResponse(UploadResponse value) {
        return new JAXBElement<UploadResponse>(_UploadResponse_QNAME, UploadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModuleDoesNotExistException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ModuleDoesNotExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "ModuleDoesNotExistException")
    public JAXBElement<ModuleDoesNotExistException> createModuleDoesNotExistException(ModuleDoesNotExistException value) {
        return new JAXBElement<ModuleDoesNotExistException>(_ModuleDoesNotExistException_QNAME, ModuleDoesNotExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDoesNotExistException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link QueryDoesNotExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "QueryDoesNotExistException")
    public JAXBElement<QueryDoesNotExistException> createQueryDoesNotExistException(QueryDoesNotExistException value) {
        return new JAXBElement<QueryDoesNotExistException>(_QueryDoesNotExistException_QNAME, QueryDoesNotExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectTypeDoesNotExistException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ObjectTypeDoesNotExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "ObjectTypeDoesNotExistException")
    public JAXBElement<ObjectTypeDoesNotExistException> createObjectTypeDoesNotExistException(ObjectTypeDoesNotExistException value) {
        return new JAXBElement<ObjectTypeDoesNotExistException>(_ObjectTypeDoesNotExistException_QNAME, ObjectTypeDoesNotExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidArgumentException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link InvalidArgumentException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "InvalidArgumentException")
    public JAXBElement<InvalidArgumentException> createInvalidArgumentException(InvalidArgumentException value) {
        return new JAXBElement<InvalidArgumentException>(_InvalidArgumentException_QNAME, InvalidArgumentException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectDoesNotExistException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ProjectDoesNotExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "ProjectDoesNotExistException")
    public JAXBElement<ProjectDoesNotExistException> createProjectDoesNotExistException(ProjectDoesNotExistException value) {
        return new JAXBElement<ProjectDoesNotExistException>(_ProjectDoesNotExistException_QNAME, ProjectDoesNotExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidContinuationTokenException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link InvalidContinuationTokenException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "InvalidContinuationTokenException")
    public JAXBElement<InvalidContinuationTokenException> createInvalidContinuationTokenException(InvalidContinuationTokenException value) {
        return new JAXBElement<InvalidContinuationTokenException>(_InvalidContinuationTokenException_QNAME, InvalidContinuationTokenException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordDoesNotExistException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RecordDoesNotExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "RecordDoesNotExistException")
    public JAXBElement<RecordDoesNotExistException> createRecordDoesNotExistException(RecordDoesNotExistException value) {
        return new JAXBElement<RecordDoesNotExistException>(_RecordDoesNotExistException_QNAME, RecordDoesNotExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidDocumentTypeException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link InvalidDocumentTypeException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "InvalidDocumentTypeException")
    public JAXBElement<InvalidDocumentTypeException> createInvalidDocumentTypeException(InvalidDocumentTypeException value) {
        return new JAXBElement<InvalidDocumentTypeException>(_InvalidDocumentTypeException_QNAME, InvalidDocumentTypeException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AccessException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "AccessException")
    public JAXBElement<AccessException> createAccessException(AccessException value) {
        return new JAXBElement<AccessException>(_AccessException_QNAME, AccessException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidContentException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link InvalidContentException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "InvalidContentException")
    public JAXBElement<InvalidContentException> createInvalidContentException(InvalidContentException value) {
        return new JAXBElement<InvalidContentException>(_InvalidContentException_QNAME, InvalidContentException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuiDoesNotExistException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GuiDoesNotExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "GuiDoesNotExistException")
    public JAXBElement<GuiDoesNotExistException> createGuiDoesNotExistException(GuiDoesNotExistException value) {
        return new JAXBElement<GuiDoesNotExistException>(_GuiDoesNotExistException_QNAME, GuiDoesNotExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDoesNotExistException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ListDoesNotExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "ListDoesNotExistException")
    public JAXBElement<ListDoesNotExistException> createListDoesNotExistException(ListDoesNotExistException value) {
        return new JAXBElement<ListDoesNotExistException>(_ListDoesNotExistException_QNAME, ListDoesNotExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionItemInvalidException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ActionItemInvalidException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "ActionItemInvalidException")
    public JAXBElement<ActionItemInvalidException> createActionItemInvalidException(ActionItemInvalidException value) {
        return new JAXBElement<ActionItemInvalidException>(_ActionItemInvalidException_QNAME, ActionItemInvalidException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionDoesNotExistException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ActionDoesNotExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tririga.com", name = "ActionDoesNotExistException")
    public JAXBElement<ActionDoesNotExistException> createActionDoesNotExistException(ActionDoesNotExistException value) {
        return new JAXBElement<ActionDoesNotExistException>(_ActionDoesNotExistException_QNAME, ActionDoesNotExistException.class, null, value);
    }

}
