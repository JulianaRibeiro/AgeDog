package idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.robot;

import idadedocachorro.studio.com.br.idadedocachorro.R;
import idadedocachorro.studio.com.br.idadedocachorro.common.ScreenRobot;

import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.constants.ConstantsHome.HEADER_APP;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.constants.ConstantsHome.IDADE_CACHORRO;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.constants.ConstantsHome.TXT_BOTAO;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.constants.ConstantsHome.TXT_HOME;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.constants.ConstantsHome.TXT_IDADE;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.constants.ConstantsHome.TXT_IDADE_VAZIA;

public class RobotHome extends ScreenRobot<RobotHome> {

    public static final int IMG_CACHORRO = R.id.imageView2;
    public static final int CAMPO_IDADE = R.id.numero;
    public static final int BOTAO_IDADE = R.id.btnIdade;
    public static final int RESULTADO_IDADE = R.id.resultado;

    public RobotHome checkCabecalho(){
        checkViewContainsText(HEADER_APP);
        return this;
    }

    public RobotHome checarTxtHome(){
        checkViewContainsText(TXT_HOME);
        return this;
    }

    public RobotHome checarImgCachorro(){
        checkIsDisplayed(IMG_CACHORRO);
        return this;
    }

    public RobotHome checarCampoIdade(){
        checkIsDisplayed(CAMPO_IDADE);
        return this;
    }

    public RobotHome checarTxtBotao(){
        checkViewContainsText(TXT_BOTAO);
        return this;
    }

    public RobotHome checarSeBotaoClicavel(){
        checkIsClickable(BOTAO_IDADE);
        return this;
    }

    public RobotHome preencherCampoIdade(){
        return enterTextIntoView(CAMPO_IDADE, IDADE_CACHORRO)
        .closeKeyboard();
    }

    public RobotHome clicarBtnHome(){
        clickOnView(BOTAO_IDADE);
        return this;
    }

//  checa resultado por texto
    public RobotHome checarTxtIdade(){
        checkViewContainsText(TXT_IDADE);
        return this;
    }

//    checa resultado por id
    public RobotHome checarIdadeValor(){
        checkViewHasText(RESULTADO_IDADE, "A idade do cachorro em anos humanos é: 84 Anos");
        return this;
    }

    public RobotHome checarIdadeVazia(){
        checkViewContainsText(TXT_IDADE_VAZIA);
        return this;
    }
}
