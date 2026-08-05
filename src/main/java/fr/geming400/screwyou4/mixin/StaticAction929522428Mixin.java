package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.action.StaticAction.class)
public class StaticAction929522428Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/network/chat/ClickEvent;", cancellable = true)
    private void value_774566892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(774566892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1979932609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1979932609L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__205937547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-205937547L))
            info.setReturnValue("X%Z\u72FFg0:|\u79F7kZr\uBBE5j3hC.5I\u2DF9p\u7688SP%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_967785170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967785170L))
            info.setReturnValue(-1238999520);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1629591144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629591144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAction(Ljava/util/Map;)Ljava/util/Optional;", cancellable = true)
    private void createAction__1977744497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977744497L))
            info.setReturnValue(null);
    }


}
