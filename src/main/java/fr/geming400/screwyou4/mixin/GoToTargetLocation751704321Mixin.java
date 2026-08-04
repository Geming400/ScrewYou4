package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.GoToTargetLocation.class)
public class GoToTargetLocation751704321Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;IF)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create_92480525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(92480525L))
            info.setReturnValue(null);
    }


}
