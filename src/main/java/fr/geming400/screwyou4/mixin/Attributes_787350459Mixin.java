package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.Attributes.class)
public class Attributes_787350459Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void bootstrap__2084247284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2084247284L))
            info.setReturnValue(null);
    }


}
