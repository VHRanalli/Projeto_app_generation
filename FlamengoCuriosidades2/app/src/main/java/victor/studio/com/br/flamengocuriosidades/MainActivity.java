package victor.studio.com.br.flamengocuriosidades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private FlaCuriosidades generatorC;//instanciamento das curiosidades
    private TextView txtPrincipal;//criação da variavel que recebera o componente id da textview
    private Button btnGerar;//variavel que recebera o botão
    private Button btnAutomacao;//variavel que recebera o botão
    private boolean aleatorio = false;//variavel de verificação
    private Handler mHandler = new Handler();//variavel que ira gerar o loop

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPrincipal = findViewById(R.id.texto_principal);//vinculação do elemento Text View da activity_main
        btnGerar = findViewById(R.id.gerar_curiosidade);//vinculação do elemento Button da activity_main
        btnAutomacao = findViewById(R.id.botao_automacao);//vinculação do elemento Button da activity_main
        generatorC = new FlaCuriosidades();// iniciando o construtor das curiozidades
        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtPrincipal.setText(generatorC.sortearCuriosidades());//irá pegar uma curiozidade aleatoria e imprimirá na tela
            }
        });

        btnAutomacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(aleatorio != true){ //if e else farão a verificação de stop do looping
                    aleatorio = true;
                    startReapeating();
                }else{
                    aleatorio = false;
                    stopRepeating();
                }

            }
        });
    }

    public void startReapeating(){
        mToastRunnable.run();
    } // metodo que iniciara o loop

    public void stopRepeating(){
        mHandler.removeCallbacks(mToastRunnable);
    } // metodo que finalizara o loop

    //metodo que controlara o loop e imprimira na tela as curiosidades
    private Runnable mToastRunnable = new Runnable() {
        @Override
        public void run() {
            txtPrincipal.setText(generatorC.sortearCuriosidades());
            mHandler.postDelayed(this, 7500);
        }
    };
}