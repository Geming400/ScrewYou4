package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.alias.RandomPoolAlias.class)
public class RandomPoolAlias_1206094541Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1703360497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1703360497L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_70634565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(70634565L))
            info.setReturnValue("{\"y<b#.?k7osWo0=*드G*;⸓nM|8:鬽⭚`匵U9h>4x: ;aub?䫓1 yKꦉ<)>rp;e$bzAᆬ.@f2}Nam");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1244357282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1244357282L))
            info.setReturnValue(-92571011);
    }

    @Inject(at = @At("HEAD"), method = "targets()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void targets_699610674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(699610674L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alias()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void alias_2014585853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2014585853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachResolved(Lnet/minecraft/util/RandomSource;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEachResolved_379110722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(379110722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1353019032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1353019032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allTargets()Ljava/util/stream/Stream;", cancellable = true)
    private void allTargets_995388225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995388225L))
            info.setReturnValue(null);
    }


}
