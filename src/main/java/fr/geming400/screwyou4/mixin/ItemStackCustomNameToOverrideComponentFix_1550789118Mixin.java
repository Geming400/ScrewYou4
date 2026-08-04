package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ItemStackCustomNameToOverrideComponentFix.class)
public class ItemStackCustomNameToOverrideComponentFix_1550789118Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1258981848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1258981848L))
            info.setReturnValue(null);
    }


}
