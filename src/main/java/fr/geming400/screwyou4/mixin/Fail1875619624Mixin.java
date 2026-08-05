package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkResult.Fail.class)
public class Fail1875619624Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1033835413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033835413L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_740159649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(740159649L))
            info.setReturnValue("9>-hU:|tZbTemD1;Vh\"BR974{o뚛@k.mi=SCpax");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1913882366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1913882366L))
            info.setReturnValue(621809484);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/server/level/ChunkResult;", cancellable = true)
    private void map__787272217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-787272217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orElse(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void orElse_1887697575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1887697575L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "orElseThrow(Ljava/util/function/Supplier;)Ljava/lang/Object;", cancellable = true)
    private void orElseThrow__1940268625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940268625L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "error()Ljava/util/function/Supplier;", cancellable = true)
    private void error_1406461033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1406461033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getError()Ljava/lang/String;", cancellable = true)
    private void getError_740159153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(740159153L))
            info.setReturnValue("#xG{x?/");
    }

    @Inject(at = @At("HEAD"), method = "ifSuccess(Ljava/util/function/Consumer;)Lnet/minecraft/server/level/ChunkResult;", cancellable = true)
    private void ifSuccess__429192955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429192955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSuccess()Z", cancellable = true)
    private void isSuccess_1913898207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1913898207L))
            info.setReturnValue(true);
    }


}
