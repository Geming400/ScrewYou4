package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BedItemColorFix.class)
public class BedItemColorFix721452184Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__2088319277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2088319277L))
            info.setReturnValue(null);
    }


}
