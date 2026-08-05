package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.ProfileResolver.Cached.class)
public class Cached1694462395Mixin {
        @Inject(at = @At("HEAD"), method = "fetchById(Ljava/util/UUID;)Ljava/util/Optional;", cancellable = true)
    private void fetchById_1110290709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1110290709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fetchByName(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void fetchByName__590469345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590469345L))
            info.setReturnValue(null);
    }


}
