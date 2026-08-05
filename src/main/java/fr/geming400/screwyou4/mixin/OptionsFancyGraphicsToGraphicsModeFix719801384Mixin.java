package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsFancyGraphicsToGraphicsModeFix.class)
public class OptionsFancyGraphicsToGraphicsModeFix719801384Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__96335335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96335335L))
            info.setReturnValue(null);
    }


}
