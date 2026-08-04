package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelSummary.CorruptedLevelSummary.class)
public class CorruptedLevelSummary_2032800388Mixin {
        @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__876542523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-876542523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInfo()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getInfo__144108778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-144108778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelName()Ljava/lang/String;", cancellable = true)
    private void getLevelName_897339916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(897339916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "primaryActionActive()Z", cancellable = true)
    private void primaryActionActive_2071078970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071078970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canRecreate()Z", cancellable = true)
    private void canRecreate_2071078970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071078970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "primaryActionMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void primaryActionMessage__144108778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-144108778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastPlayed()J", cancellable = true)
    private void getLastPlayed_2071063594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071063594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDisabled()Z", cancellable = true)
    private void isDisabled_2071078970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071078970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canEdit()Z", cancellable = true)
    private void canEdit_2071078970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071078970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canUpload()Z", cancellable = true)
    private void canUpload_2071078970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071078970L))
            info.setReturnValue(null);
    }


}
