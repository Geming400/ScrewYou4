package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.FrogAttackablesSensor.class)
public class FrogAttackablesSensor1493002681Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires__336032805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-336032805L))
            info.setReturnValue(null);
    }


}
