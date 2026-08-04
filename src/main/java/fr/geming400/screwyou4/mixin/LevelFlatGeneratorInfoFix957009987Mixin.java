package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.LevelFlatGeneratorInfoFix.class)
public class LevelFlatGeneratorInfoFix957009987Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1852761474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1852761474L))
            info.setReturnValue(null);
    }


}
