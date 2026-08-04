package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.RingBell.class)
public class RingBell_154836789Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_1260219072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1260219072L))
            info.setReturnValue(null);
    }


}
