package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.multiplayer.ServerSelectionList.class)
public class ServerSelectionList608052601Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_168972236(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(168972236L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth__1185168611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1185168611L))
            info.setReturnValue(902422185);
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/screens/multiplayer/ServerSelectionList$Entry;)V", cancellable = true)
    private void setSelected_49216714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(49216714L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/components/AbstractSelectionList$Entry;)V", cancellable = true)
    private void setSelected_2064129663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2064129663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateOnlineServers(Lnet/minecraft/client/multiplayer/ServerList;)V", cancellable = true)
    private void updateOnlineServers_823560753(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(823560753L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateNetworkServers(Ljava/util/List;)V", cancellable = true)
    private void updateNetworkServers_1112516370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1112516370L))
            info.cancel();
    }


}
