package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.piglin.StartHuntingHoglin.class)
public class StartHuntingHoglin_67482268Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__828798926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-828798926L))
            info.setReturnValue(null);
    }


}
