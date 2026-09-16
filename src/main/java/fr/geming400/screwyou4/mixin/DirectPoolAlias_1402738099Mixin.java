package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.alias.DirectPoolAlias.class)
public class DirectPoolAlias_1402738099Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_494111830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(494111830L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void target_450131058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(450131058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2121805673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121805673L))
            info.setReturnValue("a9=PB4Wc@\u1957X\u7057]\uCD84<\u1722b\u80230IwuZ\uD084Huh0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1960090189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960090189L))
            info.setReturnValue(1879286193);
    }

    @Inject(at = @At("HEAD"), method = "alias()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void alias_690254483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(690254483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachResolved(Lnet/minecraft/util/RandomSource;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEachResolved__1511590682(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1511590682L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1825783944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1825783944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allTargets()Ljava/util/stream/Stream;", cancellable = true)
    private void allTargets_1123556774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1123556774L))
            info.setReturnValue(null);
    }


}
