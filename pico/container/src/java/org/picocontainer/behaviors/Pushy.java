/*****************************************************************************
 * Copyright (C) PicoContainer Organization. All rights reserved.            *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the LICENSE.txt file.                                                     *
 *                                                                           *
 * Original code by                                                          *
 *****************************************************************************/
package org.picocontainer.behaviors;

import org.picocontainer.Behavior;
import org.picocontainer.ComponentAdapter;

import java.io.Serializable;

public class Pushy extends AbstractBehavior implements Behavior, Serializable {
    public Pushy(ComponentAdapter delegate) {
        super(delegate);
    }

    public boolean hasLifecycle(Class type) {
        return true;
    }

    public String toString() {
        return "Pushy:" + super.toString();    
    }
}