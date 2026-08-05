package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.SocialInteractionsPlayerList.class)
public class SocialInteractionsPlayerList_518780565Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1577896936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1577896936L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setFilter(Ljava/lang/String;)V", cancellable = true)
    private void setFilter__1788981865(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1788981865L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPlayer(Lnet/minecraft/client/multiplayer/PlayerInfo;Lnet/minecraft/client/gui/screens/social/SocialInteractionsScreen$Page;)V", cancellable = true)
    private void addPlayer__92957738(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-92957738L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removePlayer(Ljava/util/UUID;)V", cancellable = true)
    private void removePlayer_522878902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(522878902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "refreshHasDraftReport()V", cancellable = true)
    private void refreshHasDraftReport_1240405009(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1240405009L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updatePlayerList(Ljava/util/Collection;DZ)V", cancellable = true)
    private void updatePlayerList_1719228550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1719228550L))
            info.cancel();
    }


}
