package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.multiplayer.ServerSelectionList.class)
public class ServerSelectionList608052601Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_646327340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(646327340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateOnlineServers(Lnet/minecraft/client/multiplayer/ServerList;)V", cancellable = true)
    private void updateOnlineServers__212164163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-212164163L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateNetworkServers(Ljava/util/List;)V", cancellable = true)
    private void updateNetworkServers__171165987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-171165987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/screens/multiplayer/ServerSelectionList$Entry;)V", cancellable = true)
    private void setSelected__1792692537(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1792692537L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/components/AbstractSelectionList$Entry;)V", cancellable = true)
    private void setSelected__1829437662(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1829437662L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth_646314847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646314847L))
            info.setReturnValue(null);
    }


}
