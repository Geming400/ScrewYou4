package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.CalibratedSculkSensorBlockEntity.class)
public class CalibratedSculkSensorBlockEntity1279832581Mixin {
        @Inject(at = @At("HEAD"), method = "createVibrationUser()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$User;", cancellable = true)
    private void createVibrationUser_297353392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(297353392L))
            info.setReturnValue(null);
    }


}
