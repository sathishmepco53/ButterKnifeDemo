package codificador.butterknifedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.editTextValueA)
    EditText editTextValueA;

    @BindView(R.id.editTextValueB)
    EditText editTextValueB;

    @BindViews({R.id.buttonAdd,R.id.buttonMul})
    List<Button> buttons;

    @BindView(R.id.textViewResult)
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonAdd)
    public void submit(View view){
        int a = Integer.parseInt(editTextValueA.getText().toString());
        int b = Integer.parseInt(editTextValueB.getText().toString());
        textViewResult.setText("Addition is "+(a+b));
    }

    @OnClick(R.id.buttonMul)
    public void mul(){
        int a = Integer.parseInt(editTextValueA.getText().toString());
        int b = Integer.parseInt(editTextValueB.getText().toString());
        textViewResult.setText("Multiplication is "+(a*b));
    }
}