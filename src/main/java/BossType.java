package main.java;

public enum BossType {
    HARPY("HARPY-art.utf.ans"),
    WEREWOLF("WEREWOLF-art.utf.ans"),
    VAMPIRE("VAMPIRE-art.utf.ans"),
    DRAGON("DRAGON-art.utf.ans");
    
    private String path;
    private BossType(String path) {
        this.path = path;
    } 


    public String getPath(){
        return this.path;
    }
}