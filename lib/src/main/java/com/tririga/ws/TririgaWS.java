//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.tririga.ws;

import com.tririga.ws.dto.TriggerActions;
import com.tririga.ws.dto.*;
import com.tririga.ws.dto.content.InvalidContentException;
import com.tririga.ws.dto.content.InvalidDocumentTypeException;
import com.tririga.ws.dto.content.*;
import com.tririga.ws.dto.gui.GUI;
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

import java.util.Collection;

public interface TririgaWS {
    ApplicationInfo getApplicationInfo();

    HttpSession getHttpSession();

    Module[] getModules() throws Exception;

    int getModuleId(String var1) throws ModuleDoesNotExistException, Exception;

    long getObjectTypeId(String var1, String var2) throws ObjectTypeDoesNotExistException, Exception;

    ObjectType getObjectType(long var1) throws ObjectTypeDoesNotExistException, InvalidArgumentException, Exception;

    ObjectType getObjectTypeByName(String var1, String var2) throws ObjectTypeDoesNotExistException, Exception, InvalidArgumentException;

    BaseObjectType[] getObjectTypeListByModuleId(long var1, boolean var3) throws ModuleDoesNotExistException, InvalidArgumentException, Exception;

    BaseObjectType[] getObjectTypeListByModuleName(String var1, boolean var2) throws ModuleDoesNotExistException, InvalidArgumentException, Exception;

    AssociationDefinition[] getAssociationDefinitions(long var1) throws ObjectTypeDoesNotExistException, InvalidArgumentException, Exception;

    AssociationDefinition[] getAssociationDefinitionsByName(String var1, String var2) throws ObjectTypeDoesNotExistException, InvalidArgumentException, Exception;

    ObjectTypeAction getObjectTypeActions(long var1, long var3, long var5, long var7) throws InvalidArgumentException;

    HierarchyObjectType getHierarchyMetadata(long var1, long var3) throws ModuleDoesNotExistException, InvalidArgumentException, Exception;

    HierarchyObjectType getHierarchyMetadataByModuleId(long var1) throws ModuleDoesNotExistException, Exception;

    HierarchyObjectType getHierarchyMetadataByModuleName(String var1) throws ModuleDoesNotExistException, Exception;

    ListItem[] getListItems(long var1) throws ListDoesNotExistException, InvalidArgumentException;

    ListType[] getListByTypes(long[] var1) throws ObjectTypeDoesNotExistException, InvalidArgumentException;

    GUI getGUI(long var1, long var3) throws RecordDoesNotExistException, GuiDoesNotExistException, Exception;

    GUI getDefaultGUI(long var1) throws RecordDoesNotExistException, GuiDoesNotExistException, Exception;

    long getDefaultGuiId(long var1) throws ObjectTypeDoesNotExistException, InvalidArgumentException, Exception;

    GUI getDefaultGUIStructure(long var1) throws ObjectTypeDoesNotExistException, InvalidArgumentException, Exception;

    GUI[] getGUIs(long var1) throws ObjectTypeDoesNotExistException, InvalidArgumentException, Exception;

    GUI[] getGUIsByName(String var1, String var2) throws ObjectTypeDoesNotExistException, InvalidArgumentException, Exception;

    ResponseHelperHeader getRequiredGuiFieldNames(long var1) throws Exception;

    Association[] getTargetRecords(long var1, String var3) throws Exception;

    ResponseHelper[] getUserLicenses();

    ResponseHelperHeader associateRecords(Association[] var1) throws Exception;

    ResponseHelperHeader deassociateRecords(Association[] var1) throws Exception;

    ResponseHelper getRootRecordId(String var1, String var2) throws ModuleDoesNotExistException, ObjectTypeDoesNotExistException, InvalidArgumentException, Exception;

    Record[] getRecordDataHeaders(long[] var1) throws RecordDoesNotExistException, InvalidArgumentException, Exception;

    ResponseHelperHeader saveRecord(IntegrationRecord[] var1) throws Exception;

    ResponseHelperHeader triggerActions(TriggerActions[] var1) throws RecordDoesNotExistException, ActionDoesNotExistException, Exception;

    CurrencyConversionRate[] putCurrencyConversionRates(CurrencyConversionRate[] var1) throws InvalidArgumentException, Exception;

    ResponseHelperHeader deleteCurrencyConversionRates(long[] var1) throws InvalidArgumentException, Exception;

    CurrencyConversionRate[] getCurrencyConversionRates() throws Exception;

    ConversionGroup[] getCurrencyConversionGroups() throws Exception;

    Currency[] getCurrencies() throws Exception;

    ChildRecord[] getChildren(long var1) throws RecordDoesNotExistException, InvalidArgumentException, Exception;

    ActionItem[] getActionItems() throws Exception;

    void acceptActionItems(ActionItem[] var1) throws ActionItemInvalidException, Exception;

    Association[] getAssociatedRecords(long var1, String var3, int var4) throws ModuleDoesNotExistException, ObjectTypeDoesNotExistException, RecordDoesNotExistException, InvalidArgumentException, Exception;

    AssociationRecord[] getAllAssociatedRecords(long[] var1, String var2, int var3) throws ModuleDoesNotExistException, ObjectTypeDoesNotExistException, RecordDoesNotExistException, Exception;

    Project[] getProjects() throws Exception;

    long getProjectId(String var1) throws Exception;

    KeywordSearchResult[] keywordSearch(long var1, long var3, long var5, String var7) throws ProjectDoesNotExistException, ModuleDoesNotExistException, ObjectTypeDoesNotExistException, InvalidArgumentException;

    String getNamedQueryType(String var1, String var2, String var3) throws ModuleDoesNotExistException, QueryDoesNotExistException, Exception;

    QueryResult runNamedQuery(String var1, String var2, String var3, String var4, Filter[] var5, int var6, int var7) throws ProjectDoesNotExistException, ModuleDoesNotExistException, ObjectTypeDoesNotExistException, RecordDoesNotExistException, QueryDoesNotExistException, InvalidArgumentException, Exception;

    QueryMultiBoResult runNamedQueryMultiBo(String var1, String var2, String var3, String var4, Filter[] var5, int var6, int var7) throws ProjectDoesNotExistException, ModuleDoesNotExistException, ObjectTypeDoesNotExistException, RecordDoesNotExistException, QueryDoesNotExistException, InvalidArgumentException, Exception;

    QueryMultiBoResult runNamedQueryMultiBoLocalized(String var1, String var2, String var3, String var4, Filter[] var5, int var6, int var7) throws ProjectDoesNotExistException, ModuleDoesNotExistException, ObjectTypeDoesNotExistException, RecordDoesNotExistException, QueryDoesNotExistException, InvalidArgumentException, Exception;

    QueryResult runNamedQueryContinue(ContinuationToken var1) throws InvalidContinuationTokenException, Exception;

    QueryMultiBoResult runNamedQueryMultiBoContinue(ContinuationToken var1) throws InvalidContinuationTokenException, Exception;

    QueryResult runDynamicQueryContinue(ContinuationToken var1) throws InvalidContinuationTokenException, Exception;

    MetricQueryResult runNamedMetricQueryContinue(ContinuationToken var1) throws InvalidContinuationTokenException, Exception;

    QueryResult runDynamicQuery(String var1, String var2, String[] var3, String[] var4, String var5, String var6, int var7, DisplayLabel[] var8, DisplayLabel[] var9, FieldSortOrder[] var10, Filter[] var11, AssociationFilter[] var12, int var13, int var14) throws ProjectDoesNotExistException, ModuleDoesNotExistException, ObjectTypeDoesNotExistException, RecordDoesNotExistException, InvalidArgumentException, Exception;

    MetricQueryResult runNamedMetricQuery(String var1, String var2, String var3, MetricQueryFilter[] var4, GroupBy var5, int var6, int var7) throws ModuleDoesNotExistException, ObjectTypeDoesNotExistException, RecordDoesNotExistException, QueryDoesNotExistException, InvalidArgumentException, Exception;

    AvailableAction[] getAvailableActions(long[] var1) throws InvalidArgumentException, Exception;

    Transition[] getDefaultGUIActions(long var1) throws GuiDoesNotExistException;

    State[] getGUIStateTransitions(long var1, long var3) throws InvalidArgumentException, Exception;

    State[] getRecordState(long[] var1) throws InvalidArgumentException, Exception;

    void register(long var1) throws Exception;

    ResponseHelper terminateSession(long var1) throws Exception;

    Response upload(Content var1) throws InvalidContentException, InvalidDocumentTypeException, AccessException;

    Response download(Content var1) throws InvalidContentException, InvalidDocumentTypeException, AccessException;

    Response[] uploadFrom(Collection<Content> var1);

    Response[] downloadTo(Collection<Content> var1);

    Response delete(Content var1) throws InvalidContentException, InvalidDocumentTypeException;

    String copy(Long var1, Long var2) throws InvalidDocumentTypeException, AccessException, RecordDoesNotExistException, InvalidContentException;

    Long getContentLength(Content var1) throws InvalidContentException, InvalidDocumentTypeException, AccessException;

    Long getChecksum(Content var1) throws InvalidContentException, InvalidDocumentTypeException, AccessException;

    ContentField[] getContentFieldsDefinition(String var1, String var2) throws ModuleDoesNotExistException, ObjectTypeDoesNotExistException, AccessException;
}
