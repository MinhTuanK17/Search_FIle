package controller;

import common.Library;
import java.util.List;
import view.Menu;

public class WordManagement extends Menu<String>{
    
    static String[] menu = {"Count Word In File", "Find File By Word"};
    private WordProgram wp = new WordProgram();
    private Library lib = new Library();

    public WordManagement() {
        super("==== Word Program ====", menu, "Exit");
    }
    
    @Override
    public void execute(int n) {
        String path;
        String word;
        switch (n) {
            case 1:
                path = lib.getString("Enter Path : ");
                word = lib.getString("Enter Word : ");
                System.out.println("Bout : "+wp.countWordInFile(path, word));
                break;
            case 2:
                path = lib.getString("Enter Path : ");
                word = lib.getString("Enter Word : ");

                System.out.println("--------------File Name--------------");
                try {
                    List<String> list = wp.getFileName(path, word);
                    for (String fileName : list) {
                        System.out.println(fileName);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;
            default:
                return;
        }
    }
}
