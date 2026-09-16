package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.KnownPacksManager.class)
public class KnownPacksManager568183336Mixin {
        @Inject(at = @At("HEAD"), method = "trySelectingPacks(Ljava/util/List;)Ljava/util/List;", cancellable = true)
    private void trySelectingPacks__844827562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-844827562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createResourceManager()Lnet/minecraft/server/packs/resources/CloseableResourceManager;", cancellable = true)
    private void createResourceManager__67762043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67762043L))
            info.setReturnValue(null);
    }


}
