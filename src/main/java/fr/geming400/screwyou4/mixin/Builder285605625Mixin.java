package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder.class)
public class Builder285605625Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/Holder;D)Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private void add_1542598320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1542598320L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private void add__400201916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-400201916L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier;", cancellable = true)
    private void build__806700199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-806700199L))
            info.setReturnValue(null);
    }


}
