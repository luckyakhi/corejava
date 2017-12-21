package in.javacomics.designpatterns.behavioural.proxy;

import java.util.List;

import in.javacomics.designpatterns.behavioural.visitor.Trade;

public interface Enricher {
	public List<Trade> enrich(List<Trade> input);
}
