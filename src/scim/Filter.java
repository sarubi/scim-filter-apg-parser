package scim;

import apg.Grammar;

import java.io.PrintStream;

/** This class has been generated automatically from an SABNF grammer by
 * Java APG, the {@link apg.Generator} class.<br>
 * It is an extension of the {@link apg.Grammar}
 * class containing additional members and enums not found
 * in the base class.<br>
 * The function {@link #getInstance()} will return a reference to a static,
 * singleton instance of the class.
 * <p>For more information visit <a href="http://www.coasttocoastresearch.com" target="_blank">http://www.coasttocoastresearch.com</a>. */

public class Filter extends Grammar {

    // public API
    /** Called to get a singleton instance of this class.
     * @return a singleton instance of this class, cast as the base class, Grammar. */
    public static Grammar getInstance(){
        if(factoryInstance == null){
            factoryInstance = new Filter(getRules(), getUdts(), getOpcodes());
        }
        return factoryInstance;
    }

    // rule name enum
    /** The number of rules in the grammar */
    public static int ruleCount = 61;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>13</code>, name = <code>"ALPHA"</code> */
        ALPHA("ALPHA", 13, 99, 3),
        /** id = <code>4</code>, name = <code>"attrExp"</code> */
        ATTREXP("attrExp", 4, 35, 11),
        /** id = <code>9</code>, name = <code>"ATTRNAME"</code> */
        ATTRNAME("ATTRNAME", 9, 86, 4),
        /** id = <code>1</code>, name = <code>"attrPath"</code> */
        ATTRPATH("attrPath", 1, 6, 8),
        /** id = <code>37</code>, name = <code>"authority"</code> */
        AUTHORITY("authority", 37, 205, 10),
        /** id = <code>16</code>, name = <code>"char"</code> */
        CHAR("char", 16, 108, 17),
        /** id = <code>8</code>, name = <code>"compareOp"</code> */
        COMPAREOP("compareOp", 8, 76, 10),
        /** id = <code>7</code>, name = <code>"compValue"</code> */
        COMPVALUE("compValue", 7, 70, 6),
        /** id = <code>47</code>, name = <code>"dec-octet"</code> */
        DEC_OCTET("dec-octet", 47, 351, 16),
        /** id = <code>28</code>, name = <code>"decimal-point"</code> */
        DECIMAL_POINT("decimal-point", 28, 168, 1),
        /** id = <code>14</code>, name = <code>"DIGIT"</code> */
        DIGIT("DIGIT", 14, 102, 1),
        /** id = <code>29</code>, name = <code>"digit1-9"</code> */
        DIGIT1_9("digit1-9", 29, 169, 1),
        /** id = <code>30</code>, name = <code>"e"</code> */
        E("e", 30, 170, 3),
        /** id = <code>17</code>, name = <code>"escape"</code> */
        ESCAPE("escape", 17, 125, 1),
        /** id = <code>25</code>, name = <code>"exp"</code> */
        EXP("exp", 25, 150, 8),
        /** id = <code>21</code>, name = <code>"false"</code> */
        FALSE("false", 21, 139, 1),
        /** id = <code>5</code>, name = <code>"filter"</code> */
        FILTER("filter", 5, 46, 14),
        /** id = <code>6</code>, name = <code>"filterDash"</code> */
        FILTERDASH("filterDash", 6, 60, 10),
        /** id = <code>26</code>, name = <code>"frac"</code> */
        FRAC("frac", 26, 158, 4),
        /** id = <code>57</code>, name = <code>"fragment"</code> */
        FRAGMENT("fragment", 57, 408, 5),
        /** id = <code>44</code>, name = <code>"h16"</code> */
        H16("h16", 44, 335, 2),
        /** id = <code>20</code>, name = <code>"HEXDIG"</code> */
        HEXDIG("HEXDIG", 20, 131, 8),
        /** id = <code>35</code>, name = <code>"hier-part"</code> */
        HIER_PART("hier-part", 35, 188, 8),
        /** id = <code>39</code>, name = <code>"host"</code> */
        HOST("host", 39, 221, 4),
        /** id = <code>27</code>, name = <code>"int"</code> */
        INT("int", 27, 162, 6),
        /** id = <code>41</code>, name = <code>"IP-literal"</code> */
        IP_LITERAL("IP-literal", 41, 227, 6),
        /** id = <code>46</code>, name = <code>"IPv4address"</code> */
        IPV4ADDRESS("IPv4address", 46, 343, 8),
        /** id = <code>43</code>, name = <code>"IPv6address"</code> */
        IPV6ADDRESS("IPv6address", 43, 243, 92),
        /** id = <code>42</code>, name = <code>"IPvFuture"</code> */
        IPVFUTURE("IPvFuture", 42, 233, 10),
        /** id = <code>45</code>, name = <code>"ls32"</code> */
        LS32("ls32", 45, 337, 6),
        /** id = <code>31</code>, name = <code>"minus"</code> */
        MINUS("minus", 31, 173, 1),
        /** id = <code>10</code>, name = <code>"nameChar"</code> */
        NAMECHAR("nameChar", 10, 90, 5),
        /** id = <code>22</code>, name = <code>"null"</code> */
        NULL("null", 22, 140, 1),
        /** id = <code>24</code>, name = <code>"number"</code> */
        NUMBER("number", 24, 142, 8),
        /** id = <code>0</code>, name = <code>"PATH"</code> */
        PATH("PATH", 0, 0, 6),
        /** id = <code>49</code>, name = <code>"path-abempty"</code> */
        PATH_ABEMPTY("path-abempty", 49, 372, 4),
        /** id = <code>50</code>, name = <code>"path-absolute"</code> */
        PATH_ABSOLUTE("path-absolute", 50, 376, 9),
        /** id = <code>52</code>, name = <code>"path-empty"</code> */
        PATH_EMPTY("path-empty", 52, 391, 2),
        /** id = <code>51</code>, name = <code>"path-rootless"</code> */
        PATH_ROOTLESS("path-rootless", 51, 385, 6),
        /** id = <code>55</code>, name = <code>"pchar"</code> */
        PCHAR("pchar", 55, 397, 6),
        /** id = <code>58</code>, name = <code>"pct-encoded"</code> */
        PCT_ENCODED("pct-encoded", 58, 413, 4),
        /** id = <code>32</code>, name = <code>"plus"</code> */
        PLUS("plus", 32, 174, 1),
        /** id = <code>40</code>, name = <code>"port"</code> */
        PORT("port", 40, 225, 2),
        /** id = <code>56</code>, name = <code>"query"</code> */
        QUERY("query", 56, 403, 5),
        /** id = <code>18</code>, name = <code>"quotation-mark"</code> */
        QUOTATION_MARK("quotation-mark", 18, 126, 1),
        /** id = <code>48</code>, name = <code>"reg-name"</code> */
        REG_NAME("reg-name", 48, 367, 5),
        /** id = <code>36</code>, name = <code>"scheme"</code> */
        SCHEME("scheme", 36, 196, 9),
        /** id = <code>53</code>, name = <code>"segment"</code> */
        SEGMENT("segment", 53, 393, 2),
        /** id = <code>54</code>, name = <code>"segment-nz"</code> */
        SEGMENT_NZ("segment-nz", 54, 395, 2),
        /** id = <code>12</code>, name = <code>"SP"</code> */
        SP("SP", 12, 98, 1),
        /** id = <code>15</code>, name = <code>"string"</code> */
        STRING("string", 15, 103, 5),
        /** id = <code>60</code>, name = <code>"sub-delims"</code> */
        SUB_DELIMS("sub-delims", 60, 424, 12),
        /** id = <code>11</code>, name = <code>"subAttr"</code> */
        SUBATTR("subAttr", 11, 95, 3),
        /** id = <code>23</code>, name = <code>"true"</code> */
        TRUE("true", 23, 141, 1),
        /** id = <code>19</code>, name = <code>"unescaped"</code> */
        UNESCAPED("unescaped", 19, 127, 4),
        /** id = <code>59</code>, name = <code>"unreserved"</code> */
        UNRESERVED("unreserved", 59, 417, 7),
        /** id = <code>34</code>, name = <code>"URI"</code> */
        URI("URI", 34, 176, 12),
        /** id = <code>38</code>, name = <code>"userinfo"</code> */
        USERINFO("userinfo", 38, 215, 6),
        /** id = <code>3</code>, name = <code>"valFilter"</code> */
        VALFILTER("valFilter", 3, 19, 16),
        /** id = <code>2</code>, name = <code>"valuePath"</code> */
        VALUEPATH("valuePath", 2, 14, 5),
        /** id = <code>33</code>, name = <code>"zero"</code> */
        ZERO("zero", 33, 175, 1);
        private String name;
        private int id;
        private int offset;
        private int count;
        RuleNames(String string, int id, int offset, int count){
            this.name = string;
            this.id = id;
            this.offset = offset;
            this.count = count;
        }
        /** Associates the enum with the original grammar name of the rule it represents.
        * @return the original grammar rule name. */
        public  String ruleName(){return name;}
        /** Associates the enum with an identifier for the grammar rule it represents.
        * @return the rule name identifier. */
        public  int    ruleID(){return id;}
        private int    opcodeOffset(){return offset;}
        private int    opcodeCount(){return count;}
    }

    // UDT name enum
    /** The number of UDTs in the grammar */
    public static int udtCount = 0;
    /** This enum provides easy to remember enum constants for locating the UDT identifiers and names.
     * The enum constants have the same spelling as the UDT names rendered in all caps with underscores replacing hyphens. */
    public enum UdtNames{
    }

    // private
    private static Filter factoryInstance = null;
    private Filter(Rule[] rules, Udt[] udts, Opcode[] opcodes){
        super(rules, udts, opcodes);
    }

    private static Rule[] getRules(){
    	Rule[] rules = new Rule[61];
        for(RuleNames r : RuleNames.values()){
            rules[r.ruleID()] = getRule(r.ruleID(), r.ruleName(), r.opcodeOffset(), r.opcodeCount());
        }
        return rules;
    }

    private static Udt[] getUdts(){
    	Udt[] udts = new Udt[0];
        return udts;
    }

        // opcodes
    private static Opcode[] getOpcodes(){
    	Opcode[] op = new Opcode[436];
    	addOpcodes00(op);
        return op;
    }

    private static void addOpcodes00(Opcode[] op){
        {int[] a = {1,2}; op[0] = getOpcodeAlt(a);}
        op[1] = getOpcodeRnm(1, 6); // attrPath
        {int[] a = {3,4}; op[2] = getOpcodeCat(a);}
        op[3] = getOpcodeRnm(2, 14); // valuePath
        op[4] = getOpcodeRep((char)0, (char)1, 5);
        op[5] = getOpcodeRnm(11, 95); // subAttr
        {int[] a = {7,11,12}; op[6] = getOpcodeCat(a);}
        op[7] = getOpcodeRep((char)0, (char)1, 8);
        {int[] a = {9,10}; op[8] = getOpcodeCat(a);}
        op[9] = getOpcodeRnm(34, 176); // URI
        {char[] a = {58}; op[10] = getOpcodeTls(a);}
        op[11] = getOpcodeRnm(9, 86); // ATTRNAME
        op[12] = getOpcodeRep((char)0, (char)1, 13);
        op[13] = getOpcodeRnm(11, 95); // subAttr
        {int[] a = {15,16,17,18}; op[14] = getOpcodeCat(a);}
        op[15] = getOpcodeRnm(1, 6); // attrPath
        {char[] a = {91}; op[16] = getOpcodeTls(a);}
        op[17] = getOpcodeRnm(3, 19); // valFilter
        {char[] a = {93}; op[18] = getOpcodeTls(a);}
        {int[] a = {20,21,29}; op[19] = getOpcodeAlt(a);}
        op[20] = getOpcodeRnm(4, 35); // attrExp
        {int[] a = {22,23,24,27,28}; op[21] = getOpcodeCat(a);}
        op[22] = getOpcodeRnm(5, 46); // filter
        op[23] = getOpcodeRnm(12, 98); // SP
        {int[] a = {25,26}; op[24] = getOpcodeAlt(a);}
        {char[] a = {97,110,100}; op[25] = getOpcodeTls(a);}
        {char[] a = {111,114}; op[26] = getOpcodeTls(a);}
        op[27] = getOpcodeRnm(12, 98); // SP
        op[28] = getOpcodeRnm(5, 46); // filter
        {int[] a = {30,32,33,34}; op[29] = getOpcodeCat(a);}
        op[30] = getOpcodeRep((char)0, (char)1, 31);
        {char[] a = {110,111,116}; op[31] = getOpcodeTls(a);}
        {char[] a = {40}; op[32] = getOpcodeTls(a);}
        op[33] = getOpcodeRnm(3, 19); // valFilter
        {char[] a = {41}; op[34] = getOpcodeTls(a);}
        {int[] a = {36,40}; op[35] = getOpcodeAlt(a);}
        {int[] a = {37,38,39}; op[36] = getOpcodeCat(a);}
        op[37] = getOpcodeRnm(1, 6); // attrPath
        op[38] = getOpcodeRnm(12, 98); // SP
        {char[] a = {112,114}; op[39] = getOpcodeTls(a);}
        {int[] a = {41,42,43,44,45}; op[40] = getOpcodeCat(a);}
        op[41] = getOpcodeRnm(1, 6); // attrPath
        op[42] = getOpcodeRnm(12, 98); // SP
        op[43] = getOpcodeRnm(8, 76); // compareOp
        op[44] = getOpcodeRnm(12, 98); // SP
        op[45] = getOpcodeRnm(7, 70); // compValue
        {int[] a = {47,50,53}; op[46] = getOpcodeAlt(a);}
        {int[] a = {48,49}; op[47] = getOpcodeCat(a);}
        op[48] = getOpcodeRnm(4, 35); // attrExp
        op[49] = getOpcodeRnm(6, 60); // filterDash
        {int[] a = {51,52}; op[50] = getOpcodeCat(a);}
        op[51] = getOpcodeRnm(2, 14); // valuePath
        op[52] = getOpcodeRnm(6, 60); // filterDash
        {int[] a = {54,56,57,58,59}; op[53] = getOpcodeCat(a);}
        op[54] = getOpcodeRep((char)0, (char)1, 55);
        {char[] a = {110,111,116}; op[55] = getOpcodeTls(a);}
        {char[] a = {40}; op[56] = getOpcodeTls(a);}
        op[57] = getOpcodeRnm(5, 46); // filter
        {char[] a = {41}; op[58] = getOpcodeTls(a);}
        op[59] = getOpcodeRnm(6, 60); // filterDash
        {int[] a = {61,69}; op[60] = getOpcodeAlt(a);}
        {int[] a = {62,63,66,67,68}; op[61] = getOpcodeCat(a);}
        op[62] = getOpcodeRnm(12, 98); // SP
        {int[] a = {64,65}; op[63] = getOpcodeAlt(a);}
        {char[] a = {97,110,100}; op[64] = getOpcodeTls(a);}
        {char[] a = {111,114}; op[65] = getOpcodeTls(a);}
        op[66] = getOpcodeRnm(12, 98); // SP
        op[67] = getOpcodeRnm(5, 46); // filter
        op[68] = getOpcodeRnm(6, 60); // filterDash
        {char[] a = {}; op[69] = getOpcodeTls(a);}
        {int[] a = {71,72,73,74,75}; op[70] = getOpcodeAlt(a);}
        op[71] = getOpcodeRnm(21, 139); // false
        op[72] = getOpcodeRnm(22, 140); // null
        op[73] = getOpcodeRnm(23, 141); // true
        op[74] = getOpcodeRnm(24, 142); // number
        op[75] = getOpcodeRnm(15, 103); // string
        {int[] a = {77,78,79,80,81,82,83,84,85}; op[76] = getOpcodeAlt(a);}
        {char[] a = {101,113}; op[77] = getOpcodeTls(a);}
        {char[] a = {110,101}; op[78] = getOpcodeTls(a);}
        {char[] a = {99,111}; op[79] = getOpcodeTls(a);}
        {char[] a = {115,119}; op[80] = getOpcodeTls(a);}
        {char[] a = {101,119}; op[81] = getOpcodeTls(a);}
        {char[] a = {103,116}; op[82] = getOpcodeTls(a);}
        {char[] a = {108,116}; op[83] = getOpcodeTls(a);}
        {char[] a = {103,101}; op[84] = getOpcodeTls(a);}
        {char[] a = {108,101}; op[85] = getOpcodeTls(a);}
        {int[] a = {87,88}; op[86] = getOpcodeCat(a);}
        op[87] = getOpcodeRnm(13, 99); // ALPHA
        op[88] = getOpcodeRep((char)0, Character.MAX_VALUE, 89);
        op[89] = getOpcodeRnm(10, 90); // nameChar
        {int[] a = {91,92,93,94}; op[90] = getOpcodeAlt(a);}
        {char[] a = {45}; op[91] = getOpcodeTls(a);}
        {char[] a = {95}; op[92] = getOpcodeTls(a);}
        op[93] = getOpcodeRnm(14, 102); // DIGIT
        op[94] = getOpcodeRnm(13, 99); // ALPHA
        {int[] a = {96,97}; op[95] = getOpcodeCat(a);}
        {char[] a = {46}; op[96] = getOpcodeTls(a);}
        op[97] = getOpcodeRnm(9, 86); // ATTRNAME
        {char[] a = {32}; op[98] = getOpcodeTbs(a);}
        {int[] a = {100,101}; op[99] = getOpcodeAlt(a);}
        op[100] = getOpcodeTrg((char)65, (char)90);
        op[101] = getOpcodeTrg((char)97, (char)122);
        op[102] = getOpcodeTrg((char)48, (char)57);
        {int[] a = {104,105,107}; op[103] = getOpcodeCat(a);}
        op[104] = getOpcodeRnm(18, 126); // quotation-mark
        op[105] = getOpcodeRep((char)0, Character.MAX_VALUE, 106);
        op[106] = getOpcodeRnm(16, 108); // char
        op[107] = getOpcodeRnm(18, 126); // quotation-mark
        {int[] a = {109,110}; op[108] = getOpcodeAlt(a);}
        op[109] = getOpcodeRnm(19, 127); // unescaped
        {int[] a = {111,112}; op[110] = getOpcodeCat(a);}
        op[111] = getOpcodeRnm(17, 125); // escape
        {int[] a = {113,114,115,116,117,118,119,120,121}; op[112] = getOpcodeAlt(a);}
        {char[] a = {34}; op[113] = getOpcodeTbs(a);}
        {char[] a = {92}; op[114] = getOpcodeTbs(a);}
        {char[] a = {47}; op[115] = getOpcodeTbs(a);}
        {char[] a = {98}; op[116] = getOpcodeTbs(a);}
        {char[] a = {102}; op[117] = getOpcodeTbs(a);}
        {char[] a = {110}; op[118] = getOpcodeTbs(a);}
        {char[] a = {114}; op[119] = getOpcodeTbs(a);}
        {char[] a = {116}; op[120] = getOpcodeTbs(a);}
        {int[] a = {122,123}; op[121] = getOpcodeCat(a);}
        {char[] a = {117}; op[122] = getOpcodeTbs(a);}
        op[123] = getOpcodeRep((char)4, (char)4, 124);
        op[124] = getOpcodeRnm(20, 131); // HEXDIG
        {char[] a = {92}; op[125] = getOpcodeTbs(a);}
        {char[] a = {34}; op[126] = getOpcodeTbs(a);}
        {int[] a = {128,129,130}; op[127] = getOpcodeAlt(a);}
        op[128] = getOpcodeTrg((char)32, (char)33);
        op[129] = getOpcodeTrg((char)35, (char)91);
        op[130] = getOpcodeTrg((char)93, Character.MAX_VALUE);
        {int[] a = {132,133,134,135,136,137,138}; op[131] = getOpcodeAlt(a);}
        op[132] = getOpcodeRnm(14, 102); // DIGIT
        {char[] a = {65}; op[133] = getOpcodeTls(a);}
        {char[] a = {66}; op[134] = getOpcodeTls(a);}
        {char[] a = {67}; op[135] = getOpcodeTls(a);}
        {char[] a = {68}; op[136] = getOpcodeTls(a);}
        {char[] a = {69}; op[137] = getOpcodeTls(a);}
        {char[] a = {70}; op[138] = getOpcodeTls(a);}
        {char[] a = {102,97,108,115,101}; op[139] = getOpcodeTbs(a);}
        {char[] a = {110,117,108,108}; op[140] = getOpcodeTbs(a);}
        {char[] a = {116,114,117,101}; op[141] = getOpcodeTbs(a);}
        {int[] a = {143,145,146,148}; op[142] = getOpcodeCat(a);}
        op[143] = getOpcodeRep((char)0, (char)1, 144);
        op[144] = getOpcodeRnm(31, 173); // minus
        op[145] = getOpcodeRnm(27, 162); // int
        op[146] = getOpcodeRep((char)0, (char)1, 147);
        op[147] = getOpcodeRnm(26, 158); // frac
        op[148] = getOpcodeRep((char)0, (char)1, 149);
        op[149] = getOpcodeRnm(25, 150); // exp
        {int[] a = {151,152,156}; op[150] = getOpcodeCat(a);}
        op[151] = getOpcodeRnm(30, 170); // e
        op[152] = getOpcodeRep((char)0, (char)1, 153);
        {int[] a = {154,155}; op[153] = getOpcodeAlt(a);}
        op[154] = getOpcodeRnm(31, 173); // minus
        op[155] = getOpcodeRnm(32, 174); // plus
        op[156] = getOpcodeRep((char)1, Character.MAX_VALUE, 157);
        op[157] = getOpcodeRnm(14, 102); // DIGIT
        {int[] a = {159,160}; op[158] = getOpcodeCat(a);}
        op[159] = getOpcodeRnm(28, 168); // decimal-point
        op[160] = getOpcodeRep((char)1, Character.MAX_VALUE, 161);
        op[161] = getOpcodeRnm(14, 102); // DIGIT
        {int[] a = {163,164}; op[162] = getOpcodeAlt(a);}
        op[163] = getOpcodeRnm(33, 175); // zero
        {int[] a = {165,166}; op[164] = getOpcodeCat(a);}
        op[165] = getOpcodeRnm(29, 169); // digit1-9
        op[166] = getOpcodeRep((char)0, Character.MAX_VALUE, 167);
        op[167] = getOpcodeRnm(14, 102); // DIGIT
        {char[] a = {46}; op[168] = getOpcodeTbs(a);}
        op[169] = getOpcodeTrg((char)49, (char)57);
        {int[] a = {171,172}; op[170] = getOpcodeAlt(a);}
        {char[] a = {101}; op[171] = getOpcodeTbs(a);}
        {char[] a = {69}; op[172] = getOpcodeTbs(a);}
        {char[] a = {45}; op[173] = getOpcodeTbs(a);}
        {char[] a = {43}; op[174] = getOpcodeTbs(a);}
        {char[] a = {48}; op[175] = getOpcodeTbs(a);}
        {int[] a = {177,178,179,180,184}; op[176] = getOpcodeCat(a);}
        op[177] = getOpcodeRnm(36, 196); // scheme
        {char[] a = {58}; op[178] = getOpcodeTls(a);}
        op[179] = getOpcodeRnm(35, 188); // hier-part
        op[180] = getOpcodeRep((char)0, (char)1, 181);
        {int[] a = {182,183}; op[181] = getOpcodeCat(a);}
        {char[] a = {63}; op[182] = getOpcodeTls(a);}
        op[183] = getOpcodeRnm(56, 403); // query
        op[184] = getOpcodeRep((char)0, (char)1, 185);
        {int[] a = {186,187}; op[185] = getOpcodeCat(a);}
        {char[] a = {35}; op[186] = getOpcodeTls(a);}
        op[187] = getOpcodeRnm(57, 408); // fragment
        {int[] a = {189,193,194,195}; op[188] = getOpcodeAlt(a);}
        {int[] a = {190,191,192}; op[189] = getOpcodeCat(a);}
        {char[] a = {47,47}; op[190] = getOpcodeTls(a);}
        op[191] = getOpcodeRnm(37, 205); // authority
        op[192] = getOpcodeRnm(49, 372); // path-abempty
        op[193] = getOpcodeRnm(50, 376); // path-absolute
        op[194] = getOpcodeRnm(51, 385); // path-rootless
        op[195] = getOpcodeRnm(52, 391); // path-empty
        {int[] a = {197,198}; op[196] = getOpcodeCat(a);}
        op[197] = getOpcodeRnm(13, 99); // ALPHA
        op[198] = getOpcodeRep((char)0, Character.MAX_VALUE, 199);
        {int[] a = {200,201,202,203,204}; op[199] = getOpcodeAlt(a);}
        op[200] = getOpcodeRnm(13, 99); // ALPHA
        op[201] = getOpcodeRnm(14, 102); // DIGIT
        {char[] a = {43}; op[202] = getOpcodeTls(a);}
        {char[] a = {45}; op[203] = getOpcodeTls(a);}
        {char[] a = {46}; op[204] = getOpcodeTls(a);}
        {int[] a = {206,210,211}; op[205] = getOpcodeCat(a);}
        op[206] = getOpcodeRep((char)0, (char)1, 207);
        {int[] a = {208,209}; op[207] = getOpcodeCat(a);}
        op[208] = getOpcodeRnm(38, 215); // userinfo
        {char[] a = {64}; op[209] = getOpcodeTls(a);}
        op[210] = getOpcodeRnm(39, 221); // host
        op[211] = getOpcodeRep((char)0, (char)1, 212);
        {int[] a = {213,214}; op[212] = getOpcodeCat(a);}
        {char[] a = {58}; op[213] = getOpcodeTls(a);}
        op[214] = getOpcodeRnm(40, 225); // port
        op[215] = getOpcodeRep((char)0, Character.MAX_VALUE, 216);
        {int[] a = {217,218,219,220}; op[216] = getOpcodeAlt(a);}
        op[217] = getOpcodeRnm(59, 417); // unreserved
        op[218] = getOpcodeRnm(58, 413); // pct-encoded
        op[219] = getOpcodeRnm(60, 424); // sub-delims
        {char[] a = {58}; op[220] = getOpcodeTls(a);}
        {int[] a = {222,223,224}; op[221] = getOpcodeAlt(a);}
        op[222] = getOpcodeRnm(41, 227); // IP-literal
        op[223] = getOpcodeRnm(46, 343); // IPv4address
        op[224] = getOpcodeRnm(48, 367); // reg-name
        op[225] = getOpcodeRep((char)0, Character.MAX_VALUE, 226);
        op[226] = getOpcodeRnm(14, 102); // DIGIT
        {int[] a = {228,229,232}; op[227] = getOpcodeCat(a);}
        {char[] a = {91}; op[228] = getOpcodeTls(a);}
        {int[] a = {230,231}; op[229] = getOpcodeAlt(a);}
        op[230] = getOpcodeRnm(43, 243); // IPv6address
        op[231] = getOpcodeRnm(42, 233); // IPvFuture
        {char[] a = {93}; op[232] = getOpcodeTls(a);}
        {int[] a = {234,235,237,238}; op[233] = getOpcodeCat(a);}
        {char[] a = {118}; op[234] = getOpcodeTls(a);}
        op[235] = getOpcodeRep((char)1, Character.MAX_VALUE, 236);
        op[236] = getOpcodeRnm(20, 131); // HEXDIG
        {char[] a = {46}; op[237] = getOpcodeTls(a);}
        op[238] = getOpcodeRep((char)1, Character.MAX_VALUE, 239);
        {int[] a = {240,241,242}; op[239] = getOpcodeAlt(a);}
        op[240] = getOpcodeRnm(59, 417); // unreserved
        op[241] = getOpcodeRnm(60, 424); // sub-delims
        {char[] a = {58}; op[242] = getOpcodeTls(a);}
        {int[] a = {244,250,257,266,280,294,306,316,326}; op[243] = getOpcodeAlt(a);}
        {int[] a = {245,249}; op[244] = getOpcodeCat(a);}
        op[245] = getOpcodeRep((char)6, (char)6, 246);
        {int[] a = {247,248}; op[246] = getOpcodeCat(a);}
        op[247] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58}; op[248] = getOpcodeTls(a);}
        op[249] = getOpcodeRnm(45, 337); // ls32
        {int[] a = {251,252,256}; op[250] = getOpcodeCat(a);}
        {char[] a = {58,58}; op[251] = getOpcodeTls(a);}
        op[252] = getOpcodeRep((char)5, (char)5, 253);
        {int[] a = {254,255}; op[253] = getOpcodeCat(a);}
        op[254] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58}; op[255] = getOpcodeTls(a);}
        op[256] = getOpcodeRnm(45, 337); // ls32
        {int[] a = {258,260,261,265}; op[257] = getOpcodeCat(a);}
        op[258] = getOpcodeRep((char)0, (char)1, 259);
        op[259] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58,58}; op[260] = getOpcodeTls(a);}
        op[261] = getOpcodeRep((char)4, (char)4, 262);
        {int[] a = {263,264}; op[262] = getOpcodeCat(a);}
        op[263] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58}; op[264] = getOpcodeTls(a);}
        op[265] = getOpcodeRnm(45, 337); // ls32
        {int[] a = {267,274,275,279}; op[266] = getOpcodeCat(a);}
        op[267] = getOpcodeRep((char)0, (char)1, 268);
        {int[] a = {269,273}; op[268] = getOpcodeCat(a);}
        op[269] = getOpcodeRep((char)0, (char)1, 270);
        {int[] a = {271,272}; op[270] = getOpcodeCat(a);}
        op[271] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58}; op[272] = getOpcodeTls(a);}
        op[273] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58,58}; op[274] = getOpcodeTls(a);}
        op[275] = getOpcodeRep((char)3, (char)3, 276);
        {int[] a = {277,278}; op[276] = getOpcodeCat(a);}
        op[277] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58}; op[278] = getOpcodeTls(a);}
        op[279] = getOpcodeRnm(45, 337); // ls32
        {int[] a = {281,288,289,293}; op[280] = getOpcodeCat(a);}
        op[281] = getOpcodeRep((char)0, (char)1, 282);
        {int[] a = {283,287}; op[282] = getOpcodeCat(a);}
        op[283] = getOpcodeRep((char)0, (char)2, 284);
        {int[] a = {285,286}; op[284] = getOpcodeCat(a);}
        op[285] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58}; op[286] = getOpcodeTls(a);}
        op[287] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58,58}; op[288] = getOpcodeTls(a);}
        op[289] = getOpcodeRep((char)2, (char)2, 290);
        {int[] a = {291,292}; op[290] = getOpcodeCat(a);}
        op[291] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58}; op[292] = getOpcodeTls(a);}
        op[293] = getOpcodeRnm(45, 337); // ls32
        {int[] a = {295,302,303,304,305}; op[294] = getOpcodeCat(a);}
        op[295] = getOpcodeRep((char)0, (char)1, 296);
        {int[] a = {297,301}; op[296] = getOpcodeCat(a);}
        op[297] = getOpcodeRep((char)0, (char)3, 298);
        {int[] a = {299,300}; op[298] = getOpcodeCat(a);}
        op[299] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58}; op[300] = getOpcodeTls(a);}
        op[301] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58,58}; op[302] = getOpcodeTls(a);}
        op[303] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58}; op[304] = getOpcodeTls(a);}
        op[305] = getOpcodeRnm(45, 337); // ls32
        {int[] a = {307,314,315}; op[306] = getOpcodeCat(a);}
        op[307] = getOpcodeRep((char)0, (char)1, 308);
        {int[] a = {309,313}; op[308] = getOpcodeCat(a);}
        op[309] = getOpcodeRep((char)0, (char)4, 310);
        {int[] a = {311,312}; op[310] = getOpcodeCat(a);}
        op[311] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58}; op[312] = getOpcodeTls(a);}
        op[313] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58,58}; op[314] = getOpcodeTls(a);}
        op[315] = getOpcodeRnm(45, 337); // ls32
        {int[] a = {317,324,325}; op[316] = getOpcodeCat(a);}
        op[317] = getOpcodeRep((char)0, (char)1, 318);
        {int[] a = {319,323}; op[318] = getOpcodeCat(a);}
        op[319] = getOpcodeRep((char)0, (char)5, 320);
        {int[] a = {321,322}; op[320] = getOpcodeCat(a);}
        op[321] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58}; op[322] = getOpcodeTls(a);}
        op[323] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58,58}; op[324] = getOpcodeTls(a);}
        op[325] = getOpcodeRnm(44, 335); // h16
        {int[] a = {327,334}; op[326] = getOpcodeCat(a);}
        op[327] = getOpcodeRep((char)0, (char)1, 328);
        {int[] a = {329,333}; op[328] = getOpcodeCat(a);}
        op[329] = getOpcodeRep((char)0, (char)6, 330);
        {int[] a = {331,332}; op[330] = getOpcodeCat(a);}
        op[331] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58}; op[332] = getOpcodeTls(a);}
        op[333] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58,58}; op[334] = getOpcodeTls(a);}
        op[335] = getOpcodeRep((char)1, (char)4, 336);
        op[336] = getOpcodeRnm(20, 131); // HEXDIG
        {int[] a = {338,342}; op[337] = getOpcodeAlt(a);}
        {int[] a = {339,340,341}; op[338] = getOpcodeCat(a);}
        op[339] = getOpcodeRnm(44, 335); // h16
        {char[] a = {58}; op[340] = getOpcodeTls(a);}
        op[341] = getOpcodeRnm(44, 335); // h16
        op[342] = getOpcodeRnm(46, 343); // IPv4address
        {int[] a = {344,345,346,347,348,349,350}; op[343] = getOpcodeCat(a);}
        op[344] = getOpcodeRnm(47, 351); // dec-octet
        {char[] a = {46}; op[345] = getOpcodeTls(a);}
        op[346] = getOpcodeRnm(47, 351); // dec-octet
        {char[] a = {46}; op[347] = getOpcodeTls(a);}
        op[348] = getOpcodeRnm(47, 351); // dec-octet
        {char[] a = {46}; op[349] = getOpcodeTls(a);}
        op[350] = getOpcodeRnm(47, 351); // dec-octet
        {int[] a = {352,353,356,360,364}; op[351] = getOpcodeAlt(a);}
        op[352] = getOpcodeRnm(14, 102); // DIGIT
        {int[] a = {354,355}; op[353] = getOpcodeCat(a);}
        op[354] = getOpcodeTrg((char)49, (char)57);
        op[355] = getOpcodeRnm(14, 102); // DIGIT
        {int[] a = {357,358}; op[356] = getOpcodeCat(a);}
        {char[] a = {49}; op[357] = getOpcodeTls(a);}
        op[358] = getOpcodeRep((char)2, (char)2, 359);
        op[359] = getOpcodeRnm(14, 102); // DIGIT
        {int[] a = {361,362,363}; op[360] = getOpcodeCat(a);}
        {char[] a = {50}; op[361] = getOpcodeTls(a);}
        op[362] = getOpcodeTrg((char)48, (char)52);
        op[363] = getOpcodeRnm(14, 102); // DIGIT
        {int[] a = {365,366}; op[364] = getOpcodeCat(a);}
        {char[] a = {50,53}; op[365] = getOpcodeTls(a);}
        op[366] = getOpcodeTrg((char)48, (char)53);
        op[367] = getOpcodeRep((char)0, Character.MAX_VALUE, 368);
        {int[] a = {369,370,371}; op[368] = getOpcodeAlt(a);}
        op[369] = getOpcodeRnm(59, 417); // unreserved
        op[370] = getOpcodeRnm(58, 413); // pct-encoded
        op[371] = getOpcodeRnm(60, 424); // sub-delims
        op[372] = getOpcodeRep((char)0, Character.MAX_VALUE, 373);
        {int[] a = {374,375}; op[373] = getOpcodeCat(a);}
        {char[] a = {47}; op[374] = getOpcodeTls(a);}
        op[375] = getOpcodeRnm(53, 393); // segment
        {int[] a = {377,378}; op[376] = getOpcodeCat(a);}
        {char[] a = {47}; op[377] = getOpcodeTls(a);}
        op[378] = getOpcodeRep((char)0, (char)1, 379);
        {int[] a = {380,381}; op[379] = getOpcodeCat(a);}
        op[380] = getOpcodeRnm(54, 395); // segment-nz
        op[381] = getOpcodeRep((char)0, Character.MAX_VALUE, 382);
        {int[] a = {383,384}; op[382] = getOpcodeCat(a);}
        {char[] a = {47}; op[383] = getOpcodeTls(a);}
        op[384] = getOpcodeRnm(53, 393); // segment
        {int[] a = {386,387}; op[385] = getOpcodeCat(a);}
        op[386] = getOpcodeRnm(54, 395); // segment-nz
        op[387] = getOpcodeRep((char)0, Character.MAX_VALUE, 388);
        {int[] a = {389,390}; op[388] = getOpcodeCat(a);}
        {char[] a = {47}; op[389] = getOpcodeTls(a);}
        op[390] = getOpcodeRnm(53, 393); // segment
        op[391] = getOpcodeRep((char)0, (char)0, 392);
        op[392] = getOpcodeRnm(55, 397); // pchar
        op[393] = getOpcodeRep((char)0, Character.MAX_VALUE, 394);
        op[394] = getOpcodeRnm(55, 397); // pchar
        op[395] = getOpcodeRep((char)1, Character.MAX_VALUE, 396);
        op[396] = getOpcodeRnm(55, 397); // pchar
        {int[] a = {398,399,400,401,402}; op[397] = getOpcodeAlt(a);}
        op[398] = getOpcodeRnm(59, 417); // unreserved
        op[399] = getOpcodeRnm(58, 413); // pct-encoded
        op[400] = getOpcodeRnm(60, 424); // sub-delims
        {char[] a = {58}; op[401] = getOpcodeTls(a);}
        {char[] a = {64}; op[402] = getOpcodeTls(a);}
        op[403] = getOpcodeRep((char)0, Character.MAX_VALUE, 404);
        {int[] a = {405,406,407}; op[404] = getOpcodeAlt(a);}
        op[405] = getOpcodeRnm(55, 397); // pchar
        {char[] a = {47}; op[406] = getOpcodeTls(a);}
        {char[] a = {63}; op[407] = getOpcodeTls(a);}
        op[408] = getOpcodeRep((char)0, Character.MAX_VALUE, 409);
        {int[] a = {410,411,412}; op[409] = getOpcodeAlt(a);}
        op[410] = getOpcodeRnm(55, 397); // pchar
        {char[] a = {47}; op[411] = getOpcodeTls(a);}
        {char[] a = {63}; op[412] = getOpcodeTls(a);}
        {int[] a = {414,415,416}; op[413] = getOpcodeCat(a);}
        {char[] a = {37}; op[414] = getOpcodeTls(a);}
        op[415] = getOpcodeRnm(20, 131); // HEXDIG
        op[416] = getOpcodeRnm(20, 131); // HEXDIG
        {int[] a = {418,419,420,421,422,423}; op[417] = getOpcodeAlt(a);}
        op[418] = getOpcodeRnm(13, 99); // ALPHA
        op[419] = getOpcodeRnm(14, 102); // DIGIT
        {char[] a = {45}; op[420] = getOpcodeTls(a);}
        {char[] a = {46}; op[421] = getOpcodeTls(a);}
        {char[] a = {95}; op[422] = getOpcodeTls(a);}
        {char[] a = {126}; op[423] = getOpcodeTls(a);}
        {int[] a = {425,426,427,428,429,430,431,432,433,434,435}; op[424] = getOpcodeAlt(a);}
        {char[] a = {33}; op[425] = getOpcodeTls(a);}
        {char[] a = {36}; op[426] = getOpcodeTls(a);}
        {char[] a = {38}; op[427] = getOpcodeTls(a);}
        {char[] a = {39}; op[428] = getOpcodeTls(a);}
        {char[] a = {40}; op[429] = getOpcodeTls(a);}
        {char[] a = {41}; op[430] = getOpcodeTls(a);}
        {char[] a = {42}; op[431] = getOpcodeTls(a);}
        {char[] a = {43}; op[432] = getOpcodeTls(a);}
        {char[] a = {44}; op[433] = getOpcodeTls(a);}
        {char[] a = {59}; op[434] = getOpcodeTls(a);}
        {char[] a = {61}; op[435] = getOpcodeTls(a);}
    }

    /** Displays the original SABNF grammar on the output device.
     * @param out the output device to display on.*/
    public static void display(PrintStream out){
        out.println(";");
        out.println("; examples.scim.Filter");
        out.println(";");
        out.println("PATH = attrPath / valuePath [subAttr];");
        out.println("");
        out.println("attrPath  = [URI \":\"] ATTRNAME *1subAttr;");
        out.println("");
        out.println("valuePath = attrPath \"[\" valFilter \"]\";");
        out.println("");
        out.println("valFilter = attrExp / ( filter SP (\"and\" / \"or\") SP filter ) / *1\"not\" \"(\" valFilter \")\";");
        out.println("");
        out.println("attrExp = (attrPath SP \"pr\") / (attrPath SP compareOp SP compValue);");
        out.println("");
        out.println("filter = ( attrExp filterDash ) / (valuePath filterDash) / ( *1\"not\" \"(\" filter \")\" filterDash );");
        out.println("");
        out.println("filterDash = SP (\"and\" / \"or\") SP filter filterDash / \"\";");
        out.println("");
        out.println("compValue = false / null / true / number / string;");
        out.println("");
        out.println("compareOp = \"eq\" / \"ne\" / \"co\" / \"sw\" / \"ew\" / \"gt\" / \"lt\" / \"ge\" / \"le\";");
        out.println("");
        out.println("ATTRNAME  = ALPHA *(nameChar);");
        out.println("");
        out.println("nameChar  = \"-\" / \"_\" / DIGIT / ALPHA;");
        out.println("");
        out.println("subAttr   = \".\" ATTRNAME;");
        out.println("");
        out.println("SP             =  %x20;");
        out.println("");
        out.println("ALPHA          =  %x41-5A / %x61-7A   ;");
        out.println("");
        out.println("DIGIT          =  %x30-39;");
        out.println("");
        out.println("string = quotation-mark *char quotation-mark;");
        out.println("");
        out.println("char = unescaped / escape ( %x22 / %x5C / %x2F / %x62 / %x66 / %x6E / %x72 / %x74 / %x75 4HEXDIG );");
        out.println("");
        out.println("escape = %x5C;");
        out.println("");
        out.println("quotation-mark = %x22;");
        out.println("");
        out.println("unescaped = %x20-21 / %x23-5B / %x5D-10FFFF;");
        out.println("");
        out.println("HEXDIG         =  DIGIT / \"A\" / \"B\" / \"C\" / \"D\" / \"E\" / \"F\";");
        out.println("");
        out.println("false = %x66.61.6c.73.65;");
        out.println("");
        out.println("null  = %x6e.75.6c.6c;");
        out.println("");
        out.println("true  = %x74.72.75.65;");
        out.println("");
        out.println("number = [ minus ] int [ frac ] [ exp ];");
        out.println("");
        out.println("exp = e [ minus / plus ] 1*DIGIT;");
        out.println("");
        out.println("frac = decimal-point 1*DIGIT;");
        out.println("");
        out.println("int = zero / ( digit1-9 *DIGIT );");
        out.println("");
        out.println("decimal-point = %x2E;");
        out.println("");
        out.println("digit1-9 = %x31-39;");
        out.println("");
        out.println("e = %x65 / %x45;");
        out.println("");
        out.println("minus = %x2D;");
        out.println("");
        out.println("plus = %x2B;");
        out.println("");
        out.println("zero = %x30;");
        out.println("");
        out.println("URI = scheme \":\" hier-part [ \"?\" query ] [ \"#\" fragment ];");
        out.println("");
        out.println("hier-part = \"//\" authority path-abempty / path-absolute / path-rootless / path-empty;");
        out.println("");
        out.println("scheme = ALPHA *( ALPHA / DIGIT / \"+\" / \"-\" / \".\" );");
        out.println("");
        out.println("authority     = [ userinfo \"@\" ] host [ \":\" port ];");
        out.println("userinfo      = *( unreserved / pct-encoded / sub-delims / \":\" );");
        out.println("host          = IP-literal / IPv4address / reg-name;");
        out.println("port          = *DIGIT;");
        out.println("");
        out.println("IP-literal    = \"[\" ( IPv6address / IPvFuture  ) \"]\";");
        out.println("");
        out.println("IPvFuture     = \"v\" 1*HEXDIG \".\" 1*( unreserved / sub-delims / \":\" );");
        out.println("");
        out.println("IPv6address   =                            6( h16 \":\" ) ls32");
        out.println("                 /                       \"::\" 5( h16 \":\" ) ls32");
        out.println("                 / [               h16 ] \"::\" 4( h16 \":\" ) ls32");
        out.println("                 / [ *1( h16 \":\" ) h16 ] \"::\" 3( h16 \":\" ) ls32");
        out.println("                 / [ *2( h16 \":\" ) h16 ] \"::\" 2( h16 \":\" ) ls32");
        out.println("                 / [ *3( h16 \":\" ) h16 ] \"::\"    h16 \":\"   ls32");
        out.println("                 / [ *4( h16 \":\" ) h16 ] \"::\"              ls32");
        out.println("                 / [ *5( h16 \":\" ) h16 ] \"::\"              h16");
        out.println("                 / [ *6( h16 \":\" ) h16 ] \"::\";");
        out.println("");
        out.println("");
        out.println("h16           = 1*4HEXDIG;");
        out.println("ls32          = ( h16 \":\" h16 ) / IPv4address;");
        out.println("IPv4address   = dec-octet \".\" dec-octet \".\" dec-octet \".\" dec-octet;");
        out.println("");
        out.println("dec-octet     = DIGIT / %x31-39 DIGIT / \"1\" 2DIGIT / \"2\" %x30-34 DIGIT / \"25\" %x30-35;");
        out.println("");
        out.println("reg-name      = *( unreserved / pct-encoded / sub-delims );");
        out.println("");
        out.println("path-abempty  = *( \"/\" segment );");
        out.println("path-absolute = \"/\" [ segment-nz *( \"/\" segment ) ];");
        out.println("path-rootless = segment-nz *( \"/\" segment );");
        out.println("path-empty    = *0pchar;");
        out.println("");
        out.println("segment       = *pchar;");
        out.println("segment-nz    = 1*pchar;");
        out.println("");
        out.println("pchar         = unreserved / pct-encoded / sub-delims / \":\" / \"@\";");
        out.println("");
        out.println("query         = *( pchar / \"/\" / \"?\" );");
        out.println("");
        out.println("fragment      = *( pchar / \"/\" / \"?\" );");
        out.println("");
        out.println("pct-encoded   = \"%\" HEXDIG HEXDIG;");
        out.println("");
        out.println("unreserved    = ALPHA / DIGIT / \"-\" / \".\" / \"_\" / \"~\";");
        out.println("");
        out.println("sub-delims    = \"!\" / \"$\" / \"&\" / \"'\" / \"(\" / \")\" / \"*\" / \"+\" / \",\" / \";\" / \"=\";");
    }
}
