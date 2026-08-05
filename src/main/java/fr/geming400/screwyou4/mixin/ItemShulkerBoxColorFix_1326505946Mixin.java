package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ItemShulkerBoxColorFix.class)
public class ItemShulkerBoxColorFix_1326505946Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_510369226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(510369226L))
            info.setReturnValue(null);
    }


}
