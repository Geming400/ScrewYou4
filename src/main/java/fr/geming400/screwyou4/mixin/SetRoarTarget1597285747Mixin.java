package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.warden.SetRoarTarget.class)
public class SetRoarTarget1597285747Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Function;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__503867525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503867525L))
            info.setReturnValue(null);
    }


}
