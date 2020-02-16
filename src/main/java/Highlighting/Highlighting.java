package Highlighting;

import org.fxmisc.richtext.model.StyleSpans;

import java.util.Collection;

public interface Highlighting {
    public StyleSpans<Collection<String>> computeHighlighting( String text );
}
