package ArtPort;

import ArtPort.Catalog.Subdivision;
import ArtPort.Documents.AbstractDocument;
import ArtPort.Documents.Order;
import ArtPort.Documents.Voyage;
import ArtPort.Enums.AccumulationRecordType;
import ArtPort.Interface.ICatalog;
import ArtPort.Interface.IDocument;

import java.util.ArrayList;

public class ManagedApplicationModule {


    public static void main(String[] args) {

        AbstractDocument order = new Order();
        order.checkDocument();
        order.setNumber("first");
        System.out.println(order.getNumber());


        AbstractDocument order1 = new Order();
        order1.setNumber("second");
        order1.checkDocument();
        System.out.println(order1.getNumber());

        System.out.println(AbstractDocument.documentCost);


        AccumulationRecordType accumulationRecordType =AccumulationRecordType.EXPENSE;

        switch (accumulationRecordType){
            case EXPENSE:
                System.out.println(AbstractDocument.documentCost);
                break;
            case RECEIPT:
                break;
        }



    }
}
