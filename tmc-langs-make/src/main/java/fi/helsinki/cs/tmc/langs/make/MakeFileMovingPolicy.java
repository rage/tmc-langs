package fi.helsinki.cs.tmc.langs.make;

import fi.helsinki.cs.tmc.langs.sandbox.ExtraStudentFileAwareFileMovingPolicy;

import java.nio.file.Path;

public class MakeFileMovingPolicy extends ExtraStudentFileAwareFileMovingPolicy {

    /**
     * Returns {@code True} for all files in the <tt>projectRoot/src/main</tt> directory and other
     * files required for building the project.
     *
     * <p>Will NOT return {@code True} for any test files. If test file modification are part
     * of the exercise, those test files are whitelisted as <tt>ExtraStudentFiles</tt> and the
     * decision to move them is made by {@link ExtraStudentFileAwareFileMovingPolicy}.
     */
    @Override
    public boolean shouldMoveFile(Path path) {
        return !path.endsWith("Makefile") && path.toString().startsWith("src/");
    }
}