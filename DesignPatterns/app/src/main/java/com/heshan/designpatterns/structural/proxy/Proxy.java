/*
Proxy Design Pattern
Proxy means ‘in place of’, representing’ or ‘in place of’ or ‘on behalf of’ are literal
meanings of proxy and that directly explains Proxy Design Pattern.

Proxies are also called surrogates, handles, and wrappers. They are closely related in s
tructure, but not purpose, to Adapters and Decorators.

A real world example can be a cheque or credit card is a proxy for what is in our bank
account. It can be used in place of cash, and provides a means of accessing that cash when
required. And that’s exactly what the Proxy pattern does – “Controls and manage access to
the object they are protecting“.

When to use this pattern?

Proxy pattern is used when we need to create a wrapper to cover the main object’s complexity from
the client.

Some Examples

A very simple real life scenario is our college internet, which restricts few site access.
The proxy first checks the host you are connecting to, if it is not part of restricted site list,
then it connects to the real internet. This example is based on Protection proxies.

*/

package com.heshan.designpatterns.structural.proxy;

public class Proxy extends Subject {

    private RealSubject realSubject;

    public Proxy(RealSubject subject) {
         this.realSubject = subject;
    }

    @Override
    public String operation() {
        return "Hello world from Proxy and " + realSubject.operation();
    }
}
