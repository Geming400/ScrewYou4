package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.action.ActionTypes.class)
public class ActionTypes1650189589Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void bootstrap__2050188537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2050188537L))
            info.setReturnValue(null);
    }


}
