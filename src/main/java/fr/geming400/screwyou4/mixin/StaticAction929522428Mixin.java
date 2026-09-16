package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.action.StaticAction.class)
public class StaticAction929522428Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/network/chat/ClickEvent;", cancellable = true)
    private void value_638076379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(638076379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_20896160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(20896160L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1699945953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699945953L))
            info.setReturnValue("U,W<]D\u3649<F{zv%vA\u0C019dPQ^\u9E1CO8m:|\uFAB3f/q@79\uFEC8g]1DDH\u00D2&HpHk+\u1F51\uAEE5h@ 7v\u4347\u5D9BZJu8)^\u7BE5Dig\u39DB}D!}p\u1FBAwoz\")/#o=B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1486874519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1486874519L))
            info.setReturnValue(-1097519826);
    }

    @Inject(at = @At("HEAD"), method = "createAction(Ljava/util/Map;)Ljava/util/Optional;", cancellable = true)
    private void createAction_1539509501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539509501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1995967682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1995967682L))
            info.setReturnValue(null);
    }


}
