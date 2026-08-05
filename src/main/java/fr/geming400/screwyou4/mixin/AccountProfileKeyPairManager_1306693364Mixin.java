package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.AccountProfileKeyPairManager.class)
public class AccountProfileKeyPairManager_1306693364Mixin {
        @Inject(at = @At("HEAD"), method = "prepareKeyPair()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void prepareKeyPair__1274898672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274898672L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "shouldRefreshKeyPair()Z", cancellable = true)
    private void shouldRefreshKeyPair_1344971946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344971946L))
            info.setReturnValue(true);
    }


}
