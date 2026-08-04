package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BoatSplitFix.class)
public class BoatSplitFix_2706915Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_1487902749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487902749L))
            info.setReturnValue(null);
    }


}
