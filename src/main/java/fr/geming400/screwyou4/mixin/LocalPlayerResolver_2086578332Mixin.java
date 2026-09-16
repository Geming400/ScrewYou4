package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.player.LocalPlayerResolver.class)
public class LocalPlayerResolver_2086578332Mixin {
        @Inject(at = @At("HEAD"), method = "fetchByName(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void fetchByName_660242907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(660242907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fetchById(Ljava/util/UUID;)Ljava/util/Optional;", cancellable = true)
    private void fetchById_1686353313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1686353313L))
            info.setReturnValue(null);
    }


}
