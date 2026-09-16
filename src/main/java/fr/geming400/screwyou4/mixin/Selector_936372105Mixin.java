package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.Selector.class)
public class Selector_936372105Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_27745836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(27745836L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1706795629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1706795629L))
            info.setReturnValue("*Pa!sxA9f\uCB61-e0:#7{q]X\u07F2\u6B7CQC@wNs\u871D=F7Xcr\uA5D85/9\u75C2fg41\";*YL\u817F<S3p]\u30BDkr7dx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1493724195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1493724195L))
            info.setReturnValue(1582302736);
    }

    @Inject(at = @At("HEAD"), method = "condition()Ljava/util/Optional;", cancellable = true)
    private void condition_1778115921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1778115921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "variant()Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel$Unbaked;", cancellable = true)
    private void variant__984813025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-984813025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/world/level/block/state/StateDefinition;)Ljava/util/function/Predicate;", cancellable = true)
    private void instantiate_335617757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(335617757L))
            info.setReturnValue(null);
    }


}
