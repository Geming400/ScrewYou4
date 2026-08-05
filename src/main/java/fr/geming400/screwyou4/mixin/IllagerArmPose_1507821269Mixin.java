package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.illager.AbstractIllager.IllagerArmPose.class)
public class IllagerArmPose_1507821269Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/monster/illager/AbstractIllager$IllagerArmPose;", cancellable = true)
    private static void values__754969669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-754969669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/monster/illager/AbstractIllager$IllagerArmPose;", cancellable = true)
    private static void valueOf__494348844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-494348844L))
            info.setReturnValue(net.minecraft.world.entity.monster.illager.AbstractIllager.IllagerArmPose.BOW_AND_ARROW);
    }


}
