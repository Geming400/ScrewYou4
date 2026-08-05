package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.StrollAroundPoi.class)
public class StrollAroundPoi_2096043727Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;FI)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__689601288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-689601288L))
            info.setReturnValue(null);
    }


}
