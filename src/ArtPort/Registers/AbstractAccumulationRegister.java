package ArtPort.Registers;

import ArtPort.Documents.AbstractDocument;
import ArtPort.Enums.AccumulationRecordType;

import java.util.Date;

public abstract class AbstractAccumulationRegister {

    private Date period;
    private AbstractDocument recorder;
    private int lineNo;
    private boolean active;
    private AccumulationRecordType recordKind;

}




