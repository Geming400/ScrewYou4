package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.GoToClosestVillage.class)
public class GoToClosestVillage1510823278Mixin {
        @Inject(at = @At("HEAD"), method = "create(FI)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__2007454633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2007454633L))
            info.setReturnValue(null);
    }


}
