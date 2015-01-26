package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;
import lib.MM1_lib;
import lib.MMS_lib;

public class FrameSystemView extends Frame implements ActionListener,WindowListener,KeyListener{

	private TextField text1 = new TextField("", 10);
	private TextField text2 = new TextField("", 10);
	private TextField text3 = new TextField("", 10);
	private Button button1 = new Button("�����Z");
	
	//M/M/1�p
	private TextField m1     = new TextField("", 5);
	private TextField m2     = new TextField("", 5);
	private TextField m3     = new TextField("", 5);
	private Button bm = new Button("M/M/1");
	
	//M/M/S�p
	private TextField s1     = new TextField("", 7);
	private TextField s2     = new TextField("", 7);
	private TextField s3     = new TextField("", 10);
	private Button bs = new Button("M/M/s");
	private TextField s4     = new TextField("", 7);
	
	public FrameSystemView(FrameSystemController controller) {
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
		
		//window������
		addWindowListener(this);
		
		//�^�C�g�������߂�(�X�y�[�X��ǂݍ��܂Ȃ��j
		setTitle("FrameSystem	");
		
		//FlowLayout�͕��ׂ����Ƀ��C�A�E�g�ǉ��i����Ȃ����Ƒ傫���{�^���ɂȂ����j
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//�t���[���ɋ󗓂�{�^������z�u
		add(text1);	//(���鐔�l�P�j
		add(text2);	//�i���鐔�l�Q�j
		add(button1);		//�i�����Z�{�^���j
		add(new Label("����"));		//�����ǉ�
		add(text3);	//(�������j	
		
		//�{�^���Ɍv�Z�@�\��ǉ�(actionPerformed���Ăяo���j
		button1.addActionListener(this);
		
		
		add(new Label("��"));
		add(m1);
		add(new Label("��"));
		add(m2);
		add(bm);
		add(new Label("���όn���l��"));
		add(m3);
		
		bm.addActionListener(this);
		
		add(new Label("��"));
		add(s1);
		add(new Label("��"));
		add(s2);
		add(new Label("������"));
		add(s3);
		add(bs);
		add(new Label("���όn���l��"));
		add(s4);
		
		bs.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		if(e.getSource() == button1){   //�����Z�{�^���������ꂽ�Ƃ�
			//�p�����[�^�[�̎擾
			int val1 = Integer.parseInt(text1.getText());		//������Ƃ��đ����Ă��邽��int�^�ɕϊ����Ď󂯎��
			int val2 = Integer.parseInt(text2.getText());
		
			//�����̏o��
			//text3.setText(String.valueOf(val1 + val2));     //���������x�͕�����Ƃ��ďo��
			Calculation_lib clib = new Calculation_lib(val1,val2);		//�N���X�̃��C�u�����[�𗘗p���Čv�Z����
			text3.setText(String.valueOf(clib.getPlus()));
		}else if(e.getSource() == bm){     //���όn���l���{�^���������ꂽ�Ƃ�
			double lambda = Double.parseDouble(m1.getText());
			double mu = Double.parseDouble(m2.getText());
			
			MM1_lib mlib = new MM1_lib(lambda,mu);
			m3.setText(String.valueOf(mlib.getLength()));
		}else{
			double lambda = Double.parseDouble(s1.getText());
			double mu = Double.parseDouble(s2.getText());
			int s = Integer.parseInt(s3.getText());
			
			MMS_lib slib = new MMS_lib(lambda,mu,s);
			s4.setText(String.valueOf(slib.getL()));
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
	
		//window������
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

}
