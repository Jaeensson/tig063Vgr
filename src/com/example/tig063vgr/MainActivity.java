package com.example.tig063vgr;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
<<<<<<< HEAD
=======
import android.widget.TextView;
import modality.ModalityServiceAgent;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.ArrayOfEquipmentDto;
import org.datacontract.schemas._2004._07.vgregion_modalities_wcf_data.EquipmentDto;

import javax.xml.bind.JAXBElement;
import java.util.List;

>>>>>>> b9936126dbd7344b84e52d072bb6d0779e198f36
public class MainActivity extends Activity {

    TextView v;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
=======
        v = (TextView)findViewById(R.id.textView1);
        ArrayOfEquipmentDto a = ModalityServiceAgent.getInstance().getService().getEquipments();
        List<EquipmentDto> lista = a.getEquipmentDto();
        for (int i=0; i<lista.size();i++) {
            //JAXBElement<String> element;
            v.setText(v.getText() + "\n" + lista.get(i).getName().getValue());
        }
>>>>>>> b9936126dbd7344b84e52d072bb6d0779e198f36
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
