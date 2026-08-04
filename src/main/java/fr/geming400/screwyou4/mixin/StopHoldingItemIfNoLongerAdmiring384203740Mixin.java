package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.piglin.StopHoldingItemIfNoLongerAdmiring.class)
public class StopHoldingItemIfNoLongerAdmiring384203740Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_1489586024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1489586024L))
            info.setReturnValue(null);
    }


}
