/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openjpa.persistence.criteria;

import java.sql.Date;
import javax.persistence.metamodel.Attribute;

@javax.persistence.metamodel.TypesafeMetamodel(
    value=org.apache.openjpa.persistence.criteria.Magazine.class)
public class Magazine_ {
    public static volatile Attribute<Magazine,Date> datePublished;
    public static volatile Attribute<Magazine,Integer> id;
    public static volatile Attribute<Magazine,Publisher> idPublisher;
    public static volatile Attribute<Magazine,String> name;
}
