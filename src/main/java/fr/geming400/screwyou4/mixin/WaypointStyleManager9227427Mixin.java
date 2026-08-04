package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.WaypointStyleManager.class)
public class WaypointStyleManager9227427Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/client/resources/WaypointStyle;", cancellable = true)
    private void get_1869724631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1869724631L))
            info.setReturnValue(null);
    }


}
