package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BedItemColorFix.class)
public class BedItemColorFix721452184Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__94684535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-94684535L))
            info.setReturnValue(null);
    }


}
