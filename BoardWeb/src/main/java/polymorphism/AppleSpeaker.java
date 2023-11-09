package polymorphism;

import org.springframework.stereotype.Component;

//@Component("apple")
public class AppleSpeaker implements Speaker {

	public AppleSpeaker()
	{
		System.out.println("===> ApplerSpeaker 按眉 积己");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker --- 家府甫 棵赴促");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker --- 家府甫 撤冕促");
		
	}

}
