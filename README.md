# Jersey memory leak

Project reproduces memory leak in jersey 2.12

# Running

	```
	mvn install
	export MAVEN_OPTS="-Xmx128m"
	mvn jetty:run
	```

# Endpoint
	
	```
	curl http://localhost:8080/a/b/data/c
	```
	
# Memory Leak reported by [Eclipse Memory Analyzer](http://www.eclipse.org/mat/)

	```
	55,674 instances of "org.jvnet.hk2.internal.SystemDescriptor", loaded by "org.eclipse.jetty.webapp.WebAppClassLoader @ 0x7b0f31e78" occupy 153,827,128 (79.07%) bytes. These instances are referenced from one instance of "org.jvnet.hk2.internal.ServiceLocatorImpl", loaded by "org.eclipse.jetty.webapp.WebAppClassLoader @ 0x7b0f31e78"
	
	Keywords
	org.jvnet.hk2.internal.SystemDescriptor
	org.jvnet.hk2.internal.ServiceLocatorImpl
	org.eclipse.jetty.webapp.WebAppClassLoader
	```