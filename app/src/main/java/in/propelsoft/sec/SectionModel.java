package in.propelsoft.sec;

import java.util.ArrayList;

/**
 * Created by suvindran on 11-Oct-17.
 */

public class SectionModel {
    private String Section;
    private ArrayList<String> itemArraylist;

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public ArrayList<String> getItemArraylist() {
        return itemArraylist;
    }

    public void setItemArraylist(ArrayList<String> itemArraylist) {
        this.itemArraylist = itemArraylist;
    }

    public SectionModel(String section, ArrayList<String> itemArraylist) {
        Section = section;
        this.itemArraylist = itemArraylist;
    }


}
