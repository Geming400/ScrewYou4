package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ItemStackComponentizationFix.class)
public class ItemStackComponentizationFix930677499Mixin {
        @Inject(at = @At("HEAD"), method = "fixProfile(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void fixProfile_1335779846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335779846L))
            info.setReturnValue(null);
    }


}
