package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsProgrammerArtFix.class)
public class OptionsProgrammerArtFix931879288Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_115742569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(115742569L))
            info.setReturnValue(null);
    }


}
