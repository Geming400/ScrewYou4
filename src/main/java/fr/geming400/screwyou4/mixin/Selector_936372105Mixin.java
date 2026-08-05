package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.Selector.class)
public class Selector_936372105Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1973082933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1973082933L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__199087871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-199087871L))
            info.setReturnValue("`&uxc;鸳aNLe_Csj'xiYEn?hL4Y*pFY近$r*gf&拴");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_974634846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(974634846L))
            info.setReturnValue(1415325964);
    }

    @Inject(at = @At("HEAD"), method = "condition()Ljava/util/Optional;", cancellable = true)
    private void condition_1181833526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1181833526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "variant()Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel$Unbaked;", cancellable = true)
    private void variant__1555584038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1555584038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/world/level/block/state/StateDefinition;)Ljava/util/function/Predicate;", cancellable = true)
    private void instantiate__732293497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-732293497L))
            info.setReturnValue(null);
    }


}
