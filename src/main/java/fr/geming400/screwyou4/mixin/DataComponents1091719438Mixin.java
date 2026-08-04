package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponents.class)
public class DataComponents1091719438Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private static void bootstrap_2076995319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2076995319L))
            info.setReturnValue(null);
    }


}
