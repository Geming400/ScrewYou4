package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.timeline.AttributeTrackSampler.class)
public class AttributeTrackSampler1902950379Mixin {
        @Inject(at = @At("HEAD"), method = "applyTimeBased(Ljava/lang/Object;I)Ljava/lang/Object;", cancellable = true)
    private void applyTimeBased__85758287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-85758287L))
            info.setReturnValue(null);
    }


}
