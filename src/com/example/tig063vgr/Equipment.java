package com.example.tig063vgr;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by rasmus on 2013-05-30.
 */
public class Equipment {
    public String created, createdBy, id, modified, modifiedBy, acquisitionPrice, addedToBfrDate, deliveryDate, imagePath, isAboutToBeReplaced,
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
}
