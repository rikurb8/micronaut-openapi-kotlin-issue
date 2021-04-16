package swagger.test

import io.micronaut.core.annotation.Introspected

@Introspected
data class ExampleData(
    // These are marked as required in the generated openapi doc
    val name: String,
    val active: Boolean,
    val additionalData: ExampleAdditionalData,
    // These are not marked optional but doesn't get marked as required in generated openapi doc
    val age: Int,
    val battingAverage: Float
)

data class ExampleAdditionalData(
    val something: String
)
