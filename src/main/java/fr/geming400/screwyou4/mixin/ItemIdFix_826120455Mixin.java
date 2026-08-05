package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ItemIdFix.class)
public class ItemIdFix_826120455Mixin {
        @Inject(at = @At("HEAD"), method = "getItem(I)Ljava/lang/String;", cancellable = true)
    private static void getItem__594748882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-594748882L))
            info.setReturnValue("U,p3\u2CFCRk-h3e/5G-dsP\u0D8D*uB0C2JprETjNuH;%\u3B67}].\u2529D=X`jx;<e6A5oq2\uA679Op:3t\u8FC49(-8t6r''SJ8");
    }

    @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1983651007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1983651007L))
            info.setReturnValue(null);
    }


}
