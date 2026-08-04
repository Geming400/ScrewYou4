package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.MemoryExpiryDataFix.class)
public class MemoryExpiryDataFix_1763566807Mixin {
        @Inject(at = @At("HEAD"), method = "fixTag(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void fixTag__624282859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-624282859L))
            info.setReturnValue(null);
    }


}
