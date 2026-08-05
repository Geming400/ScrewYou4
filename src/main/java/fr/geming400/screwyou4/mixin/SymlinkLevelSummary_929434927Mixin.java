package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelSummary.SymlinkLevelSummary.class)
public class SymlinkLevelSummary_929434927Mixin {
        @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__1979907984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1979907984L))
            info.setReturnValue(1287105461);
    }

    @Inject(at = @At("HEAD"), method = "getInfo()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getInfo__1247474239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1247474239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelName()Ljava/lang/String;", cancellable = true)
    private void getLevelName__206025545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-206025545L))
            info.setReturnValue("+2K9㋜4K&ou굻W#");
    }

    @Inject(at = @At("HEAD"), method = "isDisabled()Z", cancellable = true)
    private void isDisabled_967713509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967713509L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canEdit()Z", cancellable = true)
    private void canEdit_967713509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967713509L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canUpload()Z", cancellable = true)
    private void canUpload_967713509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967713509L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "primaryActionActive()Z", cancellable = true)
    private void primaryActionActive_967713509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967713509L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "primaryActionMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void primaryActionMessage__1247474239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1247474239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canRecreate()Z", cancellable = true)
    private void canRecreate_967713509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967713509L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLastPlayed()J", cancellable = true)
    private void getLastPlayed_967698133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967698133L))
            info.setReturnValue(-2131303293842958214L);
    }


}
