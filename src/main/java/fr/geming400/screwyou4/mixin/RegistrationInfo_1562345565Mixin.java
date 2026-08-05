package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistrationInfo.class)
public class RegistrationInfo_1562345565Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_653719296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(653719296L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1962198207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1962198207L))
            info.setReturnValue("5nUa\uCB7CXK6\u55FDxq'\uABB9<VZt\u9122bHA:se*%eWrr");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2119697655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2119697655L))
            info.setReturnValue(-1833194266);
    }

    @Inject(at = @At("HEAD"), method = "lifecycle()Lcom/mojang/serialization/Lifecycle;", cancellable = true)
    private void lifecycle__859866952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-859866952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knownPackInfo()Ljava/util/Optional;", cancellable = true)
    private void knownPackInfo_116272852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(116272852L))
            info.setReturnValue(null);
    }


}
