package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelSummary.CorruptedLevelSummary.class)
public class CorruptedLevelSummary_2032800388Mixin {
        @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo_140696453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140696453L))
            info.setReturnValue(-1609924806);
    }

    @Inject(at = @At("HEAD"), method = "getInfo()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getInfo_902640442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902640442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelName()Ljava/lang/String;", cancellable = true)
    private void getLevelName_381131461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(381131461L))
            info.setReturnValue("\u60EFm%b2.\u27BFH0:I:zTVs\uD3B3Op|:\u5D9E\u7C86j^TYl3lY\u8A68X \"pOI\u08CBok_JmwEl|$:m\uC555S$+/\u53AC\u29B6B/GtRwDq 1p/UnaA^\u0862>H>ze");
    }

    @Inject(at = @At("HEAD"), method = "primaryActionMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void primaryActionMessage__554346907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-554346907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "primaryActionActive()Z", cancellable = true)
    private void primaryActionActive_2109218556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109218556L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canRecreate()Z", cancellable = true)
    private void canRecreate_477940411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(477940411L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLastPlayed()J", cancellable = true)
    private void getLastPlayed__434984309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-434984309L))
            info.setReturnValue(6799051584182192360L);
    }

    @Inject(at = @At("HEAD"), method = "canEdit()Z", cancellable = true)
    private void canEdit__635217280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-635217280L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canUpload()Z", cancellable = true)
    private void canUpload_530897129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530897129L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isDisabled()Z", cancellable = true)
    private void isDisabled__520588748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-520588748L))
            info.setReturnValue(true);
    }


}
