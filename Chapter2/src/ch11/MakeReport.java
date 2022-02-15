package ch11;

public class MakeReport {
    private StringBuffer buffer = new StringBuffer();
    private String line = "=================================\n";
    private String title = "이름\t   주소\t\t   전화번호\n";

    private void makeHeader(){
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody(){
        buffer.append("jame \t");
        buffer.append("Seoul \t");
        buffer.append("010-3333-3333\n");

        buffer.append("eddie \t");
        buffer.append("Seoul \t");
        buffer.append("010-4444-3333\n");
    }

    private void makeFooter(){
        buffer.append(line);
    }

    public String getReport(){
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }

}
