package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.InsideBrownianWalk.class)
public class InsideBrownianWalk812811933Mixin {
        @Inject(at = @At("HEAD"), method = "create(F)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__149128201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-149128201L))
            info.setReturnValue(null);
    }


}
