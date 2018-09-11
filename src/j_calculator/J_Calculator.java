package j_calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
    private static JButton dot = new JButton(".");
    private static JLabel displaypanel= new JLabel("");
    
    public J_Calculator(){
        JPanel  paneltop=new JPanel(new FlowLayout());
        JPanel  panelleftover=new JPanel(new GridLayout(5,3));
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setBounds(470,130, 500, 500);
        frame.setTitle("Reaper Calculator");
        frame.setLayout(new FlowLayout());
        one.setPreferredSize(new Dimension(75,75 ));
        one.setFont(new Font("Arial", Font.PLAIN, 40));
        one.addActionListener(this);
        one.setBackground(Color.GRAY);
        back.setPreferredSize(new Dimension(75,75 ));
        back.setFont(new Font("Arial", Font.PLAIN, 40));
        back.addActionListener(this);
        back.setBackground(Color.ORANGE);
        plus.setBackground(Color.ORANGE);
        two.setPreferredSize(new Dimension(75,75 ));
        two.setFont(new Font("Arial", Font.PLAIN, 40));
        two.addActionListener(this);
        two.setBackground(Color.GRAY);
        three.setPreferredSize(new Dimension(75,75 ));
        three.setFont(new Font("Arial", Font.PLAIN, 40));
        three.addActionListener(this);
        three.setBackground(Color.GRAY);
        four.setPreferredSize(new Dimension(75,75 ));
        four.setFont(new Font("Arial", Font.PLAIN, 40));
        four.addActionListener(this);
        four.setBackground(Color.GRAY);
        five.setPreferredSize(new Dimension(75,75 ));
        five.setFont(new Font("Arial", Font.PLAIN, 40));
        five.addActionListener(this);
        five.setBackground(Color.GRAY);
        six.setPreferredSize(new Dimension(75,75 ));
        six.setFont(new Font("Arial", Font.PLAIN, 40));
        six.addActionListener(this);
        six.setBackground(Color.GRAY);
        seven.setPreferredSize(new Dimension(75,75 ));
        seven.setFont(new Font("Arial", Font.PLAIN, 40));
        seven.addActionListener(this);
        seven.setBackground(Color.GRAY);
        eight.setPreferredSize(new Dimension(75,75 ));
        eight.setFont(new Font("Arial", Font.PLAIN, 40));
        eight.addActionListener(this);
        eight.setBackground(Color.GRAY);
        nine.setPreferredSize(new Dimension(75,75 ));
        nine.setFont(new Font("Arial", Font.PLAIN, 40));
        nine.addActionListener(this);
        nine.setBackground(Color.GRAY);
        zero.setPreferredSize(new Dimension(75,75 ));
        zero.setFont(new Font("Arial", Font.PLAIN, 40));
        zero.addActionListener(this);
        zero.setBackground(Color.GRAY);
        displaypanel.setPreferredSize(new Dimension(475,50 ));
        displaypanel.setText("Version 1.0.6");
        displaypanel.setSize(60, 60);
        displaypanel.setFont(new Font("Serif", Font.PLAIN, 44));
        plus.setPreferredSize(new Dimension(75,75 ));
        plus.setBackground(Color.ORANGE);
        plus.setFont(new Font("Arial", Font.PLAIN, 40));
        plus.addActionListener(this);
        minus.setBackground(Color.ORANGE);
        minus.setPreferredSize(new Dimension(75,75 ));
        minus.setFont(new Font("Arial", Font.PLAIN, 40));
        minus.addActionListener(this);
        multiply.setPreferredSize(new Dimension(75,75 ));
        multiply.setBackground(Color.ORANGE);
        multiply.setFont(new Font("Arial", Font.PLAIN, 40));
        multiply.addActionListener(this);
        divide.setPreferredSize(new Dimension(75,75 ));
        divide.setFont(new Font("Arial", Font.PLAIN, 40));
        divide.addActionListener(this);
        divide.setBackground(Color.ORANGE);
        dot.setPreferredSize(new Dimension(75,75 ));
        dot.setFont(new Font("Arial", Font.PLAIN, 40));
        dot.addActionListener(this);
        dot.setBackground(Color.GRAY);
        equal.setPreferredSize(new Dimension(75,75 ));
        equal.setFont(new Font("Arial", Font.PLAIN, 40));
        equal.addActionListener(this);
        equal.setBackground(Color.GRAY);
        paneltop.add(displaypanel);        
        panelleftover.add(one);
        panelleftover.add(two);
        panelleftover.add(three);
        panelleftover.add(four);
        panelleftover.add(five);
        panelleftover.add(six);
        panelleftover.add(seven);
        panelleftover.add(eight);
        panelleftover.add(nine);
        panelleftover.add(zero);
        panelleftover.add(plus);
        panelleftover.add(minus);
        panelleftover.add(multiply);
        panelleftover.add(divide);
        panelleftover.add(back);
        panelleftover.add(dot);
        panelleftover.add(equal);
        frame.add(paneltop);
        frame.add(panelleftover);
    }
    private String string_build="";
    static boolean operator=false;
    static boolean dot_operator=true;
    static boolean clear=false;
    @Override 
    public void actionPerformed(ActionEvent event){
        if(clear==true ){
                if( !event.getSource().equals(plus) && !event.getSource().equals(minus) && !event.getSource().equals(divide)
                                && !event.getSource().equals(multiply) ){
                    string_build="";
                }
                clear=false;
        }
        
       if(event.getSource().equals(one)){
           string_build+="1";
           displaypanel.setText(string_build);
           operator=false;
       }
       else if(event.getSource().equals(dot)){
           if(dot_operator ){
                string_build+=".";
                displaypanel.setText(string_build);
                dot_operator=false;
           }
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
           System.out.println(string_build.length());
                if(!operator){
                        if(string_build.length()!=0){
                                string_build+=" + ";
                                System.out.print("11");
                                operator=true;
                        }
               displaypanel.setText(string_build);
           }else{
               int lastindex=string_build.length()-2;
               string_build=string_build.substring(0,lastindex);
               string_build+="+ ";
               displaypanel.setText(string_build);
           }
           dot_operator=true;
       }
       else if(event.getSource().equals(minus)){
                if(!operator){
                        if(string_build.length()!=0){
                                string_build+=" - ";
                                operator=true;
                        }
                        displaypanel.setText(string_build);
           }else{
               int lastindex=string_build.length()-2;
               string_build=string_build.substring(0,lastindex);
               string_build+="- ";
               displaypanel.setText(string_build);
           }
           
           dot_operator=true;
       }
       else if(event.getSource().equals(divide)){
           if(!operator){
                        if(string_build.length()!=0){
                                string_build+=" / ";
                                operator=true;
                        }
                        displaypanel.setText(string_build);
           }else{
               int lastindex=string_build.length()-2;
               string_build=string_build.substring(0,lastindex);
               string_build+="/ ";
               displaypanel.setText(string_build);
           }
           dot_operator=true;
       }
       else if(event.getSource().equals(multiply)){
           if(!operator){
                        if(string_build.length()!=0){
                                string_build+=" * ";
                                operator=true;
                        }
                        displaypanel.setText(string_build);
           }else{
               int lastindex=string_build.length()-2;
               string_build=string_build.substring(0,lastindex);
               string_build+="* ";
               displaypanel.setText(string_build);
           }
           dot_operator=true;
       }
       else if(event.getSource().equals(equal)){
                int flaging=0;
                try{
                        string_build=result(string_build);
                }catch(NumberFormatException nfe){
                        System.out.println("error found");
                        string_build="Bad Expression";
                        displaypanel.setText(string_build);
                        string_build="";
                        flaging=1;
                        }
                if(flaging!=1){
                        displaypanel.setText(string_build);
                }
           
           clear=true;
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
    // This is logical portion of the calculator
    
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
        double first=0,second=0;
        String first_half="",second_half="";
        for(int k=0;k<array[0];k++){
                for(int i=0;i<string_build.length();i++){
                        if(string_build.charAt(i)=='/'){
                                int iter=i+2;
                                String loc="";
                                while(iter <string_build.length() && string_build.charAt(iter)!=' '){
                                        loc+=string_build.charAt(iter);
                                        iter++;
                                }
                        second_half=string_build.substring(iter);   // it include space at front
                        second=Double.parseDouble(loc);
                        //------------------------------------------------------------//
                        //parsing first input for operation
                        iter=i-2;
                        String changeme="";
                        while(iter >=0 && string_build.charAt(iter)!=' '){
                                changeme=changeme+string_build.charAt(iter);
                                iter--;
                        }
                        StringBuilder sb=new StringBuilder(changeme);
                        changeme=sb.reverse().toString();
                        first=Double.parseDouble(changeme);
                        first_half=string_build.substring(0,iter+1);    // include space at end
                        string_build=first_half;        // first half addition for display panel
                        double temp_cal=first/second;
                        
                        // Checking for dot to make it perfect integer
                        Double d=new Double(temp_cal);
                        String checkdot=d.toString();
                        String IsItPerfectNo = "";
                        int flag=0;
                        for(int i280=0 ; i280<checkdot.length() ; i280++){
                                if(checkdot.charAt(i280)=='.'){
                                        for(int i_five=i280+1;i_five<checkdot.length();i_five++){
                                                if(checkdot.charAt(i_five)=='0'){
                                                        flag=1;
                                                }else{
                                                        flag=0;
                                                        break;
                                                }
                                        }
                                        break;
                                }
                                else{
                                        IsItPerfectNo+=checkdot.charAt(i280);
                                }
                                        
                        }
                        String mid="";
                        if(flag==1){
                                mid=IsItPerfectNo;
                                }
                        else{
                                 mid=Double.toString(temp_cal);
                        }
                        // work done now either we have perfect no. or float value
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
                                String loc="";
                                while(iter <string_build.length() && string_build.charAt(iter)!=' '){
                                        loc+=string_build.charAt(iter);
                                        iter++;
                                }
                        second_half=string_build.substring(iter);   // it include space at front
                        second=Double.parseDouble(loc);
                        //------------------------------------------------------------//
                        //parsing first input for operation
                        iter=i-2;
                        String changeme="";
                        while(iter >=0 && string_build.charAt(iter)!=' '){
                                changeme=changeme+string_build.charAt(iter);
                                iter--;
                        }
                        StringBuilder sb=new StringBuilder(changeme);
                        changeme=sb.reverse().toString();
                        first=Double.parseDouble(changeme);
                        first_half=string_build.substring(0,iter+1);    // include space at end
                        string_build=first_half;
                        double temp_cal=first*second;
                        
                        // Checking for dot to make it perfect integer
                        Double d=new Double(temp_cal);
                        String checkdot=d.toString();
                        String IsItPerfectNo = "";
                        int flag=0;
                        for(int i280=0 ; i280<checkdot.length() ; i280++){
                                if(checkdot.charAt(i280)=='.'){
                                        for(int i_five=i280+1;i_five<checkdot.length();i_five++){
                                                if(checkdot.charAt(i_five)=='0'){
                                                        flag=1;
                                                }else{
                                                        flag=0;
                                                        break;
                                                }
                                        }
                                        break;
                                }
                                else{
                                        IsItPerfectNo+=checkdot.charAt(i280);
                                }
                                        
                        }
                        String mid="";
                        if(flag==1){
                                mid=IsItPerfectNo;
                                }
                        else{
                                 mid=Double.toString(temp_cal);
                        }
                        // work done now either we have perfect no. or float value
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
                                String loc="";
                                while(iter <string_build.length() && string_build.charAt(iter)!=' '){
                                        loc+=string_build.charAt(iter);
                                        iter++;
                                }
                        second_half=string_build.substring(iter);   // it include space at front
                        second=Double.parseDouble(loc);
                        //------------------------------------------------------------//
                        //parsing first input for operation
                        iter=i-2;
                        String changeme="";
                        while(iter >=0 && string_build.charAt(iter)!=' '){
                                changeme=changeme+string_build.charAt(iter);
                                iter--;
                        }
                        StringBuilder sb=new StringBuilder(changeme);
                        changeme=sb.reverse().toString();
                        first=Double.parseDouble(changeme);
                        first_half=string_build.substring(0,iter+1);    // include space at end
                        string_build=first_half;
                        double temp_cal=first+second;
                       // Checking for dot to make it perfect integer
                        Double d=new Double(temp_cal);
                        String checkdot=d.toString();
                        String IsItPerfectNo = "";
                        int flag=0;
                        for(int i280=0 ; i280<checkdot.length() ; i280++){
                                if(checkdot.charAt(i280)=='.'){
                                        for(int i_five=i280+1;i_five<checkdot.length();i_five++){
                                                if(checkdot.charAt(i_five)=='0'){
                                                        flag=1;
                                                }else{
                                                        flag=0;
                                                        break;
                                                }
                                        }
                                        break;
                                }
                                else{
                                        IsItPerfectNo+=checkdot.charAt(i280);
                                }
                                        
                        }
                        String mid="";
                        if(flag==1){
                                mid=IsItPerfectNo;
                                }
                        else{
                                 mid=Double.toString(temp_cal);
                        }
                        // work done now either we have perfect no. or float value
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
                                String loc="";
                                while(iter <string_build.length() && string_build.charAt(iter)!=' '){
                                        loc+=string_build.charAt(iter);
                                        iter++;
                                }
                        second_half=string_build.substring(iter);   // it include space at front
                        second=Double.parseDouble(loc);
                        //------------------------------------------------------------//
                        //parsing first input for operation
                        iter=i-2;
                        String changeme="";
                        while(iter >=0 && string_build.charAt(iter)!=' '){
                                changeme=changeme+string_build.charAt(iter);
                                iter--;
                        }
                        StringBuilder sb=new StringBuilder(changeme);
                        changeme=sb.reverse().toString();
                        first=Double.parseDouble(changeme);
                        first_half=string_build.substring(0,iter+1);    // include space at end
                        string_build=first_half;
                        double temp_cal=first-second;
                       // Checking for dot to make it perfect integer
                        Double d=new Double(temp_cal);
                        String checkdot=d.toString();
                        String IsItPerfectNo = "";
                        int flag=0;
                        for(int i280=0 ; i280<checkdot.length() ; i280++){
                                if(checkdot.charAt(i280)=='.'){
                                        for(int i_five=i280+1;i_five<checkdot.length();i_five++){
                                                if(checkdot.charAt(i_five)=='0'){
                                                        flag=1;
                                                }else{
                                                        flag=0;
                                                        break;
                                                }
                                        }
                                        break;
                                }
                                else{
                                        IsItPerfectNo+=checkdot.charAt(i280);
                                }
                                        
                        }
                        String mid="";
                        if(flag==1){
                                mid=IsItPerfectNo;
                                }
                        else{
                                 mid=Double.toString(temp_cal);
                        }
                        // work done now either we have perfect no. or float value
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
        J_Calculator j_Calculator = new J_Calculator();  // no requirenment of object just required for initiating 
                                                                        //frame and components
    }   
}