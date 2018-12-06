package util;

import controller.ControllerEmpresa;
import java.util.ArrayList;
import java.util.Date;
import model.ModelEmpresa;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author cicero.ramos
 */
public class EnviaEmail {

    BLDatas bLDatas = new BLDatas();


    String cpf, cnpj, razaoSocial, nomeFantasia,emailEmpresa;
    Date d2;
    int cod = 0;
    
    ModelEmpresa modelEmpresa = new ModelEmpresa();
    ControllerEmpresa controllerEmpresa = new ControllerEmpresa();
    ArrayList<ModelEmpresa> listaModelEmpresas = new ArrayList<>();
    
    private void carregarEmpresa() {
        
        modelEmpresa = controllerEmpresa.getEmpresaController(1);
        razaoSocial = modelEmpresa.getRazaoSocial();
        nomeFantasia = modelEmpresa.getNomeFantasia();
        cnpj = modelEmpresa.getCnpj();
        cpf = modelEmpresa.getCpf();
        emailEmpresa = modelEmpresa.getEmail();

    }

    public void sendEmail() throws EmailException {

        carregarEmpresa();
        
        SimpleEmail email = new SimpleEmail();

//Utilize o hostname do seu provedor de email
        System.out.println("alterando hostname...");
        email.setHostName("smtp.gmail.com");
//Quando a porta utilizada não é a padrão (gmail = 465)
        email.setSmtpPort(465);
//Para autenticar no servidor é necessário chamar os dois métodos abaixo
        System.out.println("autenticando...");
        email.setAuthentication("fenixinfoteccg", "jesusjesus");
        email.setSSLOnConnect(true);
//Configure o seu email do qual enviará
        email.setFrom("fenixinfoteccg@gmail.com", "Cliente");
//Adicione os destinatários
        email.addTo("fenixinfoteccg@gmail.com", "FenixInfotec");
//Adicione um assunto
        email.setSubject(" Informação do Cliente SysSeV: " + nomeFantasia);
//Adicione a mensagem do email
        email.setMsg("  CPF : " + cpf + "   CNPJ:  " + cnpj
                + "      Razão Social: " + razaoSocial
                + "      Data Vencimento: " + d2);
        System.out.println("enviando...");
//Enviar mensagem        
        email.send();
        System.out.println("Email enviado!");
        System.out.println(cpf);
    }

}
