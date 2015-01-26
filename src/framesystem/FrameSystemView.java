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
	private Button button1 = new Button("足し算");
	
	//M/M/1用
	private TextField m1     = new TextField("", 5);
	private TextField m2     = new TextField("", 5);
	private TextField m3     = new TextField("", 5);
	private Button bm = new Button("M/M/1");
	
	//M/M/S用
	private TextField s1     = new TextField("", 7);
	private TextField s2     = new TextField("", 7);
	private TextField s3     = new TextField("", 10);
	private Button bs = new Button("M/M/s");
	private TextField s4     = new TextField("", 7);
	
	public FrameSystemView(FrameSystemController controller) {
		// TODO 自動生成されたコンストラクター・スタブ
		
		//windowを閉じれる
		addWindowListener(this);
		
		//タイトルを決める(スペースを読み込まない）
		setTitle("FrameSystem	");
		
		//FlowLayoutは並べた順にレイアウト追加（これなしだと大きいボタンになった）
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//フレームに空欄やボタン等を配置
		add(text1);	//(ある数値１）
		add(text2);	//（ある数値２）
		add(button1);		//（足し算ボタン）
		add(new Label("答え"));		//文字追加
		add(text3);	//(答え欄）	
		
		//ボタンに計算機能を追加(actionPerformedを呼び出し）
		button1.addActionListener(this);
		
		
		add(new Label("λ"));
		add(m1);
		add(new Label("μ"));
		add(m2);
		add(bm);
		add(new Label("平均系内人数"));
		add(m3);
		
		bm.addActionListener(this);
		
		add(new Label("λ"));
		add(s1);
		add(new Label("μ"));
		add(s2);
		add(new Label("窓口数"));
		add(s3);
		add(bs);
		add(new Label("平均系内人数"));
		add(s4);
		
		bs.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
		if(e.getSource() == button1){   //足し算ボタンが押されたとき
			//パラメーターの取得
			int val1 = Integer.parseInt(text1.getText());		//文字列として送られてくるためint型に変換して受け取る
			int val2 = Integer.parseInt(text2.getText());
		
			//答えの出力
			//text3.setText(String.valueOf(val1 + val2));     //答えを今度は文字列として出力
			Calculation_lib clib = new Calculation_lib(val1,val2);		//クラスのライブラリーを利用して計算する
			text3.setText(String.valueOf(clib.getPlus()));
		}else if(e.getSource() == bm){     //平均系内人数ボタンが押されたとき
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
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
	
		//windowを閉じれる
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
