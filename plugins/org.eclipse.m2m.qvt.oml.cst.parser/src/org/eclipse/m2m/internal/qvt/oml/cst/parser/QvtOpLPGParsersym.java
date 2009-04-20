/**
* <copyright>
*
* Copyright (c) 2005, 2008 IBM Corporation and others.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   IBM - Initial API and implementation
*   E.D.Willink - Elimination of some shift-reduce conflicts
*   E.D.Willink - Remove unnecessary warning suppression
*   E.D.Willink - 225493 Need ability to set CSTNode offsets
*
* </copyright>
*
* $Id: QvtOpLPGParsersym.java,v 1.70 2009/04/20 16:57:34 aigdalov Exp $
*/
/**
* <copyright>
*
* Copyright (c) 2006, 2007 Borland Inc.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   Borland - Initial API and implementation
*
* </copyright>
*
* $Id: QvtOpLPGParsersym.java,v 1.70 2009/04/20 16:57:34 aigdalov Exp $
*/
/**
* <copyright>
*
* Copyright (c) 2006, 2007 Borland Inc.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   Borland - Initial API and implementation
*
* </copyright>
*
* $Id: QvtOpLPGParsersym.java,v 1.70 2009/04/20 16:57:34 aigdalov Exp $
*/
/**
* <copyright>
*
* Copyright (c) 2006, 2007 Borland Inc.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   Borland - Initial API and implementation
*
* </copyright>
*
* $Id: QvtOpLPGParsersym.java,v 1.70 2009/04/20 16:57:34 aigdalov Exp $
*/

package org.eclipse.m2m.internal.qvt.oml.cst.parser;

public interface QvtOpLPGParsersym {
    public final static int
      TK_NUMERIC_OPERATION = 71,
      TK_STRING_LITERAL = 21,
      TK_INTEGER_LITERAL = 55,
      TK_REAL_LITERAL = 56,
      TK_PLUS = 53,
      TK_MINUS = 54,
      TK_MULTIPLY = 22,
      TK_DIVIDE = 45,
      TK_GREATER = 25,
      TK_LESS = 26,
      TK_EQUAL = 5,
      TK_GREATER_EQUAL = 27,
      TK_LESS_EQUAL = 28,
      TK_NOT_EQUAL = 29,
      TK_LPAREN = 1,
      TK_RPAREN = 3,
      TK_LBRACE = 94,
      TK_RBRACE = 96,
      TK_LBRACKET = 100,
      TK_RBRACKET = 109,
      TK_ARROW = 124,
      TK_BAR = 99,
      TK_COMMA = 95,
      TK_COLON = 97,
      TK_COLONCOLON = 98,
      TK_SEMICOLON = 93,
      TK_DOT = 102,
      TK_DOTDOT = 125,
      TK_ATPRE = 110,
      TK_CARET = 126,
      TK_CARETCARET = 127,
      TK_QUESTIONMARK = 120,
      TK_ADD_ASSIGN = 136,
      TK_RESET_ASSIGN = 103,
      TK_AT_SIGN = 147,
      TK_EXCLAMATION_MARK = 121,
      TK_NOT_EQUAL_EXEQ = 111,
      TK_INTEGER_RANGE_START = 128,
      TK_class = 148,
      TK_composes = 149,
      TK_constructor = 112,
      TK_datatype = 174,
      TK_default = 175,
      TK_derived = 150,
      TK_do = 176,
      TK_elif = 177,
      TK_enum = 178,
      TK_except = 179,
      TK_exception = 180,
      TK_from = 181,
      TK_literal = 182,
      TK_ordered = 151,
      TK_primitive = 183,
      TK_raise = 184,
      TK_readonly = 152,
      TK_references = 153,
      TK_tag = 113,
      TK_try = 185,
      TK_typedef = 186,
      TK_unlimited = 187,
      TK_invalid = 188,
      TK_COLONCOLONEQUAL = 137,
      TK_STEREOTYPE_QUALIFIER_OPEN = 138,
      TK_STEREOTYPE_QUALIFIER_CLOSE = 154,
      TK_MULTIPLICITY_RANGE = 155,
      TK_TILDE_SIGN = 156,
      TK_self = 46,
      TK_inv = 189,
      TK_pre = 190,
      TK_post = 191,
      TK_context = 192,
      TK_package = 193,
      TK_endpackage = 194,
      TK_def = 195,
      TK_if = 72,
      TK_then = 139,
      TK_else = 129,
      TK_endif = 130,
      TK_and = 48,
      TK_or = 49,
      TK_xor = 50,
      TK_not = 57,
      TK_implies = 140,
      TK_let = 80,
      TK_in = 104,
      TK_true = 58,
      TK_false = 59,
      TK_body = 30,
      TK_derive = 31,
      TK_init = 157,
      TK_null = 51,
      TK_attr = 196,
      TK_oper = 197,
      TK_Set = 6,
      TK_Bag = 7,
      TK_Sequence = 8,
      TK_Collection = 9,
      TK_OrderedSet = 10,
      TK_iterate = 32,
      TK_forAll = 33,
      TK_exists = 34,
      TK_isUnique = 35,
      TK_any = 36,
      TK_one = 37,
      TK_collect = 38,
      TK_select = 39,
      TK_reject = 40,
      TK_collectNested = 41,
      TK_sortedBy = 42,
      TK_closure = 43,
      TK_oclIsKindOf = 60,
      TK_oclIsTypeOf = 61,
      TK_oclAsType = 62,
      TK_oclIsNew = 63,
      TK_oclIsUndefined = 64,
      TK_oclIsInvalid = 65,
      TK_oclIsInState = 66,
      TK_allInstances = 44,
      TK_String = 11,
      TK_Integer = 12,
      TK_UnlimitedNatural = 13,
      TK_Real = 14,
      TK_Boolean = 15,
      TK_Tuple = 20,
      TK_OclAny = 16,
      TK_OclVoid = 17,
      TK_Invalid = 18,
      TK_OclMessage = 19,
      TK_OclInvalid = 73,
      TK_end = 107,
      TK_while = 74,
      TK_out = 122,
      TK_object = 75,
      TK_transformation = 131,
      TK_import = 158,
      TK_library = 132,
      TK_metamodel = 198,
      TK_mapping = 114,
      TK_query = 115,
      TK_helper = 116,
      TK_inout = 123,
      TK_when = 133,
      TK_var = 82,
      TK_configuration = 134,
      TK_intermediate = 135,
      TK_property = 117,
      TK_opposites = 159,
      TK_population = 141,
      TK_map = 67,
      TK_new = 76,
      TK_xmap = 68,
      TK_late = 69,
      TK_log = 81,
      TK_assert = 83,
      TK_with = 160,
      TK_resolve = 85,
      TK_resolveone = 86,
      TK_resolveIn = 87,
      TK_resolveoneIn = 88,
      TK_invresolve = 89,
      TK_invresolveone = 90,
      TK_invresolveIn = 91,
      TK_invresolveoneIn = 92,
      TK_modeltype = 161,
      TK_uses = 162,
      TK_where = 163,
      TK_refines = 164,
      TK_access = 105,
      TK_extends = 101,
      TK_blackbox = 118,
      TK_abstract = 119,
      TK_static = 108,
      TK_result = 47,
      TK_main = 106,
      TK_this = 52,
      TK_switch = 70,
      TK_case = 142,
      TK_xselect = 165,
      TK_xcollect = 166,
      TK_selectOne = 167,
      TK_collectOne = 168,
      TK_collectselect = 169,
      TK_collectselectOne = 170,
      TK_return = 84,
      TK_rename = 171,
      TK_disjuncts = 143,
      TK_merges = 144,
      TK_inherits = 145,
      TK_forEach = 172,
      TK_forOne = 173,
      TK_compute = 77,
      TK_Dict = 23,
      TK_List = 24,
      TK_break = 78,
      TK_continue = 79,
      TK_EOF_TOKEN = 146,
      TK_IDENTIFIER = 2,
      TK_ERROR_TOKEN = 4;

      public final static String orderedTerminalSymbols[] = {
                 "",
                 "LPAREN",
                 "IDENTIFIER",
                 "RPAREN",
                 "ERROR_TOKEN",
                 "EQUAL",
                 "Set",
                 "Bag",
                 "Sequence",
                 "Collection",
                 "OrderedSet",
                 "String",
                 "Integer",
                 "UnlimitedNatural",
                 "Real",
                 "Boolean",
                 "OclAny",
                 "OclVoid",
                 "Invalid",
                 "OclMessage",
                 "Tuple",
                 "STRING_LITERAL",
                 "MULTIPLY",
                 "Dict",
                 "List",
                 "GREATER",
                 "LESS",
                 "GREATER_EQUAL",
                 "LESS_EQUAL",
                 "NOT_EQUAL",
                 "body",
                 "derive",
                 "iterate",
                 "forAll",
                 "exists",
                 "isUnique",
                 "any",
                 "one",
                 "collect",
                 "select",
                 "reject",
                 "collectNested",
                 "sortedBy",
                 "closure",
                 "allInstances",
                 "DIVIDE",
                 "self",
                 "result",
                 "and",
                 "or",
                 "xor",
                 "null",
                 "this",
                 "PLUS",
                 "MINUS",
                 "INTEGER_LITERAL",
                 "REAL_LITERAL",
                 "not",
                 "true",
                 "false",
                 "oclIsKindOf",
                 "oclIsTypeOf",
                 "oclAsType",
                 "oclIsNew",
                 "oclIsUndefined",
                 "oclIsInvalid",
                 "oclIsInState",
                 "map",
                 "xmap",
                 "late",
                 "switch",
                 "NUMERIC_OPERATION",
                 "if",
                 "OclInvalid",
                 "while",
                 "object",
                 "new",
                 "compute",
                 "break",
                 "continue",
                 "let",
                 "log",
                 "var",
                 "assert",
                 "return",
                 "resolve",
                 "resolveone",
                 "resolveIn",
                 "resolveoneIn",
                 "invresolve",
                 "invresolveone",
                 "invresolveIn",
                 "invresolveoneIn",
                 "SEMICOLON",
                 "LBRACE",
                 "COMMA",
                 "RBRACE",
                 "COLON",
                 "COLONCOLON",
                 "BAR",
                 "LBRACKET",
                 "extends",
                 "DOT",
                 "RESET_ASSIGN",
                 "in",
                 "access",
                 "main",
                 "end",
                 "static",
                 "RBRACKET",
                 "ATPRE",
                 "NOT_EQUAL_EXEQ",
                 "constructor",
                 "tag",
                 "mapping",
                 "query",
                 "helper",
                 "property",
                 "blackbox",
                 "abstract",
                 "QUESTIONMARK",
                 "EXCLAMATION_MARK",
                 "out",
                 "inout",
                 "ARROW",
                 "DOTDOT",
                 "CARET",
                 "CARETCARET",
                 "INTEGER_RANGE_START",
                 "else",
                 "endif",
                 "transformation",
                 "library",
                 "when",
                 "configuration",
                 "intermediate",
                 "ADD_ASSIGN",
                 "COLONCOLONEQUAL",
                 "STEREOTYPE_QUALIFIER_OPEN",
                 "then",
                 "implies",
                 "population",
                 "case",
                 "disjuncts",
                 "merges",
                 "inherits",
                 "EOF_TOKEN",
                 "AT_SIGN",
                 "class",
                 "composes",
                 "derived",
                 "ordered",
                 "readonly",
                 "references",
                 "STEREOTYPE_QUALIFIER_CLOSE",
                 "MULTIPLICITY_RANGE",
                 "TILDE_SIGN",
                 "init",
                 "import",
                 "opposites",
                 "with",
                 "modeltype",
                 "uses",
                 "where",
                 "refines",
                 "xselect",
                 "xcollect",
                 "selectOne",
                 "collectOne",
                 "collectselect",
                 "collectselectOne",
                 "rename",
                 "forEach",
                 "forOne",
                 "datatype",
                 "default",
                 "do",
                 "elif",
                 "enum",
                 "except",
                 "exception",
                 "from",
                 "literal",
                 "primitive",
                 "raise",
                 "try",
                 "typedef",
                 "unlimited",
                 "invalid",
                 "inv",
                 "pre",
                 "post",
                 "context",
                 "package",
                 "endpackage",
                 "def",
                 "attr",
                 "oper",
                 "metamodel"
             };

    public final static boolean isValidForParser = true;
}
