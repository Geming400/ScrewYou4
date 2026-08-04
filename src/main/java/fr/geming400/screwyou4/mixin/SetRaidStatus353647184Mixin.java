package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SetRaidStatus.class)
public class SetRaidStatus353647184Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_1459029468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1459029468L))
            info.setReturnValue(null);
    }


}
