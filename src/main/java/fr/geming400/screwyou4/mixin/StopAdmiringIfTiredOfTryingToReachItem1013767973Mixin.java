package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.piglin.StopAdmiringIfTiredOfTryingToReachItem.class)
public class StopAdmiringIfTiredOfTryingToReachItem1013767973Mixin {
        @Inject(at = @At("HEAD"), method = "create(II)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__1709631599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1709631599L))
            info.setReturnValue(null);
    }


}
