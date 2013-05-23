public class printData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	    /**
	     * Executes the "GetOrganizations" operation.
	     * @return 
	     */
	    static List<OrganizationDto> getOrganizations() {
	    	ArrayOfOrganizationDto response = ModalityServiceAgent.getInstance().getService().getOrganizations();
	    	return response.getOrganizationDto();
	    }
	    
	    /**
	     * Executes the "GetOrganizationalUnits" operation.
	     * @return
	     */
	    static List<OrganizationalUnitDto> getOrganizationalUnits() {
	    	ArrayOfOrganizationalUnitDto response = ModalityServiceAgent.getInstance().getService().getOrganizationalUnits();
	    	return response.getOrganizationalUnitDto();
	    }
	    
	    /**
	     * Executes the "GetLocations" operation.
	     * @return
	     */
	    static List<LocationDto> getLocations() {
	    	ArrayOfLocationDto  response = ModalityServiceAgent.getInstance().getService().getLocations();
	    	return response.getLocationDto();
	    }
	    
	    /**
	     * Executes the "GetEquipment" operation.
	     * @return
	     */
	    static List<EquipmentDto> getEquipment() {
	    	ArrayOfEquipmentDto response = ModalityServiceAgent.getInstance().getService().getEquipments();
	    	return response.getEquipmentDto();
	    }
	    
	    /**
	     * Executes the "GetMaintenanceProviders" operation.
	     * @return
	     */
	    static List<MaintenanceProviderDto> getMaintenanceProviders() {
	    	ArrayOfMaintenanceProviderDto response = ModalityServiceAgent.getInstance().getService().getMaintenanceProviders();
	    	return response.getMaintenanceProviderDto();
	    }
	    
	    /**
	     * Executes the "GetMaintenanceContracts" operation.
	     * @return
	     */
	    static List<MaintenanceContractDto> getMaintenanceContracts() {
	    	ArrayOfMaintenanceContractDto response = ModalityServiceAgent.getInstance().getService().getMaintenanceContracts();
	    	return response.getMaintenanceContractDto();
	    }
	    
	    /**
	     * Executes the "GetModalities" operation.
	     * @return
	     */
	    static List<ModalityDto> getModalities() {
	    	ArrayOfModalityDto response = ModalityServiceAgent.getInstance().getService().getModalities();
	    	return response.getModalityDto();
	    }
	    
	    /**
	     * Executes the "GetModalityGroups" operation.
	     * @return
	     */
	    static List<ModalityGroupDto> getModalityGroups() {
	    	ArrayOfModalityGroupDto response = ModalityServiceAgent.getInstance().getService().getModalityGroups();
	    	return response.getModalityGroupDto();
	    }
	    
	    /**
	     * Executes the "GetTimelineByEquipment" operation.
	     * @return
	     */
	    static List<TimelineDto> getTimelineByEquipment() {
	    	List<EquipmentDto> equipment = ModalityServiceAgent.getInstance().getService().getEquipments().getEquipmentDto();
	    	ArrayOfTimelineDto response = ModalityServiceAgent.getInstance().getService().getTimelineByEquipment(equipment.get(0).getId());
	    	return response.getTimelineDto();
	    }
	    
	    /**
	     * Executes the "GetTimelineByModalityGroup" operation.
	     * @return
	     */
	    static List<TimelineDto> getTimelineByModalityGroup() {
	    	List<ModalityGroupDto> modalityGroups = ModalityServiceAgent.getInstance().getService().getModalityGroups().getModalityGroupDto();
	    	ArrayOfTimelineDto response = ModalityServiceAgent.getInstance().getService().getTimelineByModalityGroup(modalityGroups.get(0).getId());
	    	return response.getTimelineDto();
	    }
	}
}
