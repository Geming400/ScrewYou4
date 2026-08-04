package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.StatsCounterFix.class)
public class StatsCounterFix642777482Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_2127973317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127973317L))
            info.setReturnValue(null);
    }


}
