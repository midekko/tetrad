///////////////////////////////////////////////////////////////////////////////
// For information as to what this class does, see the Javadoc, below.       //
// Copyright (C) 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006,       //
// 2007, 2008, 2009, 2010, 2014, 2015 by Peter Spirtes, Richard Scheines, Joseph   //
// Ramsey, and Clark Glymour.                                                //
//                                                                           //
// This program is free software; you can redistribute it and/or modify      //
// it under the terms of the GNU General Public License as published by      //
// the Free Software Foundation; either version 2 of the License, or         //
// (at your option) any later version.                                       //
//                                                                           //
// This program is distributed in the hope that it will be useful,           //
// but WITHOUT ANY WARRANTY; without even the implied warranty of            //
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the             //
// GNU General Public License for more details.                              //
//                                                                           //
// You should have received a copy of the GNU General Public License         //
// along with this program; if not, write to the Free Software               //
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA //
///////////////////////////////////////////////////////////////////////////////

package edu.cmu.tetradapp.model;

import edu.cmu.tetrad.data.DataSet;
import edu.cmu.tetrad.graph.Node;
import edu.cmu.tetrad.session.Executable;
import edu.cmu.tetrad.util.Parameters;

import java.util.List;

/**
 * Represents a runner for a Markov blanket search.
 *
 * @author Tyler Gibson
 */
public interface MarkovBlanketSearchRunner extends Executable {
    static final long serialVersionUID = 23L;

    /**
     * @return the search params.
     */
    Parameters getParams();


    /**
     * Return the source for the search.
     */
    DataSet getSource();
    

    /**
     * @return the data model for the variables in the markov blanket.
     */
    DataSet getDataModelForMarkovBlanket();


    /**
     * @return the variables in the markov blanket.
     */
    List<Node> getMarkovBlanket();


    /**
     * @return the name of the search.
     */
    String getSearchName();


    /**
     * Sets the search name.
     */
    void setSearchName(String n);


}



