package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.TryFindWater.class)
public class TryFindWater_803595429Mixin {
        @Inject(at = @At("HEAD"), method = "create(IF)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_2072427251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2072427251L))
            info.setReturnValue(null);
    }


}
