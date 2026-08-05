package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.alias.DirectPoolAlias.class)
public class DirectPoolAlias_1402738099Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1506716939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506716939L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void target__2083737885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083737885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_267278123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(267278123L))
            info.setReturnValue("=[]1Q7첮hT줕骱af$> 5iRⰡQ8/1eXqF$.q:]꼺1ZP)<絰Z.s4榵d2GqY%KI'ﾡ瘍깲0ㄼJ'硥");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1441000840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441000840L))
            info.setReturnValue(-2126695997);
    }

    @Inject(at = @At("HEAD"), method = "alias()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void alias__2083737885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083737885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachResolved(Lnet/minecraft/util/RandomSource;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEachResolved_575754280(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(575754280L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1156375474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156375474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allTargets()Ljava/util/stream/Stream;", cancellable = true)
    private void allTargets_1192031783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192031783L))
            info.setReturnValue(null);
    }


}
