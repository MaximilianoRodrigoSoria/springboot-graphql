package ar.com.graphql.poc.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Component;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

	public String hello() {
		return "Hola mundo!!!";
	}

	public int suma(int a, int b) {
		return a + b;
	}

}
