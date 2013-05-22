
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.ArrayOfEquipmentDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.ArrayOfLocationDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.ArrayOfMaintenanceContractDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.ArrayOfMaintenanceProviderDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.ArrayOfModalityDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.ArrayOfModalityGroupDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.ArrayOfOrganizationDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.ArrayOfOrganizationalUnitDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.ArrayOfTimelineDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.EquipmentDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.LocationDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.MaintenanceContractDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.MaintenanceProviderDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.ModalityDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.ModalityGroupDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.OrganizationDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.OrganizationalUnitDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.TimelineDto;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EditOrganizationOrganizationDto_QNAME = new QName("http://tempuri.org/", "organizationDto");
    private final static QName _GetTimelineByLocationResponseGetTimelineByLocationResult_QNAME = new QName("http://tempuri.org/", "GetTimelineByLocationResult");
    private final static QName _EditMaintenanceContractMaintenanceContractDto_QNAME = new QName("http://tempuri.org/", "maintenanceContractDto");
    private final static QName _GetLocationsResponseGetLocationsResult_QNAME = new QName("http://tempuri.org/", "GetLocationsResult");
    private final static QName _EditLocationLocationDto_QNAME = new QName("http://tempuri.org/", "locationDto");
    private final static QName _GetTimelineByModalityGroupResponseGetTimelineByModalityGroupResult_QNAME = new QName("http://tempuri.org/", "GetTimelineByModalityGroupResult");
    private final static QName _GetTimelineByMaintenanceContractResponseGetTimelineByMaintenanceContractResult_QNAME = new QName("http://tempuri.org/", "GetTimelineByMaintenanceContractResult");
    private final static QName _GetOrganizationsResponseGetOrganizationsResult_QNAME = new QName("http://tempuri.org/", "GetOrganizationsResult");
    private final static QName _AddModalityModalityDto_QNAME = new QName("http://tempuri.org/", "modalityDto");
    private final static QName _EditOrganizationalUnitOrganizationalUnitDto_QNAME = new QName("http://tempuri.org/", "organizationalUnitDto");
    private final static QName _GetModalityResponseGetModalityResult_QNAME = new QName("http://tempuri.org/", "GetModalityResult");
    private final static QName _AddMaintenanceProviderMaintenanceProviderDto_QNAME = new QName("http://tempuri.org/", "maintenanceProviderDto");
    private final static QName _EditEquipmentEquipmentDto_QNAME = new QName("http://tempuri.org/", "equipmentDto");
    private final static QName _EditTimelineTimelineDto_QNAME = new QName("http://tempuri.org/", "timelineDto");
    private final static QName _GetMaintenanceProvidersResponseGetMaintenanceProvidersResult_QNAME = new QName("http://tempuri.org/", "GetMaintenanceProvidersResult");
    private final static QName _GetModalityGroupsResponseGetModalityGroupsResult_QNAME = new QName("http://tempuri.org/", "GetModalityGroupsResult");
    private final static QName _GetMaintenanceContractsResponseGetMaintenanceContractsResult_QNAME = new QName("http://tempuri.org/", "GetMaintenanceContractsResult");
    private final static QName _GetTimelineByHsaIdentityHsaIdentity_QNAME = new QName("http://tempuri.org/", "hsaIdentity");
    private final static QName _GetEquipmentResponseGetEquipmentResult_QNAME = new QName("http://tempuri.org/", "GetEquipmentResult");
    private final static QName _GetModalityGroupResponseGetModalityGroupResult_QNAME = new QName("http://tempuri.org/", "GetModalityGroupResult");
    private final static QName _GetOrganizationResponseGetOrganizationResult_QNAME = new QName("http://tempuri.org/", "GetOrganizationResult");
    private final static QName _GetOrganizationalUnitsResponseGetOrganizationalUnitsResult_QNAME = new QName("http://tempuri.org/", "GetOrganizationalUnitsResult");
    private final static QName _GetTimelineResponseGetTimelineResult_QNAME = new QName("http://tempuri.org/", "GetTimelineResult");
    private final static QName _GetTimelineByHsaIdentityResponseGetTimelineByHsaIdentityResult_QNAME = new QName("http://tempuri.org/", "GetTimelineByHsaIdentityResult");
    private final static QName _GetTimelineByMaintenanceProviderResponseGetTimelineByMaintenanceProviderResult_QNAME = new QName("http://tempuri.org/", "GetTimelineByMaintenanceProviderResult");
    private final static QName _GetMaintenanceContractResponseGetMaintenanceContractResult_QNAME = new QName("http://tempuri.org/", "GetMaintenanceContractResult");
    private final static QName _GetLocationResponseGetLocationResult_QNAME = new QName("http://tempuri.org/", "GetLocationResult");
    private final static QName _GetEquipmentsResponseGetEquipmentsResult_QNAME = new QName("http://tempuri.org/", "GetEquipmentsResult");
    private final static QName _GetModalitiesResponseGetModalitiesResult_QNAME = new QName("http://tempuri.org/", "GetModalitiesResult");
    private final static QName _GeTimelinesResponseGeTimelinesResult_QNAME = new QName("http://tempuri.org/", "GeTimelinesResult");
    private final static QName _GetMaintenanceProviderResponseGetMaintenanceProviderResult_QNAME = new QName("http://tempuri.org/", "GetMaintenanceProviderResult");
    private final static QName _EditModalityGroupModalityGroupDto_QNAME = new QName("http://tempuri.org/", "modalityGroupDto");
    private final static QName _GetOrganizationalUnitResponseGetOrganizationalUnitResult_QNAME = new QName("http://tempuri.org/", "GetOrganizationalUnitResult");
    private final static QName _GetTimelineByEquipmentResponseGetTimelineByEquipmentResult_QNAME = new QName("http://tempuri.org/", "GetTimelineByEquipmentResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddOrganization }
     * 
     */
    public AddOrganization createAddOrganization() {
        return new AddOrganization();
    }

    /**
     * Create an instance of {@link RemoveMaintenanceProvider }
     * 
     */
    public RemoveMaintenanceProvider createRemoveMaintenanceProvider() {
        return new RemoveMaintenanceProvider();
    }

    /**
     * Create an instance of {@link GetModalityResponse }
     * 
     */
    public GetModalityResponse createGetModalityResponse() {
        return new GetModalityResponse();
    }

    /**
     * Create an instance of {@link GetTimelineByMaintenanceContractResponse }
     * 
     */
    public GetTimelineByMaintenanceContractResponse createGetTimelineByMaintenanceContractResponse() {
        return new GetTimelineByMaintenanceContractResponse();
    }

    /**
     * Create an instance of {@link GetMaintenanceContractsResponse }
     * 
     */
    public GetMaintenanceContractsResponse createGetMaintenanceContractsResponse() {
        return new GetMaintenanceContractsResponse();
    }

    /**
     * Create an instance of {@link RemoveLocationResponse }
     * 
     */
    public RemoveLocationResponse createRemoveLocationResponse() {
        return new RemoveLocationResponse();
    }

    /**
     * Create an instance of {@link RemoveMaintenanceProviderResponse }
     * 
     */
    public RemoveMaintenanceProviderResponse createRemoveMaintenanceProviderResponse() {
        return new RemoveMaintenanceProviderResponse();
    }

    /**
     * Create an instance of {@link AddEquipment }
     * 
     */
    public AddEquipment createAddEquipment() {
        return new AddEquipment();
    }

    /**
     * Create an instance of {@link GetModalitiesResponse }
     * 
     */
    public GetModalitiesResponse createGetModalitiesResponse() {
        return new GetModalitiesResponse();
    }

    /**
     * Create an instance of {@link GetOrganizationsResponse }
     * 
     */
    public GetOrganizationsResponse createGetOrganizationsResponse() {
        return new GetOrganizationsResponse();
    }

    /**
     * Create an instance of {@link GetTimelineByMaintenanceProvider }
     * 
     */
    public GetTimelineByMaintenanceProvider createGetTimelineByMaintenanceProvider() {
        return new GetTimelineByMaintenanceProvider();
    }

    /**
     * Create an instance of {@link EditMaintenanceContractResponse }
     * 
     */
    public EditMaintenanceContractResponse createEditMaintenanceContractResponse() {
        return new EditMaintenanceContractResponse();
    }

    /**
     * Create an instance of {@link EditTimelineResponse }
     * 
     */
    public EditTimelineResponse createEditTimelineResponse() {
        return new EditTimelineResponse();
    }

    /**
     * Create an instance of {@link GetOrganizations }
     * 
     */
    public GetOrganizations createGetOrganizations() {
        return new GetOrganizations();
    }

    /**
     * Create an instance of {@link AddOrganizationalUnit }
     * 
     */
    public AddOrganizationalUnit createAddOrganizationalUnit() {
        return new AddOrganizationalUnit();
    }

    /**
     * Create an instance of {@link RemoveLocation }
     * 
     */
    public RemoveLocation createRemoveLocation() {
        return new RemoveLocation();
    }

    /**
     * Create an instance of {@link GetEquipments }
     * 
     */
    public GetEquipments createGetEquipments() {
        return new GetEquipments();
    }

    /**
     * Create an instance of {@link AddModality }
     * 
     */
    public AddModality createAddModality() {
        return new AddModality();
    }

    /**
     * Create an instance of {@link GetTimelineByHsaIdentity }
     * 
     */
    public GetTimelineByHsaIdentity createGetTimelineByHsaIdentity() {
        return new GetTimelineByHsaIdentity();
    }

    /**
     * Create an instance of {@link EditEquipment }
     * 
     */
    public EditEquipment createEditEquipment() {
        return new EditEquipment();
    }

    /**
     * Create an instance of {@link GetTimelineByMaintenanceProviderResponse }
     * 
     */
    public GetTimelineByMaintenanceProviderResponse createGetTimelineByMaintenanceProviderResponse() {
        return new GetTimelineByMaintenanceProviderResponse();
    }

    /**
     * Create an instance of {@link GetMaintenanceContracts }
     * 
     */
    public GetMaintenanceContracts createGetMaintenanceContracts() {
        return new GetMaintenanceContracts();
    }

    /**
     * Create an instance of {@link AddLocation }
     * 
     */
    public AddLocation createAddLocation() {
        return new AddLocation();
    }

    /**
     * Create an instance of {@link AddOrganizationalUnitResponse }
     * 
     */
    public AddOrganizationalUnitResponse createAddOrganizationalUnitResponse() {
        return new AddOrganizationalUnitResponse();
    }

    /**
     * Create an instance of {@link GetOrganizationalUnit }
     * 
     */
    public GetOrganizationalUnit createGetOrganizationalUnit() {
        return new GetOrganizationalUnit();
    }

    /**
     * Create an instance of {@link GetTimelineByModalityGroupResponse }
     * 
     */
    public GetTimelineByModalityGroupResponse createGetTimelineByModalityGroupResponse() {
        return new GetTimelineByModalityGroupResponse();
    }

    /**
     * Create an instance of {@link GetEquipmentsResponse }
     * 
     */
    public GetEquipmentsResponse createGetEquipmentsResponse() {
        return new GetEquipmentsResponse();
    }

    /**
     * Create an instance of {@link EditTimeline }
     * 
     */
    public EditTimeline createEditTimeline() {
        return new EditTimeline();
    }

    /**
     * Create an instance of {@link GetLocationResponse }
     * 
     */
    public GetLocationResponse createGetLocationResponse() {
        return new GetLocationResponse();
    }

    /**
     * Create an instance of {@link GetOrganizationalUnits }
     * 
     */
    public GetOrganizationalUnits createGetOrganizationalUnits() {
        return new GetOrganizationalUnits();
    }

    /**
     * Create an instance of {@link AddMaintenanceContract }
     * 
     */
    public AddMaintenanceContract createAddMaintenanceContract() {
        return new AddMaintenanceContract();
    }

    /**
     * Create an instance of {@link RemoveModalityResponse }
     * 
     */
    public RemoveModalityResponse createRemoveModalityResponse() {
        return new RemoveModalityResponse();
    }

    /**
     * Create an instance of {@link GetOrganization }
     * 
     */
    public GetOrganization createGetOrganization() {
        return new GetOrganization();
    }

    /**
     * Create an instance of {@link GetModality }
     * 
     */
    public GetModality createGetModality() {
        return new GetModality();
    }

    /**
     * Create an instance of {@link EditModality }
     * 
     */
    public EditModality createEditModality() {
        return new EditModality();
    }

    /**
     * Create an instance of {@link EditEquipmentResponse }
     * 
     */
    public EditEquipmentResponse createEditEquipmentResponse() {
        return new EditEquipmentResponse();
    }

    /**
     * Create an instance of {@link RemoveModalityGroupResponse }
     * 
     */
    public RemoveModalityGroupResponse createRemoveModalityGroupResponse() {
        return new RemoveModalityGroupResponse();
    }

    /**
     * Create an instance of {@link GetTimelineResponse }
     * 
     */
    public GetTimelineResponse createGetTimelineResponse() {
        return new GetTimelineResponse();
    }

    /**
     * Create an instance of {@link AddMaintenanceProviderResponse }
     * 
     */
    public AddMaintenanceProviderResponse createAddMaintenanceProviderResponse() {
        return new AddMaintenanceProviderResponse();
    }

    /**
     * Create an instance of {@link EditOrganization }
     * 
     */
    public EditOrganization createEditOrganization() {
        return new EditOrganization();
    }

    /**
     * Create an instance of {@link AddModalityResponse }
     * 
     */
    public AddModalityResponse createAddModalityResponse() {
        return new AddModalityResponse();
    }

    /**
     * Create an instance of {@link RemoveOrganizationalUnit }
     * 
     */
    public RemoveOrganizationalUnit createRemoveOrganizationalUnit() {
        return new RemoveOrganizationalUnit();
    }

    /**
     * Create an instance of {@link GetMaintenanceContractResponse }
     * 
     */
    public GetMaintenanceContractResponse createGetMaintenanceContractResponse() {
        return new GetMaintenanceContractResponse();
    }

    /**
     * Create an instance of {@link RemoveOrganizationalUnitResponse }
     * 
     */
    public RemoveOrganizationalUnitResponse createRemoveOrganizationalUnitResponse() {
        return new RemoveOrganizationalUnitResponse();
    }

    /**
     * Create an instance of {@link GetOrganizationalUnitsResponse }
     * 
     */
    public GetOrganizationalUnitsResponse createGetOrganizationalUnitsResponse() {
        return new GetOrganizationalUnitsResponse();
    }

    /**
     * Create an instance of {@link EditModalityResponse }
     * 
     */
    public EditModalityResponse createEditModalityResponse() {
        return new EditModalityResponse();
    }

    /**
     * Create an instance of {@link GetMaintenanceProviderResponse }
     * 
     */
    public GetMaintenanceProviderResponse createGetMaintenanceProviderResponse() {
        return new GetMaintenanceProviderResponse();
    }

    /**
     * Create an instance of {@link AddModalityGroup }
     * 
     */
    public AddModalityGroup createAddModalityGroup() {
        return new AddModalityGroup();
    }

    /**
     * Create an instance of {@link GetTimelineByHsaIdentityResponse }
     * 
     */
    public GetTimelineByHsaIdentityResponse createGetTimelineByHsaIdentityResponse() {
        return new GetTimelineByHsaIdentityResponse();
    }

    /**
     * Create an instance of {@link EditModalityGroupResponse }
     * 
     */
    public EditModalityGroupResponse createEditModalityGroupResponse() {
        return new EditModalityGroupResponse();
    }

    /**
     * Create an instance of {@link GetMaintenanceProvider }
     * 
     */
    public GetMaintenanceProvider createGetMaintenanceProvider() {
        return new GetMaintenanceProvider();
    }

    /**
     * Create an instance of {@link EditOrganizationResponse }
     * 
     */
    public EditOrganizationResponse createEditOrganizationResponse() {
        return new EditOrganizationResponse();
    }

    /**
     * Create an instance of {@link RemoveOrganization }
     * 
     */
    public RemoveOrganization createRemoveOrganization() {
        return new RemoveOrganization();
    }

    /**
     * Create an instance of {@link GeTimelinesResponse }
     * 
     */
    public GeTimelinesResponse createGeTimelinesResponse() {
        return new GeTimelinesResponse();
    }

    /**
     * Create an instance of {@link EditOrganizationalUnitResponse }
     * 
     */
    public EditOrganizationalUnitResponse createEditOrganizationalUnitResponse() {
        return new EditOrganizationalUnitResponse();
    }

    /**
     * Create an instance of {@link EditOrganizationalUnit }
     * 
     */
    public EditOrganizationalUnit createEditOrganizationalUnit() {
        return new EditOrganizationalUnit();
    }

    /**
     * Create an instance of {@link GetLocationsResponse }
     * 
     */
    public GetLocationsResponse createGetLocationsResponse() {
        return new GetLocationsResponse();
    }

    /**
     * Create an instance of {@link AddOrganizationResponse }
     * 
     */
    public AddOrganizationResponse createAddOrganizationResponse() {
        return new AddOrganizationResponse();
    }

    /**
     * Create an instance of {@link AddTimeline }
     * 
     */
    public AddTimeline createAddTimeline() {
        return new AddTimeline();
    }

    /**
     * Create an instance of {@link GetEquipment }
     * 
     */
    public GetEquipment createGetEquipment() {
        return new GetEquipment();
    }

    /**
     * Create an instance of {@link RemoveTimelineResponse }
     * 
     */
    public RemoveTimelineResponse createRemoveTimelineResponse() {
        return new RemoveTimelineResponse();
    }

    /**
     * Create an instance of {@link GetMaintenanceProviders }
     * 
     */
    public GetMaintenanceProviders createGetMaintenanceProviders() {
        return new GetMaintenanceProviders();
    }

    /**
     * Create an instance of {@link GetTimelineByEquipmentResponse }
     * 
     */
    public GetTimelineByEquipmentResponse createGetTimelineByEquipmentResponse() {
        return new GetTimelineByEquipmentResponse();
    }

    /**
     * Create an instance of {@link GetMaintenanceContract }
     * 
     */
    public GetMaintenanceContract createGetMaintenanceContract() {
        return new GetMaintenanceContract();
    }

    /**
     * Create an instance of {@link GetModalityGroups }
     * 
     */
    public GetModalityGroups createGetModalityGroups() {
        return new GetModalityGroups();
    }

    /**
     * Create an instance of {@link EditMaintenanceProvider }
     * 
     */
    public EditMaintenanceProvider createEditMaintenanceProvider() {
        return new EditMaintenanceProvider();
    }

    /**
     * Create an instance of {@link GetOrganizationalUnitResponse }
     * 
     */
    public GetOrganizationalUnitResponse createGetOrganizationalUnitResponse() {
        return new GetOrganizationalUnitResponse();
    }

    /**
     * Create an instance of {@link EditLocation }
     * 
     */
    public EditLocation createEditLocation() {
        return new EditLocation();
    }

    /**
     * Create an instance of {@link GetMaintenanceProvidersResponse }
     * 
     */
    public GetMaintenanceProvidersResponse createGetMaintenanceProvidersResponse() {
        return new GetMaintenanceProvidersResponse();
    }

    /**
     * Create an instance of {@link GetTimelineByLocationResponse }
     * 
     */
    public GetTimelineByLocationResponse createGetTimelineByLocationResponse() {
        return new GetTimelineByLocationResponse();
    }

    /**
     * Create an instance of {@link GetModalities }
     * 
     */
    public GetModalities createGetModalities() {
        return new GetModalities();
    }

    /**
     * Create an instance of {@link RemoveModality }
     * 
     */
    public RemoveModality createRemoveModality() {
        return new RemoveModality();
    }

    /**
     * Create an instance of {@link AddEquipmentResponse }
     * 
     */
    public AddEquipmentResponse createAddEquipmentResponse() {
        return new AddEquipmentResponse();
    }

    /**
     * Create an instance of {@link GetOrganizationResponse }
     * 
     */
    public GetOrganizationResponse createGetOrganizationResponse() {
        return new GetOrganizationResponse();
    }

    /**
     * Create an instance of {@link GetLocation }
     * 
     */
    public GetLocation createGetLocation() {
        return new GetLocation();
    }

    /**
     * Create an instance of {@link RemoveEquipmentResponse }
     * 
     */
    public RemoveEquipmentResponse createRemoveEquipmentResponse() {
        return new RemoveEquipmentResponse();
    }

    /**
     * Create an instance of {@link EditMaintenanceContract }
     * 
     */
    public EditMaintenanceContract createEditMaintenanceContract() {
        return new EditMaintenanceContract();
    }

    /**
     * Create an instance of {@link RemoveTimeline }
     * 
     */
    public RemoveTimeline createRemoveTimeline() {
        return new RemoveTimeline();
    }

    /**
     * Create an instance of {@link GetTimelineByMaintenanceContract }
     * 
     */
    public GetTimelineByMaintenanceContract createGetTimelineByMaintenanceContract() {
        return new GetTimelineByMaintenanceContract();
    }

    /**
     * Create an instance of {@link RemoveModalityGroup }
     * 
     */
    public RemoveModalityGroup createRemoveModalityGroup() {
        return new RemoveModalityGroup();
    }

    /**
     * Create an instance of {@link RemoveMaintenanceContract }
     * 
     */
    public RemoveMaintenanceContract createRemoveMaintenanceContract() {
        return new RemoveMaintenanceContract();
    }

    /**
     * Create an instance of {@link GetLocations }
     * 
     */
    public GetLocations createGetLocations() {
        return new GetLocations();
    }

    /**
     * Create an instance of {@link GetTimelineByModalityGroup }
     * 
     */
    public GetTimelineByModalityGroup createGetTimelineByModalityGroup() {
        return new GetTimelineByModalityGroup();
    }

    /**
     * Create an instance of {@link EditModalityGroup }
     * 
     */
    public EditModalityGroup createEditModalityGroup() {
        return new EditModalityGroup();
    }

    /**
     * Create an instance of {@link GetEquipmentResponse }
     * 
     */
    public GetEquipmentResponse createGetEquipmentResponse() {
        return new GetEquipmentResponse();
    }

    /**
     * Create an instance of {@link RemoveMaintenanceContractResponse }
     * 
     */
    public RemoveMaintenanceContractResponse createRemoveMaintenanceContractResponse() {
        return new RemoveMaintenanceContractResponse();
    }

    /**
     * Create an instance of {@link AddTimelineResponse }
     * 
     */
    public AddTimelineResponse createAddTimelineResponse() {
        return new AddTimelineResponse();
    }

    /**
     * Create an instance of {@link EditLocationResponse }
     * 
     */
    public EditLocationResponse createEditLocationResponse() {
        return new EditLocationResponse();
    }

    /**
     * Create an instance of {@link GetTimelineByEquipment }
     * 
     */
    public GetTimelineByEquipment createGetTimelineByEquipment() {
        return new GetTimelineByEquipment();
    }

    /**
     * Create an instance of {@link RemoveOrganizationResponse }
     * 
     */
    public RemoveOrganizationResponse createRemoveOrganizationResponse() {
        return new RemoveOrganizationResponse();
    }

    /**
     * Create an instance of {@link AddModalityGroupResponse }
     * 
     */
    public AddModalityGroupResponse createAddModalityGroupResponse() {
        return new AddModalityGroupResponse();
    }

    /**
     * Create an instance of {@link RemoveEquipment }
     * 
     */
    public RemoveEquipment createRemoveEquipment() {
        return new RemoveEquipment();
    }

    /**
     * Create an instance of {@link AddLocationResponse }
     * 
     */
    public AddLocationResponse createAddLocationResponse() {
        return new AddLocationResponse();
    }

    /**
     * Create an instance of {@link GetModalityGroupsResponse }
     * 
     */
    public GetModalityGroupsResponse createGetModalityGroupsResponse() {
        return new GetModalityGroupsResponse();
    }

    /**
     * Create an instance of {@link AddMaintenanceContractResponse }
     * 
     */
    public AddMaintenanceContractResponse createAddMaintenanceContractResponse() {
        return new AddMaintenanceContractResponse();
    }

    /**
     * Create an instance of {@link GetTimelineByLocation }
     * 
     */
    public GetTimelineByLocation createGetTimelineByLocation() {
        return new GetTimelineByLocation();
    }

    /**
     * Create an instance of {@link GetModalityGroup }
     * 
     */
    public GetModalityGroup createGetModalityGroup() {
        return new GetModalityGroup();
    }

    /**
     * Create an instance of {@link AddMaintenanceProvider }
     * 
     */
    public AddMaintenanceProvider createAddMaintenanceProvider() {
        return new AddMaintenanceProvider();
    }

    /**
     * Create an instance of {@link GetModalityGroupResponse }
     * 
     */
    public GetModalityGroupResponse createGetModalityGroupResponse() {
        return new GetModalityGroupResponse();
    }

    /**
     * Create an instance of {@link EditMaintenanceProviderResponse }
     * 
     */
    public EditMaintenanceProviderResponse createEditMaintenanceProviderResponse() {
        return new EditMaintenanceProviderResponse();
    }

    /**
     * Create an instance of {@link GetTimeline }
     * 
     */
    public GetTimeline createGetTimeline() {
        return new GetTimeline();
    }

    /**
     * Create an instance of {@link GeTimelines }
     * 
     */
    public GeTimelines createGeTimelines() {
        return new GeTimelines();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "organizationDto", scope = EditOrganization.class)
    public JAXBElement<OrganizationDto> createEditOrganizationOrganizationDto(OrganizationDto value) {
        return new JAXBElement<OrganizationDto>(_EditOrganizationOrganizationDto_QNAME, OrganizationDto.class, EditOrganization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimelineDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTimelineByLocationResult", scope = GetTimelineByLocationResponse.class)
    public JAXBElement<ArrayOfTimelineDto> createGetTimelineByLocationResponseGetTimelineByLocationResult(ArrayOfTimelineDto value) {
        return new JAXBElement<ArrayOfTimelineDto>(_GetTimelineByLocationResponseGetTimelineByLocationResult_QNAME, ArrayOfTimelineDto.class, GetTimelineByLocationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceContractDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "maintenanceContractDto", scope = EditMaintenanceContract.class)
    public JAXBElement<MaintenanceContractDto> createEditMaintenanceContractMaintenanceContractDto(MaintenanceContractDto value) {
        return new JAXBElement<MaintenanceContractDto>(_EditMaintenanceContractMaintenanceContractDto_QNAME, MaintenanceContractDto.class, EditMaintenanceContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetLocationsResult", scope = GetLocationsResponse.class)
    public JAXBElement<ArrayOfLocationDto> createGetLocationsResponseGetLocationsResult(ArrayOfLocationDto value) {
        return new JAXBElement<ArrayOfLocationDto>(_GetLocationsResponseGetLocationsResult_QNAME, ArrayOfLocationDto.class, GetLocationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "locationDto", scope = EditLocation.class)
    public JAXBElement<LocationDto> createEditLocationLocationDto(LocationDto value) {
        return new JAXBElement<LocationDto>(_EditLocationLocationDto_QNAME, LocationDto.class, EditLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimelineDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTimelineByModalityGroupResult", scope = GetTimelineByModalityGroupResponse.class)
    public JAXBElement<ArrayOfTimelineDto> createGetTimelineByModalityGroupResponseGetTimelineByModalityGroupResult(ArrayOfTimelineDto value) {
        return new JAXBElement<ArrayOfTimelineDto>(_GetTimelineByModalityGroupResponseGetTimelineByModalityGroupResult_QNAME, ArrayOfTimelineDto.class, GetTimelineByModalityGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimelineDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTimelineByMaintenanceContractResult", scope = GetTimelineByMaintenanceContractResponse.class)
    public JAXBElement<ArrayOfTimelineDto> createGetTimelineByMaintenanceContractResponseGetTimelineByMaintenanceContractResult(ArrayOfTimelineDto value) {
        return new JAXBElement<ArrayOfTimelineDto>(_GetTimelineByMaintenanceContractResponseGetTimelineByMaintenanceContractResult_QNAME, ArrayOfTimelineDto.class, GetTimelineByMaintenanceContractResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganizationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetOrganizationsResult", scope = GetOrganizationsResponse.class)
    public JAXBElement<ArrayOfOrganizationDto> createGetOrganizationsResponseGetOrganizationsResult(ArrayOfOrganizationDto value) {
        return new JAXBElement<ArrayOfOrganizationDto>(_GetOrganizationsResponseGetOrganizationsResult_QNAME, ArrayOfOrganizationDto.class, GetOrganizationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModalityDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "modalityDto", scope = AddModality.class)
    public JAXBElement<ModalityDto> createAddModalityModalityDto(ModalityDto value) {
        return new JAXBElement<ModalityDto>(_AddModalityModalityDto_QNAME, ModalityDto.class, AddModality.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationalUnitDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "organizationalUnitDto", scope = EditOrganizationalUnit.class)
    public JAXBElement<OrganizationalUnitDto> createEditOrganizationalUnitOrganizationalUnitDto(OrganizationalUnitDto value) {
        return new JAXBElement<OrganizationalUnitDto>(_EditOrganizationalUnitOrganizationalUnitDto_QNAME, OrganizationalUnitDto.class, EditOrganizationalUnit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModalityDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetModalityResult", scope = GetModalityResponse.class)
    public JAXBElement<ModalityDto> createGetModalityResponseGetModalityResult(ModalityDto value) {
        return new JAXBElement<ModalityDto>(_GetModalityResponseGetModalityResult_QNAME, ModalityDto.class, GetModalityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceProviderDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "maintenanceProviderDto", scope = AddMaintenanceProvider.class)
    public JAXBElement<MaintenanceProviderDto> createAddMaintenanceProviderMaintenanceProviderDto(MaintenanceProviderDto value) {
        return new JAXBElement<MaintenanceProviderDto>(_AddMaintenanceProviderMaintenanceProviderDto_QNAME, MaintenanceProviderDto.class, AddMaintenanceProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceProviderDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "maintenanceProviderDto", scope = EditMaintenanceProvider.class)
    public JAXBElement<MaintenanceProviderDto> createEditMaintenanceProviderMaintenanceProviderDto(MaintenanceProviderDto value) {
        return new JAXBElement<MaintenanceProviderDto>(_AddMaintenanceProviderMaintenanceProviderDto_QNAME, MaintenanceProviderDto.class, EditMaintenanceProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationalUnitDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "organizationalUnitDto", scope = AddOrganizationalUnit.class)
    public JAXBElement<OrganizationalUnitDto> createAddOrganizationalUnitOrganizationalUnitDto(OrganizationalUnitDto value) {
        return new JAXBElement<OrganizationalUnitDto>(_EditOrganizationalUnitOrganizationalUnitDto_QNAME, OrganizationalUnitDto.class, AddOrganizationalUnit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "equipmentDto", scope = EditEquipment.class)
    public JAXBElement<EquipmentDto> createEditEquipmentEquipmentDto(EquipmentDto value) {
        return new JAXBElement<EquipmentDto>(_EditEquipmentEquipmentDto_QNAME, EquipmentDto.class, EditEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "equipmentDto", scope = AddEquipment.class)
    public JAXBElement<EquipmentDto> createAddEquipmentEquipmentDto(EquipmentDto value) {
        return new JAXBElement<EquipmentDto>(_EditEquipmentEquipmentDto_QNAME, EquipmentDto.class, AddEquipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModalityDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "modalityDto", scope = EditModality.class)
    public JAXBElement<ModalityDto> createEditModalityModalityDto(ModalityDto value) {
        return new JAXBElement<ModalityDto>(_AddModalityModalityDto_QNAME, ModalityDto.class, EditModality.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimelineDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "timelineDto", scope = EditTimeline.class)
    public JAXBElement<TimelineDto> createEditTimelineTimelineDto(TimelineDto value) {
        return new JAXBElement<TimelineDto>(_EditTimelineTimelineDto_QNAME, TimelineDto.class, EditTimeline.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMaintenanceProviderDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetMaintenanceProvidersResult", scope = GetMaintenanceProvidersResponse.class)
    public JAXBElement<ArrayOfMaintenanceProviderDto> createGetMaintenanceProvidersResponseGetMaintenanceProvidersResult(ArrayOfMaintenanceProviderDto value) {
        return new JAXBElement<ArrayOfMaintenanceProviderDto>(_GetMaintenanceProvidersResponseGetMaintenanceProvidersResult_QNAME, ArrayOfMaintenanceProviderDto.class, GetMaintenanceProvidersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModalityGroupDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetModalityGroupsResult", scope = GetModalityGroupsResponse.class)
    public JAXBElement<ArrayOfModalityGroupDto> createGetModalityGroupsResponseGetModalityGroupsResult(ArrayOfModalityGroupDto value) {
        return new JAXBElement<ArrayOfModalityGroupDto>(_GetModalityGroupsResponseGetModalityGroupsResult_QNAME, ArrayOfModalityGroupDto.class, GetModalityGroupsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimelineDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "timelineDto", scope = AddTimeline.class)
    public JAXBElement<TimelineDto> createAddTimelineTimelineDto(TimelineDto value) {
        return new JAXBElement<TimelineDto>(_EditTimelineTimelineDto_QNAME, TimelineDto.class, AddTimeline.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMaintenanceContractDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetMaintenanceContractsResult", scope = GetMaintenanceContractsResponse.class)
    public JAXBElement<ArrayOfMaintenanceContractDto> createGetMaintenanceContractsResponseGetMaintenanceContractsResult(ArrayOfMaintenanceContractDto value) {
        return new JAXBElement<ArrayOfMaintenanceContractDto>(_GetMaintenanceContractsResponseGetMaintenanceContractsResult_QNAME, ArrayOfMaintenanceContractDto.class, GetMaintenanceContractsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hsaIdentity", scope = GetTimelineByHsaIdentity.class)
    public JAXBElement<String> createGetTimelineByHsaIdentityHsaIdentity(String value) {
        return new JAXBElement<String>(_GetTimelineByHsaIdentityHsaIdentity_QNAME, String.class, GetTimelineByHsaIdentity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetEquipmentResult", scope = GetEquipmentResponse.class)
    public JAXBElement<EquipmentDto> createGetEquipmentResponseGetEquipmentResult(EquipmentDto value) {
        return new JAXBElement<EquipmentDto>(_GetEquipmentResponseGetEquipmentResult_QNAME, EquipmentDto.class, GetEquipmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "locationDto", scope = AddLocation.class)
    public JAXBElement<LocationDto> createAddLocationLocationDto(LocationDto value) {
        return new JAXBElement<LocationDto>(_EditLocationLocationDto_QNAME, LocationDto.class, AddLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModalityGroupDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetModalityGroupResult", scope = GetModalityGroupResponse.class)
    public JAXBElement<ModalityGroupDto> createGetModalityGroupResponseGetModalityGroupResult(ModalityGroupDto value) {
        return new JAXBElement<ModalityGroupDto>(_GetModalityGroupResponseGetModalityGroupResult_QNAME, ModalityGroupDto.class, GetModalityGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetOrganizationResult", scope = GetOrganizationResponse.class)
    public JAXBElement<OrganizationDto> createGetOrganizationResponseGetOrganizationResult(OrganizationDto value) {
        return new JAXBElement<OrganizationDto>(_GetOrganizationResponseGetOrganizationResult_QNAME, OrganizationDto.class, GetOrganizationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrganizationalUnitDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetOrganizationalUnitsResult", scope = GetOrganizationalUnitsResponse.class)
    public JAXBElement<ArrayOfOrganizationalUnitDto> createGetOrganizationalUnitsResponseGetOrganizationalUnitsResult(ArrayOfOrganizationalUnitDto value) {
        return new JAXBElement<ArrayOfOrganizationalUnitDto>(_GetOrganizationalUnitsResponseGetOrganizationalUnitsResult_QNAME, ArrayOfOrganizationalUnitDto.class, GetOrganizationalUnitsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimelineDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTimelineResult", scope = GetTimelineResponse.class)
    public JAXBElement<TimelineDto> createGetTimelineResponseGetTimelineResult(TimelineDto value) {
        return new JAXBElement<TimelineDto>(_GetTimelineResponseGetTimelineResult_QNAME, TimelineDto.class, GetTimelineResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimelineDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTimelineByHsaIdentityResult", scope = GetTimelineByHsaIdentityResponse.class)
    public JAXBElement<ArrayOfTimelineDto> createGetTimelineByHsaIdentityResponseGetTimelineByHsaIdentityResult(ArrayOfTimelineDto value) {
        return new JAXBElement<ArrayOfTimelineDto>(_GetTimelineByHsaIdentityResponseGetTimelineByHsaIdentityResult_QNAME, ArrayOfTimelineDto.class, GetTimelineByHsaIdentityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceContractDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "maintenanceContractDto", scope = AddMaintenanceContract.class)
    public JAXBElement<MaintenanceContractDto> createAddMaintenanceContractMaintenanceContractDto(MaintenanceContractDto value) {
        return new JAXBElement<MaintenanceContractDto>(_EditMaintenanceContractMaintenanceContractDto_QNAME, MaintenanceContractDto.class, AddMaintenanceContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimelineDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTimelineByMaintenanceProviderResult", scope = GetTimelineByMaintenanceProviderResponse.class)
    public JAXBElement<ArrayOfTimelineDto> createGetTimelineByMaintenanceProviderResponseGetTimelineByMaintenanceProviderResult(ArrayOfTimelineDto value) {
        return new JAXBElement<ArrayOfTimelineDto>(_GetTimelineByMaintenanceProviderResponseGetTimelineByMaintenanceProviderResult_QNAME, ArrayOfTimelineDto.class, GetTimelineByMaintenanceProviderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceContractDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetMaintenanceContractResult", scope = GetMaintenanceContractResponse.class)
    public JAXBElement<MaintenanceContractDto> createGetMaintenanceContractResponseGetMaintenanceContractResult(MaintenanceContractDto value) {
        return new JAXBElement<MaintenanceContractDto>(_GetMaintenanceContractResponseGetMaintenanceContractResult_QNAME, MaintenanceContractDto.class, GetMaintenanceContractResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetLocationResult", scope = GetLocationResponse.class)
    public JAXBElement<LocationDto> createGetLocationResponseGetLocationResult(LocationDto value) {
        return new JAXBElement<LocationDto>(_GetLocationResponseGetLocationResult_QNAME, LocationDto.class, GetLocationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetEquipmentsResult", scope = GetEquipmentsResponse.class)
    public JAXBElement<ArrayOfEquipmentDto> createGetEquipmentsResponseGetEquipmentsResult(ArrayOfEquipmentDto value) {
        return new JAXBElement<ArrayOfEquipmentDto>(_GetEquipmentsResponseGetEquipmentsResult_QNAME, ArrayOfEquipmentDto.class, GetEquipmentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModalityDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetModalitiesResult", scope = GetModalitiesResponse.class)
    public JAXBElement<ArrayOfModalityDto> createGetModalitiesResponseGetModalitiesResult(ArrayOfModalityDto value) {
        return new JAXBElement<ArrayOfModalityDto>(_GetModalitiesResponseGetModalitiesResult_QNAME, ArrayOfModalityDto.class, GetModalitiesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimelineDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GeTimelinesResult", scope = GeTimelinesResponse.class)
    public JAXBElement<ArrayOfTimelineDto> createGeTimelinesResponseGeTimelinesResult(ArrayOfTimelineDto value) {
        return new JAXBElement<ArrayOfTimelineDto>(_GeTimelinesResponseGeTimelinesResult_QNAME, ArrayOfTimelineDto.class, GeTimelinesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceProviderDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetMaintenanceProviderResult", scope = GetMaintenanceProviderResponse.class)
    public JAXBElement<MaintenanceProviderDto> createGetMaintenanceProviderResponseGetMaintenanceProviderResult(MaintenanceProviderDto value) {
        return new JAXBElement<MaintenanceProviderDto>(_GetMaintenanceProviderResponseGetMaintenanceProviderResult_QNAME, MaintenanceProviderDto.class, GetMaintenanceProviderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModalityGroupDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "modalityGroupDto", scope = EditModalityGroup.class)
    public JAXBElement<ModalityGroupDto> createEditModalityGroupModalityGroupDto(ModalityGroupDto value) {
        return new JAXBElement<ModalityGroupDto>(_EditModalityGroupModalityGroupDto_QNAME, ModalityGroupDto.class, EditModalityGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "organizationDto", scope = AddOrganization.class)
    public JAXBElement<OrganizationDto> createAddOrganizationOrganizationDto(OrganizationDto value) {
        return new JAXBElement<OrganizationDto>(_EditOrganizationOrganizationDto_QNAME, OrganizationDto.class, AddOrganization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationalUnitDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetOrganizationalUnitResult", scope = GetOrganizationalUnitResponse.class)
    public JAXBElement<OrganizationalUnitDto> createGetOrganizationalUnitResponseGetOrganizationalUnitResult(OrganizationalUnitDto value) {
        return new JAXBElement<OrganizationalUnitDto>(_GetOrganizationalUnitResponseGetOrganizationalUnitResult_QNAME, OrganizationalUnitDto.class, GetOrganizationalUnitResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTimelineDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTimelineByEquipmentResult", scope = GetTimelineByEquipmentResponse.class)
    public JAXBElement<ArrayOfTimelineDto> createGetTimelineByEquipmentResponseGetTimelineByEquipmentResult(ArrayOfTimelineDto value) {
        return new JAXBElement<ArrayOfTimelineDto>(_GetTimelineByEquipmentResponseGetTimelineByEquipmentResult_QNAME, ArrayOfTimelineDto.class, GetTimelineByEquipmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModalityGroupDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "modalityGroupDto", scope = AddModalityGroup.class)
    public JAXBElement<ModalityGroupDto> createAddModalityGroupModalityGroupDto(ModalityGroupDto value) {
        return new JAXBElement<ModalityGroupDto>(_EditModalityGroupModalityGroupDto_QNAME, ModalityGroupDto.class, AddModalityGroup.class, value);
    }

}
