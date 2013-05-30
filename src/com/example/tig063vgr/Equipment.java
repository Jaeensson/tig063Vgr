package com.example.tig063vgr;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by rasmus on 2013-05-30.
 */
public class Equipment implements Parcelable {
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

    public Equipment (Parcel p) {
        Bundle obj = p.readBundle();
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

    }

    public static final Parcelable.Creator<Equipment> CREATOR
            = new Parcelable.Creator<Equipment>() {
        public Equipment createFromParcel(Parcel in) {
            return new Equipment(in);
        }

        public Equipment[] newArray(int size) {
            return new Equipment[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        Bundle obj = new Bundle();
        
        obj.putString("Created", created);
        obj.putString("CreatedBy", createdBy);
        obj.putString("Id", id);
        obj.putString("Modified", modified);
        obj.putString("ModifiedBy", modifiedBy);
        obj.putString("AcquisitionPrice", acquisitionPrice);
        obj.putString("AddedToBfrDate", addedToBfrDate);
        obj.putString("DeliveryDate", deliveryDate);
        obj.putString("ImagePath", imagePath);
        obj.putString("IsAboutToBeReplaced", isAboutToBeReplaced);
        obj.putString("LocationId", locationId);
        obj.putString("ModalityGroupId", modalityGroupId);
        obj.putString("Name", name);
        obj.putString("PurchaseDate", purchaseDate);
        obj.putString("RegisterId", registerId);
        obj.putString("SerialNumber", serialNumber);
        
        parcel.writeBundle(obj);
    }
}
