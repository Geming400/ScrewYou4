package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SetHiddenState.class)
public class SetHiddenState_400438787Mixin {
        @Inject(at = @At("HEAD"), method = "create(II)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_1972006510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972006510L))
            info.setReturnValue(null);
    }


}
