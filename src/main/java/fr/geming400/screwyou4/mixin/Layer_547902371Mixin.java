package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BannerPatternLayers.Layer.class)
public class Layer_547902371Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__360723898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-360723898L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1318325895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1318325895L))
            info.setReturnValue("5,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1105254461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1105254461L))
            info.setReturnValue(-1111352586);
    }

    @Inject(at = @At("HEAD"), method = "pattern()Lnet/minecraft/core/Holder;", cancellable = true)
    private void pattern_1994911246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994911246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void color_578517925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(578517925L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.BROWN);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void description_797801649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797801649L))
            info.setReturnValue(null);
    }


}
