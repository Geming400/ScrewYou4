package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.SavedDataFeaturePoolElementFix.class)
public class SavedDataFeaturePoolElementFix_1433569444Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_617432724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617432724L))
            info.setReturnValue(null);
    }


}
