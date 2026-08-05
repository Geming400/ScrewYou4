package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.TryFindLand.class)
public class TryFindLand1287518545Mixin {
        @Inject(at = @At("HEAD"), method = "create(IF)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__1460494436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1460494436L))
            info.setReturnValue(null);
    }


}
