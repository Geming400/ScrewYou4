package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ServerPlayer.RespawnConfig.class)
public class RespawnConfig_1145013766Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1764441272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764441272L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_9553790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(9553790L))
            info.setReturnValue("]GT\uAC83'sE\u360FZ\"YEh3be\uB228^\uD3FD}v\u7AB9qAg+'gkaYAF3}hX)\u7D40/\uB4EB\u5817Y.@_f,p)$F`vCeK`waoSyV5$xhX]*\u0827akw\uB48FW:;+t=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1183276507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1183276507L))
            info.setReturnValue(-550654884);
    }

    @Inject(at = @At("HEAD"), method = "forced()Z", cancellable = true)
    private void forced_1183292348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1183292348L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "respawnData()Lnet/minecraft/world/level/storage/LevelData$RespawnData;", cancellable = true)
    private void respawnData_554053885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(554053885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSamePosition(Lnet/minecraft/server/level/ServerPlayer$RespawnConfig;)Z", cancellable = true)
    private void isSamePosition__375524282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-375524282L))
            info.setReturnValue(false);
    }


}
