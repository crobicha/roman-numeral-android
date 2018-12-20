package crobicha.com.romannumeralandroid.domain.interactor


// fun execute(arg: Argument): Result

class ConvertToNumericUseCase : UseCase<Int?, String> {
    override fun execute(arg: String): Int? {

        return if ("I".equals(arg, true)) {
            1
        } else {
            null
        }
    }

}