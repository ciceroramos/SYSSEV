-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: bdidealcar
-- ------------------------------------------------------
-- Server version	5.6.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empresa` (
  `CODIGO` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `RAZAO_SOCIAL` varchar(300) NOT NULL,
  `NOME_FANTASIA` varchar(300) NOT NULL,
  `ENDERECO` varchar(300) NOT NULL,
  `BAIRRO` varchar(50) NOT NULL,
  `CIDADE` varchar(50) NOT NULL,
  `ESTADO` varchar(50) NOT NULL,
  `CEP` varchar(9) NOT NULL,
  `TELEFONE` varchar(30) NOT NULL,
  `CNPJ` varchar(45) NOT NULL,
  `CPF` varchar(45) NOT NULL,
  `CONTRATO` varchar(6) DEFAULT NULL,
  `EMAIL` varchar(50) NOT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
INSERT INTO `empresa` (`CODIGO`, `RAZAO_SOCIAL`, `NOME_FANTASIA`, `ENDERECO`, `BAIRRO`, `CIDADE`, `ESTADO`, `CEP`, `TELEFONE`, `CNPJ`, `CPF`, `CONTRATO`, `EMAIL`) VALUES (1,'PEG E PAGA DO JOSE DIAS ME','FENIX SOFT','Rua José Wilton G de Figueiredo','Malvinas ','Campina Grande','PB','58433-086','(83)36454-7889','08.407.654/0001-09','251.456.789-15','ANUAL','cgciceroramos@gmail.com');
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbcliente`
--

DROP TABLE IF EXISTS `tbcliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbcliente` (
  `CODIGO` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(45) DEFAULT NULL,
  `CPF` varchar(14) DEFAULT NULL,
  `RG` varchar(7) DEFAULT NULL,
  `DATA_NASCIMENTO` date DEFAULT NULL,
  `ENDERECO` varchar(80) DEFAULT NULL,
  `BAIRRO` varchar(40) DEFAULT NULL,
  `CEP` varchar(9) DEFAULT NULL,
  `CIDADE` varchar(50) DEFAULT NULL,
  `ESTADO` varchar(2) DEFAULT NULL,
  `COMPLEMENTO` varchar(45) DEFAULT NULL,
  `TELEFONE` varchar(13) DEFAULT NULL,
  `CELULAR` varchar(14) DEFAULT NULL,
  `OBSERVACAO` varchar(2000) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`CODIGO`),
  UNIQUE KEY `CPF_UNIQUE` (`CPF`),
  UNIQUE KEY `RG_UNIQUE` (`RG`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbcliente`
--

LOCK TABLES `tbcliente` WRITE;
/*!40000 ALTER TABLE `tbcliente` DISABLE KEYS */;
INSERT INTO `tbcliente` (`CODIGO`, `NOME`, `CPF`, `RG`, `DATA_NASCIMENTO`, `ENDERECO`, `BAIRRO`, `CEP`, `CIDADE`, `ESTADO`, `COMPLEMENTO`, `TELEFONE`, `CELULAR`, `OBSERVACAO`, `EMAIL`) VALUES (1,'CICERO RAMOS','050.532.144-09','2670597','1983-03-15','Rua José Wilton G de Figueiredo,49','Malvinas','58433-086','Campina Grande','PB','AP 204','(83)3656-4554','(83)98178-3775','teste obs','cgciceroramos@gmail.com'),(2,'ERICA DE FRANCA PEREIRA','464.354.167-46','2641598','1980-04-25','Rua Matias Vasconcelos da Costa,49','Sandra Cavalcante ','58410-690','Campina Grande','PB','AP 204','(54)5113-5465','(54)43124-5445','teste','erica.cicero@hotmail.com');
/*!40000 ALTER TABLE `tbcliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbdespesa_veiculo`
--

DROP TABLE IF EXISTS `tbdespesa_veiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbdespesa_veiculo` (
  `CODIGO` int(11) NOT NULL AUTO_INCREMENT,
  `CODIGO_VEICULO` int(11) NOT NULL,
  `LIMPEZA` double DEFAULT NULL,
  `MECANICA` double DEFAULT NULL,
  `FUNILARIA` double DEFAULT NULL,
  `REVISAO` double DEFAULT NULL,
  `DEBITOS` double DEFAULT NULL,
  `OUTROS` double DEFAULT NULL,
  KEY `FK_DESPEZA_idx` (`CODIGO`),
  KEY `FKDESPESA_idx` (`CODIGO_VEICULO`),
  CONSTRAINT `FKDESPESA` FOREIGN KEY (`CODIGO_VEICULO`) REFERENCES `tbveiculo` (`CODIGO`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbdespesa_veiculo`
--

LOCK TABLES `tbdespesa_veiculo` WRITE;
/*!40000 ALTER TABLE `tbdespesa_veiculo` DISABLE KEYS */;
INSERT INTO `tbdespesa_veiculo` (`CODIGO`, `CODIGO_VEICULO`, `LIMPEZA`, `MECANICA`, `FUNILARIA`, `REVISAO`, `DEBITOS`, `OUTROS`) VALUES (1,1,100,100,100,100,100,100),(3,3,25,55,70,40,65,75),(4,4,25,0,120,100,178,0),(5,5,10,50,30,20,40,60),(6,6,10,50,30,20,40,60),(7,7,10,70,50,20,60,80),(8,8,50,50,50,50,50,50),(14,1,200,200,200,200,2,5),(15,4,5,25,15,10,20,30),(16,5,0,0,0,0,0,0),(17,1,0,0,0,0,0,0),(18,8,0,0,0,0,0,0);
/*!40000 ALTER TABLE `tbdespesa_veiculo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbhistorico`
--

DROP TABLE IF EXISTS `tbhistorico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbhistorico` (
  `CODIGO` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(45) NOT NULL,
  `CPF` varchar(14) NOT NULL,
  `RG` varchar(7) DEFAULT NULL,
  `DATA_NASCIMENTO` date DEFAULT NULL,
  `ENDERECO` varchar(80) DEFAULT NULL,
  `BAIRRO` varchar(40) DEFAULT NULL,
  `CEP` varchar(9) DEFAULT NULL,
  `CIDADE` varchar(50) DEFAULT NULL,
  `ESTADO` varchar(30) DEFAULT NULL,
  `COMPLEMENTO` varchar(45) DEFAULT NULL,
  `TELEFONE` varchar(13) DEFAULT NULL,
  `CELULAR` varchar(14) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `PLACA` varchar(8) NOT NULL,
  `ANO_FABRICACAO` varchar(4) NOT NULL,
  `ANO_MODELO` varchar(4) NOT NULL,
  `CHASSI` varchar(17) NOT NULL,
  `RENAVAM` varchar(11) NOT NULL,
  `MARCA` varchar(45) DEFAULT NULL,
  `MODELO` varchar(100) DEFAULT NULL,
  `COR` varchar(20) DEFAULT NULL,
  `COMBUSTIVEL` varchar(8) DEFAULT NULL,
  `KM_RODADOS` varchar(45) DEFAULT NULL,
  `MOTOR` varchar(3) DEFAULT NULL,
  `OBSERVACAO_VEICULO` varchar(2000) DEFAULT NULL,
  `DATA_COMPRA` date DEFAULT NULL,
  `TIPO` varchar(5) DEFAULT NULL,
  `TIPO_NEGOCIACAO` varchar(45) DEFAULT NULL,
  `DATA_VENDA` date DEFAULT NULL,
  `DESCONTO` float DEFAULT NULL,
  `VALOR_VENDA` float DEFAULT NULL,
  `OBSERVACAO_VENDA` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbhistorico`
--

LOCK TABLES `tbhistorico` WRITE;
/*!40000 ALTER TABLE `tbhistorico` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbhistorico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_usuarios`
--

DROP TABLE IF EXISTS `tbl_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_usuarios` (
  `pk_codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  PRIMARY KEY (`pk_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_usuarios`
--

LOCK TABLES `tbl_usuarios` WRITE;
/*!40000 ALTER TABLE `tbl_usuarios` DISABLE KEYS */;
INSERT INTO `tbl_usuarios` (`pk_codigo`, `nome`, `login`, `senha`) VALUES (1,'ADMINISTRADOR','ADMIN','1234');
/*!40000 ALTER TABLE `tbl_usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbopcionais`
--

DROP TABLE IF EXISTS `tbopcionais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbopcionais` (
  `CODIGO` int(11) NOT NULL AUTO_INCREMENT,
  `CODIGO_VEICULO` int(11) DEFAULT NULL,
  `OPCIONAIS` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`CODIGO`),
  KEY `FK_OPCIONAIS_idx` (`CODIGO_VEICULO`),
  CONSTRAINT `FK_OPCIONAIS` FOREIGN KEY (`CODIGO_VEICULO`) REFERENCES `tbveiculo` (`CODIGO`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=153 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbopcionais`
--

LOCK TABLES `tbopcionais` WRITE;
/*!40000 ALTER TABLE `tbopcionais` DISABLE KEYS */;
INSERT INTO `tbopcionais` (`CODIGO`, `CODIGO_VEICULO`, `OPCIONAIS`) VALUES (2,6,'Alarme'),(3,6,'Ar-Condicionado'),(4,6,'Direção Hidraulica'),(5,6,'Trava Eletrica'),(6,6,'Vidro Eletrico'),(7,6,'Limpador Trazeiro'),(8,7,'Alarme'),(9,7,'Ar-Condicionado'),(10,7,'Direção Hidraulica'),(11,7,'Som'),(12,7,'Vidro Eletrico'),(13,7,'Capota Maritima'),(67,3,'Alarme'),(68,3,'Direção Hidraulica'),(69,3,'Trava Eletrica'),(106,4,'ABS'),(107,4,'Alarme'),(108,4,'Ar-Condicionado'),(109,4,'ARBAG'),(110,4,'Banco em Couro'),(111,4,'Direção Eletrica'),(112,4,'Direção Hidraulica'),(113,4,'Rodas Esportivas'),(114,4,'Trava Eletrica'),(115,4,'Banco em Couro'),(116,5,'Alarme'),(117,5,'Ar-Condicionado'),(118,5,'Direção Hidraulica'),(119,5,'Trava Eletrica'),(120,5,'Vidro Eletrico'),(121,5,'Limpador Trazeiro'),(122,5,'Farol Neblina'),(123,1,'ABS'),(124,1,'Alarme'),(125,1,'Ar-Condicionado'),(126,1,'ARBAG'),(127,1,'Banco em Couro'),(128,1,'Direção Eletrica'),(129,1,'Kit Multimidea'),(130,1,'Rodas Esportivas'),(131,1,'Som'),(132,1,'Trava Eletrica'),(133,1,'Vidro Eletrico'),(134,1,'GPS'),(135,1,'Banco em Couro'),(136,1,'Teto Solar'),(137,1,'Retrovisor Eletrico'),(138,1,'Sensor de Estacionamento'),(139,1,'Farol Neblina'),(140,1,'Comando Volante'),(141,8,'Alarme'),(142,8,'Ar-Condicionado'),(143,8,'ARBAG'),(144,8,'Banco em Couro'),(145,8,'Direção Hidraulica'),(146,8,'Kit Multimidea'),(147,8,'Rodas Esportivas'),(148,8,'Trava Eletrica'),(149,8,'Vidro Eletrico'),(150,8,'Banco em Couro'),(151,8,'Teto Solar'),(152,8,'Computador de Bordo');
/*!40000 ALTER TABLE `tbopcionais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbveiculo`
--

DROP TABLE IF EXISTS `tbveiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbveiculo` (
  `CODIGO` int(11) NOT NULL AUTO_INCREMENT,
  `PLACA` varchar(8) NOT NULL,
  `ANO_FABRICACAO` varchar(4) NOT NULL,
  `ANO_MODELO` varchar(4) NOT NULL,
  `CHASSI` varchar(17) NOT NULL,
  `RENAVAM` varchar(11) NOT NULL,
  `MARCA` varchar(45) DEFAULT NULL,
  `MODELO` varchar(100) DEFAULT NULL,
  `COR` varchar(20) DEFAULT NULL,
  `COMBUSTIVEL` varchar(8) DEFAULT NULL,
  `KM_RODADOS` varchar(45) DEFAULT NULL,
  `MOTOR` varchar(3) DEFAULT NULL,
  `CUSTO_AQUISICAO` double DEFAULT NULL,
  `VALOR_VENDA` double NOT NULL,
  `OBSERVACAO` varchar(2000) DEFAULT NULL,
  `DATA_COMPRA` date NOT NULL,
  `SITUACAO` varchar(12) DEFAULT NULL,
  `TIPO` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbveiculo`
--

LOCK TABLES `tbveiculo` WRITE;
/*!40000 ALTER TABLE `tbveiculo` DISABLE KEYS */;
INSERT INTO `tbveiculo` (`CODIGO`, `PLACA`, `ANO_FABRICACAO`, `ANO_MODELO`, `CHASSI`, `RENAVAM`, `MARCA`, `MODELO`, `COR`, `COMBUSTIVEL`, `KM_RODADOS`, `MOTOR`, `CUSTO_AQUISICAO`, `VALOR_VENDA`, `OBSERVACAO`, `DATA_COMPRA`, `SITUACAO`, `TIPO`) VALUES (1,'HGJ-6541','2009','2009','FGH123YH34NJ5667N','12345678901','BMW','320 I AUTOMATICA','PRETA','GASOLINA','56352','2.0',32646.514,45890,'TESTE OBS TESTE','2018-01-17','DISPONIVEL','USADO'),(3,'FHS-1234','2011','2011','SKGBAKÇDJT345345','12345678988','Chevrolet','CLASSIC LT','VERDE','FLEX','59410','1.0',18300,22500,'TESTE','2018-01-17','DISPONIVEL','USADO'),(4,'KSB-3847','2011','2011','ADKJFA6739LKFJ879','25976438768','Citroën','C3 LOUNG','PRATA','FLEX','59632','1.6',22560,29890,'TEST OBS','2018-01-17','DISPONIVEL','USADO'),(5,'ASJ-8475','2010','2010','SDJFHS475938BBJSH','34958723495','Fiat','PALIO ECONOMY','PRETA','FLEX','78562','1.0',18100,23500,'TESTE','2018-01-17','DISPONIVEL','USADO'),(6,'SKD-8475','2012','2013','FGJH356JH456454H','39458649856','Ford','KA CLASS','VERMELHO','FLEX','78423','1.0',16010,22600,'TESTE','2018-01-17','RESERVADO','USADO'),(7,'DYQ-8273','2012','2013','SKJSD3453HKJH53','34756837465','Fiat','STRADA FIRE','BRANCA','FLEX','64890','1.4',23500,32600,'TESTE','2018-01-18','DISPONIVEL','USADO'),(8,'NZB-1723','2011','2011','FHSKLDFH98475938','72317235711','Honda','CIVC LXL AUTOMATICO','PRATA','FLEX','59789','1.8',25600,33900,'TESTE	','2018-01-18','RESERVADO','USADO');
/*!40000 ALTER TABLE `tbveiculo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbvenda`
--

DROP TABLE IF EXISTS `tbvenda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbvenda` (
  `CODIGO` int(11) NOT NULL AUTO_INCREMENT,
  `CODIGO_CLIENTE` int(11) NOT NULL,
  `TIPO_NEGOCIACAO` varchar(45) DEFAULT NULL,
  `DATA_VENDA` date DEFAULT NULL,
  `DESCONTO` float DEFAULT NULL,
  `VALOR_VENDA` float DEFAULT NULL,
  `OBSERVACAO` varchar(2000) DEFAULT NULL,
  `PLACA` varchar(8) NOT NULL,
  `ANO_FABRICACAO` varchar(4) NOT NULL,
  `ANO_MODELO` varchar(4) NOT NULL,
  `CHASSI` varchar(17) NOT NULL,
  `RENAVAM` varchar(11) NOT NULL,
  `MARCA` varchar(45) DEFAULT NULL,
  `MODELO` varchar(100) DEFAULT NULL,
  `COR` varchar(20) DEFAULT NULL,
  `COMBUSTIVEL` varchar(8) DEFAULT NULL,
  `KM_RODADOS` varchar(45) DEFAULT NULL,
  `MOTOR` varchar(3) DEFAULT NULL,
  `OBSERVACAO_VEICULO` varchar(2000) DEFAULT NULL,
  `DATA_COMPRA` date DEFAULT NULL,
  `TIPO` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`CODIGO`),
  KEY `FKCLIENTE_idx` (`CODIGO_CLIENTE`),
  CONSTRAINT `FKCLIENTE` FOREIGN KEY (`CODIGO_CLIENTE`) REFERENCES `tbcliente` (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbvenda`
--

LOCK TABLES `tbvenda` WRITE;
/*!40000 ALTER TABLE `tbvenda` DISABLE KEYS */;
INSERT INTO `tbvenda` (`CODIGO`, `CODIGO_CLIENTE`, `TIPO_NEGOCIACAO`, `DATA_VENDA`, `DESCONTO`, `VALOR_VENDA`, `OBSERVACAO`, `PLACA`, `ANO_FABRICACAO`, `ANO_MODELO`, `CHASSI`, `RENAVAM`, `MARCA`, `MODELO`, `COR`, `COMBUSTIVEL`, `KM_RODADOS`, `MOTOR`, `OBSERVACAO_VEICULO`, `DATA_COMPRA`, `TIPO`) VALUES (1,2,'TROCA COM FINANCIAMENTO','2018-03-05',90,29800,'venda apos alteração	','KSB-3847','2011','2011','ADKJFA6739LKFJ879','25976438768','Citroën','C3 LOUNG','PRATA','FLEX','59632','1.6','TEST OBS','2018-01-17','USADO'),(2,1,'VENDA AVISTA','2018-03-05',0,32800,'tes 2','KJH-8764','2013','2013','fksjgdf9456394hk','1234567890','Chevrolet','ONIX LT','BRANCA','FLEX','45968','1.0','TESTE','2018-01-17','USADO');
/*!40000 ALTER TABLE `tbvenda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_permissao`
--

DROP TABLE IF EXISTS `usuario_permissao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario_permissao` (
  `pk_codigo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fk_codigo_usuario` int(10) unsigned NOT NULL,
  `permissao` varchar(45) NOT NULL,
  PRIMARY KEY (`pk_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_permissao`
--

LOCK TABLES `usuario_permissao` WRITE;
/*!40000 ALTER TABLE `usuario_permissao` DISABLE KEYS */;
INSERT INTO `usuario_permissao` (`pk_codigo`, `fk_codigo_usuario`, `permissao`) VALUES (1,1,'cliente'),(2,1,'veiculo'),(3,1,'usuario'),(4,1,'venda'),(5,1,'empresa');
/*!40000 ALTER TABLE `usuario_permissao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `validade_sistema`
--

DROP TABLE IF EXISTS `validade_sistema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `validade_sistema` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `dataVencimento` date DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `validade_sistema`
--

LOCK TABLES `validade_sistema` WRITE;
/*!40000 ALTER TABLE `validade_sistema` DISABLE KEYS */;
INSERT INTO `validade_sistema` (`codigo`, `dataVencimento`) VALUES (7,'2017-05-30'),(8,'2017-07-03'),(10,'2017-08-31'),(11,'2017-10-01'),(12,'2018-12-31');
/*!40000 ALTER TABLE `validade_sistema` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-15 20:45:08
