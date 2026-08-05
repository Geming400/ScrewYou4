package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.body.DialogBodyTypes.class)
public class DialogBodyTypes_1136032319Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void bootstrap__2142132322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142132322L))
            info.setReturnValue(null);
    }


}
