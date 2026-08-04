package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.KnownPacksManager.class)
public class KnownPacksManager568183336Mixin {
        @Inject(at = @At("HEAD"), method = "trySelectingPacks(Ljava/util/List;)Ljava/util/List;", cancellable = true)
    private void trySelectingPacks_659346823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659346823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createResourceManager()Lnet/minecraft/server/packs/resources/CloseableResourceManager;", cancellable = true)
    private void createResourceManager__1640415608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1640415608L))
            info.setReturnValue(null);
    }


}
