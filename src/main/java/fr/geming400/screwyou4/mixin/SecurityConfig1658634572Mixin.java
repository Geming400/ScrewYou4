package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.security.SecurityConfig.class)
public class SecurityConfig1658634572Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_750008304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750008304L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1865909199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1865909199L))
            info.setReturnValue("zA\uABB5qne.4gk8\uAB21J<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2078980633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2078980633L))
            info.setReturnValue(-1482047064);
    }

    @Inject(at = @At("HEAD"), method = "isValid(Ljava/lang/String;)Z", cancellable = true)
    private static void isValid__1957902637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1957902637L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "secretKey()Ljava/lang/String;", cancellable = true)
    private void secretKey__1434061532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1434061532L))
            info.setReturnValue("Q\u241C!\u1344\"'");
    }

    @Inject(at = @At("HEAD"), method = "generateSecretKey()Ljava/lang/String;", cancellable = true)
    private static void generateSecretKey_1473210855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1473210855L))
            info.setReturnValue("6qRCp:RfQd@&Z)BGj<\u2617&1\u087EF|-_5<\"\u35F0C\u4701u):ZAf'*{i[O,\u4B20ptBxCzRi\u67A5\u14FCg\u2B7E%DZr0@f3(T;u]-;!\u3331Xaf)b4Ox");
    }


}
