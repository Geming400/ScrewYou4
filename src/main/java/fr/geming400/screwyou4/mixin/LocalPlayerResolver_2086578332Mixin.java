package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.player.LocalPlayerResolver.class)
public class LocalPlayerResolver_2086578332Mixin {
        @Inject(at = @At("HEAD"), method = "fetchByName(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void fetchByName__198353409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-198353409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fetchById(Ljava/util/UUID;)Ljava/util/Optional;", cancellable = true)
    private void fetchById_1502406645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1502406645L))
            info.setReturnValue(null);
    }


}
