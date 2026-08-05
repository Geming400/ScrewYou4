package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityShulkerRotationFix.class)
public class EntityShulkerRotationFix_2088343664Mixin {
        @Inject(at = @At("HEAD"), method = "fixTag(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void fixTag_1140453619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1140453619L))
            info.setReturnValue(null);
    }


}
