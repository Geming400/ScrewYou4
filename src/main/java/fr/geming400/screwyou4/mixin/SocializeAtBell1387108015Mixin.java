package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SocializeAtBell.class)
public class SocializeAtBell1387108015Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create_490826822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(490826822L))
            info.setReturnValue(null);
    }


}
