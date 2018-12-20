package crobicha.com.romannumeralandroid.domain.interactor

public interface UseCase<Result, Argument> {
    @Throws(Exception::class)
    fun execute(arg: Argument): Result
}