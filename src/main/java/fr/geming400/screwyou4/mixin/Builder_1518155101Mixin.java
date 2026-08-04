package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.context.ContextKeySet.Builder.class)
public class Builder_1518155101Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/util/context/ContextKeySet;", cancellable = true)
    private void build_2000911441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2000911441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optional(Lnet/minecraft/util/context/ContextKey;)Lnet/minecraft/util/context/ContextKeySet$Builder;", cancellable = true)
    private void optional_1104110348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104110348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "required(Lnet/minecraft/util/context/ContextKey;)Lnet/minecraft/util/context/ContextKeySet$Builder;", cancellable = true)
    private void required_1104110348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104110348L))
            info.setReturnValue(null);
    }


}
