
public class Contructora {
	String login;
	String password;
	Contructora(){
		System.out.println("You are using a class of Contructora");
	}
	Contructora(String login,String password){
		login=login;
		password=password;
		System.out.println(login);
		System.out.println(password);
	}
	public static void main(String[] args) {
		
		Contructora contructora=new Contructora();
		Contructora contructora2= new Contructora("logsuresjin", "sdjfjsdf");
	}

}
