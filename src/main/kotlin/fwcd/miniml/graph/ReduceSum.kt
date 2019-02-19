package fwcd.miniml.graph

import fwcd.miniml.math.NDArray
import fwcd.miniml.math.scalarOf

/**
 * The sum across all elements.
 */
class ReduceSum(
	private val value: ValueNode
) : ValueNode {
	override fun forward() = scalarOf(value.forward().reduceSum())
}