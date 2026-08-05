package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.StriderGravityFix.class)
public class StriderGravityFix_1951947886Mixin {
        @Inject(at = @At("HEAD"), method = "fixTag(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void fixTag_1004057841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004057841L))
            info.setReturnValue(null);
    }


}
