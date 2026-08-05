package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkResult.Success.class)
public class Success1352169459Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value_348648511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348648511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_443543191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(443543191L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2122592984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122592984L))
            info.setReturnValue("\"wn>M#*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1909521550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909521550L))
            info.setReturnValue(2057368995);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/server/level/ChunkResult;", cancellable = true)
    private void map__64390954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-64390954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orElse(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void orElse__1497842386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497842386L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "orElseThrow(Ljava/util/function/Supplier;)Ljava/lang/Object;", cancellable = true)
    private void orElseThrow__424504400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-424504400L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "ifSuccess(Ljava/util/function/Consumer;)Lnet/minecraft/server/level/ChunkResult;", cancellable = true)
    private void ifSuccess__1066562454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1066562454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSuccess()Z", cancellable = true)
    private void isSuccess__114243119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-114243119L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getError()Ljava/lang/String;", cancellable = true)
    private void getError_797328974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797328974L))
            info.setReturnValue("s/PLzS\"\u429D4F+E^oX\u6063dN%d9/cj?BBa->h#%[7P\uB286LHmm\u98E8D\uA136\u09A1DT JQ>+BB`i.!-4I\u7C83Aw21b$YJW+ykD");
    }


}
