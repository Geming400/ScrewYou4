package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ItemSpawnEggFix.class)
public class ItemSpawnEggFix_861617366Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_45480646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(45480646L))
            info.setReturnValue(null);
    }


}
