package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ItemStackMapIdFix.class)
public class ItemStackMapIdFix_1260775003Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_444638283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(444638283L))
            info.setReturnValue(null);
    }


}
