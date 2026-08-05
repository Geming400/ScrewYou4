package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.util.HoverRandomPos.class)
public class HoverRandomPos1191636749Mixin {
        @Inject(at = @At("HEAD"), method = "getPos(Lnet/minecraft/world/entity/PathfinderMob;IIDDFII)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPos_1703260381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703260381L))
            info.setReturnValue(null);
    }


}
