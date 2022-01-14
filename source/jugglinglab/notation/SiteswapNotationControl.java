// SiteswapNotationControl.java
//
// Copyright 2002-2022 Jack Boyce and the Juggling Lab contributors

package jugglinglab.notation;


public class SiteswapNotationControl extends MHNNotationControl {
    @Override
    public Pattern newPattern() {
        return new SiteswapPattern();
    }
}
