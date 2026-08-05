package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityPaintingMotiveFix.class)
public class EntityPaintingMotiveFix440805562Mixin {
        @Inject(at = @At("HEAD"), method = "fixTag(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void fixTag__507084482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-507084482L))
            info.setReturnValue(null);
    }


}
