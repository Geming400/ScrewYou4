package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.CalibratedSculkSensorBlockEntity.class)
public class CalibratedSculkSensorBlockEntity1279832581Mixin {
        @Inject(at = @At("HEAD"), method = "createVibrationUser()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$User;", cancellable = true)
    private void createVibrationUser__377646097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377646097L))
            info.setReturnValue(null);
    }


}
