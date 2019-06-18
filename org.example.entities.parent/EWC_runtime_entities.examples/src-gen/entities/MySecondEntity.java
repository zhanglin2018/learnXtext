package entities;

public class MySecondEntity  extends MyFirstEntity {
	private MyFirstEntity anEntity;
	
	public MyFirstEntity getAnEntity(){
		return anEntity;
	}
		
	public void setAnEntity(MyFirstEntity _arg){
		this.anEntity = _arg;
	}
	
}
