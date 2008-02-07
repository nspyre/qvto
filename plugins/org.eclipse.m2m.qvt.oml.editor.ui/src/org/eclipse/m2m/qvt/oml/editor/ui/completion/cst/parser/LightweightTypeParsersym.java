/**
* <copyright>
*
* Copyright (c) 2007 Borland Software Corporation
* 
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     Borland Software Corporation - initial API and implementation
*
* </copyright>
*
* $Id: LightweightTypeParsersym.java,v 1.11 2008/02/07 15:54:13 aigdalov Exp $
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
* $Id: LightweightTypeParsersym.java,v 1.11 2008/02/07 15:54:13 aigdalov Exp $
*/

package org.eclipse.m2m.qvt.oml.editor.ui.completion.cst.parser;

public interface LightweightTypeParsersym {
    public final static int
      TK_NUMERIC_OPERATION = 64,
      TK_STRING_LITERAL = 65,
      TK_INTEGER_LITERAL = 66,
      TK_REAL_LITERAL = 67,
      TK_PLUS = 33,
      TK_MINUS = 34,
      TK_MULTIPLY = 25,
      TK_DIVIDE = 26,
      TK_GREATER = 15,
      TK_LESS = 16,
      TK_EQUAL = 5,
      TK_GREATER_EQUAL = 17,
      TK_LESS_EQUAL = 18,
      TK_NOT_EQUAL = 19,
      TK_LPAREN = 1,
      TK_RPAREN = 3,
      TK_LBRACE = 85,
      TK_RBRACE = 86,
      TK_LBRACKET = 91,
      TK_RBRACKET = 94,
      TK_ARROW = 106,
      TK_BAR = 88,
      TK_COMMA = 84,
      TK_COLON = 90,
      TK_COLONCOLON = 89,
      TK_SEMICOLON = 87,
      TK_DOT = 107,
      TK_DOTDOT = 108,
      TK_ATPRE = 95,
      TK_CARET = 109,
      TK_CARETCARET = 110,
      TK_QUESTIONMARK = 96,
      TK_QUOTE_STRING_LITERAL = 124,
      TK_ADD_ASSIGN = 99,
      TK_RESET_ASSIGN = 92,
      TK_AT_SIGN = 113,
      TK_EXCLAMATION_MARK = 97,
      TK_NOT_EQUAL_EXEQ = 93,
      TK_self = 27,
      TK_inv = 125,
      TK_pre = 126,
      TK_post = 127,
      TK_endpackage = 128,
      TK_def = 129,
      TK_if = 68,
      TK_then = 111,
      TK_else = 100,
      TK_endif = 101,
      TK_and = 28,
      TK_or = 29,
      TK_xor = 30,
      TK_not = 53,
      TK_implies = 112,
      TK_let = 75,
      TK_in = 102,
      TK_true = 69,
      TK_false = 70,
      TK_body = 36,
      TK_derive = 37,
      TK_init = 38,
      TK_null = 39,
      TK_attr = 130,
      TK_oper = 131,
      TK_Set = 20,
      TK_Bag = 21,
      TK_Sequence = 22,
      TK_Collection = 23,
      TK_OrderedSet = 24,
      TK_iterate = 40,
      TK_forAll = 41,
      TK_exists = 42,
      TK_isUnique = 43,
      TK_any = 44,
      TK_one = 45,
      TK_collect = 46,
      TK_select = 47,
      TK_reject = 48,
      TK_collectNested = 49,
      TK_sortedBy = 50,
      TK_closure = 51,
      TK_oclIsKindOf = 54,
      TK_oclIsTypeOf = 55,
      TK_oclAsType = 56,
      TK_oclIsNew = 57,
      TK_oclIsUndefined = 58,
      TK_oclIsInvalid = 59,
      TK_oclIsInState = 60,
      TK_allInstances = 52,
      TK_String = 6,
      TK_Integer = 7,
      TK_UnlimitedNatural = 8,
      TK_Real = 9,
      TK_Boolean = 10,
      TK_Tuple = 35,
      TK_OclAny = 11,
      TK_OclVoid = 12,
      TK_Invalid = 13,
      TK_OclMessage = 14,
      TK_OclInvalid = 71,
      TK_end = 132,
      TK_while = 72,
      TK_out = 133,
      TK_object = 73,
      TK_transformation = 134,
      TK_import = 135,
      TK_library = 136,
      TK_metamodel = 137,
      TK_mapping = 138,
      TK_query = 139,
      TK_inout = 140,
      TK_when = 114,
      TK_var = 103,
      TK_configuration = 141,
      TK_property = 142,
      TK_map = 61,
      TK_xmap = 62,
      TK_late = 63,
      TK_log = 98,
      TK_assert = 104,
      TK_with = 115,
      TK_resolve = 76,
      TK_resolveone = 77,
      TK_resolveIn = 78,
      TK_resolveoneIn = 79,
      TK_invresolve = 80,
      TK_invresolveone = 81,
      TK_invresolveIn = 82,
      TK_invresolveoneIn = 83,
      TK_modeltype = 143,
      TK_uses = 144,
      TK_where = 145,
      TK_refines = 146,
      TK_enforcing = 147,
      TK_access = 148,
      TK_extends = 149,
      TK_blackbox = 150,
      TK_abstract = 151,
      TK_static = 152,
      TK_result = 31,
      TK_main = 116,
      TK_this = 32,
      TK_switch = 74,
      TK_xselect = 117,
      TK_xcollect = 118,
      TK_selectOne = 119,
      TK_collectOne = 120,
      TK_collectselect = 121,
      TK_collectselectOne = 122,
      TK_rename = 153,
      TK_IDENTIFIER = 2,
      TK_ERROR_TOKEN = 4,
      TK_INTEGER_RANGE_START = 105,
      TK_EOF_TOKEN = 123;

      public final static String orderedTerminalSymbols[] = {
                 "",
                 "LPAREN",
                 "IDENTIFIER",
                 "RPAREN",
                 "ERROR_TOKEN",
                 "EQUAL",
                 "String",
                 "Integer",
                 "UnlimitedNatural",
                 "Real",
                 "Boolean",
                 "OclAny",
                 "OclVoid",
                 "Invalid",
                 "OclMessage",
                 "GREATER",
                 "LESS",
                 "GREATER_EQUAL",
                 "LESS_EQUAL",
                 "NOT_EQUAL",
                 "Set",
                 "Bag",
                 "Sequence",
                 "Collection",
                 "OrderedSet",
                 "MULTIPLY",
                 "DIVIDE",
                 "self",
                 "and",
                 "or",
                 "xor",
                 "result",
                 "this",
                 "PLUS",
                 "MINUS",
                 "Tuple",
                 "body",
                 "derive",
                 "init",
                 "null",
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
                 "not",
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
                 "NUMERIC_OPERATION",
                 "STRING_LITERAL",
                 "INTEGER_LITERAL",
                 "REAL_LITERAL",
                 "if",
                 "true",
                 "false",
                 "OclInvalid",
                 "while",
                 "object",
                 "switch",
                 "let",
                 "resolve",
                 "resolveone",
                 "resolveIn",
                 "resolveoneIn",
                 "invresolve",
                 "invresolveone",
                 "invresolveIn",
                 "invresolveoneIn",
                 "COMMA",
                 "LBRACE",
                 "RBRACE",
                 "SEMICOLON",
                 "BAR",
                 "COLONCOLON",
                 "COLON",
                 "LBRACKET",
                 "RESET_ASSIGN",
                 "NOT_EQUAL_EXEQ",
                 "RBRACKET",
                 "ATPRE",
                 "QUESTIONMARK",
                 "EXCLAMATION_MARK",
                 "log",
                 "ADD_ASSIGN",
                 "else",
                 "endif",
                 "in",
                 "var",
                 "assert",
                 "INTEGER_RANGE_START",
                 "ARROW",
                 "DOT",
                 "DOTDOT",
                 "CARET",
                 "CARETCARET",
                 "then",
                 "implies",
                 "AT_SIGN",
                 "when",
                 "with",
                 "main",
                 "xselect",
                 "xcollect",
                 "selectOne",
                 "collectOne",
                 "collectselect",
                 "collectselectOne",
                 "EOF_TOKEN",
                 "QUOTE_STRING_LITERAL",
                 "inv",
                 "pre",
                 "post",
                 "endpackage",
                 "def",
                 "attr",
                 "oper",
                 "end",
                 "out",
                 "transformation",
                 "import",
                 "library",
                 "metamodel",
                 "mapping",
                 "query",
                 "inout",
                 "configuration",
                 "property",
                 "modeltype",
                 "uses",
                 "where",
                 "refines",
                 "enforcing",
                 "access",
                 "extends",
                 "blackbox",
                 "abstract",
                 "static",
                 "rename"
             };

    public final static boolean isValidForParser = true;
}
