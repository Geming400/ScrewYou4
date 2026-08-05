package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.axolotl.ValidatePlayDead.class)
public class ValidatePlayDead256536928Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__483599384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-483599384L))
            info.setReturnValue(null);
    }


}
