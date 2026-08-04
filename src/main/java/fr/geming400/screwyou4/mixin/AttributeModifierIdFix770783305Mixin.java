package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.AttributeModifierIdFix.class)
public class AttributeModifierIdFix770783305Mixin {
        @Inject(at = @At("HEAD"), method = "uuidFromIntArray([I)Ljava/util/UUID;", cancellable = true)
    private static void uuidFromIntArray__1584155834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1584155834L))
            info.setReturnValue(null);
    }


}
