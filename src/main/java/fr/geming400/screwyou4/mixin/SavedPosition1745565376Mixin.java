package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ServerPlayer.SavedPosition.class)
public class SavedPosition1745565376Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_836939108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(836939108L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1778978395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778978395L))
            info.setReturnValue("Y\u68D9C \u44E76T\u9B96OzX@?:eK,=-0Jm}*l]-o\") NnMq\u4214I\u122DAj0(n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1992049829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1992049829L))
            info.setReturnValue(-1146252355);
    }

    @Inject(at = @At("HEAD"), method = "position()Ljava/util/Optional;", cancellable = true)
    private void position__1761569129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1761569129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Ljava/util/Optional;", cancellable = true)
    private void rotation_1569627628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1569627628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimension()Ljava/util/Optional;", cancellable = true)
    private void dimension__1334852652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334852652L))
            info.setReturnValue(null);
    }


}
