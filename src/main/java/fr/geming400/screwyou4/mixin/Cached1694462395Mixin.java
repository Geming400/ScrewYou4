package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.ProfileResolver.Cached.class)
public class Cached1694462395Mixin {
        @Inject(at = @At("HEAD"), method = "fetchByName(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void fetchByName_268126971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268126971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fetchById(Ljava/util/UUID;)Ljava/util/Optional;", cancellable = true)
    private void fetchById_1294237377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1294237377L))
            info.setReturnValue(null);
    }


}
