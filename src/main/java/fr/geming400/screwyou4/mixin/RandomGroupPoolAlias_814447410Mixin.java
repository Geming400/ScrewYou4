package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.alias.RandomGroupPoolAlias.class)
public class RandomGroupPoolAlias_814447410Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2095007628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2095007628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__321012566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-321012566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_852710151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(852710151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "groups()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void groups_307963543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(307963543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1744666163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1744666163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allTargets()Ljava/util/stream/Stream;", cancellable = true)
    private void allTargets_603741094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(603741094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachResolved(Lnet/minecraft/util/RandomSource;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEachResolved__12536409(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-12536409L))
            info.cancel();
    }


}
