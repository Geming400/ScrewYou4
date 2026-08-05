package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.piglin.PiglinBruteAi.class)
public class PiglinBruteAi493610093Mixin {
        @Inject(at = @At("HEAD"), method = "getActivities(Lnet/minecraft/world/entity/monster/piglin/PiglinBrute;)Ljava/util/List;", cancellable = true)
    private static void getActivities_1455119378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455119378L))
            info.setReturnValue(null);
    }


}
