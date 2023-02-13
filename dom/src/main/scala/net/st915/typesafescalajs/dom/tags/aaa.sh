#!/bin/bash

echo ""
echo "  opaque type $1 = Tags.$1"
echo "  object $1:"
echo "    def apply(attrs: (AcceptAttributes.$1, _)*)(children: Node*): $1 ="
echo "      Tags.$1(attrs.toSet, children.toList)"
echo "    def apply(values: ((AcceptAttributes.$1, _) | Node)*): $1 ="
echo "      applyMacro(Tags.$1.apply)(values)"
