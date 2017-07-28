package in.clouthink.daas.sbb.news.domain.request;


import in.clouthink.daas.sbb.account.domain.model.SysUser;
import in.clouthink.daas.sbb.news.domain.model.News;

/**
 */
public interface ReadNewsEvent {

	String EVENT_NAME = ReadNewsEvent.class.getName();

	News getNews();

	SysUser getUser();

}
