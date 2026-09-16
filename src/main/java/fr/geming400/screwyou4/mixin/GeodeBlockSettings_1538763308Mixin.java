package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.GeodeBlockSettings.class)
public class GeodeBlockSettings_1538763308Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_630137039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(630137039L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1985780464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985780464L))
            info.setReturnValue("&N%rCR,H]\u9E90)#A@|Hdz?QTENcg\u3735\u92EB907}sN:\u58419R2#\u481APH{\u059DFBK<K\uBBCA\u4AA6Ak&LRe&\u8143<#_VT");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2096115398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096115398L))
            info.setReturnValue(-1894391341);
    }

    @Inject(at = @At("HEAD"), method = "invalidBlocks()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void invalidBlocks_1170108124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1170108124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillingProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void fillingProvider_1901096438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901096438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "innerPlacements()Ljava/util/List;", cancellable = true)
    private void innerPlacements_1213964159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213964159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "middleLayerProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void middleLayerProvider_1752855795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1752855795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "innerLayerProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void innerLayerProvider__1839255534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1839255534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cannotReplace()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void cannotReplace__928695376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-928695376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outerLayerProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void outerLayerProvider_1742668109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1742668109L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alternateInnerLayerProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void alternateInnerLayerProvider_161243052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161243052L))
            info.setReturnValue(null);
    }


}
