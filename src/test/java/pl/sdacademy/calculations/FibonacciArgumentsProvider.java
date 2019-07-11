package pl.sdacademy.calculations;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class FibonacciArgumentsProvider implements ArgumentsProvider {
  @Override
  public Stream<? extends Arguments> provideArguments(final ExtensionContext extensionContext) throws Exception {
    return Stream.of(
        Arguments.of(1, 1),
        Arguments.of(5, 5),
        Arguments.of(15, 610)
    );
  }
}