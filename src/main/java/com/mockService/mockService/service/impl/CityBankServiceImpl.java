package com.mockService.mockService.service.impl;

import com.mockService.mockService.service.CityBankService;
import org.springframework.stereotype.Service;

@Service
public class CityBankServiceImpl implements CityBankService {
    @Override
    public String getPendingEftTxnStatus() {
        return
               "<ns:OtherBankTransactionStatusResponse\n" +
                       "\t\txmlns:ns=\"http://ws.apache.org/axis2\">\n" +
                       "        <ns:return\n" +
                       "\t\t\txmlns:ax218=\"http://movie.city/xsd\"\n" +
                       "\t\t\txmlns:ax216=\"http://io.java/xsd\"\n" +
                       "\t\t\txmlns:ax227=\"http://ivac.city/xsd\"\n" +
                       "\t\t\txmlns:ax239=\"http://holidays.city/xsd\"\n" +
                       "\t\t\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                       "\t\t\txmlns:ax214=\"http://ababil.city/xsd\"\n" +
                       "\t\t\txmlns:ax225=\"http://mfs.city/xsd\"\n" +
                       "\t\t\txmlns:ax28=\"http://fi/xsd\"\n" +
                       "\t\t\txmlns:ax237=\"http://bkash.city/xsd\"\n" +
                       "\t\t\txmlns:ax248=\"http://fimi_types_xsd._1_0.two.schemas.compassplus.com/xsd\"\n" +
                       "\t\t\txmlns:ax27=\"http://tutionfee.city/xsd\"\n" +
                       "\t\t\txmlns:ax223=\"http://qr.city/xsd\"\n" +
                       "\t\t\txmlns:ax234=\"http://dom.w3c.org/xsd\"\n" +
                       "\t\t\txmlns:ax245=\"http://otherbank.city/xsd\"\n" +
                       "\t\t\txmlns:ax232=\"http://helper/xsd\"\n" +
                       "\t\t\txmlns:ax243=\"http://security.java/xsd\"\n" +
                       "\t\t\txmlns:ax211=\"http://nsu.city/xsd\"\n" +
                       "\t\t\txmlns:ax23=\"http://kgdcl.city/xsd\"\n" +
                       "\t\t\txmlns:ax230=\"http://veefin.city/xsd\"\n" +
                       "\t\t\txmlns:ax241=\"http://ababil.ababilNG/xsd\"\n" +
                       "\t\t\txmlns:ax220=\"http://rtgs.city/xsd\"\n" +
                       "\t\t\txmlns:ax25=\"http://card/xsd\"\n" +
                       "\t\t\txmlns:ax250=\"http://paywell.city/xsd\"\n" +
                       "\t\t\txmlns:ax21=\"http://city/xsd\" xsi:type=\"ax245:OtherBankTransactionStatusResponse\">\n" +
                       "            <ax245:responseCode>100</ax245:responseCode>\n" +
                       "            <ax245:responseData xsi:type=\"ax245:OtherBankTransactionStatus\">\n" +
                       "                <ax245:amount>120.0</ax245:amount>\n" +
                       "                <ax245:bankName>BRAC BANK LTD.</ax245:bankName>\n" +
                       "                <ax245:beneficiaryAccountName>Md. Jahangir Alam</ax245:beneficiaryAccountName>\n" +
                       "                <ax245:beneficiaryAccountNumber>1041260451330</ax245:beneficiaryAccountNumber>\n" +
                       "                <ax245:branchName>GULSHAN</ax245:branchName>\n" +
                       "                <ax245:departmentId>222</ax245:departmentId>\n" +
                       "                <ax245:payeeAccountNumber>3102812231001</ax245:payeeAccountNumber>\n" +
                       "                <ax245:returnDate xsi:nil=\"true\"/>\n" +
                       "                <ax245:returnReason xsi:nil=\"true\"/>\n" +
                       "                <ax245:routingNo>095260439</ax245:routingNo>\n" +
                       "                <ax245:sessionID xsi:nil=\"true\"/>\n" +
                       "                <ax245:settlementDate xsi:nil=\"true\"/>\n" +
                       "                <ax245:status>3</ax245:status>\n" +
                       "                <ax245:transactionDate>13-05-2022</ax245:transactionDate>\n" +
                       "                <ax245:transactionFlagCBS>1</ax245:transactionFlagCBS>\n" +
                       "                <ax245:transactionId>1528</ax245:transactionId>\n" +
                       "                <ax245:transactionRefNumber>2390839</ax245:transactionRefNumber>\n" +
                       "                <ax245:transactionReturnFlagCBS>0</ax245:transactionReturnFlagCBS>\n" +
                       "                <ax245:transactionType>C</ax245:transactionType>\n" +
                       "            </ax245:responseData>\n" +
                       "            <ax245:responseMessage>Operation Successful.</ax245:responseMessage>\n" +
                       "        </ns:return>\n" +
                       "    </ns:OtherBankTransactionStatusResponse>";

    }

    @Override
    public String doDebitTxn() {
        return "<ns:doDebitTransactionResponse xmlns:ns=\"http://ws.apache.org/axis2\">\n" +
                "         <ns:return xsi:type=\"ax27:TransactionResponse\" xmlns:ax21=\"http://wallet.city/xsd\" xmlns:ax210=\"http://fi/xsd\" xmlns:ax213=\"http://nsu.city/xsd\" xmlns:ax216=\"http://ababil.city/xsd\" xmlns:ax218=\"http://movie.city/xsd\" xmlns:ax220=\"http://mbm.city/xsd\" xmlns:ax222=\"http://rtgs.city/xsd\" xmlns:ax225=\"http://sql.java/xsd\" xmlns:ax227=\"http://qr.city/xsd\" xmlns:ax229=\"http://nagad.city/xsd\" xmlns:ax23=\"http://kgdcl.city/xsd\" xmlns:ax231=\"http://mfs.city/xsd\" xmlns:ax233=\"http://ivac.city/xsd\" xmlns:ax236=\"http://veefin.city/xsd\" xmlns:ax238=\"http://helper/xsd\" xmlns:ax240=\"http://dom.w3c.org/xsd\" xmlns:ax242=\"http://bkash.city/xsd\" xmlns:ax244=\"http://amberit.city/xsd\" xmlns:ax246=\"http://akash.city/xsd\" xmlns:ax248=\"http://io.java/xsd\" xmlns:ax25=\"http://card/xsd\" xmlns:ax250=\"http://security.java/xsd\" xmlns:ax252=\"http://iPay.city/xsd\" xmlns:ax254=\"http://otherbank.city/xsd\" xmlns:ax256=\"http://gp.city/xsd\" xmlns:ax259=\"http://fimi_types_xsd._1_0.two.schemas.compassplus.com/xsd\" xmlns:ax261=\"http://cdm_otp.city/xsd\" xmlns:ax263=\"http://paywell.city/xsd\" xmlns:ax27=\"http://city/xsd\" xmlns:ax29=\"http://tutionfee.city/xsd\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "            <ax27:responseCode>100</ax27:responseCode>\n" +
                "            <ax27:responseMessage>Operation Successful.</ax27:responseMessage>\n" +
                "            <ax27:transactionDateTime>20200318201445</ax27:transactionDateTime>\n" +
                "            <ax27:transactionRefNumber>021416148440</ax27:transactionRefNumber>\n" +
                "         </ns:return>\n" +
                "      </ns:doDebitTransactionResponse>";
    }

    @Override
    public String doCreditTxn() {
        return "<ns:doCreditTransactionResponse xmlns:ns=\"http://ws.apache.org/axis2\">\n" +
                "         <ns:return xsi:type=\"ax27:TransactionResponse\" xmlns:ax21=\"http://wallet.city/xsd\" xmlns:ax210=\"http://fi/xsd\" xmlns:ax213=\"http://nsu.city/xsd\" xmlns:ax216=\"http://ababil.city/xsd\" xmlns:ax218=\"http://movie.city/xsd\" xmlns:ax220=\"http://mbm.city/xsd\" xmlns:ax222=\"http://rtgs.city/xsd\" xmlns:ax225=\"http://sql.java/xsd\" xmlns:ax227=\"http://qr.city/xsd\" xmlns:ax229=\"http://nagad.city/xsd\" xmlns:ax23=\"http://kgdcl.city/xsd\" xmlns:ax231=\"http://mfs.city/xsd\" xmlns:ax233=\"http://ivac.city/xsd\" xmlns:ax236=\"http://veefin.city/xsd\" xmlns:ax238=\"http://helper/xsd\" xmlns:ax240=\"http://dom.w3c.org/xsd\" xmlns:ax242=\"http://bkash.city/xsd\" xmlns:ax244=\"http://amberit.city/xsd\" xmlns:ax246=\"http://akash.city/xsd\" xmlns:ax248=\"http://io.java/xsd\" xmlns:ax25=\"http://card/xsd\" xmlns:ax250=\"http://security.java/xsd\" xmlns:ax252=\"http://iPay.city/xsd\" xmlns:ax254=\"http://otherbank.city/xsd\" xmlns:ax256=\"http://gp.city/xsd\" xmlns:ax259=\"http://fimi_types_xsd._1_0.two.schemas.compassplus.com/xsd\" xmlns:ax261=\"http://cdm_otp.city/xsd\" xmlns:ax263=\"http://paywell.city/xsd\" xmlns:ax27=\"http://city/xsd\" xmlns:ax29=\"http://tutionfee.city/xsd\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "            <ax27:responseCode>100</ax27:responseCode>\n" +
                "            <ax27:responseMessage>Operation Successful.</ax27:responseMessage>\n" +
                "            <ax27:transactionDateTime>20200318201445</ax27:transactionDateTime>\n" +
                "            <ax27:transactionRefNumber>021417296971</ax27:transactionRefNumber>\n" +
                "         </ns:return>\n" +
                "      </ns:doCreditTransactionResponse>\n";
    }
}
