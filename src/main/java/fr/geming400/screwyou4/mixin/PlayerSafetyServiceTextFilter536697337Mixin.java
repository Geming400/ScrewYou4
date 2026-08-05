package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.PlayerSafetyServiceTextFilter.class)
public class PlayerSafetyServiceTextFilter536697337Mixin {
        @Inject(at = @At("HEAD"), method = "createTextFilterFromConfig(Ljava/lang/String;)Lnet/minecraft/server/network/ServerTextFilter;", cancellable = true)
    private static void createTextFilterFromConfig__459929007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-459929007L))
            info.setReturnValue(null);
    }


}
