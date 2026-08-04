package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.MapColor.class)
public class MapColor453870471Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__2105243101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2105243101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1839382730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1839382730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__681589504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-681589504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_492133213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(492133213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultColor()I", cancellable = true)
    private void defaultColor_492132717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(492132717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate__202442755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-202442755L))
            info.setReturnValue(null);
    }


}
