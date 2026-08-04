package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistrationInfo.class)
public class RegistrationInfo_1562345565Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1347109473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1347109473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_426885589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(426885589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1600608306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1600608306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lifecycle()Lcom/mojang/serialization/Lifecycle;", cancellable = true)
    private void lifecycle_530957134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530957134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knownPackInfo()Ljava/util/Optional;", cancellable = true)
    private void knownPackInfo_1807806986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1807806986L))
            info.setReturnValue(null);
    }


}
