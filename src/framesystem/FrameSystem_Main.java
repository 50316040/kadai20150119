package framesystem;

public class FrameSystem_Main {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		FrameSystemController controller = new FrameSystemController();
		FrameSystemView frame = new FrameSystemView(controller);
		
		frame.setBounds(5,5,420,455);
		frame.setVisible(true);
	}

}
