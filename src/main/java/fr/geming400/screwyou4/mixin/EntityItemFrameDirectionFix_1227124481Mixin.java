package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityItemFrameDirectionFix.class)
public class EntityItemFrameDirectionFix_1227124481Mixin {
        @Inject(at = @At("HEAD"), method = "fixTag(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void fixTag__1160725185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1160725185L))
            info.setReturnValue(null);
    }


}
