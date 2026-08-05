package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.frog.TadpoleAi.class)
public class TadpoleAi1653278601Mixin {
        @Inject(at = @At("HEAD"), method = "getActivities()Ljava/util/List;", cancellable = true)
    private static void getActivities__1015351631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1015351631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/animal/frog/Tadpole;)V", cancellable = true)
    private static void updateActivity__1678115353(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1678115353L))
            info.cancel();
    }


}
