package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.sniffer.SnifferAi.class)
public class SnifferAi_1151848523Mixin {
        @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/animal/sniffer/Sniffer;)V", cancellable = true)
    private static void updateActivity__1554625283(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1554625283L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getActivities()Ljava/util/List;", cancellable = true)
    private static void getActivities__1516781710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516781710L))
            info.setReturnValue(null);
    }


}
