package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder.class)
public class Builder285605625Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/Holder;D)Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private void add__990758257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990758257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private void add_487908229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(487908229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier;", cancellable = true)
    private void build__1556519701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1556519701L))
            info.setReturnValue(null);
    }


}
