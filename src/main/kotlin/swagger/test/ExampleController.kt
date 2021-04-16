package swagger.test

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.swagger.v3.oas.annotations.tags.Tag

@Controller("/api/v1")
@Tag(name = "Example")
class ExampleController {

    @Get(uri = "/example")
    fun getExampleData(): ExampleData {
        return ExampleData(
            "name",
            true,
            ExampleAdditionalData("hello"),
            2,
            0.456f
        )
    }

}
