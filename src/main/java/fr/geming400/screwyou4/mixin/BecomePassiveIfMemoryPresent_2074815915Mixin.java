package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.BecomePassiveIfMemoryPresent.class)
public class BecomePassiveIfMemoryPresent_2074815915Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;I)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__358948693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-358948693L))
            info.setReturnValue(null);
    }


}
