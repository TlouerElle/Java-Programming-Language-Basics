package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class project extends JFrame{
    /**图形化界面设计**/
    private static final long serialVersionUID = 4907149509182425824L;
    public project(){
        Container c = getContentPane(); //定义一个顶级容器c
        setLayout(new GridLayout(2,1));//新建网格布局管理器，2行1列
        JTextField jtf = new JTextField("",0);//构造一个用指定文本和列初始化的新文本框--jtf
        jtf.setHorizontalAlignment(JTextField.RIGHT);//设置水平对齐方式：居右对齐
        jtf.setFont(new Font("黑体",Font.BOLD,60));//设置文本框字体类型、风格、大小
        jtf.setBackground(Color.darkGray);//设置文本框背景颜色
        jtf.setForeground(Color.white);//设置文本框字体颜色
        JButton data0 = new JButton("0");
        data0.setFont(new Font("黑体",Font.BOLD,50));
        data0.setForeground(Color.white);
        data0.setBackground(Color.black);// 为了看出效果，设置了颜色
        JButton data1 = new JButton("1");
        data1.setBackground(Color.black);
        data1.setFont(new Font("黑体",Font.BOLD,50));
        data1.setForeground(Color.white);
        JButton data2 = new JButton("2");
        data2.setFont(new Font("黑体",Font.BOLD,50));
        data2.setForeground(Color.white);
        data2.setBackground(Color.black);
        JButton data3 = new JButton("3");
        data3.setFont(new Font("黑体",Font.BOLD,50));
        data3.setForeground(Color.white);
        data3.setBackground(Color.black);
        JButton data4 = new JButton("4");
        data4.setFont(new Font("黑体",Font.BOLD,50));
        data4.setForeground(Color.white);
        data4.setBackground(Color.black);
        JButton data5 = new JButton("5");
        data5.setFont(new Font("黑体",Font.BOLD,50));
        data5.setForeground(Color.white);
        data5.setBackground(Color.black);
        JButton data6 = new JButton("6");
        data6.setFont(new Font("黑体",Font.BOLD,50));
        data6.setForeground(Color.white);
        data6.setBackground(Color.black);
        JButton data7 = new JButton("7");
        data7.setFont(new Font("黑体",Font.BOLD,50));
        data7.setForeground(Color.white);
        data7.setBackground(Color.black);
        JButton data8 = new JButton("8");
        data8.setFont(new Font("黑体",Font.BOLD,50));
        data8.setForeground(Color.white);
        data8.setBackground(Color.black);
        JButton data9 = new JButton("9");
        data9.setFont(new Font("黑体",Font.BOLD,50));
        data9.setForeground(Color.white);
        data9.setBackground(Color.black);
        JButton point = new JButton(".");
        point.setFont(new Font("黑体",Font.BOLD,45));
        point.setForeground(Color.white);
        point.setBackground(Color.black);
        JButton equ = new JButton("=");
        equ.setFont(new Font("黑体",Font.BOLD,45));
        equ.setForeground(Color.white);
        equ.setBackground(Color.darkGray);
        JButton plus = new JButton("+");
        plus.setFont(new Font("黑体",Font.BOLD,45));
        plus.setForeground(Color.white);
        plus.setBackground(Color.darkGray);
        JButton minus = new JButton("-");
        minus.setFont(new Font("黑体",Font.BOLD,45));
        minus.setForeground(Color.white);
        minus.setBackground(Color.darkGray);
        JButton mtp = new JButton("*");
        mtp.setFont(new Font("黑体",Font.BOLD,45));
        mtp.setForeground(Color.white);
        mtp.setBackground(Color.darkGray);
        JButton dvd = new JButton("/");
        dvd.setFont(new Font("黑体",Font.BOLD,45));
        dvd.setForeground(Color.white);
        dvd.setBackground(Color.darkGray);
        JButton sqr = new JButton("√");
        sqr.setFont(new Font("黑体",Font.BOLD,45));
        sqr.setForeground(Color.white);
        sqr.setBackground(Color.darkGray);
        JButton root = new JButton("x^2");
        root.setBackground(Color.darkGray);
        root.setFont(new Font("黑体",Font.BOLD,45));
        root.setForeground(Color.white);
        JButton tg = new JButton("D");
        tg.setFont(new Font("黑体",Font.BOLD,45));
        tg.setForeground(Color.white);
        tg.setBackground(Color.darkGray);
        JButton ql = new JButton("C");
        ql.setBackground(Color.darkGray);
        ql.setFont(new Font("黑体",Font.BOLD,50));
        ql.setForeground(Color.white);
        JPanel jp = new JPanel();   //新建JPanel面板--jp
        jp.setLayout(new GridLayout(4,5,5,5));//新建网格布局管理器（行数，列数，组件间的水平垂直间距）
        jp.setFont(new Font("黑体",Font.PLAIN,5));
        jp.setBackground(Color.black);//网格布局管理器背景
        jp.add(data1);
        jp.add(data2);
        jp.add(data3);
        jp.add(plus);
        jp.add(sqr);
        jp.add(data4);
        jp.add(data5);
        jp.add(data6);
        jp.add(minus);
        jp.add(root);
        jp.add(data7);
        jp.add(data8);
        jp.add(data9);
        jp.add(mtp);
        jp.add(ql);
        jp.add(data0);
        jp.add(point);
        jp.add(equ);
        jp.add(dvd);
        jp.add(tg);
        c.add(jtf);//将文本框jtf添加到顶级容器c中
        c.add(jp);//将JPanel面板jp添加到顶级容器c中
        setSize(650,800);
        setTitle("计算器");
        setVisible(true);
        setResizable(false);//窗体大小由程序员决定，用户不能自由改变大小
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /*
         * *********************************************************                
                    相关计算功能的实现                             
         * *********************************************************
         */

        data0.addActionListener(new ActionListener(){//数字0的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){//将按钮值与0作比较
                    jtf.requestFocus();//把输入焦点放在调用这个方法的控件上(即把光标放在文本框jtf里)
                }
                else{
                    String str = jtf.getText();//取得当前按钮的按钮值
                    jtf.setText(str+"0");   //将文本内容后加上字符0
                }
            }
        });
        data1.addActionListener(new ActionListener(){//数字1的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){//将按钮值与0作比较
                    jtf.setText("");//将文本框初始化为空
                    jtf.setText("1");//将文本框内容置为 1
                    jtf.requestFocus();//把输入焦点放在调用这个方法的控件上(即把光标放在文本框jtf里)
                }
                else{
                    String str = jtf.getText();//取得当前按钮的按钮值
                    jtf.setText(str+"1");   //将文本内容后加上字符1
                }
            }
        });
        data2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("2");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"2");
                }
            }
        });
        data3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("3");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"3");
                }
            }
        });
        data4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("4");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"4");
                }
            }
        });
        data5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("5");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"5");
                }
            }
        });
        data6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("6");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"6");
                }
            }
        });
        data7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("7");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"7");
                }
            }
        });
        data8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("8");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"8");
                }
            }
        });
        data9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("9");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"9");
                }
            }
        });
        point.addActionListener(new ActionListener(){    //点号的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText(".");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+".");
                }
            }
        });
        plus.addActionListener(new ActionListener(){    //+号的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("+");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"+");
                }
            }
        });
        minus.addActionListener(new ActionListener(){    //-号的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("-");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"-");
                }
            }
        });
        mtp.addActionListener(new ActionListener(){    //*号的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("*");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"*");
                }
            }
        });
        dvd.addActionListener(new ActionListener(){    //除号的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("/");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"/");
                }
            }
        });
        //【**退格功能如下**】
        tg.addActionListener(new ActionListener(){//监听退格键
            public void actionPerformed(ActionEvent arg0){//处理退格键被按下的事件
                String text = jtf.getText();
                int i = text.length();
                if(i>0){
                    text = text.substring(0,i-1);//去掉最后一个字符
                    if (text.length() == 0) {// 如果文本没有了内容，则初始化计算器的各种值
                        jtf.setText("");
                    } else { // 显示新的文本
                        jtf.setText(text);
                }
            }
            }
        });
        //【**清零功能如下**】
        ql.addActionListener(new ActionListener(){//监听清零键
            public void actionPerformed(ActionEvent e) {
                jtf.setText("");//将文本框置为空（清零功能）
            }

        });
        //【**平方功能如下**】
        root.addActionListener(new ActionListener(){//监听root键
            public void actionPerformed(ActionEvent e){//root键被按事件
                String i = jtf.getText();
                Double j = Double.parseDouble(i);//将字符串i转换成对应的double类型的数值
                double ans = j*j;  //求平方
                String answer =String.valueOf(ans);//将int型数据转换成String类型
                jtf.setText(answer);//将文本框设置为平方后的结果
            }
        });
        //【**开方功能如下**】
        sqr.addActionListener(new ActionListener(){//监听sqrt键
            public void actionPerformed(ActionEvent e){//sqrt键被按事件
                String i = jtf.getText();
                Double j = Double.parseDouble(i);//将字符串转换成对应的double类型的数值
                double ans = (double)Math.sqrt(j);//求开方
                String answer = String.valueOf(ans);//将double型数据转换成String类型
                jtf.setText(answer);//将文本框设置为开方后的结果
            }
        });
        jtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
            if (e.getKeyChar() == KeyEvent.VK_SPACE)
            {
                jtf.setText("");
            }
        }
        });
        //文本框判断enter键进行计算
        jtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
            if (e.getKeyChar() == KeyEvent.VK_ENTER)
            {
                 if(jtf.getText().indexOf("+")!= -1){//将字符串分割为子字符串，然后将结果作为字符串数组返回
                     String[] s = jtf.getText().split("[+]");//转义字符，要用"[+]"或者"\+"
                     Double d1 = Double.parseDouble(s[0]);//返回一个指定字符串表示的double值
                     Double d2 = Double.parseDouble(s[1]);
                     double ans = d1 + d2;
                     String answer = String.valueOf(ans);//将结果转换为字符串
                     jtf.setText(answer);//将加法运算的结果以字符串形式在文本框中显示
                 }
                 //【**减法运算**】
                 else if(jtf.getText().indexOf("-")!= -1){
                     String[] s = jtf.getText().split("-");
                     jtf.setText("");
                     Double d1 = Double.parseDouble(s[0]);
                     Double d2 = Double.parseDouble(s[1]);
                     double ans = d1-d2;
                     String answer =String.valueOf(ans);
                     jtf.setText(answer);
                 }
                 //【**乘法运算**】
                 else if(jtf.getText().indexOf("*")!= -1){
                     String[] s = jtf.getText().split("[*]");//*是转义字符，要用"[*]",或者"\*"
                     jtf.setText("");
                     Double d1 = Double.parseDouble(s[0]);
                     Double d2 = Double.parseDouble(s[1]);
                     double ans = d1*d2;
                     String answer =String.valueOf(ans);
                     jtf.setText(answer);
                 }
                 //【**除法运算**】
                 else if(jtf.getText().indexOf("/")!= -1){
                     String[] s = jtf.getText().split("/");
                     jtf.setText("");
                     Double d1 = Double.parseDouble(s[0]);
                     Double d2 = Double.parseDouble(s[1]);
                     double ans = d1/d2;
                     String answer =String.valueOf(ans);
                     jtf.setText(answer);
                 }
                 else{
                     jtf.setText("格式错误，清零后重新计算");
                 } 

            }
        }
        });
        //【等号实现 加减乘除 功能】
        equ.addActionListener(new ActionListener(){ //监听 “等号” 按键
            public void actionPerformed(ActionEvent arg0){//处理“等号” 按键被按下事件
                //【**加法运算**】
                if(jtf.getText().indexOf("+")!= -1){//将字符串分割为子字符串，然后将结果作为字符串数组返回
                    String[] s = jtf.getText().split("[+]");//转义字符，要用"[+]"或者"\+"
                    Double d1 = Double.parseDouble(s[0]);//返回一个指定字符串表示的double值
                    Double d2 = Double.parseDouble(s[1]);
                    double ans = d1 + d2;
                    String answer = String.valueOf(ans);//将结果转换为字符串
                    jtf.setText(answer);//将加法运算的结果以字符串形式在文本框中显示
                }
                //【**减法运算**】
                else if(jtf.getText().indexOf("-")!= -1){
                    String[] s = jtf.getText().split("-");
                    jtf.setText("");
                    Double d1 = Double.parseDouble(s[0]);
                    Double d2 = Double.parseDouble(s[1]);
                    double ans = d1-d2;
                    String answer =String.valueOf(ans);
                    jtf.setText(answer);
                }
                //【**乘法运算**】
                else if(jtf.getText().indexOf("*")!= -1){
                    String[] s = jtf.getText().split("[*]");//*是转义字符，要用"[*]",或者"\*"
                    jtf.setText("");
                    Double d1 = Double.parseDouble(s[0]);
                    Double d2 = Double.parseDouble(s[1]);
                    double ans = d1*d2;
                    String answer =String.valueOf(ans);
                    jtf.setText(answer);
                }
                //【**除法运算**】
                else if(jtf.getText().indexOf("/")!= -1){
                    String[] s = jtf.getText().split("/");
                    jtf.setText("");
                    Double d1 = Double.parseDouble(s[0]);
                    Double d2 = Double.parseDouble(s[1]);
                    double ans = d1/d2;
                    String answer =String.valueOf(ans);
                    jtf.setText(answer);
                }
                else{
                    jtf.setText("格式错误，清零后重新计算");
                } 
            }     
        
        });
        
    }
    public static void main(String[] args) {
        new project();
    }
}