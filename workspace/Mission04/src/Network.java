
class NetworkInfo{
	private String id;
	private String password;
	private String email;
	
	NetworkInfo(String id,String password,String email){
		this.id = id;
		this.password = password;
		this.email = email;
	
	}
	NetworkInfo(String id,String password){
		this.id = id;
		this.password = password;
		this.email = id+"@gameschool.com";
		
	}
	void display(){
		System.out.println("id:"+id);
		System.out.println("password:"+password);
		System.out.println("email:"+email);
	}
	
	
}

public class Network {
	public static void main(String[] args){
		
		NetworkInfo pjx = new NetworkInfo("001","123123","444909312@qq.com");
		NetworkInfo xxy = new NetworkInfo("002","123123");
		
		
		pjx.display();
		xxy.display();
	}
}

