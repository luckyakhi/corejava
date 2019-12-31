package in.javacomics.streams;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {
    public static void main(String[] args) {
        Trade ril1 = new Trade("1","RIL",InstrumentType.EQUITY,10,1200);
        Trade ril2 = new Trade("2","RIL",InstrumentType.EQUITY,20,600);
        Trade bond1 = new Trade("3","PF",InstrumentType.DEBT,5,300);
        Trade bond2 = new Trade("4","PF",InstrumentType.DEBT,6,200);
        Trade sb1 = new Trade("5","SBI",InstrumentType.EQUITY,100,700);
        Trade sb2 = new Trade("5","SBI",InstrumentType.EQUITY,5,780);
        List<Trade> tradeList = Arrays.asList(ril1,ril2,bond1,bond2,sb1,sb2);
        Map<String, List<Trade>> groupedMap=tradeList.stream().filter(t-> t.getInstrumentType()==InstrumentType.EQUITY)
                .collect(Collectors.groupingBy(Trade::getCusip));
        groupedMap.entrySet().forEach(entry -> {
            System.out.println("Entries for "+entry.getKey());
            int value=entry.getValue().stream().map(t->t.getPrice()*t.getQuantity()).reduce(Math::addExact).get();
            System.out.println("Value is for "+value);

        });
        Map<String, List<Trade>> groupedTrade = tradeList.stream().collect(Collectors.groupingBy(Trade::getCusip));
        System.out.println(groupedTrade);
    }
}
