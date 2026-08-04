package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.Count.class)
public class Count239398161Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get__771644925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771644925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_1975251885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1975251885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1624910420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1624910420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__896061814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-896061814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_277660903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277660903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "normalize()Z", cancellable = true)
    private void normalize_277676744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277676744L))
            info.setReturnValue(null);
    }


}
