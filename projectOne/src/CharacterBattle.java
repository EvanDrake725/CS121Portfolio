
import javax.swing.*;
    public class CharacterBattle {
        public static void main(String[] args){
            int numRounds = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of rounds \n (preferably an odd amount)"));
            int p1score=0;
            int p2score=0;
            for (int s = 1; s < numRounds + 1; s++) {
                String p1n = JOptionPane.showInputDialog("Enter Player 1s name:");
                int p1h = Integer.parseInt(JOptionPane.showInputDialog("Enter "+ p1n + "s hp:"));
                String p1an = JOptionPane.showInputDialog("Enter " +p1n+"s attack name:");
                int p1ast = Integer.parseInt(JOptionPane.showInputDialog("Enter " +p1an+ "s attack strength"));
                int  p1asp= Integer.parseInt(JOptionPane.showInputDialog("Enter " +p1an+ "s attack speed"));

                String p2n = JOptionPane.showInputDialog("Enter Player 2s name:");
                int p2h = Integer.parseInt(JOptionPane.showInputDialog("Enter "+ p2n + "s hp:"));
                String p2an = JOptionPane.showInputDialog("Enter " +p2n+"s attack name:");
                int p2ast = Integer.parseInt(JOptionPane.showInputDialog("Enter " +p2an+ "s attack strength"));
                int  p2asp= Integer.parseInt(JOptionPane.showInputDialog("Enter " +p2an+ "s attack speed"));

                if (p1asp>p2asp){
                    while (p1h>0 && p2h>0) {
                        p2h = p2h - p1ast;
                        if (p2h <= 0) {
                            JOptionPane.showMessageDialog(null, "Commencing Battle!");
                            p1score++;
                            JOptionPane.showMessageDialog(null, "Round " + s + "\n" + p1n + " won the round!");
                            JOptionPane.showMessageDialog(null, "p1 wins: " + p1score + "\n p2 wins: " + p2score);
                        } else {
                            JOptionPane.showMessageDialog(null, "Commencing Battle!");
                            p1h = p1h-p2ast;
                            if (p1h <= 0) {
                                p2score++;
                                JOptionPane.showMessageDialog(null, "Round " + s + "\n" + p2n + " won the round!");
                                JOptionPane.showMessageDialog(null, "p1 wins: " + p1score + "\n p2 wins: " + p2score);
                            }
                        }
                        JOptionPane.showMessageDialog(null, "They fought and "+ p1n+ " has "+p1h+" and "+ p2n+ " has "+p2h);
                    }
                }else if(p1asp<p2asp){
                    while (p1h>0 && p2h>0) {
                        JOptionPane.showMessageDialog(null, "Commencing Battle!");
                        p1h = p1h-p2ast;
                        if (p1h <= 0) {
                            p2score++;
                            JOptionPane.showMessageDialog(null, "Round " + s + "\n" + p2n + " won the round!");
                            JOptionPane.showMessageDialog(null, "p1 wins: " + p1score + "\n p2 wins: " + p2score);
                        } else {
                            JOptionPane.showMessageDialog(null, "Commencing Battle!");
                            p2h = p2h-p1ast;
                            if (p2h <= 0) {
                                p1score++;
                                JOptionPane.showMessageDialog(null, "Round " + s + "\n" + p1n + " won the round!");
                                JOptionPane.showMessageDialog(null, "p1 wins: " + p1score + "\n p2 wins: " + p2score);
                            }
                            JOptionPane.showMessageDialog(null, "They fought and "+ p1n+ " has "+p1h+" and "+ p2n+ " has "+p2h);
                        }
                    }
                }
            }if (p1score>p2score){
                JOptionPane.showMessageDialog(null, "Player 1 wins!");
            } else if(p1score<p2score){
                JOptionPane.showMessageDialog(null, "Player 2 wins!");
            }else{
                JOptionPane.showMessageDialog(null, "Player 1 ties with player 2!");
            }
            JOptionPane.showMessageDialog(null, "Final scores: \n Player 1 wins: "+p1score + "\n Player 2 wins: "+p2score);
        }
    }
