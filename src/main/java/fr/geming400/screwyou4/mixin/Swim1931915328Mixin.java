package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.Swim.class)
public class Swim1931915328Mixin {
        @Inject(at = @At("HEAD"), method = "shouldSwim(Lnet/minecraft/world/entity/Mob;)Z", cancellable = true)
    private static void shouldSwim_1693219294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693219294L))
            info.setReturnValue(false);
    }


}
