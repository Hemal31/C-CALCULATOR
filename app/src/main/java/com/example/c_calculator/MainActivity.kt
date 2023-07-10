package com.example.c_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

annotation class override

class MainActivity : AppCompatActivity() {
    Button btnConvert;
    EditText etmiles,etfeets,etinches;
    TextView tvResult;
    checkbox cbmeters;
    float result;
    private var cbmeters: Any

    @override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        var etmiles = this.findViewById(R.id.etmiles);
        var etmeters = findViewById(/* id = */ R.id.etmeters);
        var etInches = findViewById(R.id.einches);

        var btnConvert = findViewById(R.id.btnConvert);
        var tvResult = findViewById(R.id.tvResult);
        btnConvert=findViewById(R.id.btnConvert);
        tvResult=findViewById(R.id.tvResult);
        cbmeters=findViewById(R.id.cbmeters);
        btnConvert.setOnClickListener(new view.OnClickListener()
        {
            @override
            public void onClick(View View){doConversion();}
        });
    }
    private void doConversion()
    {
        result=0;
        if(!etInches.getText().tostring().equal("")){
            result=result+(float)(float.parseFloat(etInches.gettext().tostring().trim())*2.54);
        }
        if(!etmiles.gettext().tostring().equals("")){
            result=result+(float.parasfloat(etmiles.gettext().tostring().trim())*160934);
        }
        if(!etmeters.getText().tostring().equals("")){
            result=result+(float)(float.parasFloat(etmeters.getText().tostring().trim())*30.48);
        }
        if(cbmeters.ischecked()){
            result=result/100;
            tvresult.setText("result:"+result+"meters");
        }else
            private void doConversion()
            {
                result=0;
                if(!etInches.getText().tostring().equal("")){
                    result=result+(float)(float.parseFloat(etInches.gettext().tostring().trim())*2.54);
                }
                if(!etmiles.gettext().tostring().equals("")){
                    result=result+(float.parasfloat(etmiles.gettext().tostring().trim())*160934);
                }
                if(!etmeters.getText().tostring().equals("")){
                    result=result+(float)(float.parasFloat(etmeters.getText().tostring().trim())*30.48);
                    if(cbmeters.isChecked()){
                        result=result/100;
                        val tvresults = null
                        tvresults.settext("result:"+result+"cm");
                    }
            }
    }
}