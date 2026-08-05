package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.PoiCompetitorScan.class)
public class PoiCompetitorScan_1799753915Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_1059617602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059617602L))
            info.setReturnValue(null);
    }


}
