
public class UserManager {

	public void add(User user) {
		System.out.println(user.getId() + " no'lu ID kaydedildi.");
	}
	
	//bulk insert
	
	//public void addMultiple(User[] user) {
		//for(User user : users) {
			//add(user);
		//}
		//tek tek dönüp her kullanýcý için yukarýda yer alan add'i çalýþtýracak
	//}
}
