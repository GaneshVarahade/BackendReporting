package com.comlink.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

public class CrdParameterizedRowMapper implements ParameterizedRowMapper<Crd>
{
	public Crd mapRow(ResultSet rs, int rowNum) throws SQLException {
		Crd crd = new Crd();		
		crd.setCdrId(rs.getInt("cdr_id"));
		crd.setCallerSubId(rs.getInt("caller_sub_id"));
		crd.setCalleeSubId(rs.getInt("callee_sub_id"));
		crd.setSubscriberGroupId(rs.getInt("subscriber_group_id"));
		crd.setCallerSubRspId(rs.getString("caller_sub_rsp_id"));
		crd.setProxyUri(rs.getString("proxy_uri"));
		crd.setSourceAddress(rs.getString("source_address"));
		crd.setCalledUri(rs.getString("called_uri"));
		crd.setCallStart(rs.getInt("call_start"));
		crd.setCallAnswer(rs.getInt("call_answer"));
		crd.setCallEnd(rs.getInt("call_end"));
		crd.setCallerUri(rs.getString("caller_uri"));
		crd.setOriginCallId(rs.getString("origin_call_id"));
		crd.setTerminationCallId(rs.getString("termination_call_id"));
		crd.setSipId(rs.getString("sip_id"));
		crd.setSipStatus(rs.getInt("cdr_id"));
		crd.setCountryCode(rs.getString("caller_uri"));     
		crd.setTerminatedByCaller(rs.getBoolean("is_terminated_by_caller")); 
		return crd;
	}
}
