package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugScreenEntryList.class)
public class DebugScreenEntryList1276273089Mixin {
        @Inject(at = @At("HEAD"), method = "load()V", cancellable = true)
    private void load_1314547828(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1314547828L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save()V", cancellable = true)
    private void save_1314547828(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1314547828L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStatus(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/gui/components/debug/DebugScreenEntryStatus;", cancellable = true)
    private void getStatus_34474705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(34474705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCurrentlyEnabled()Ljava/util/Collection;", cancellable = true)
    private void getCurrentlyEnabled__537375183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-537375183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOverlayVisible()Z", cancellable = true)
    private void isOverlayVisible_1314551672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1314551672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOverlayVisible(Z)V", cancellable = true)
    private void setOverlayVisible__1789077378(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1789077378L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toggleStatus(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void toggleStatus__218164224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-218164224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleDebugOverlay()V", cancellable = true)
    private void toggleDebugOverlay_1314547828(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1314547828L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isCurrentlyEnabled(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void isCurrentlyEnabled__218164224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-218164224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rebuildCurrentList()V", cancellable = true)
    private void rebuildCurrentList_1314547828(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1314547828L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStatus(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/gui/components/debug/DebugScreenEntryStatus;)V", cancellable = true)
    private void setStatus_437420629(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(437420629L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCurrentlyEnabledVersion()J", cancellable = true)
    private void getCurrentlyEnabledVersion_1314536296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1314536296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadProfile(Lnet/minecraft/client/gui/components/debug/DebugScreenProfile;)V", cancellable = true)
    private void loadProfile_277469512(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(277469512L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isUsingProfile(Lnet/minecraft/client/gui/components/debug/DebugScreenProfile;)Z", cancellable = true)
    private void isUsingProfile_277473356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277473356L))
            info.setReturnValue(null);
    }


}
