package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.LongJumpUtil.class)
public class LongJumpUtil140767668Mixin {
        @Inject(at = @At("HEAD"), method = "calculateJumpVectorForAngle(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/world/phys/Vec3;FIZ)Ljava/util/Optional;", cancellable = true)
    private static void calculateJumpVectorForAngle__854934858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-854934858L))
            info.setReturnValue(null);
    }


}
