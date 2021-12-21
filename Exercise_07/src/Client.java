
public class Client {

	public static void main(String[] args) {
		Smartphone sp = new Smartphone();
		
		Black_White_Phone bf = new Black_White_Phone();

		Smart_Enabled_Phone sep = new Smart_Enabled_Phone();
				
		MobilePhone[] mobilephones = {sp, bf, sep};
				
		System.out.println("SMART PHONE LOOP :");
		for( int i = 0; i < mobilephones.length; i++) {
			mobilephones[i].start_phone();
		}
		System.out.println();
				
		Feature_Phone[] featurephones = {bf, sep};
		System.out.println("FEATURED PHONE LOOP :");
		for( int i = 0; i < featurephones.length; i++) {
			featurephones[i].setPolyphonicRingtone();
		}
	}

}
