package framesystem;

public class FrameSystem_Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		FrameSystemController controller = new FrameSystemController();
		FrameSystemView frame = new FrameSystemView(controller);
		
		frame.setBounds(5,5,420,455);
		frame.setVisible(true);
	}

}
