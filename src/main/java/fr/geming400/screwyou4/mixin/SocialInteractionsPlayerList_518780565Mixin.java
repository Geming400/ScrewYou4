package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.SocialInteractionsPlayerList.class)
public class SocialInteractionsPlayerList_518780565Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_557059147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(557059147L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setFilter(Ljava/lang/String;)V", cancellable = true)
    private void setFilter_1671141713(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1671141713L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPlayer(Lnet/minecraft/client/multiplayer/PlayerInfo;Lnet/minecraft/client/gui/screens/social/SocialInteractionsScreen$Page;)V", cancellable = true)
    private void addPlayer_1565596792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1565596792L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removePlayer(Ljava/util/UUID;)V", cancellable = true)
    private void removePlayer_161224475(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(161224475L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "refreshHasDraftReport()V", cancellable = true)
    private void refreshHasDraftReport_557055303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(557055303L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updatePlayerList(Ljava/util/Collection;DZ)V", cancellable = true)
    private void updatePlayerList_123181134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(123181134L))
            info.cancel();
    }


}
