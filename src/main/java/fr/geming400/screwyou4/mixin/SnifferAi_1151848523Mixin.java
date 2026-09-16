package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.sniffer.SnifferAi.class)
public class SnifferAi_1151848523Mixin {
        @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/animal/sniffer/Sniffer;)V", cancellable = true)
    private static void updateActivity__1957774347(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1957774347L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getActivities()Ljava/util/List;", cancellable = true)
    private static void getActivities__1356995627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1356995627L))
            info.setReturnValue(null);
    }


}
