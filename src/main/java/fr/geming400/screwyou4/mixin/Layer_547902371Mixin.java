package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BannerPatternLayers.Layer.class)
public class Layer_547902371Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1933414629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933414629L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__587557605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-587557605L))
            info.setReturnValue("0s&Kf|sFO^燐-9+8Qꣵ;#2:s:X8C?cR骐MΙ4a83eh<.m뛊Z:U\"S;Jud5iUtr6yQ嘠AW<//䤨%7 3Qd멼ZQgX`cz뿮");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_586165112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586165112L))
            info.setReturnValue(-484981152);
    }

    @Inject(at = @At("HEAD"), method = "pattern()Lnet/minecraft/core/Holder;", cancellable = true)
    private void pattern_2096778142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096778142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void color_1983210600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983210600L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.RED);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void description__1860101843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1860101843L))
            info.setReturnValue(null);
    }


}
