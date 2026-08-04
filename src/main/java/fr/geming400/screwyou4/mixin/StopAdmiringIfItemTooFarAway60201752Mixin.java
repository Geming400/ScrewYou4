package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.piglin.StopAdmiringIfItemTooFarAway.class)
public class StopAdmiringIfItemTooFarAway60201752Mixin {
        @Inject(at = @At("HEAD"), method = "create(I)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_777499147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777499147L))
            info.setReturnValue(null);
    }


}
