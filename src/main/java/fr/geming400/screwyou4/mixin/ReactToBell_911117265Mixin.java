package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.ReactToBell.class)
public class ReactToBell_911117265Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_2016499548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2016499548L))
            info.setReturnValue(null);
    }


}
