package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapDecorationTypes.class)
public class MapDecorationTypes_1832851837Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void bootstrap__1038745906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1038745906L))
            info.setReturnValue(null);
    }


}
