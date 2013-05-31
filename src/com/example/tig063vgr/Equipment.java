package com.example.tig063vgr;

import org.json.JSONException;
import org.json.JSONObject;

public class Equipment {
    private String created, createdBy, id, modified, modifiedBy, acquisitionPrice, addedToBfrDate, deliveryDate, imagePath, isAboutToBeReplaced,
            locationId, modalityGroupId, name, purchaseDate, registerId, serialNumber;

    public Equipment(JSONObject obj) {
        try {
            created = obj.getString("Created");
            createdBy = obj.getString("CreatedBy");
            id = obj.getString("Id");
            modified= obj.getString("Modified");
            modifiedBy = obj.getString("ModifiedBy");
            acquisitionPrice = obj.getString("AcquisitionPrice");
            addedToBfrDate = obj.getString("AddedToBfrDate");
            deliveryDate = obj.getString("DeliveryDate");
            imagePath = obj.getString("ImagePath");
            isAboutToBeReplaced = obj.getString("IsAboutToBeReplaced");
            locationId = obj.getString("LocationId");
            modalityGroupId = obj.getString("ModalityGroupId");
            name = obj.getString("Name");
            purchaseDate = obj.getString("PurchaseDate");
            registerId = obj.getString("RegisterId");
            serialNumber = obj.getString("SerialNumber");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getAcquisitionPrice() {
        return acquisitionPrice;
    }

    public void setAcquisitionPrice(String acquisitionPrice) {
        this.acquisitionPrice = acquisitionPrice;
    }

    public String getAddedToBfrDate() {
        return addedToBfrDate;
    }

    public void setAddedToBfrDate(String addedToBfrDate) {
        this.addedToBfrDate = addedToBfrDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getAboutToBeReplaced() {
        return isAboutToBeReplaced;
    }

    public void setAboutToBeReplaced(String aboutToBeReplaced) {
        isAboutToBeReplaced = aboutToBeReplaced;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getModalityGroupId() {
        return modalityGroupId;
    }

    public void setModalityGroupId(String modalityGroupId) {
        this.modalityGroupId = modalityGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
