package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugScreenEntryList.class)
public class DebugScreenEntryList1276273089Mixin {
        @Inject(at = @At("HEAD"), method = "load()V", cancellable = true)
    private void load__1682128050(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1682128050L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save()V", cancellable = true)
    private void save_1407388951(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1407388951L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStatus(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/gui/components/debug/DebugScreenEntryStatus;", cancellable = true)
    private void getStatus__1443521607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1443521607L))
            info.setReturnValue(net.minecraft.client.gui.components.debug.DebugScreenEntryStatus.IN_OVERLAY);
    }

    @Inject(at = @At("HEAD"), method = "rebuildCurrentList()V", cancellable = true)
    private void rebuildCurrentList__1463864488(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1463864488L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isCurrentlyEnabled(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void isCurrentlyEnabled_1633080507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633080507L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCurrentlyEnabled()Ljava/util/Collection;", cancellable = true)
    private void getCurrentlyEnabled__1613063678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1613063678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOverlayVisible(Z)V", cancellable = true)
    private void setOverlayVisible_984122498(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(984122498L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isOverlayVisible()Z", cancellable = true)
    private void isOverlayVisible_257320236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(257320236L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "loadProfile(Lnet/minecraft/client/gui/components/debug/DebugScreenProfile;)V", cancellable = true)
    private void loadProfile__206613371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-206613371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isUsingProfile(Lnet/minecraft/client/gui/components/debug/DebugScreenProfile;)Z", cancellable = true)
    private void isUsingProfile__1161322723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1161322723L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCurrentlyEnabledVersion()J", cancellable = true)
    private void getCurrentlyEnabledVersion__1439000767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1439000767L))
            info.setReturnValue(-1995968151142993970L);
    }

    @Inject(at = @At("HEAD"), method = "setStatus(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/gui/components/debug/DebugScreenEntryStatus;)V", cancellable = true)
    private void setStatus__131683615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-131683615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toggleDebugOverlay()V", cancellable = true)
    private void toggleDebugOverlay__301239517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-301239517L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toggleStatus(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void toggleStatus__102066598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-102066598L))
            info.setReturnValue(false);
    }


}
