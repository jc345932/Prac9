import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jc345932 on 21/09/17.
 */
public class JMovieFrame extends JFrame implements ActionListener{
    private  JButton nbt,sbt,ebt,wbt,cbt;
    private JLabel nlb,slb,elb,wlb,clb;
    private JPanel mp;
    public JMovieFrame(){
        setTitle("Movie");
        mp = new JPanel(new BorderLayout());
        setContentPane(mp);
        setSize(500,500);
        nbt = new JButton("North of the Movie");
        sbt = new JButton("South of the Movie");
        ebt = new JButton("East of the Movie");
        wbt = new JButton("West of the Movie");
        cbt = new JButton("Center of the Movie");
        nlb = new JLabel("  1996, James");
        slb = new JLabel("  1997, Mike");
        elb = new JLabel("  1998, John");
        wlb = new JLabel("  1999, Peter");
        clb = new JLabel("  2000, Tom");
        mp.add(nbt, BorderLayout.NORTH);
        mp.add(sbt, BorderLayout.SOUTH);
        mp.add(ebt, BorderLayout.EAST);
        mp.add(wbt, BorderLayout.WEST);
        mp.add(cbt, BorderLayout.CENTER);
        nbt.addActionListener(this);
        sbt.addActionListener(this);
        ebt.addActionListener(this);
        wbt.addActionListener(this);
        cbt.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == nbt){
            remove(nbt);
            add(nlb, BorderLayout.NORTH);
        }else if (e.getSource() == sbt){
            remove(sbt);
            add(slb,BorderLayout.SOUTH);
        }else if (e.getSource() == ebt){
            remove(ebt);
            add(elb,BorderLayout.EAST);
        }else if (e.getSource() == wbt){
            remove(wbt);
            add(wlb, BorderLayout.WEST);
        }else if (e.getSource() == ebt){
            remove(ebt);
            add(elb,BorderLayout.EAST);
        }else if (e.getSource()== cbt){
            remove(cbt);
            add(clb,BorderLayout.CENTER);
        }
        invalidate();
        validate();
    }
    public static void main(String[] args){
        JMovieFrame movie = new JMovieFrame();
        movie.setVisible(true);
        movie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
