package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.context.ContextKeySet.Builder.class)
public class Builder_1518155101Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/util/context/ContextKeySet;", cancellable = true)
    private void build__642698689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-642698689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optional(Lnet/minecraft/util/context/ContextKey;)Lnet/minecraft/util/context/ContextKeySet$Builder;", cancellable = true)
    private void optional_1241011116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1241011116L))
            info.setReturnValue(new net.minecraft.util.context.ContextKeySet.Builder());
    }

    @Inject(at = @At("HEAD"), method = "required(Lnet/minecraft/util/context/ContextKey;)Lnet/minecraft/util/context/ContextKeySet$Builder;", cancellable = true)
    private void required__404084787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-404084787L))
            info.setReturnValue(null);
    }


}
