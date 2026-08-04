package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootDataType.class)
public class LootDataType_921898652Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1987556386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1987556386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__213561324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-213561324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/stream/Stream;", cancellable = true)
    private static void values_711192584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(711192584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_960161393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(960161393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryKey()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void registryKey_1730389964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1730389964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contextGetter()Lnet/minecraft/world/level/storage/loot/LootDataType$ContextGetter;", cancellable = true)
    private void contextGetter__1803561594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1803561594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_529933025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529933025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runValidation(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;Lnet/minecraft/core/HolderLookup;)V", cancellable = true)
    private void runValidation__2056413298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2056413298L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runValidation(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/storage/loot/Validatable;)V", cancellable = true)
    private void runValidation__30324582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-30324582L))
            info.cancel();
    }


}
