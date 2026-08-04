package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ItemBannerColorFix.class)
public class ItemBannerColorFix1821097363Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__988674098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-988674098L))
            info.setReturnValue(null);
    }


}
