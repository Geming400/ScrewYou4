package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.nautilus.ZombieNautilusAi.class)
public class ZombieNautilusAi9417343Mixin {
        @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/animal/nautilus/ZombieNautilus;)V", cancellable = true)
    private static void updateActivity_1644772988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1644772988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getActivities()Ljava/util/List;", cancellable = true)
    private static void getActivities_1795540490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795540490L))
            info.setReturnValue(null);
    }


}
