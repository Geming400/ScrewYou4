package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.nautilus.NautilusAi.class)
public class NautilusAi_592747079Mixin {
        @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/animal/nautilus/Nautilus;)V", cancellable = true)
    private static void updateActivity__718006071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-718006071L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getActivities()Ljava/util/List;", cancellable = true)
    private static void getActivities__1916097071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1916097071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTemptations()Ljava/util/function/Predicate;", cancellable = true)
    private static void getTemptations__2077200876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2077200876L))
            info.setReturnValue(null);
    }


}
