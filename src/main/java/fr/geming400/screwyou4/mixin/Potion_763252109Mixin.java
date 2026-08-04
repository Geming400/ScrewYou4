package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.Potion.class)
public class Potion_763252109Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1795861464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1795861464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2146202929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146202929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__372207867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-372207867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_801514850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801514850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultColor()I", cancellable = true)
    private void defaultColor_801514354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801514354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate_106938882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(106938882L))
            info.setReturnValue(null);
    }


}
