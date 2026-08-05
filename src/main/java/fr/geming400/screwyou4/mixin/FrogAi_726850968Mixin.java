package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.frog.FrogAi.class)
public class FrogAi_726850968Mixin {
        @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/animal/frog/Frog;)V", cancellable = true)
    private static void updateActivity_2021360506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2021360506L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTemptations()Ljava/util/function/Predicate;", cancellable = true)
    private static void getTemptations__1943096987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943096987L))
            info.setReturnValue(null);
    }


}
