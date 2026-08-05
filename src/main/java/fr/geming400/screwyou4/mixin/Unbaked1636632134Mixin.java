package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.SelectBlockModel.Unbaked.class)
public class Unbaked1636632134Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_728005866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(728005866L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1887911637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1887911637L))
            info.setReturnValue("KlZ+m#*\u618B>r_7>O\uFE44U+*M\u147C8di\u0A3CVUr<tj;R\u5051\u5090_Bl\uBF6AhM/yQA]\uCEEE9uFX\u7E6B)>[GBO,>\uBF81DBG\"zF\uD22BWF*;N");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2100983071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2100983071L))
            info.setReturnValue(291277320);
    }

    @Inject(at = @At("HEAD"), method = "fallback()Ljava/util/Optional;", cancellable = true)
    private void fallback_891295958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891295958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation__1459798019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1459798019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unbakedSwitch()Lnet/minecraft/client/renderer/block/SelectBlockModel$UnbakedSwitch;", cancellable = true)
    private void unbakedSwitch_2015614850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015614850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/block/model/BlockModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void bake__1052493132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1052493132L))
            info.setReturnValue(null);
    }


}
