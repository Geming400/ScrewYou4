package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.AssignProfessionFromJobSite.class)
public class AssignProfessionFromJobSite217551489Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__522584823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-522584823L))
            info.setReturnValue(null);
    }


}
