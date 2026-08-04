package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.StartCelebratingIfTargetDead.class)
public class StartCelebratingIfTargetDead900166252Mixin {
        @Inject(at = @At("HEAD"), method = "create(ILjava/util/function/BiPredicate;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__486800983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-486800983L))
            info.setReturnValue(null);
    }


}
