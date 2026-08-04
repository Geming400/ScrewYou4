package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.SensorType.class)
public class SensorType_303510146Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/sensing/Sensor;", cancellable = true)
    private void create_746149285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746149285L))
            info.setReturnValue(null);
    }


}
