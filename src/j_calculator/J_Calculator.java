package j_calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class J_Calculator implements ActionListener {
    private static JButton one = new JButton("1");
    private static JButton two = new JButton("2");
    private static JButton three = new JButton("3");
    private static JButton four = new JButton("4");
    private static JButton five = new JButton("5");
    private static JButton six = new JButton("6");
    private static JButton seven = new JButton("7");
    private static JButton eight = new JButton("8");
    private static JButton nine = new JButton("9");
    private static JButton zero = new JButton("0");
    private static JButton plus = new JButton("+");
    private static JButton back = new JButton("C");
    private static JButton minus = new JButton("-");
    private static JButton multiply = new JButton("*");
    private static JButton divide = new JButton("/");
    private static JButton equal = new JButton("=");
    private static JLabel displaypanel= new JLabel("");
    
    public J_Calculator(){
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setBounds(470,130, 500, 500);
        frame.setTitle("Reaper Calculator");
        frame.setLayout(new FlowLayout());
        one.setPreferredSize(new Dimension(75,75 ));
        one.setFont(new Font("Arial", Font.PLAIN, 40));
        one.addActionListener(this);
        back.setPreferredSize(new Dimension(75,75 ));
        back.setFont(new Font("Arial", Font.PLAIN, 40));
        back.addActionListener(this);
        two.setPreferredSize(new Dimension(75,75 ));
        two.setFont(new Font("Arial", Font.PLAIN, 40));
        two.addActionListener(this);
        three.setPreferredSize(new Dimension(75,75 ));
        three.setFont(new Font("Arial", Font.PLAIN, 40));
        three.addActionListener(this);
        four.setPreferredSize(new Dimension(75,75 ));
        four.setFont(new Font("Arial", Font.PLAIN, 40));
        four.addActionListener(this);
        five.setPreferredSize(new Dimension(75,75 ));
        five.setFont(new Font("Arial", Font.PLAIN, 40));
        five.addActionListener(this);
        six.setPreferredSize(new Dimension(75,75 ));
        six.setFont(new Font("Arial", Font.PLAIN, 40));
        six.addActionListener(this);
        seven.setPreferredSize(new Dimension(75,75 ));
        seven.setFont(new Font("Arial", Font.PLAIN, 40));
        seven.addActionListener(this);
        eight.setPreferredSize(new Dimension(75,75 ));
        eight.setFont(new Font("Arial", Font.PLAIN, 40));
        eight.addActionListener(this);
        nine.setPreferredSize(new Dimension(75,75 ));
        nine.setFont(new Font("Arial", Font.PLAIN, 40));
        nine.addActionListener(this);
        zero.setPreferredSize(new Dimension(75,75 ));
        zero.setFont(new Font("Arial", Font.PLAIN, 40));
        zero.addActionListener(this);
        displaypanel.setPreferredSize(new Dimension(475,50 ));
        displaypanel.setText("Version 1.0.6");
        displaypanel.setSize(60, 60);
        displaypanel.setFont(new Font("Serif", Font.PLAIN, 44));
        plus.setPreferredSize(new Dimension(75,75 ));
        plus.setFont(new Font("Arial", Font.PLAIN, 40));
        plus.addActionListener(this);
        minus.setPreferredSize(new Dimension(75,75 ));
        minus.setFont(new Font("Arial", Font.PLAIN, 40));
        minus.addActionListener(this);
        multiply.setPreferredSize(new Dimension(75,75 ));
        multiply.setFont(new Font("Arial", Font.PLAIN, 40));
        multiply.addActionListener(this);
        divide.setPreferredSize(new Dimension(75,75 ));
        divide.setFont(new Font("Arial", Font.PLAIN, 40));
        divide.addActionListener(this);
        equal.setPreferredSize(new Dimension(75,75 ));
        equal.setFont(new Font("Arial", Font.PLAIN, 40));
        equal.addActionListener(this);
        frame.add(displaypanel);
        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(zero);
        frame.add(plus);
        frame.add(minus);
        frame.add(multiply);
        frame.add(divide);
        frame.add(back);
        frame.add(equal);
    }
    private String string_build="";
    static boolean operator=false;
    @Override 
    public void actionPerformed(ActionEvent event){
       if(event.getSource().equals(one)){
           string_build+="1";
           displaypanel.setText(string_build);
           operator=false;
       }
       else if(event.getSource().equals(two)){
           string_build+="2";
           displaypanel.setText(string_build);
           operator=false;
       }
       else if(event.getSource().equals(three)){
           string_build+="3";
           displaypanel.setText(string_build);
           operator=false;
       }
       else if(event.getSource().equals(four)){
           string_build+="4";
           displaypanel.setText(string_build);
           operator=false;
       }
       else if(event.getSource().equals(five)){
           string_build+="5";
           displaypanel.setText(string_build);
           operator=false;
       }
       else if(event.getSource().equals(six)){
           string_build+="6";
           displaypanel.setText(string_build);
           operator=false;
       }
       else if(event.getSource().equals(seven)){
           string_build+="7";
           displaypanel.setText(string_build);
           operator=false;
       }
       else if(event.getSource().equals(eight)){
           string_build+="8";
           displaypanel.setText(string_build);
           operator=false;
       }
       else if(event.getSource().equals(nine)){
           string_build+="9";
           displaypanel.setText(string_build);
           operator=false;
       }
       else if(event.getSource().equals(zero)){
           string_build+="0";
           displaypanel.setText(string_build);
           operator=false;
       }
       else if(event.getSource().equals(plus)){
           if(!operator){
               string_build+=" + ";
               displaypanel.setText(string_build);
           }else{
               int lastindex=string_build.length()-2;
               string_build=string_build.substring(0,lastindex);
               string_build+="+ ";
               displaypanel.setText(string_build);
           }
           operator=true;
       }
       else if(event.getSource().equals(minus)){
           if(!operator){
               string_build+=" - ";
               displaypanel.setText(string_build);
           }else{
               int lastindex=string_build.length()-2;
               string_build=string_build.substring(0,lastindex);
               string_build+="- ";
               displaypanel.setText(string_build);
           }
           operator=true;
       }
       else if(event.getSource().equals(divide)){
           if(!operator){
               string_build+=" / ";
               displaypanel.setText(string_build);
           }else{
               int lastindex=string_build.length()-2;
               string_build=string_build.substring(0,lastindex);
               string_build+="/ ";
               displaypanel.setText(string_build);
           }
           operator=true;
       }
       else if(event.getSource().equals(multiply)){
           if(!operator){
               string_build+=" * ";
               displaypanel.setText(string_build);
           }else{
               int lastindex=string_build.length()-2;
               string_build=string_build.substring(0,lastindex);
               string_build+="* ";
               displaypanel.setText(string_build);
           }
           operator=true;
       }
       else if(event.getSource().equals(equal)){
           string_build=result(string_build);
           displaypanel.setText(string_build);
           operator=false;
       }
       else if(event.getSource().equals(back)){
           int length=string_build.length()-1;
           if(length==-1){
               
           }
           else if(string_build.charAt(length)==' '){
               string_build=string_build.substring(0,length-2);
               operator=false;
           }else {
               string_build=string_build.substring(0,length);
           }
           displaypanel.setText(string_build);
       }
    }
    private String result(String string_build){
        int size=string_build.length();
        int array[]=new int[4];
        for(int i=0;i<size;i++){
            if(string_build.charAt(i)=='/')
                array[0]++;
            if(string_build.charAt(i)=='*')
                array[1]++;
            if(string_build.charAt(i)=='+')
                array[2]++;
            if(string_build.charAt(i)=='-')
                array[3]++;
        }
        int first=0,second=0;
        String first_half="",second_half="";
        for(int k=0;k<array[0];k++){
                for(int i=0;i<string_build.length();i++){
                        if(string_build.charAt(i)=='/'){
                                int iter=i+2;
                                while(iter <string_build.length() && string_build.charAt(iter)!=' '){
                                        second=second*10+string_build.charAt(iter)-'0';
                                        iter++;
                                }
                        second_half=string_build.substring(iter);   // it include space at front
                        iter=i-2;
                        String changeme="";
                        while(iter >=0 && string_build.charAt(iter)!=' '){
                                changeme=changeme+string_build.charAt(iter);
                                iter--;
                        }
                        StringBuilder sb=new StringBuilder(changeme);
                        sb=sb.reverse();
                        first_half=string_build.substring(0,iter+1);    // include space at end
                        int temp=0;
                                while(first!=0){
                                        temp=temp*10+first%10;
                                        first/=10;
                                }
                                first=temp;                   
                        string_build=first_half;
                        int temp_cal=first/second;
                        String mid=Integer.toString(temp_cal);
                        string_build+=mid;
                        string_build+=second_half;
                        second=0;first=0;
                        break;
                        }
                }   
        }
        
        for(int k=0;k<array[1];k++){
                for(int i=0;i<string_build.length();i++){
                        if(string_build.charAt(i)=='*'){
                                int iter=i+2;
                                while(iter <string_build.length() && string_build.charAt(iter)!=' '){
                                        second=second*10+string_build.charAt(iter)-'0';
                                        iter++;
                                }
                        second_half=string_build.substring(iter);   // it include space at front
                        iter=i-2;
                        while(iter >=0 && string_build.charAt(iter)!=' '){
                                first=first*10+string_build.charAt(iter)-'0';
                                iter--;
                        }
                        first_half=string_build.substring(0,iter+1);    // include space at end
                        int temp=0;
                                while(first!=0){
                                        temp=temp*10+first%10;
                                        first/=10;
                                }
                                first=temp;                   
                        string_build=first_half;
                        int temp_cal=first*second;
                        String mid=Integer.toString(temp_cal);
                        string_build+=mid;
                        string_build+=second_half;
                        second=0;first=0;
                        break;
                        }
                }   
        }
           
        for(int k=0;k<array[2];k++){
                for(int i=0;i<string_build.length();i++){
                        if(string_build.charAt(i)=='+'){
                                int iter=i+2;
                                while(iter <string_build.length() && string_build.charAt(iter)!=' '){
                                        second=second*10+string_build.charAt(iter)-'0';
                                        iter++;
                                }
                        second_half=string_build.substring(iter);   // it include space at front
                        iter=i-2;
                        while(iter >=0 && string_build.charAt(iter)!=' '){
                                first=first*10+string_build.charAt(iter)-'0';
                                iter--;
                        }
                        first_half=string_build.substring(0,iter+1);    // include space at end
                        int temp=0;
                                while(first!=0){
                                        temp=temp*10+first%10;
                                        first/=10;
                                }
                                first=temp;                   
                        string_build=first_half;
                        int temp_cal=first+second;
                        String mid=Integer.toString(temp_cal);
                        string_build+=mid;
                        string_build+=second_half;
                        second=0;first=0;
                        break;
                        }
                }   
        }
        
        for(int k=0;k<array[3];k++){
                for(int i=0;i<string_build.length();i++){
                        if(string_build.charAt(i)=='-'){
                                int iter=i+2;
                                while(iter <string_build.length() && string_build.charAt(iter)!=' '){
                                        second=second*10+string_build.charAt(iter)-'0';
                                        iter++;
                                }
                        second_half=string_build.substring(iter);   // it include space at front
                        iter=i-2;
                        while(iter >=0 && string_build.charAt(iter)!=' '){
                                first=first*10+string_build.charAt(iter)-'0';
                                iter--;
                        }
                        first_half=string_build.substring(0,iter+1);    // include space at end
                        int temp=0;
                                while(first!=0){
                                        temp=temp*10+first%10;
                                        first/=10;
                                }
                                first=temp;                   
                        string_build=first_half;
                        int temp_cal=first-second;
                        String mid=Integer.toString(temp_cal);
                        string_build+=mid;
                        string_build+=second_half;
                        second=0;first=0;
                        break;
                        }
                }   
        }
        return string_build;
    }
    public static void main(String[] args) {
        new J_Calculator();
    }   
}