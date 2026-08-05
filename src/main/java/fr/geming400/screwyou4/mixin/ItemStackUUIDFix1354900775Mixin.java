package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ItemStackUUIDFix.class)
public class ItemStackUUIDFix1354900775Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_538764056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(538764056L))
            info.setReturnValue(null);
    }


}
