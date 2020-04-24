package com.company;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;
import com.sun.deploy.util.StringUtils;
import com.sun.jmx.snmp.internal.SnmpSubSystem;

import java.util.Scanner;

public class Main {
    static int mt (int n1,int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.printf("%d",mt(n1,n2));
        }
    }
