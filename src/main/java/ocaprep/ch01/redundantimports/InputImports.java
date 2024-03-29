package ocaprep.ch01.redundantimports;

// option 1
// importing classes explicitly
// import java.nio.file.Files;
// import java.nio.file.Paths;

// option 2
// importing with wildcard (*)
import java.nio.file.*;

/*
    -- notes --
    import java.nio.*; // NO GOOD - a wildcard only matches class names, not "file.*Files"
    import java.nio.*.*; // NO GOOD - you can only have one wildcard and it must be at the end
    import java.nio.files.Paths.*; // NO GOOD - you cannot import methods only class names
*/

public class InputImports {
    public void read(Files files){
        Paths.get("name");
    }
}