package Observer;

public class Editor {
    public EvenManager events = new EvenManager("open","save");
    String file = "";

    void openFile(String filename){
        this.file = filename;
        events.notify("open",file);
    }
    void saveFile(){
        if(file!=""){
            events.notify("save",file);
        }
    }
}
