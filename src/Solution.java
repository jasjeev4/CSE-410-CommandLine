import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    private static String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. In ante metus dictum at. Ornare arcu dui vivamus arcu felis bibendum ut tristique et. Vitae justo eget magna fermentum iaculis eu non diam phasellus. Faucibus vitae aliquet nec ullamcorper sit amet risus. Porttitor eget dolor morbi non. Ac turpis egestas maecenas pharetra convallis. Tincidunt eget nullam non nisi est sit amet facilisis magna. Faucibus turpis in eu mi bibendum neque egestas congue quisque. Quis imperdiet massa tincidunt nunc pulvinar sapien. Ut aliquam purus sit amet luctus venenatis lectus magna. Aenean euismod elementum nisi quis. Viverra justo nec ultrices dui sapien. Nunc lobortis mattis aliquam faucibus purus in massa tempor. Aliquet enim tortor at auctor urna nunc. Tellus elementum sagittis vitae et leo. Ut eu sem integer vitae. Id eu nisl nunc mi ipsum.\n" +
            "Sociis natoque penatibus et magnis dis parturient montes. Magna fermentum iaculis eu non diam phasellus vestibulum lorem sed. Sed velit dignissim sodales ut eu sem integer. Vitae semper quis lectus nulla at volutpat diam. Tellus at urna condimentum mattis pellentesque id nibh tortor id. At volutpat diam ut venenatis. Ac placerat vestibulum lectus mauris. Risus nullam eget felis eget. Cursus eget nunc scelerisque viverra mauris. Dignissim enim sit amet venenatis urna cursus eget nunc. Eget magna fermentum iaculis eu non diam phasellus vestibulum.\n" +
            "Semper viverra nam libero justo laoreet sit amet cursus. Quam id leo in vitae turpis massa. Accumsan in nisl nisi scelerisque eu. Et ligula ullamcorper malesuada proin libero nunc consequat interdum. Curabitur vitae nunc sed velit dignissim. Pharetra pharetra massa massa ultricies mi. Tortor vitae purus faucibus ornare. Tellus elementum sagittis vitae et leo. Nibh tellus molestie nunc non blandit massa enim nec dui. Id neque aliquam vestibulum morbi blandit cursus risus. Quis varius quam quisque id diam vel. Ornare massa eget egestas purus. Metus aliquam eleifend mi in nulla posuere sollicitudin aliquam ultrices. Tristique sollicitudin nibh sit amet commodo nulla facilisi nullam vehicula.\n" +
            "Blandit massa enim nec dui nunc. Ipsum dolor sit amet consectetur adipiscing. Erat pellentesque adipiscing commodo elit at imperdiet dui accumsan sit. Aenean euismod elementum nisi quis eleifend quam adipiscing. Commodo viverra maecenas accumsan lacus vel. Tellus rutrum tellus pellentesque eu tincidunt tortor. Nunc id cursus metus aliquam eleifend mi in nulla. Feugiat nisl pretium fusce id velit ut tortor pretium viverra. Ut faucibus pulvinar elementum integer enim. Tortor at risus viverra adipiscing at in. Cursus in hac habitasse platea dictumst quisque sagittis purus sit. Quam adipiscing vitae proin sagittis nisl rhoncus mattis rhoncus urna. Ultrices gravida dictum fusce ut placerat orci nulla pellentesque dignissim. Sagittis id consectetur purus ut faucibus pulvinar elementum. Nec feugiat nisl pretium fusce id velit ut tortor pretium.\n" +
            "Sit amet nulla facilisi morbi tempus. Nunc sed augue lacus viverra vitae congue eu consequat. Scelerisque mauris pellentesque pulvinar pellentesque habitant morbi. Duis convallis convallis tellus id interdum velit laoreet id donec. Integer malesuada nunc vel risus commodo. Vitae proin sagittis nisl rhoncus mattis rhoncus. Odio tempor orci dapibus ultrices in. Tincidunt praesent semper feugiat nibh sed pulvinar proin gravida hendrerit. Placerat orci nulla pellentesque dignissim enim sit. Est lorem ipsum dolor sit amet consectetur. Tempus quam pellentesque nec nam aliquam sem et tortor consequat. Consequat mauris nunc congue nisi. Dui sapien eget mi proin sed libero enim sed. Quis hendrerit dolor magna eget. In metus vulputate eu scelerisque felis imperdiet. Sit amet risus nullam eget felis eget nunc. Et netus et malesuada fames ac turpis egestas sed.\n";

    private static String anguish = "Wants pawn term dare worsted ladle gull hoe hat search putty yowler coils debt pimple colder Guilty Looks. Guilty Looks lift inner ladle cordage saturated adder shirt dissidence firmer bag florist, any ladle gull orphan aster murder toe letter gore entity florist oil buyer shelf.\n" +
            "\"Guilty Looks!\" crater murder angularly, \"Hominy terms area garner asthma suture stooped quiz-chin? Goiter door florist? Sordidly NUT!\"\n" +
            "\"Wire nut, murder?\" wined Guilty Looks, hoe dint peony tension tore murder's scaldings.\n" +
            "\"Cause dorsal lodge an wicket beer inner florist hoe orphan molasses pimple. Ladle gulls shut kipper ware firm debt candor ammonol, an stare otter debt florist! Debt florist's mush toe dentures furry ladle gull!\"\n" +
            "Wail, pimple oil-wares wander doe wart udder pimple dum wampum toe doe. Debt's jest hormone nurture. Wan moaning, Guilty Looks dissipater murder, an win entity florist.\n" +
            "Fur lung, disk avengeress gull wetter putty yowler coils cam tore morticed ladle cordage inhibited buyer hull firmly off beers—Fodder Beer (home pimple, fur oblivious raisins, coiled \"Brewing\"), Murder Beer, an Ladle Bore Beer. Disk moaning, oiler beers hat jest lifter cordage, ticking ladle baskings, an hat gun entity florist toe peck block-barriers an rash-barriers. Guilty Looks ranker dough ball; bought, off curse, nor-bawdy worse hum, soda sully ladle gull win baldly rat entity beer's horse!\n";

    private static BufferedReader br;

    private static boolean commandMode = true;

    private static String library = null;
    private static Boolean html = null;
    private static Integer count = null;
    private static String outfile = null;
    private static String mode = null;


    public static void main(String args[]) {

        ArrayList<String> al = new ArrayList<String>(Arrays.asList(args));

        checkHelpOrVersion(al);

        //Check if user wants to generate text
        if(al.contains("--generate") || al.contains("-g")) {
            //Command mode
            commandMode = true;
            processCommand(al);
        }
        else {
            commandMode = false;
            br = new BufferedReader(new InputStreamReader(System.in));
            //Interactive mode
            interactiveMode(al);
            //Interactive mode
//            processLine(al);
//            while(true) {
//                BufferedReader
//            }
        }
    }

    private static void checkHelpOrVersion(ArrayList<String> al) {
        //check if user wants help
        if(al.contains("--help") || al.contains("-h")) {
            if(al.size()!=1) {
                System.out.println("Help option needs to be alone");
            }
            else {
                displayHelp();
            }
        }

        //check if user wants the version
        if(al.contains("--version") || al.contains("-v")) {
            if(al.size()!=1) {
                System.out.println("Version option needs to be alone");
            }
            else {
                displayVersion();
            }
        }
    }

    private static void interactiveMode(ArrayList<String> al) {

        switch (al.get(0)) {
            case "generate" : {
                checkHelpOrVersion(al);
                processCommand(al);
                break;
            }
            case "help" : {
                displayHelp();
                break;
            }
            case "version" : {
                displayVersion();
                break;
            }
            case "exit" : {
                displayExitMessage();
                break;
            }
            case "quit" : {
                displayExitMessage();
                break;
            }
            case "set" : {
                manageSet(al);
                break;
            }
            case "show" : {
                manageShow(al);
                break;
            }
            default: {
                System.out.println("Unsupported command. Try 'help' for help with usage.");
                break;
            }
        }
        launchInteractive();
    }

    private static void launchInteractive() {
        String line = gatherLine();
        String[] asArr = line.split(" ");
        ArrayList<String> al = new ArrayList<>(Arrays.asList(asArr));
        interactiveMode(al);
    }

    private static void manageSet(ArrayList<String> al) {
        if(al.size()<3) {
            System.out.println("You need to specify an value for the option you are setting.");
            skipOrEnd();
        }
        switch (al.get(1)) {
            case "mode" : {
                mode = al.get(2);
                break;
            }
            case "count" : {
                setCount(al.get(2));
                break;
            }
            case "html" : {
                setHtml(al.get(2));
                break;
            }
            case "library" : {
                library = al.get(2);
                break;
            }
            default : {
                System.out.println("Incorrect option for set");
                System.out.println("Valid options are: \nmode\ncount\nhtml\nlibrary");
                skipOrEnd();
                break;
            }
        }
    }

    private static void manageShow(ArrayList<String> al) {
        String ans = "";
        if(al.size()<2) {
            ans += "Mode: " + mode + "\nCount: " + count + "\nHTML: " + html + "\nLibrary: " + library;
        }
        switch (al.get(1)) {
            case "mode" : {
                if(mode==null) {
                    System.out.println("Not set yet.");
                }
                else {
                    ans += mode;
                }
                break;
            }
            case "count" : {
                if(count==null) {
                    System.out.println("Not set yet.");
                }
                else {
                    ans += count;
                }
                break;
            }
            case "html" : {
                if(html==null) {
                    System.out.println("Not set yet.");
                }
                else {
                    ans += html;
                }
                break;
            }
            case "library" : {
                if(library==null) {
                    System.out.println("Not set yet.");
                }
                else {
                    ans += library;
                }
                break;
            }
            default : {
                System.out.print("Incorrect option for show");
                System.out.println("Valid options are: \nmode\ncount\nhtml\nlibrary or the command run as just 'show' to display all the options");
                skipOrEnd();
                break;
            }
        }
        System.out.print(ans);
    }


    private static String gatherLine() {
        String retVal = "";
        try {
            retVal =  br.readLine();
        }
        catch (IOException ie) {
            System.out.println("Exception while trying to get input. Program will exit");
            System.exit(1);
        }
        return retVal.trim();
    }

    private static void processCommand(ArrayList<String> al) {

        //Check if user wants to use a library
        int idx1 = al.indexOf("--library");
        int idx2 = al.indexOf("-l");
        int chkIdx = Integer.MAX_VALUE;
        if(idx1>0){
            chkIdx = idx1+1;
        }
        else if(idx2>0) {
            chkIdx = idx2+1;
        }
        else if(commandMode) {
            //Display available libraries
            displayLibraries();
        }
        if(chkIdx<al.size()) {
            library = al.get(chkIdx);
        }
        else if(commandMode){
            System.out.println("No library specified");
            skipOrEnd();
        }


        //Check if user wants to specify a count
        idx1 = al.indexOf("--count");
        idx2 = al.indexOf("-c");
        chkIdx = Integer.MAX_VALUE;
        if(idx1>0){
            chkIdx = idx1+1;
        }
        else if(idx2>0) {
            chkIdx = idx2+1;
        }
        if(chkIdx<al.size()) {
            String val = al.get(chkIdx);
            setCount(val);
        }

        //Check if user wants to specify html mode or no
        idx1 = al.indexOf("--html");
        idx2 = al.indexOf("-t");
        chkIdx = Integer.MAX_VALUE;
        if(idx1>0){
            chkIdx = idx1+1;
        }
        else if(idx2>0) {
            chkIdx = idx2+1;
        }
        if(chkIdx<al.size()) {
            String val = al.get(chkIdx);
            setHtml(val);
        }

        //Check if user wants to specify a outfile filename
        idx1 = al.indexOf("--outfile");
        idx2 = al.indexOf("-o");
        chkIdx = Integer.MAX_VALUE;
        if(idx1>0){
            chkIdx = idx1+1;
        }
        else if(idx2>0) {
            chkIdx = idx2+1;
        }
        if(chkIdx<al.size()) {
            outfile = al.get(chkIdx);
        }

        //Check if user wants to specify a mode
        idx1 = al.indexOf("--mode");
        idx2 = al.indexOf("-m");
        chkIdx = Integer.MAX_VALUE;
        if(idx1>0){
            chkIdx = idx1+1;
        }
        else if(idx2>0) {
            chkIdx = idx2+1;
        }
        if(chkIdx<al.size()) {
            mode = al.get(chkIdx);
        }

        generateText(library, mode, count, html, outfile);
    }

    private static void setCount(String S) {
        try {
            count = Integer.parseInt(S);
        }
        catch (Exception e) {
            System.out.println("Count needs to be a number");
            skipOrEnd();
        }
    }

    private static void setHtml(String S) {
        try {
            html = Boolean.parseBoolean(S);
        }
        catch (Exception e) {
            System.out.println("Html needs to be a true/false value");
            skipOrEnd();
        }
    }


    private static void generateText(String library, String mode, Integer count, Boolean html, String filename) {
        String ans = "";
        switch (library) {
            case "lorem" :
                ans = lorem;
                break;
            case "anguish" :
                ans = anguish;
                break;
            default :
                System.out.println("Library unsupported");
                displayLibraries();
                skipOrEnd();
                break;
        }

        //check that count is specified
        if(count == null) {
            System.out.println("Count must be specified");
            displayCountHelp();
            skipOrEnd();
        }

        //check count is in range
        if((count < 1) || (count > 5)) {
            System.out.println("Count must be in the range 1-5");
            skipOrEnd();
        }

        //check that mode is specified
        if(mode == null) {
            System.out.println("Mode must be specified");
            displayModeHelp();
            skipOrEnd();
        }

        //if html null set to false
        if(html == null) {
            html = false;
        }

        switch (mode) {
            case "words" :
                ans = getWords(ans, count, html);
                break;
            case "bullets" :
                ans = getBullets(ans, count, html);
                break;
            case "paragraphs" :
                ans = getParagraphs(ans, count, html);
                break;
            default:
                System.out.println("Unsupported mode");
                displayModeHelp();
                skipOrEnd();
                break;
        }

        if(filename==null) {
            System.out.println(ans);
        }
        else {
            writeFile(ans, filename);
        }
    }

    private static String getParagraphs(String S, int count, boolean html) {
        String[] paragraphs = S.split("\n");
        String ans = "";
        for(int i=0; i<count; i++) {
            if(html) {
                ans += "<p>" + paragraphs[i] + "</p>\n";
            }
            else {
                ans += "\t" + paragraphs[i];
                if(i<(count-1)) {
                    ans += "\n\n";
                }
            }
        }
        return ans;
    }

    private static String getWords(String S, int count, boolean html) {
        String[] words = S.split(" ");
        String ans = "";
        for(int i=0; i<count; i++) {
            String line = words[i].replaceAll("[^a-zA-Z]","");
            if(html) {
                ans += "<h1>" + line + "</h1>\n";
            }
            else {
                ans += line + "\n";
            }
        }
        return ans;
    }

    private static String getBullets(String S, int count, boolean html) {
        String[] bullets = S.split("[.]");
        String ans = "";
        for(int i=0; i<count; i++) {
            if(html) {
                ans += "\t<li>\n\t\t" + bullets[i].trim() + "\n\t</li>\n";
            }
            else {
                ans = ans + "• " + bullets[i].trim() + "\n";
            }
        }
        if(html) {
            ans = "<ul>\n" + ans + "</ul>";
        }
        return ans;
    }

    private static void displayLibraries() {
        System.out.println("Supported libraries: lorem and anguish");
    }

    private static void displayHelp() {
        System.out.println("This program supports generate mode as well as interactive mode.");
        System.out.println("Use generate mode by specifying the flag --generate or -g");
        System.out.println("Here are the flags available to use in generate mode:");
        System.out.println("Specify a library using --library or -l followed by the library name.");
        displayLibraries();
        displayCountHelp();
        displayModeHelp();
    }

    private static void displayCountHelp() {
        System.out.println("Specify an integer count 1-5 using --count or -c");
    }

    private static void displayModeHelp() {
        System.out.println("Specify a mode using --mode or -m followed by the mode");
        System.out.println("Supported modes are: words, bullets and paragraphs");
    }

    private static void displayFileHelp() {
        System.out.println("Specify a filename using --outfile or -o followed by the filename");
    }

    private static void displayExitMessage() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    private static void displayVersion() {
        System.out.println("Version 0.0.3");
    }

    private static void writeFile(String S, String filename) {
        File tempFile = new File(filename);
        if(tempFile.exists()) {
            System.out.println("File: " + filename + " already exists, try a different filename");
            skipOrEnd();
        }
        BufferedWriter fw = null;
        try {
            fw = new BufferedWriter((new FileWriter(filename)));
            fw.write(S);
            fw.close();
        }
        catch (Exception e) {
            System.out.println("Exception while trying to write to file. Exception:\n" + e);
        }
    }

    private static void skipOrEnd() {
        if(commandMode) {
            System.exit(-1);
        }
        else {
            launchInteractive();
        }
    }
}