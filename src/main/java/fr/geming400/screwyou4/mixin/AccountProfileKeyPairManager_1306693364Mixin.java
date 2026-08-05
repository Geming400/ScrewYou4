package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.AccountProfileKeyPairManager.class)
public class AccountProfileKeyPairManager_1306693364Mixin {
        @Inject(at = @At("HEAD"), method = "prepareKeyPair()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void prepareKeyPair__269191454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-269191454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRefreshKeyPair()Z", cancellable = true)
    private void shouldRefreshKeyPair__172481479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-172481479L))
            info.setReturnValue(true);
    }


}
