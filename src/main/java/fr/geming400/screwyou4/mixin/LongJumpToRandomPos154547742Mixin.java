package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.LongJumpToRandomPos.class)
public class LongJumpToRandomPos154547742Mixin {
        @Inject(at = @At("HEAD"), method = "defaultAcceptableLandingSpot(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void defaultAcceptableLandingSpot__358187859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-358187859L))
            info.setReturnValue(true);
    }


}
