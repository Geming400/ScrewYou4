package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.nautilus.NautilusAi.class)
public class NautilusAi_592747079Mixin {
        @Inject(at = @At("HEAD"), method = "getTemptations()Ljava/util/function/Predicate;", cancellable = true)
    private static void getTemptations__57137652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-57137652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/animal/nautilus/Nautilus;)V", cancellable = true)
    private static void updateActivity_161187793(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(161187793L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getActivities()Ljava/util/List;", cancellable = true)
    private static void getActivities__2075883154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2075883154L))
            info.setReturnValue(null);
    }


}
