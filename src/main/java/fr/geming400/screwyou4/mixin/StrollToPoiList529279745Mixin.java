package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.StrollToPoiList.class)
public class StrollToPoiList529279745Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;FIILnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__1119009401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1119009401L))
            info.setReturnValue(null);
    }


}
