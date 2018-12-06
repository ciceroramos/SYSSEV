package util;

import controller.ControllerEmpresa;
import java.util.ArrayList;
import model.ModelEmpresa;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

/**
 *
 * @author cicero.ramos
 */
public class EnviaEmailDoc {

    BLDatas bLDatas = new BLDatas();

    String cpf,
            cnpj,
            razaoSocial,
            nomeFantasia,
            emailEmpresa,
            senhaEmail,
            nomeCliente,
            emailCliente;

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
        senhaEmail = modelEmpresa.getSenhaEmail();
        
        nomeCliente = getNomeCliente();
        emailCliente = getEmailCliente();
        
    }

    public void sendEmail() throws EmailException {

        EmailAttachment anexo = new EmailAttachment();
        anexo.setPath("C:/SYSSEV/relrelatorioVendas.pdf");
        anexo.setDisposition(EmailAttachment.ATTACHMENT);
        anexo.setDescription("Documento de Compra do Veículo");
        anexo.setName(nomeFantasia);

        MultiPartEmail email = new MultiPartEmail();

        carregarEmpresa();

//Utilize o hostname do seu provedor de email
        email.setHostName("smtp-mail.outlook.com");
        System.out.println("servidor de email...");
//Quando a porta utilizada não é a padrão (gmail = 465)
        email.setSmtpPort(587);
        email.setStartTLSEnabled(true);
//Para autenticar no servidor é necessário chamar os dois métodos abaixo
        System.out.println("autenticando...");
        email.setAuthentication(emailEmpresa, senhaEmail); //email da empresa e senha 
//Configure o seu email do qual enviará
        email.setFrom(emailEmpresa, nomeFantasia); //email da empresa e senha
//Adicione os destinatários
        email.addTo(emailCliente, nomeCliente); //e-mail do cliente
//Adicione um assunto
        email.setSubject(" Documento de Compra do Veículo ");
//Adicione a mensagem do email
        email.setMsg("  CPF : " + cpf + "   CNPJ:  " + cnpj
                + "      Razão Social: " + razaoSocial  + "Nome Fantasia: " + nomeFantasia);
        System.out.println("enviando...");
//Enviar mensagem  
        email.attach(anexo);
        email.send();
        System.out.println("Email enviado!");
    }

    //Variaveis para receber o email e nome do cliente
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
}
