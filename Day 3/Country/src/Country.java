import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class  Country{
	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<>();
		
		
		 map.put( "AD","Andorra, Principality Of");
	     map.put( "AE","United Arab Emirates");
	     map.put( "AF","Afghanistan, Islamic State Of");
	     map.put( "AG","Antigua And Barbuda");
	     map.put( "AI","Anguilla");
	     map.put( "AL","Albania");
	     map.put( "AM","Armenia");
	     map.put( "AN","Netherlands Antilles");
	     map.put( "AO","Angola");
	     map.put( "AQ","Antarctica");
	     map.put( "AR","Argentina");
	     map.put( "AS","American Samoa");
	     map.put( "AT","Austria");
	     map.put( "AU","Australia");
	     map.put( "AW","Aruba");
	     map.put( "AZ","Azerbaidjan");
	     map.put( "BA","Bosnia-Herzegovina");
	     map.put( "BB","Barbados");
	     map.put( "BD","Bangladesh");
	     map.put( "BE","Belgium");
	     map.put( "BF","Burkina Faso");
	     map.put( "BG","Bulgaria");
	     map.put( "BH","Bahrain");
	     map.put( "BI","Burundi");
	     map.put( "BJ","Benin");
	     map.put("BM","Bermuda" );
	     map.put( "BN","Brunei Darussalam");
	     map.put( "BO","Bolivia");
	     map.put( "BR","Brazil");
	     map.put( "BS","Bahamas");
	     map.put( "BT","Bhutan");
	     map.put( "BV","Bouvet Island");
	     map.put( "BW","Botswana");
	     map.put( "BY","Belarus");
	     map.put( "BZ","Belize");
	     map.put( "CA","Canada");
	     map.put( "CC","Cocos (Keeling) Islands");
	     map.put( "CF","Central African Republic");
	     map.put("CD","Congo, The Democratic Republic Of The" );
	     map.put( "CG","Congo");
	     map.put( "CH","Switzerland");
	     map.put( "CI","Ivory Coast (Cote D'Ivoire)");
	     map.put( "CK","Cook Islands");
	     map.put( "CL","Chile");
	     map.put("CM","Cameroon" );
	     map.put( "CN","China");
	     map.put( "CO","Colombia");
	     map.put( "CR","Costa Rica");
	     map.put( "CS","Former Czechoslovakia");
	     map.put( "CU","Cuba");
	     map.put( "CV","Cape Verde");
	     map.put( "CX","Christmas Island");
	     map.put( "CY","Cyprus");
	     map.put( "CZ","Czech Republic");
	     map.put( "DE","Germany");
	     map.put("DJ","Djibouti" );
	     map.put( "DK","Denmark");
	     map.put( "DM","Dominica");
	     map.put( "DO","Dominican Republic");
	     map.put( "DZ","Algeria");
	     map.put( "EC","Ecuador");
	     map.put( "EE","Estonia");
	     map.put( "EG","Egypt");
	     map.put( "EH","Western Sahara");
	     map.put( "ER","Eritrea");
	     map.put("ES","Spain" );
	     map.put( "ET","Ethiopia");
	     map.put( "FI","Finland");
	     map.put( "FJ","Fiji");
	     map.put( "FK","Falkland Islands");
	     map.put( "FM","Micronesia");
	     map.put( "FO","Faroe Islands");
	     map.put( "FR","France");
	     map.put( "FX","France (European Territory)");
	     map.put( "GA","Gabon");
	     map.put( "UK","Great Britain");
	     map.put( "GD","Grenada");
	     map.put( "GE","Georgia");
	     map.put( "GF","French Guyana");
	     map.put( "GH","Ghana");
	     map.put( "GI","Gibraltar");
	     map.put("GL","Greenland" );
	     map.put( "GM","Gambia");
	     map.put( "GN","Guinea");
	     map.put( "GP","Guadeloupe (French)");
	     map.put( "GQ","Equatorial Guinea");
	     map.put( "GR","Greece");
	     map.put( "GS","S. Georgia & S. Sandwich Isls.");
	     map.put( "GT","Guatemala");
	     map.put("GU","Guam (USA)" );
	     map.put( "GW","Guinea Bissau");
	     map.put( "GY","Guyana");
	     map.put( "HK","Hong Kong");
	     map.put( "HM","Heard And McDonald Islands");
	     map.put( "HN","Honduras");
	     map.put( "HR","Croatia");
	     map.put( "HT","Haiti");
	     map.put( "HU","Hungary");
	     map.put( "ID","Indonesia");
	     map.put("IE","Ireland" );
	     map.put( "IL","Israel");
	     map.put( "IN","India");
	     map.put("IO","British Indian Ocean Territory" );
	     map.put( "IQ","Iraq");
	     map.put( "IR","Iran");
	     map.put( "IS","Iceland");
	     map.put( "IT","Italy");
	     map.put( "JM","Jamaica");
	     map.put( "JO","Jordan");
	     map.put( "JP","Japan");
	     map.put( "KE","Kenya");
	     map.put( "KG","Kyrgyz Republic (Kyrgyzstan)");
	     map.put( "KH","Cambodia, Kingdom Of");
	     map.put( "KI","Kiribati");
	     map.put( "KM","Comoros");
	     map.put( "KN","Saint Kitts & Nevis Anguilla");
	     map.put( "KP","North Korea");
	     map.put( "KR","South Korea");
	     map.put( "KW","Kuwait");
	     map.put( "KY","Cayman Islands");
	     map.put( "KZ","Kazakhstan");
	     map.put( "LA","Laos");
	     map.put( "LB","Lebanon");
	     map.put( "LC","Saint Lucia");
	     map.put( "LI","Liechtenstein");
	     map.put( "LK","Sri Lanka");
	     map.put( "LR","Liberia");
	     map.put( "LS","Lesotho");
	     map.put( "LT","Lithuania");
	     map.put( "LU","Luxembourg");
	     map.put( "LV","Latvia");
	     map.put( "LY","Libya");
	     map.put( "MA","Morocco");
	     map.put( "MC","Monaco");
	     map.put("MG","Madagascar" );
	     map.put( "MH","Marshall Islands");
	     map.put( "MK","Macedonia");
	     map.put( "ML","Mali");
	     map.put( "MM","Myanmar");
	     map.put( "MN","Mongolia");
	     map.put( "MO","Macau");
	     map.put( "MP","Northern Mariana Islands");
	     map.put( "MQ","Martinique (French)");
	     map.put("MR","Mauritania" );
	     map.put("MS","Montserrat" );
	     map.put( "MT","Malta");
	     map.put( "MU","Mauritius");
	     map.put( "MV","Maldives");
	     map.put( "MW","Malawi");
	     map.put( "MX","Mexico");
	     map.put( "MY","Malaysia");
	     map.put( "MZ","Mozambique");
	     map.put( "NA","Namibia");
	     map.put( "NC","New Caledonia (French)");
	     map.put( "NE","Niger");
	     map.put( "NF","Norfolk Island");
	     map.put( "NG","Nigeria");
	     map.put( "NI","Nicaragua");
	     map.put( "NL","Netherlands");
	     map.put( "NO","Norway");
	     map.put( "NP","Nepal");
	     map.put( "NR","Nauru");
	     map.put( "NT","Neutral Zone");
	     map.put("NU","Niue");
	     map.put( "NZ","New Zealand");
	     map.put( "OM","Oman");
	     map.put( "PA","Panama");
	     map.put( "PE","Peru");
	     map.put( "PF","Polynesia (French)");
	     map.put( "PG","Papua New Guinea");
	     map.put( "PH","Philippines");
	     map.put( "PK","Pakistan");
	     map.put( "PL","Poland");
	     map.put( "PM","Saint Pierre And Miquelon");
	     map.put( "PN","Pitcairn Island");
	     map.put( "PR","Puerto Rico");
	     map.put( "PT","Portugal");
	     map.put( "PW","Palau");
	     map.put( "PY","Paraguay");
	     map.put( "QA","Qatar");
	     map.put( "RE","Reunion (French)");
	     map.put( "RO","Romania");
	     map.put( "RU","Russian Federation");
	     map.put( "RW","Rwanda");
	     map.put("SA","Saudi Arabia");
	     map.put( "SB","Solomon Islands");
	     map.put( "SC","Seychelles");
	     map.put( "SD","Sudan");
	     map.put( "SE","Sweden");
	     map.put( "SG","Singapore");
	     map.put( "SH","Saint Helena");
	     map.put( "SI","Slovenia");
	     map.put( "SJ","Svalbard And Jan Mayen Islands");
	     map.put( "SK","Slovak Republic");
	     map.put( "SL","Sierra Leone");
	     map.put( "SM","San Marino");
	     map.put( "SN","Senegal");
	     map.put( "SO","Somalia");
	     map.put( "SR","Suriname");
	     map.put("ST","Saint Tome (Sao Tome) And Principe" );
	     map.put( "SU","Former USSR");
	     map.put( "SV","El Salvador");
	     map.put( "SY","Syria");
	     map.put( "SZ","Swaziland");
	     map.put( "TC","Turks And Caicos Islands");
	     map.put( "TD","Chad");
	     map.put( "TF","French Southern Territories");
	     map.put( "TG","Togo");
	     map.put( "TH","Thailand");
	     map.put( "TJ","Tadjikistan");
	     map.put("TK","Tokelau" );
	     map.put( "TM","Turkmenistan");
	     map.put( "TN","Tunisia");
	     map.put( "TO","Tonga");
	     map.put( "TP","East Timor");
	     map.put( "TR","Turkey");
	     map.put( "TT","Trinidad And Tobago");
	     map.put( "TV","Tuvalu");
	     map.put( "TW","Taiwan");
	     map.put ("TZ","Tanzania");
	     map.put( "UA","Ukraine");
	     map.put( "UG","Uganda");
	     map.put( "UK","United Kingdom");
	     map.put( "UM","USA Minor Outlying Islands");
	     map.put( "US","United States");
	     map.put( "UY","Uruguay");
	     map.put("UZ","Uzbekistan");
	     map.put( "VA","Holy See (Vatican City State)");
	     map.put( "VC","Saint Vincent & Grenadines");
	     map.put( "VE","Venezuela");
	     map.put( "VG","Virgin Islands (British)");
	     map.put( "VI","Virgin Islands (USA)");
	     map.put( "VN","Vietnam");
	     map.put( "VU","Vanuatu");
	     map.put( "WF","Wallis And Futuna Islands");
	     map.put( "WS","Samoa");
	     map.put( "YE","Yemen");
	     map.put( "YT","Mayotte");
	     map.put( "YU","Yugoslavia");
	     map.put( "ZA","South Africa");
	     map.put( "ZM","Zambia");
	     map.put( "ZR","Zaire");
	     map.put( "ZW","Zimbabwe");
		
		Iterator <Map.Entry<String, String>>it=map.entrySet().iterator(); //Iterator is generic hence we require <Map.Entry<Integer, String>>
		while(it.hasNext()) {
			Map.Entry<String, String> pair =it.next();
			System.out.println(pair.getKey()+" = "+pair.getValue());
		}
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter the Country Code: ");
		String n = reader.nextLine(); 
		String name=map.get(n);
		System.out.println(name);
		reader.close();
	}
}
