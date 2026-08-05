package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueInput.DecodeFromFieldFailedProblem.class)
public class DecodeFromFieldFailedProblem1227842737Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_92382266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(92382266L))
            info.setReturnValue("k(xafUmrnA1\uC4FFU\uD5EAX&\u759136*At/S@nJM$g6B\u3EB3\u0478;C");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1681612300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1681612300L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_92382762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(92382762L))
            info.setReturnValue("8BI8wo=_!pa\u360DE7WU.2o5jj\uBF30I");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1266105479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1266105479L))
            info.setReturnValue(-1785508314);
    }

    @Inject(at = @At("HEAD"), method = "error()Lcom/mojang/serialization/DataResult$Error;", cancellable = true)
    private void error_1680087388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680087388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void tag__1523837474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1523837474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_92382266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(92382266L))
            info.setReturnValue("k(xafUmrnA1\uC4FFU\uD5EAX&\u759136*At/S@nJM$g6B\u3EB3\u0478;C");
    }


}
