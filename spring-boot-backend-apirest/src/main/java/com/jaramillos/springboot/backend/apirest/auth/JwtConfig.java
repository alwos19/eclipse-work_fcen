package com.jaramillos.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "Clave.secreta.12345678";
	
	public static String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\n" + 
			"MIIEpQIBAAKCAQEAu1/wZ4fNjTtva55R1g9HQ7aBccTvBehTE1IHH0t0/0wnB+SY\n" + 
			"BRKNMFPFgXORIggYEJYbgBslIib40v5t6VC737jgtJVzWFBQkEH5RMBoPeJlmfQ4\n" + 
			"L1c8ky58pJCM0hZjRCl+pNn7vQk74IgdGvAxyo2c5S8RtjL/dS47OXQtnzBV2XWT\n" + 
			"nCXr5Cg1eVt39Aiw/5g1IXvrG6UTQaJBQCBjYwALLQtOCywW96/ZTdvKeBATIoxk\n" + 
			"yaf9msjOkMYisTr7iz20QmZ4j308qH6Ox8WkNOpFTbUbeI2Dvok0E52Wtm28cGPS\n" + 
			"WyoXre7FjVFI5KXtko5nolPe4YC4FC0iO307WQIDAQABAoIBAAY7lr+a4NeF1pr5\n" + 
			"1TcNow05kOy75EeKBtlprRr5Y5bqbZHxpKzmhRPKdZNsyLMdGc/Tbm7AeGe+bCB4\n" + 
			"nidYrCcw+yiGoCOb6FIkH6qNy+njEgYg/Y11lWo/7Z17wXNrkzm9N508MweCux8o\n" + 
			"5+7xdnaKZ2GoQyqQX7cCJq4ukyXsYxxcXwmAXoQ/WrLUtVD7ZM4zGYQXc+sKNoai\n" + 
			"teHyjbCmpsjimp6XDFqUs1TcjlbigLvcPRjTMtlm7ISn3Ho4J97kHWMXABQi7OWl\n" + 
			"+wH5D0z2iH+bW03s3liIao0DNaqLtk91camWEtjkkwOP+de3zgwLiF9WyALVDpOU\n" + 
			"L9rKPgECgYEA3Uv0siSQi0l2CoXIeGYrjalswOZsZBsXRmlv8d0yn2YlKkdyxX/4\n" + 
			"2KaNlSjO0XZMANu+CrW0Ws9V4FeEOof61Xxck6KKWNfU8m1KCf6bIYcGred7rdeJ\n" + 
			"cSdMH73BGld7TpVDVODMbqhiNthP3ert/OECNmx71chx+zhmSrGeUakCgYEA2MIs\n" + 
			"ZqYn7etE2H42cffwL9UBrpJQ0WVLYpZKNIjs3mK+wuONybH90Z6Dvo84wDxh8ZaL\n" + 
			"id1tzXgZdRWDiQhLpXco9nFPxhnyYpbu7CF3ZVGbjUimEADRx71ughVNX/s0Fw3i\n" + 
			"0xTvsZkcTd51vp9Wf/orYUE3d0sxVPmDvOJnCjECgYEAw5mqfHczR9ozutNLQZhV\n" + 
			"MM6rMMm6zrTfWr5BU1AHubqoaPlkKcuWYbC9fjTmsV/ViACytnarJoUSy8uvNakR\n" + 
			"ffeBQIEvtZ14PJt7EOB5sCXQMpBj0mGru1dXwsqPT0A53liyfeiA6eJthTqnRWis\n" + 
			"2JLtyLsUrf6RONM+HxFl9ZkCgYEAi9q05UI9rx/GmtzMajpsKaCI5kcXiBOQUTrh\n" + 
			"BAZ4toAFzx8dQ87pEs/w9wnXtwj+tO7Kd5h8GT9tRYMtDERi8o7wyhmQPCRPpNb3\n" + 
			"rzlknOXLtJv0MY0lzXdnDt2Jv+0Hzfwyprjycqd0gLWRSP3rxMT4Klb236yPVuFq\n" + 
			"43s8unECgYEArXPbKAyJJxPz8bT9ucvbMvy2yqpuHHzIXcgfBOup4KPPIk7zLSKI\n" + 
			"a5pfTUYf0RiMeVIt7Bw8STCIQKN9g/S35qhIYDJSPzxh+OR9GWASKlFh8bnvwuXl\n" + 
			"3eV2JMheksLWEjT0sRX3BkG/S+V9l1aq3t5PIzob3OXXr4WfWCNCH2M=\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAu1/wZ4fNjTtva55R1g9H\n" + 
			"Q7aBccTvBehTE1IHH0t0/0wnB+SYBRKNMFPFgXORIggYEJYbgBslIib40v5t6VC7\n" + 
			"37jgtJVzWFBQkEH5RMBoPeJlmfQ4L1c8ky58pJCM0hZjRCl+pNn7vQk74IgdGvAx\n" + 
			"yo2c5S8RtjL/dS47OXQtnzBV2XWTnCXr5Cg1eVt39Aiw/5g1IXvrG6UTQaJBQCBj\n" + 
			"YwALLQtOCywW96/ZTdvKeBATIoxkyaf9msjOkMYisTr7iz20QmZ4j308qH6Ox8Wk\n" + 
			"NOpFTbUbeI2Dvok0E52Wtm28cGPSWyoXre7FjVFI5KXtko5nolPe4YC4FC0iO307\n" + 
			"WQIDAQAB\n" + 
			"-----END PUBLIC KEY-----";

}
