package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.StrollToPoi.class)
public class StrollToPoi1418874051Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;FII)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__7880573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-7880573L))
            info.setReturnValue(null);
    }


}
