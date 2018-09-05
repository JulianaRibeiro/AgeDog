package idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home;

import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.robot.RobotHome;
import idadedocachorro.studio.com.br.idadedocachorro.MainActivity;
import idadedocachorro.studio.com.br.idadedocachorro.common.ScreenRobot;

//@RunWith(AndroidJUnit4.class)

public class ExampleInstrumentedTest extends ScreenRobot {

    @Rule
    public ActivityTestRule<MainActivity>
        mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class, false,true);

    @Before
    public void test(){

    }

    @Test
    public void AutomacaoUmEncontrarTodosOsElementosDaTela(){
        new RobotHome()
                .checarImgCachorro()
                .checarCampoIdade()
                .checarSeBotaoClicavel();
    }

    @Test
    public void AutomacaoDoisValidarTodosOsTextosDaTela(){
        new RobotHome()
                .checkCabecalho()
                .checarTxtHome()
                .checarTxtBotao();
    }

    @Test
    public void AutomacaoTresValidarTextoComIdadeDoCachorro(){
        new RobotHome()
                .preencherCampoIdade()
                .clicarBtnHome()
                .checarTxtIdade()
                .checarIdadeValor();
    }

    @Test
    public void AutomacaoQuatroValidarTextoComIdadeDoCachorroVazia(){
        new RobotHome()
                .checarImgCachorro()
                .checarCampoIdade()
                .checarSeBotaoClicavel()
                .checkCabecalho()
                .checarTxtHome()
                .checarTxtBotao()
                .clicarBtnHome()
                .checarIdadeVazia();
    }
}



