package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SetClosestHomeAsWalkTarget.class)
public class SetClosestHomeAsWalkTarget_701454918Mixin {
        @Inject(at = @At("HEAD"), method = "create(F)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_1116016411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116016411L))
            info.setReturnValue(null);
    }


}
