package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.Message.class)
public class Message656196905Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__252429363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-252429363L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1426620430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426620430L))
            info.setReturnValue("RE5'*\uFFC5d\u3647M=#='98J)bQUmc!Pc\u2925]H\uA422Q\u2E07[HZ>5'lk}/C*v2|{?$\uB8FEqJx\u0646&>&HL>7Lqmgj\u13A1\u23EA#\u088C4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1213548996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213548996L))
            info.setReturnValue(-1705769611);
    }

    @Inject(at = @At("HEAD"), method = "literal()Ljava/util/Optional;", cancellable = true)
    private void literal_121830022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(121830022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translatable()Ljava/util/Optional;", cancellable = true)
    private void translatable_52470696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(52470696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translatableParams()Ljava/util/Optional;", cancellable = true)
    private void translatableParams_1071175310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1071175310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asComponent()Ljava/util/Optional;", cancellable = true)
    private void asComponent__2082230590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082230590L))
            info.setReturnValue(null);
    }


}
