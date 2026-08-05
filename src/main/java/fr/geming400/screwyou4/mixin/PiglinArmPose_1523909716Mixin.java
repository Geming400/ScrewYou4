package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.piglin.PiglinArmPose.class)
public class PiglinArmPose_1523909716Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/monster/piglin/PiglinArmPose;", cancellable = true)
    private static void values__1054615318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1054615318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/monster/piglin/PiglinArmPose;", cancellable = true)
    private static void valueOf_439754563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439754563L))
            info.setReturnValue(net.minecraft.world.entity.monster.piglin.PiglinArmPose.ADMIRING_ITEM);
    }


}
